package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ar.com.ConcejoDeliberante.Entity.Rol;
import ar.com.ConcejoDeliberante.Service.IRol;

@Controller
public class RolController {
	@Autowired
	IRol rolServer;
	
	
	@GetMapping ("/altaRol")
	public String cargaRol(Model model) {
		Rol rol=new Rol();
		model.addAttribute("Rol", rol);
		model.addAttribute("roles", rolServer.roles());
		return "Rol/formulario";
	
	}
	@PostMapping ("/guardar")
	public String guardar(Rol rol) {
	rolServer.guardar(rol);
	return "redirect:/"; 
	}
}
