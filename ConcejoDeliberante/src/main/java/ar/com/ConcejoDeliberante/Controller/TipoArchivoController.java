package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ar.com.ConcejoDeliberante.Entity.TipoArchivo;
import ar.com.ConcejoDeliberante.Service.ITipoArchivo;

@Controller
public class TipoArchivoController {
	
	@Autowired
	ITipoArchivo tipoService;
	
	@GetMapping ("/altaTipo")
	public String cargaTipo(Model model) {
		
		TipoArchivo t = new TipoArchivo();
		model.addAttribute("tipoA", t);
		model.addAttribute("tipos", tipoService.archivos());
		return "TipoArchivo/formularioTipo";
	
	}
	
	@PostMapping ("/guardarTipo")
	public String guardarTipo(TipoArchivo tipo) {
		
		tipoService.guarda(tipo);
	return "redirect:/altaTipo"; 
	}
}
