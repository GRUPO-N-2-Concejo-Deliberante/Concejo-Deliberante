package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ar.com.ConcejoDeliberante.Entity.Comision;
import ar.com.ConcejoDeliberante.Service.IComision;

@Controller
public class ComisionController {
	
	@Autowired
	IComision comisionService;
	
	@GetMapping ("/altaComision")
	public String cargaComision(Model model) {
		
		Comision c = new Comision();
		model.addAttribute("comision", c);
		model.addAttribute("comisiones", comisionService.comisiones());
		
		
		return "Comision/formularioComision";
	
	}
	
	@PostMapping ("/guardarComision")
	public String guardarComision(Comision c) {
		comisionService.guardar(c);
		
	return "redirect:/altaComision"; 
	}
	
}
