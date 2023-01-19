package es.susosise.albaranes.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "poblaciones")
public class Poblacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    @GeneratedValue(strategy = GenerationType.UUID)
    UUID idPublico;

    String pais;
    String provinciaOestado;

    String codigoPostal;
    String nombre;

}
