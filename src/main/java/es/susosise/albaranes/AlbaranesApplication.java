package es.susosise.albaranes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import es.susosise.albaranes.albaranes.Albaran;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranesParaPruebas;

@SpringBootApplication
public class AlbaranesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbaranesApplication.class, args);
	}

	@Bean
	public CommandLineRunner llenarLaBaseDeDatosConDatosParaPruebas(ManejoDeAlbaranes albaranes) {
		return args -> {
			Albaran albaran01 = ManejoDeAlbaranesParaPruebas.getAlbaranDePrueba(1);
			if (albaranes.getAlbaran(albaran01.getNumeroDeAlbaran()).isEmpty()) {
				albaranes.guardar(albaran01);
			}
			Albaran albaran02 = ManejoDeAlbaranesParaPruebas.getAlbaranDePrueba(2);
			if (albaranes.getAlbaran(albaran02.getNumeroDeAlbaran()).isEmpty()) {
				albaranes.guardar(albaran02);
			}
			Albaran albaran03 = ManejoDeAlbaranesParaPruebas.getAlbaranDePrueba(3);
			if (albaranes.getAlbaran(albaran03.getNumeroDeAlbaran()).isEmpty()) {
				albaranes.guardar(albaran03);
			}
		};
	}

}
