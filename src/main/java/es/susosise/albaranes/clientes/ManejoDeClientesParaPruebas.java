package es.susosise.albaranes.clientes;

import java.util.HashSet;

public class ManejoDeClientesParaPruebas {

    public static Cliente getClienteDePrueba(int n) {
        PuntoDeEntrega puntoDeEntregaPrincipal = getPuntoDeEntregaDePrueba(n);
        Cliente cliente = new Cliente(
                "ClienteDePrueba" + n, puntoDeEntregaPrincipal);
        puntoDeEntregaPrincipal.setCliente(cliente);
        // Por ahora no se le han añadido mas puntos de entrega
        // y este for para procesarlos no seria necesario.
        // Pero se deja aquí como recordatorio.
        for (PuntoDeEntrega punto : cliente.getOtrosPuntosDeEntrega()) {
            punto.setCliente(cliente);
        }
        return cliente;
    }

    public static PuntoDeEntrega getPuntoDeEntregaDePrueba(int n) {
        return new PuntoDeEntrega(
                "aliasDePrueba" + n, getPoblacionDePrueba(n), "Poligono " + n + " de Pruebas" + n,
                "Calle " + n + " de Pruebas" + n, "N" + n, "P" + n + "izda",
                n + n + n + "-" + n + n + "-" + n + n + "-" + n + n);
        // , new CoordenadasGPS(n + ".999999", (n+1) + ".888888")
    }

    public static Poblacion getPoblacionDePrueba(int n) {
        return new Poblacion(
                "Pueblo " + n + " de Pruebas", "" + n + n + n + n + n + "");

    }

}
