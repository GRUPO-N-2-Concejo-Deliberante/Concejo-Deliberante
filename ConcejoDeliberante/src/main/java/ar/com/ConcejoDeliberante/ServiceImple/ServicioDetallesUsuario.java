package ar.com.ConcejoDeliberante.ServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Entity.Secretaria;
import ar.com.ConcejoDeliberante.Repository.IConcejalRepo;
import ar.com.ConcejoDeliberante.Repository.ISecretariaRepo;

@Service
public class ServicioDetallesUsuario implements UserDetailsService {

    @Autowired
    private IConcejalRepo concejalRepo;

    @Autowired
    private ISecretariaRepo secretariaRepo;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario)
            throws UsernameNotFoundException {

        Concejal concejal = concejalRepo.findByNombreUsuario(nombreUsuario);

        if (concejal != null) {
            return User.builder()
                    .username(concejal.getNombreUsuario())
                    .password(concejal.getPassword())
                    .authorities(concejal.getTipoRol().getCargo())
                    .build();
        }

        Secretaria secretaria = secretariaRepo.findByNombreUsuario(nombreUsuario);

        if (secretaria != null) {
            return User.builder()
                    .username(secretaria.getNombreUsuario())
                    .password(secretaria.getPassword())
                    .authorities(secretaria.getTipoRol().getCargo())
                    .build();
        }

        throw new UsernameNotFoundException("No se encontró el usuario: " + nombreUsuario);
    }
}
