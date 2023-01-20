package es.susosise.albaranes.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    String nombre;

    @OneToOne(mappedBy= "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    PuntoDeEntrega razonSocialPrincipal;
    
    @OneToMany(mappedBy= "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<PuntoDeEntrega> otrosPuntosDeEntrega;

    public Cliente() {}

    public Cliente(String nombre, PuntoDeEntrega razonSocialPrincipal) {
        this.nombre = nombre;
        this.razonSocialPrincipal = razonSocialPrincipal;
        this.otrosPuntosDeEntrega = new HashSet<PuntoDeEntrega>();
    }

    @Override
    public String toString() {
        return nombre;
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

    public PuntoDeEntrega getRazonSocialPrincipal() {
        return razonSocialPrincipal;
    }

    public void setRazonSocialPrincipal(PuntoDeEntrega razonSocialPrincipal) {
        this.razonSocialPrincipal = razonSocialPrincipal;
    }

    public Set<PuntoDeEntrega> getOtrosPuntosDeEntrega() {
        return otrosPuntosDeEntrega;
    }

    public void setOtrosPuntosDeEntrega(Set<PuntoDeEntrega> otrosPuntosDeEntrega) {
        this.otrosPuntosDeEntrega = otrosPuntosDeEntrega;
    }

    public void añadirUnPuntoDeEntrega(PuntoDeEntrega punto) {
        this.otrosPuntosDeEntrega.add(punto);
    }
    public void quitarUnPuntoDeEntrega(PuntoDeEntrega punto) {
        this.otrosPuntosDeEntrega.remove(punto);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idInterno == null) ? 0 : idInterno.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((razonSocialPrincipal == null) ? 0 : razonSocialPrincipal.hashCode());
        result = prime * result + ((otrosPuntosDeEntrega == null) ? 0 : otrosPuntosDeEntrega.hashCode());
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
        Cliente other = (Cliente) obj;
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
        if (razonSocialPrincipal == null) {
            if (other.razonSocialPrincipal != null)
                return false;
        } else if (!razonSocialPrincipal.equals(other.razonSocialPrincipal))
            return false;
        if (otrosPuntosDeEntrega == null) {
            if (other.otrosPuntosDeEntrega != null)
                return false;
        } else if (!otrosPuntosDeEntrega.equals(other.otrosPuntosDeEntrega))
            return false;
        return true;
    }

 
}
