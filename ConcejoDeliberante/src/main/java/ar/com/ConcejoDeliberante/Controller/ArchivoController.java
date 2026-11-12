package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import ar.com.ConcejoDeliberante.Entity.Archivo;
import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Service.IArchivo;
import ar.com.ConcejoDeliberante.Service.IConcejal;
import ar.com.ConcejoDeliberante.ServiceImple.ImpleArchivo;

@Controller
public class ArchivoController {

    @Autowired
    IArchivo archivoService; 
    
    @Autowired
    IConcejal concejalesservice;
    
    @GetMapping("/altaArchivo")
    public String mostrarFormulario(Model model, MultipartFile file)  {
    	
    	Archivo archivo = new Archivo();
        model.addAttribute("archivo", archivo);
        model.addAttribute("concejales", concejalesservice.concejales());
        model.addAttribute("archivos", archivoService.listar());
        
        return "Archivo/formulario"; 
    }

    @PostMapping("/guardarArchivo")
    public String guardarArchivos( Archivo archivo) {
        archivoService.guardar(archivo);
        return "redirect:/altaArchivo";
    } 
    
    
    
}