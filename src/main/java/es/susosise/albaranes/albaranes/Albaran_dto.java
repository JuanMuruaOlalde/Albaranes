package es.susosise.albaranes.albaranes;

import java.util.HashSet;

import es.susosise.albaranes.clientes.Cliente_dto;
import es.susosise.albaranes.clientes.PuntoDeEntrega_dto;

public class Albaran_dto {
    private String numeroDeAlbaran;
    private Cliente_dto cliente;
    private PuntoDeEntrega_dto destino;
    private HashSet<LineaDeAlbaran_dto> lineas;

    public Albaran_dto(Albaran unAlbaran) {
        this.numeroDeAlbaran = unAlbaran.numeroDeAlbaran;
        this.cliente = new Cliente_dto(unAlbaran.cliente);
        this.destino = new PuntoDeEntrega_dto(unAlbaran.destino);
        lineas = new HashSet<>();
        for (LineaDeAlbaran linea : unAlbaran.lineas) {
            lineas.add(new LineaDeAlbaran_dto(linea));
        }
        ;
    }

    public Albaran_dto(String numeroDeAlbaran, Cliente_dto cliente, PuntoDeEntrega_dto destino,
            HashSet<LineaDeAlbaran_dto> lineas) {
        this.numeroDeAlbaran = numeroDeAlbaran;
        this.cliente = cliente;
        this.destino = destino;
        this.lineas = lineas;
    }

    public String getNumeroDeAlbaran() {
        return numeroDeAlbaran;
    }

    public Cliente_dto getCliente() {
        return cliente;
    }

    public PuntoDeEntrega_dto getDestino() {
        return destino;
    }

    public HashSet<LineaDeAlbaran_dto> getLineas() {
        return lineas;
    }

}
