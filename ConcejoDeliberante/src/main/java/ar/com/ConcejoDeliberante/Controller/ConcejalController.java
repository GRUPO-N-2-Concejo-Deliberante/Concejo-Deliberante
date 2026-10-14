package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Entity.Usuario;
import ar.com.ConcejoDeliberante.Service.IConcejal;
import ar.com.ConcejoDeliberante.Service.IRol;

@Controller

public class ConcejalController {
@Autowired
IConcejal concejalServer;
@Autowired
IRol rolServer;


@GetMapping ("/altaConcejal")
public String cargaUsuario(Model model) {
	Concejal concejal=new Concejal();
	model.addAttribute("concejal", concejal);
	model.addAttribute("Concejales", concejalServer.concejales());
	model.addAttribute("roles",rolServer.roles() );
	return "Concejal/formulario";
}
@PostMapping ("/guardarConcejal")
public String guardar(Concejal concejal) {
	concejalServer.guarda(concejal);
	return "redirect:/";
}
@GetMapping ("/eliminarConcejal/{id}")
public String eliminar (@PathVariable int id) {
	concejalServer.eliminarConcejal(id);
	return "redirect:/";
}
@GetMapping("/busqueda")
public String resultadoBusqueda( @RequestParam ("DNI") String DNI, Model model) {
	Concejal concejal=concejalServer.buscar(DNI);
	model.addAttribute("usuario", concejal);
	return "redirect:/";
}
@GetMapping ("/modificar")
public String mostrarEdicion(@RequestParam ("DNI") String DNi, Model model) {
	Concejal concejal=concejalServer.buscar(DNi);
	model.addAttribute("Usuario", concejal);
	return "inicio/formulario"; 
}
}
