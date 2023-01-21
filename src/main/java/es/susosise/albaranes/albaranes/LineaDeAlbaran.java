package es.susosise.albaranes.albaranes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import es.susosise.albaranes.articulos.Articulo;

@Entity
@Table(name = "albaranes_lineas")
public class LineaDeAlbaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    Articulo articulo;

    Integer cantidad;

    public LineaDeAlbaran() {
    }

    public LineaDeAlbaran(Articulo articulo, Integer cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Long getIdInterno() {
        return idInterno;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setIdInterno(Long idInterno) {
        this.idInterno = idInterno;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idInterno == null) ? 0 : idInterno.hashCode());
        result = prime * result + ((articulo == null) ? 0 : articulo.hashCode());
        result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LineaDeAlbaran other = (LineaDeAlbaran) obj;
        if (idInterno == null) {
            if (other.idInterno != null)
                return false;
        } else if (!idInterno.equals(other.idInterno))
            return false;
        if (articulo == null) {
            if (other.articulo != null)
                return false;
        } else if (!articulo.equals(other.articulo))
            return false;
        if (cantidad == null) {
            if (other.cantidad != null)
                return false;
        } else if (!cantidad.equals(other.cantidad))
            return false;
        return true;
    }

}
