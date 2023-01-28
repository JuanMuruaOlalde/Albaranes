package es.susosise.albaranes.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "poblaciones")
public class Poblacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    String nombre;
    String codigoPostal;

    public Poblacion() {
    }

    public Poblacion(String nombre, String codigoPostal) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return codigoPostal + " - " + nombre;
    }

    public Long getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(Long idInterno) {
        this.idInterno = idInterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idInterno == null) ? 0 : idInterno.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
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
        Poblacion other = (Poblacion) obj;
        if (idInterno == null) {
            if (other.idInterno != null)
                return false;
        } else if (!idInterno.equals(other.idInterno))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (codigoPostal == null) {
            if (other.codigoPostal != null)
                return false;
        } else if (!codigoPostal.equals(other.codigoPostal))
            return false;
        return true;
    }

}
