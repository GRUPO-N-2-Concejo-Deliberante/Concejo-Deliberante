package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ar.com.ConcejoDeliberante.Entity.Asistencia;
import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Entity.DetalleAsistencia;
import ar.com.ConcejoDeliberante.Repository.IConcejalRepo;
import ar.com.ConcejoDeliberante.Service.IActivivdad;
import ar.com.ConcejoDeliberante.Service.IAsistencia;
import ar.com.ConcejoDeliberante.Service.IConcejal;
import ar.com.ConcejoDeliberante.Service.IDetalleAsistencia;

@Controller
public class AsistenciaController  {

    @Autowired
    private IDetalleAsistencia detalleAsistenciaService;

    @Autowired
    private IConcejal concejalServer;
	@Autowired
	IActivivdad actividadService;
    
    @GetMapping("/asistencias")
    public String vistaUnica(Model model) {
        model.addAttribute("asistencias", detalleAsistenciaService.listarAsistencia());
        model.addAttribute("Concejales", concejalServer.concejales());model.addAttribute("actividades", actividadService.listarActividadad());
        model.addAttribute("detalleAsistencia", new DetalleAsistencia());
        return "asistencias/lista"; //  
    }

     
    @PostMapping("/asistencias/guardar")
    public String guardar(@ModelAttribute DetalleAsistencia detAsistencia, 
                          @RequestParam("idConcejal") Integer idConcejal,
                          RedirectAttributes redirectAttributes) {
        try {
            Concejal concejal = new Concejal();
            concejal.setId (idConcejal);  

            detalleAsistenciaService.guardarAsistencia(detAsistencia, concejal);
            redirectAttributes.addFlashAttribute("exito", "Asistencia registrada correctamente.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al guardar: " + e.getMessage());
        }
        return "redirect:/asistencias";
    }
}

	

