package es.susosise.albaranes.albaranes;

import es.susosise.albaranes.articulos.Articulo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "albaranes_lineas")
public class AlbaranLinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    Articulo articulo;
    Double cantidad;

}
