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
	
	@GetMapping ("/altaTipoA")
	public String cargaTipo(Model model) {
		TipoArchivo tipo = new TipoArchivo();
		model.addAttribute("Tip", tipo);
//		model.addAttribute("tipos", tipoService.tiposArchivos());
		return "TipoArchivo/formulario";
	}
	
	@PostMapping ("/guardarTipo")
	public String guardarTipo (TipoArchivo tipo) {
		tipoService.guardar(tipo);
		return "redirect:/altaTipoA";
		
	}
}
