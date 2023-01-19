package es.susosise.albaranes.albaranes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import es.susosise.albaranes.articulos.Articulo;

@Entity
@Table(name = "albaranes_lineas")
public class LineaDeAlbaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    Articulo articulo;
    Integer cantidad;
    
    public LineaDeAlbaran(Articulo articulo, Integer cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

}
