package es.susosise.albaranes.articulos;

public class Articulo_dto {
    private String codigoDeArticulo;
    private String nombreCorto;
    private String descripcionLarga;

    public Articulo_dto(Articulo unArticulo) {
        this.codigoDeArticulo = unArticulo.getCodigoDeArticulo();
        this.nombreCorto = unArticulo.getNombreCorto();
        this.descripcionLarga = unArticulo.getDescripcionLarga();
    }

    public String getCodigoDeArticulo() {
        return codigoDeArticulo;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

}
