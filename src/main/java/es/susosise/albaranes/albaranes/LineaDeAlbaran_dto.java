package es.susosise.albaranes.albaranes;

import es.susosise.albaranes.articulos.Articulo_dto;

public class LineaDeAlbaran_dto {
    Articulo_dto articulo;
    Integer cantidad;

    public LineaDeAlbaran_dto(LineaDeAlbaran unaLinea) {
        this.articulo = new Articulo_dto(unaLinea.articulo);
        this.cantidad = unaLinea.getCantidad();
    }

    public Articulo_dto getArticulo() {
        return articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

}
