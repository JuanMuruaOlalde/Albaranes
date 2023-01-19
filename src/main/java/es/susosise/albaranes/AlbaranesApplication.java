package es.susosise.albaranes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;

import es.susosise.albaranes.albaranes.Albaran;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranesParaPruebas;
import es.susosise.albaranes.articulos.ManejoDeArticulos;
import es.susosise.albaranes.clientes.ManejoDeClientes;


@SpringBootApplication
public class AlbaranesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbaranesApplication.class, args);
	}


	@Bean
	public CommandLineRunner llenarLaBaseDeDatosConDatosParaPruebas(
		ManejoDeAlbaranes albaranes,	
		ManejoDeClientes clientes,
		ManejoDeArticulos articulos){
		return args -> {
			Albaran albaran01 = ManejoDeAlbaranesParaPruebas.getAlbaranDePrueba(1);
			if (albaranes.getAlbaran(albaran01.getNumeroDeAlbaran()).isEmpty()) {
				albaranes.guardar(albaran01);
			}
		};
	}

}
