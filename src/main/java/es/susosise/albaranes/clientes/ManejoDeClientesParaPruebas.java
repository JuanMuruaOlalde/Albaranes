package es.susosise.albaranes.clientes;

import java.util.HashSet;

public class ManejoDeClientesParaPruebas {

    public static Cliente getClienteDePrueba(int n) {
        PuntoDeEntrega puntoDeEntregaPrincipal = getPuntoDeEntregaDePrueba(n);
        Cliente cliente = new Cliente(
                "ClienteDePrueba" + n, puntoDeEntregaPrincipal);
        for (PuntoDeEntrega punto : getUnParDeOtrosPuntosDeEntregaDePrueba((n))) {
            cliente.añadirUnPuntoDeEntrega(punto);
        }
        puntoDeEntregaPrincipal.setCliente(cliente);
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

    public static HashSet<PuntoDeEntrega> getUnParDeOtrosPuntosDeEntregaDePrueba(int n) {
        HashSet<PuntoDeEntrega> otrosPuntos = new HashSet<>();
        PuntoDeEntrega punto01 = new PuntoDeEntrega(
                "otro1aliasDePrueba" + n, getPoblacionDePrueba(n), "otro1Poligono " + n + " de Pruebas" + n,
                "otra1Calle " + n + " de Pruebas" + n, "N" + n, "P" + n + "izda",
                n + n + n + "-" + n + n + "-" + n + n + "-" + n + n);
        // , new CoordenadasGPS(n + ".999999", (n+1) + ".888888")
        otrosPuntos.add(punto01);
        PuntoDeEntrega punto02 = new PuntoDeEntrega(
                "otro2aliasDePrueba" + n, getPoblacionDePrueba(n), "otro2Poligono " + n + " de Pruebas" + n,
                "otra2Calle " + n + " de Pruebas" + n, "N" + n, "P" + n + "izda",
                n + n + n + "-" + n + n + "-" + n + n + "-" + n + n);
        // , new CoordenadasGPS(n + ".999999", (n+1) + ".888888")
        otrosPuntos.add(punto02);
        return otrosPuntos;
    }

    public static Poblacion getPoblacionDePrueba(int n) {
        return new Poblacion(
                "Pueblo " + n + " de Pruebas", "" + n + n + n + n + n + "");

    }

}
