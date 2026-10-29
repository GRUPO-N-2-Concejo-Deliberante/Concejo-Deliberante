package ar.com.ConcejoDeliberante.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Entity.Usuario;
import ar.com.ConcejoDeliberante.Service.IConcejal;
import ar.com.ConcejoDeliberante.Service.IRol;
import ar.com.ConcejoDeliberante.ServiceImple.ImpleConcejal;
import ar.com.ConcejoDeliberante.ServiceImple.ImpleRol;

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
public String guardar(Concejal concejal, Model model,RedirectAttributes redirect) {
	

	try {
	concejalServer.guarda(concejal);
	redirect.addFlashAttribute("mensajeExito", "concejal guardado correctamente");
	
	}catch(Exception e) {
		redirect.addFlashAttribute("mensajeError", "No es posible cargar estos datos"+ e.getMessage());
	}
	return "redirect:/altaConcejal";
}
@GetMapping ("/eliminarConcejal/{id}")
public String eliminar (@PathVariable int id) {
	concejalServer.eliminarConcejal(id);
	return "redirect:/";
}
@GetMapping("/busqueda")
public String resultadoBusqueda( @RequestParam ("DNI") String DNI, Model model) {
	Concejal c =concejalServer.porDNI(DNI);
	model.addAttribute("Concejales", c);
	return "redirect:/";
}
@GetMapping ("/modificar")
public String mostrarEdicion(@RequestParam ("DNI") String DNI, Model model) {
	Concejal concejal=concejalServer.porDNI(DNI);
	model.addAttribute("concejal", concejal);
	model.addAttribute("Concejales", concejalServer.concejales());
	model.addAttribute("roles",rolServer.roles() );
	return "Concejal/formulario"; 
}
@GetMapping ("/concejal/bajaConcejal")
public String bajaConcejal(Concejal concejal) {
concejalServer.baja(concejal);
return "redirect:/";
}
}