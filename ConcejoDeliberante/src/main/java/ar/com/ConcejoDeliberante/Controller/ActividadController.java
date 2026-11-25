package ar.com.ConcejoDeliberante.Controller;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ar.com.ConcejoDeliberante.Entity.Actividad;
import ar.com.ConcejoDeliberante.Entity.Archivo;
import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Service.IActivivdad;

@Controller
public class ActividadController {

	@Autowired
	IActivivdad ActividadService;
	
	@GetMapping("/AltaActividad")
	public String mostrarFormulario(Model model)  {
    	
    	Actividad actividad = new Actividad();
        model.addAttribute("actividad", actividad);
        model.addAttribute("actividades", ActividadService.listarActividadad());
        
        return "Actividad/formularioActividad";
        
	}
	
	
	@PostMapping ("/GuardarActividad")
	   public String guardarArchivos( Actividad actividad) {
        ActividadService.guardarAct(actividad);
         
        return "redirect:/AltaActividad";
	
}
	
	@GetMapping ("/modificarActividad")
	public String mostrarEdicion(@RequestParam ("id")  int id, Model model) {
		Actividad act = ActividadService.porID (id);
		model.addAttribute("actividad", act);
		model.addAttribute("actividades", ActividadService.listarActividadad());
		return "Actividad/formularioActividad";
	}
	
}
