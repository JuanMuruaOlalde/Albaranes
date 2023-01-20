package es.susosise.albaranes.albaranes;

import java.util.HashSet;

import es.susosise.albaranes.clientes.Cliente;
import es.susosise.albaranes.clientes.PuntoDeEntrega;

public class Albaran_dto {
    String numeroDeAlbaran;
    Cliente cliente;
    PuntoDeEntrega destino;
    HashSet<LineaDeAlbaran> lineas;

    public Albaran_dto(Albaran unAlbaran){
        this.numeroDeAlbaran = unAlbaran.numeroDeAlbaran;
        this.cliente = unAlbaran.cliente;
        this.destino = unAlbaran.destino;
        lineas = new HashSet<LineaDeAlbaran>();
        for(LineaDeAlbaran linea : unAlbaran.lineas){
            lineas.add(linea);
        };
    }

    public Albaran_dto(String numeroDeAlbaran, Cliente cliente, PuntoDeEntrega destino, HashSet<LineaDeAlbaran> lineas) {
        this.numeroDeAlbaran = numeroDeAlbaran;
        this.cliente = cliente;
        this.destino = destino;
        this.lineas = lineas;
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

    public HashSet<LineaDeAlbaran> getLineas() {
        return lineas;
    }

}
