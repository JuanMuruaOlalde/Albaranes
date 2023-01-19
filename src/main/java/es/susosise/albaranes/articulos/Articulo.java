package es.susosise.albaranes.articulos;

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

    String codigoDeArticulo;
    String nombreCorto;
    String descripcionLarga;
    public Articulo(String codigo, String nombreCorto, String descripcionLarga) {
        this.codigoDeArticulo = codigo;
        this.nombreCorto = nombreCorto;
        this.descripcionLarga = descripcionLarga;
    }

}
