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

    public Articulo() {
    }

    public Articulo(String codigo, String nombreCorto, String descripcionLarga) {
        this.codigoDeArticulo = codigo;
        this.nombreCorto = nombreCorto;
        this.descripcionLarga = descripcionLarga;
    }

    @Override
    public String toString() {
        return "[" + codigoDeArticulo + "] " + nombreCorto;
    }

    public Long getIdInterno() {
        return idInterno;
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

    public void setIdInterno(Long idInterno) {
        this.idInterno = idInterno;
    }

    public void setCodigoDeArticulo(String codigoDeArticulo) {
        this.codigoDeArticulo = codigoDeArticulo;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idInterno == null) ? 0 : idInterno.hashCode());
        result = prime * result + ((codigoDeArticulo == null) ? 0 : codigoDeArticulo.hashCode());
        result = prime * result + ((nombreCorto == null) ? 0 : nombreCorto.hashCode());
        result = prime * result + ((descripcionLarga == null) ? 0 : descripcionLarga.hashCode());
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
        Articulo other = (Articulo) obj;
        if (idInterno == null) {
            if (other.idInterno != null)
                return false;
        } else if (!idInterno.equals(other.idInterno))
            return false;
        if (codigoDeArticulo == null) {
            if (other.codigoDeArticulo != null)
                return false;
        } else if (!codigoDeArticulo.equals(other.codigoDeArticulo))
            return false;
        if (nombreCorto == null) {
            if (other.nombreCorto != null)
                return false;
        } else if (!nombreCorto.equals(other.nombreCorto))
            return false;
        if (descripcionLarga == null) {
            if (other.descripcionLarga != null)
                return false;
        } else if (!descripcionLarga.equals(other.descripcionLarga))
            return false;
        return true;
    }

}
