package es.susosise.albaranes.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    String nombre;
    PuntoDeEntrega razonSocialPrincipal;
    List<PuntoDeEntrega> puntosDeEntrega;

    public Cliente(String nombre, PuntoDeEntrega razonSocialPrincipal, List<PuntoDeEntrega> puntosDeEntrega) {
        this.nombre = nombre;
        this.razonSocialPrincipal = razonSocialPrincipal;
        this.puntosDeEntrega = puntosDeEntrega;
    }

    public Long getIdInterno() {
        return idInterno;
    }

    public String getNombre() {
        return nombre;
    }

    public PuntoDeEntrega getRazonSocialPrincipal() {
        return razonSocialPrincipal;
    }

    public List<PuntoDeEntrega> getPuntosDeEntrega() {
        return puntosDeEntrega;
    }

}
