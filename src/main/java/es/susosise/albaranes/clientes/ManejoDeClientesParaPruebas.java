package es.susosise.albaranes.clientes;

import java.util.ArrayList;

public class ManejoDeClientesParaPruebas {

    public static Cliente getClienteDePrueba(int n) {
        ArrayList<PuntoDeEntrega> puntosDeEntrega = new ArrayList<>();
        return new Cliente(
            "ClienteDePrueba" + n
            , getPuntoDeEntregaDePrueba(n)
            , puntosDeEntrega
            );
    }

    public static PuntoDeEntrega getPuntoDeEntregaDePrueba(int n) {
        return new PuntoDeEntrega(
            "aliasDePrueba" + n
            , getPoblacionDePrueba(n)
            , "Poligono " + n + " de Pruebas" + n
            , "Calle " + n + " de Pruebas" + n
            , "N" + n
            , "P" + n + "izda"
            , n + n + n +"-" + n + n + "-" + n + n + "-" + n + n
            , new CoordenadasGPS(n + ".999999", (n+1) + ".888888")
            );
    }

    public static Poblacion getPoblacionDePrueba(int n) {
        return new Poblacion(
            "Pueblo " + n + " de Pruebas"
            , "" + n + n + n + n + n + ""
            );

    }

}
