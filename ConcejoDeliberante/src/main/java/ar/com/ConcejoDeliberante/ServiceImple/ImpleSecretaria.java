package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Secretaria;
import ar.com.ConcejoDeliberante.Repository.ISecretariaRepo;
import ar.com.ConcejoDeliberante.Service.ISecretaria;

@Service
public class ImpleSecretaria implements ISecretaria {

	@Autowired
	private ISecretariaRepo secretariaRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void guardar(Secretaria secretaria) {

		Secretaria secretariaExistente = secretariaRepo.findById(secretaria.getId());

		if (secretariaExistente != null) {

			secretariaExistente.setNombre(secretaria.getNombre());
			secretariaExistente.setApellido(secretaria.getApellido());
			secretariaExistente.setDNI(secretaria.getDNI());
			secretariaExistente.setCorreo(secretaria.getCorreo());
			secretariaExistente.setTelefono(secretaria.getTelefono());
			secretariaExistente.setTipoRol(secretaria.getTipoRol());
			secretariaExistente.setNombreUsuario(secretaria.getNombreUsuario());

			if (secretaria.getPassword() != null && !secretaria.getPassword().isBlank()) {
				secretariaExistente.setPassword(passwordEncoder.encode(secretaria.getPassword()));
			}
			secretariaRepo.save(secretariaExistente);
		} else {
			secretaria.setEstado(true);
			secretaria.setPassword(passwordEncoder.encode(secretaria.getPassword()));
			secretariaRepo.save(secretaria);
		}
	}

	@Override
	public List<Secretaria> lista() {

		return secretariaRepo.findAll();
	}

}
