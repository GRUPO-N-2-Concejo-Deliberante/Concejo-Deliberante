package ar.com.ConcejoDeliberante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ar.com.ConcejoDeliberante.Entity.Secretaria;
import ar.com.ConcejoDeliberante.Service.IRol;
import ar.com.ConcejoDeliberante.Service.ISecretaria;

@Controller
public class SecretariaController {

	@Autowired
	private ISecretaria secretariaServer;

	@Autowired
	private IRol rolServer;

	@GetMapping("/altaSecretaria")
	public String cargaSecretaria(Model model) {

		Secretaria secretaria = new Secretaria();

		model.addAttribute("secretaria", secretaria);
		model.addAttribute("Secretarias", secretariaServer.lista());
		model.addAttribute("roles", rolServer.roles());

		return "Secretaria/formularioSecretaria";
	}

	@PostMapping("/guardarSecretaria")
	public String guardarSCRE(Secretaria secretaria, RedirectAttributes redirect) {

		try {
			secretariaServer.guardar(secretaria);

			redirect.addFlashAttribute("mensajeExito", "Secretaria guardada correctamente");

		} catch (Exception e) {

			redirect.addFlashAttribute("mensajeError", "No es posible cargar estos datos: " + e.getMessage());
		}

		return "redirect:/altaSecretaria";
	}
}