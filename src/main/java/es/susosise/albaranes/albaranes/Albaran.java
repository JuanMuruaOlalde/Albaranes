package es.susosise.albaranes.albaranes;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

import es.susosise.albaranes.clientes.Cliente;
import es.susosise.albaranes.clientes.PuntoDeEntrega;

@Entity
@Table(name = "albaranes_cabeceras")
public class Albaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    String numeroDeAlbaran;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    PuntoDeEntrega destino;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<LineaDeAlbaran> lineas;

    public Albaran() {
    }

    public Albaran(String numeroDeAlbaran, Cliente cliente, PuntoDeEntrega destino, Set<LineaDeAlbaran> lineas) {
        this.numeroDeAlbaran = numeroDeAlbaran;
        this.cliente = cliente;
        this.destino = destino;
        this.lineas = lineas;
    }

    public Long getIdInterno() {
        return idInterno;
    }

    public String getNumeroDeAlbaran() {
        return numeroDeAlbaran;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PuntoDeEntrega getDestino() {
        return destino;
    }

    public Set<LineaDeAlbaran> getLineas() {
        return lineas;
    }

    public void setIdInterno(Long idInterno) {
        this.idInterno = idInterno;
    }

    public void setNumeroDeAlbaran(String numeroDeAlbaran) {
        this.numeroDeAlbaran = numeroDeAlbaran;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDestino(PuntoDeEntrega destino) {
        this.destino = destino;
    }

    public void setLineas(Set<LineaDeAlbaran> lineas) {
        this.lineas = lineas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idInterno == null) ? 0 : idInterno.hashCode());
        result = prime * result + ((numeroDeAlbaran == null) ? 0 : numeroDeAlbaran.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((destino == null) ? 0 : destino.hashCode());
        result = prime * result + ((lineas == null) ? 0 : lineas.hashCode());
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
        Albaran other = (Albaran) obj;
        if (idInterno == null) {
            if (other.idInterno != null)
                return false;
        } else if (!idInterno.equals(other.idInterno))
            return false;
        if (numeroDeAlbaran == null) {
            if (other.numeroDeAlbaran != null)
                return false;
        } else if (!numeroDeAlbaran.equals(other.numeroDeAlbaran))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (destino == null) {
            if (other.destino != null)
                return false;
        } else if (!destino.equals(other.destino))
            return false;
        if (lineas == null) {
            if (other.lineas != null)
                return false;
        } else if (!lineas.equals(other.lineas))
            return false;
        return true;
    }

}
