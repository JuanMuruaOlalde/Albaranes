package es.susosise.albaranes.clientes;

import java.util.HashSet;

public class Cliente_dto {
    private String nombre;
    private PuntoDeEntrega_dto razonSocialPrincipal;
    private HashSet<PuntoDeEntrega_dto> otrosPuntosDeEntrega;

    public Cliente_dto(Cliente unCliente) {
        this.nombre = unCliente.nombre;
        this.razonSocialPrincipal = new PuntoDeEntrega_dto(unCliente.razonSocialPrincipal);
        this.otrosPuntosDeEntrega = new HashSet<>();
        for (PuntoDeEntrega punto : unCliente.getOtrosPuntosDeEntrega()) {
            otrosPuntosDeEntrega.add(new PuntoDeEntrega_dto(punto));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public PuntoDeEntrega_dto getRazonSocialPrincipal() {
        return razonSocialPrincipal;
    }

    public HashSet<PuntoDeEntrega_dto> getOtrosPuntosDeEntrega() {
        return otrosPuntosDeEntrega;
    }

}
