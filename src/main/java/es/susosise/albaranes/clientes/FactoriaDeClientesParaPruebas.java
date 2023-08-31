package es.susosise.albaranes.clientes;

import java.util.HashSet;

public class FactoriaDeClientesParaPruebas {

    public static Cliente getUnClienteDePruebaRealista() {
        PuntoDeEntrega puntoDeEntregaPrincipal = 
            new PuntoDeEntrega("faro de Punta Galea", new Poblacion("Getxo", "48993"), null, "Galea", "1", null, "999-99-99-99", 43.37183380126953, -3.035311460494995);
        Cliente cliente = new Cliente("UnClienteDePrueba", puntoDeEntregaPrincipal);
        puntoDeEntregaPrincipal.setCliente(cliente);
        return cliente;
    }
    public static Cliente getOtroClienteDePruebaRealista() {
        PuntoDeEntrega puntoDeEntregaPrincipal = 
            new PuntoDeEntrega("monte Urgull", new Poblacion("Donostia", "20003"), null, "Urgull", "1", null, "888-88-88-88", 43.32531, -1.98986);
        Cliente cliente = new Cliente("OtroClienteDePrueba", puntoDeEntregaPrincipal);
        puntoDeEntregaPrincipal.setCliente(cliente);
        return cliente;
    }

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
                n + n + n + "-" + n + n + "-" + n + n + "-" + n + n , n + 0.9, n + 0.8);
    }

    public static HashSet<PuntoDeEntrega> getUnParDeOtrosPuntosDeEntregaDePrueba(int n) {
        HashSet<PuntoDeEntrega> otrosPuntos = new HashSet<>();
        PuntoDeEntrega punto01 = new PuntoDeEntrega(
                "otro1aliasDePrueba" + n, getPoblacionDePrueba(n), "otro1Poligono " + n + " de Pruebas" + n,
                "otra1Calle " + n + " de Pruebas" + n, "N" + n, "P" + n + "izda",
                n + n + n + "-" + n + n + "-" + n + n + "-" + n + n, n + 0.9, n + 0.8);
        otrosPuntos.add(punto01);
        PuntoDeEntrega punto02 = new PuntoDeEntrega(
                "otro2aliasDePrueba" + n, getPoblacionDePrueba(n), "otro2Poligono " + n + " de Pruebas" + n,
                "otra2Calle " + n + " de Pruebas" + n, "N" + n, "P" + n + "izda",
                n + n + n + "-" + n + n + "-" + n + n + "-" + n + n, n + 0.9, n + 0.8);
        otrosPuntos.add(punto02);
        return otrosPuntos;
    }

    public static Poblacion getPoblacionDePrueba(int n) {
        return new Poblacion(
                "Pueblo " + n + " de Pruebas", "" + n + n + n + n + n + "");

    }

}
