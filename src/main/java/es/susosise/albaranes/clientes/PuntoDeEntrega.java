package es.susosise.albaranes.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "puntos_de_entrega")
public class PuntoDeEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    String aliasIdentificativo;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = false)
    Poblacion poblacion;
    String zonaOpoligono;
    String calle;
    String portal;
    String pisoYmano;

    String telefonoDeContacto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clientes_idInterno", nullable = false)
    private Cliente cliente;

    public PuntoDeEntrega() {
    }

    public PuntoDeEntrega(String aliasIdentificativo, Poblacion poblacion, String zonaOpoligono,
            String calle, String portal, String pisoYmano, String telefonoDeContacto) {
        this.aliasIdentificativo = aliasIdentificativo;
        this.poblacion = poblacion;
        this.zonaOpoligono = zonaOpoligono;
        this.calle = calle;
        this.portal = portal;
        this.pisoYmano = pisoYmano;
        this.telefonoDeContacto = telefonoDeContacto;
    }

    @Override
    public String toString() {
        return "[" + poblacion.nombre + "] (" + zonaOpoligono + ") " + calle + ", " + portal + " ; " + pisoYmano;
    }

    public Long getIdInterno() {
        return idInterno;
    }

    public String getAliasIdentificativo() {
        return aliasIdentificativo;
    }

    public Poblacion getPoblacion() {
        return poblacion;
    }

    public String getZonaOpoligono() {
        return zonaOpoligono;
    }

    public String getCalle() {
        return calle;
    }

    public String getPortal() {
        return portal;
    }

    public String getPisoYmano() {
        return pisoYmano;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setIdInterno(Long idInterno) {
        this.idInterno = idInterno;
    }

    public void setAliasIdentificativo(String aliasIdentificativo) {
        this.aliasIdentificativo = aliasIdentificativo;
    }

    public void setPoblacion(Poblacion poblacion) {
        this.poblacion = poblacion;
    }

    public void setZonaOpoligono(String zonaOpoligono) {
        this.zonaOpoligono = zonaOpoligono;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public void setPisoYmano(String pisoYmano) {
        this.pisoYmano = pisoYmano;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idInterno == null) ? 0 : idInterno.hashCode());
        result = prime * result + ((aliasIdentificativo == null) ? 0 : aliasIdentificativo.hashCode());
        result = prime * result + ((poblacion == null) ? 0 : poblacion.hashCode());
        result = prime * result + ((zonaOpoligono == null) ? 0 : zonaOpoligono.hashCode());
        result = prime * result + ((calle == null) ? 0 : calle.hashCode());
        result = prime * result + ((portal == null) ? 0 : portal.hashCode());
        result = prime * result + ((pisoYmano == null) ? 0 : pisoYmano.hashCode());
        result = prime * result + ((telefonoDeContacto == null) ? 0 : telefonoDeContacto.hashCode());
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
        PuntoDeEntrega other = (PuntoDeEntrega) obj;
        if (idInterno == null) {
            if (other.idInterno != null)
                return false;
        } else if (!idInterno.equals(other.idInterno))
            return false;
        if (aliasIdentificativo == null) {
            if (other.aliasIdentificativo != null)
                return false;
        } else if (!aliasIdentificativo.equals(other.aliasIdentificativo))
            return false;
        if (poblacion == null) {
            if (other.poblacion != null)
                return false;
        } else if (!poblacion.equals(other.poblacion))
            return false;
        if (zonaOpoligono == null) {
            if (other.zonaOpoligono != null)
                return false;
        } else if (!zonaOpoligono.equals(other.zonaOpoligono))
            return false;
        if (calle == null) {
            if (other.calle != null)
                return false;
        } else if (!calle.equals(other.calle))
            return false;
        if (portal == null) {
            if (other.portal != null)
                return false;
        } else if (!portal.equals(other.portal))
            return false;
        if (pisoYmano == null) {
            if (other.pisoYmano != null)
                return false;
        } else if (!pisoYmano.equals(other.pisoYmano))
            return false;
        if (telefonoDeContacto == null) {
            if (other.telefonoDeContacto != null)
                return false;
        } else if (!telefonoDeContacto.equals(other.telefonoDeContacto))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        return true;
    }

}
