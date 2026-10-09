package ar.com.ConcejoDeliberante.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConcejalController {
	@GetMapping("/")
	public String mostrarInicio(Model model) {
		
		
		return "layout/inicio";
		
	}
}
