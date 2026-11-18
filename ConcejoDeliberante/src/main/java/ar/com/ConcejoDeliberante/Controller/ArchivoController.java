package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ar.com.ConcejoDeliberante.Entity.Archivo;
import ar.com.ConcejoDeliberante.Service.IArchivo;
import ar.com.ConcejoDeliberante.Service.IComision;
import ar.com.ConcejoDeliberante.Service.IConcejal;
import ar.com.ConcejoDeliberante.Service.ITipoArchivo;
import ar.com.ConcejoDeliberante.ServiceImple.ImpleArchivo;


@Controller
public class ArchivoController {

    @Autowired
    IArchivo archivoService;

    @Autowired
    IConcejal concejalesservice;

    
    @Autowired
    ITipoArchivo tiposService;
    
    @Autowired
    IComision comisionService;
    
    @GetMapping("/altaArchivo")
    public String mostrarFormulario(Model model, MultipartFile file) {

        Archivo archivo = new Archivo();
        model.addAttribute("archivo", archivo);
        model.addAttribute("concejales", concejalesservice.concejales());
        model.addAttribute("archivos", archivoService.listar());
        model.addAttribute("tipos", tiposService.archivos());
        model.addAttribute("comisiones", comisionService.comisiones());
        
        return "Archivo/formulario"; 

    }

    @PostMapping("/guardarArchivo")
    public String guardarArchivos(Archivo archivo, RedirectAttributes redirect) {
        try {
            archivoService.guardar(archivo);
            redirect.addFlashAttribute("SuccessMessage", "El Archivo fue guardado correctamente");
        } catch (Exception indorr) {
            redirect.addFlashAttribute("WrongMessage", "El archivo no fue guardado correctamente" + indorr.getMessage());
        }
        return "redirect:/altaArchivo";
    }
}