package es.susosise.albaranes.articulos;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    @GeneratedValue(strategy = GenerationType.UUID)
    UUID idPublico;

    String codigo;
    String nombreCorto;
    String descripcionLarga;

}
