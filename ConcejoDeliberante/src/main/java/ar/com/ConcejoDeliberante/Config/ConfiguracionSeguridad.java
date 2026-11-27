package ar.com.ConcejoDeliberante.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ConfiguracionSeguridad {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain cadenaFiltrosSeguridad(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(autorizacion -> autorizacion

				.requestMatchers("/login", "/resourse/**", "/resources/**", "/css/**", "/js/**", "/img/**",
						"/webjars/**")
				.permitAll()

				.requestMatchers("/").hasAnyAuthority("concejal", "secretaria")

				.requestMatchers("/altaArchivo", "/guardarArchivo").hasAnyAuthority("concejal", "secretaria")

				.anyRequest().hasAuthority("secretaria"))

				.formLogin(formulario -> formulario.loginPage("/login").loginProcessingUrl("/login")
						.defaultSuccessUrl("/", true).failureUrl("/login?error").permitAll())

				.logout(cierre -> cierre.logoutUrl("/logout").logoutSuccessUrl("/login?logout").permitAll());

		return http.build();
	}
}
