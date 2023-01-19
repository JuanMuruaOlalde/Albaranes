package es.susosise.albaranes.albaranes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

import es.susosise.albaranes.clientes.Cliente;
import es.susosise.albaranes.clientes.PuntoDeEntrega;

@Entity
@Table(name = "albaranes_cabeceras")
public class Albaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    String numeroDeAlbaran;
    Cliente cliente;
    PuntoDeEntrega destino;

    List<LineaDeAlbaran> lineas;

    public Albaran(String numeroDeAlbaran, Cliente cliente, PuntoDeEntrega destino, List<LineaDeAlbaran> lineas) {
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

    public List<LineaDeAlbaran> getLineas() {
        return lineas;
    }

}
