package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.ConcejoDeliberante.Entity.Archivo;
import ar.com.ConcejoDeliberante.Entity.DetalleActividad;
import ar.com.ConcejoDeliberante.Service.IActivivdad;
import ar.com.ConcejoDeliberante.Service.IArchivo;
import ar.com.ConcejoDeliberante.Service.IDetalle;

@Controller
public class DetalleController {
	
	
	@Autowired
	IDetalle detalleService;
	@Autowired
	IActivivdad actividadService;
	@Autowired
	IArchivo archivoService;
	
	@GetMapping ("/altaDetalle")
	public String cargaRol(Model model) {
		DetalleActividad detalle = new DetalleActividad();
		model.addAttribute("detalle", detalle);
		model.addAttribute("detalles", detalleService.listarDetalle());
		model.addAttribute("actividades", actividadService.listarActividadad());
		model.addAttribute("archivos", archivoService.listar());
		return "Detalle/formularioDetalle";
	
	}
	@PostMapping("/guardarDetalle")
    public String guardar(
            DetalleActividad detalle,
            @RequestParam("idArchivo") int idArchivo) {

        Archivo archivo = archivoService.buscarPorId(idArchivo);

        detalleService.generarDetalle(detalle, archivo);

        return "redirect:/altaDetalle";
    }
}
