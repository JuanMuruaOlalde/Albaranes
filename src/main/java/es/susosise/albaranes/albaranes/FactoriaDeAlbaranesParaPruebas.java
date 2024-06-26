package es.susosise.albaranes.albaranes;

import java.util.HashSet;

import es.susosise.albaranes.articulos.FactoriaDeArticulosParaPruebas;
import es.susosise.albaranes.clientes.Cliente;
import es.susosise.albaranes.clientes.FactoriaDeClientesParaPruebas;

public class FactoriaDeAlbaranesParaPruebas {

    public static Albaran getUnAlbaranDePruebaRealista() {
        Cliente unCliente = FactoriaDeClientesParaPruebas.getUnClienteDePruebaRealista();
        return new Albaran(
            "Alb000001-2023", 
            unCliente, unCliente.getPuntoDeEntregaPrincipal(),
            FactoriaDeAlbaranesParaPruebas.getUnasCuantasLineasDePrueba(7));
    }

    public static Albaran getOtroAlbaranDePruebaRealista() {
        Cliente otroCliente = FactoriaDeClientesParaPruebas.getOtroClienteDePruebaRealista();
        return new Albaran(
            "Alb000002-2023", 
            otroCliente, otroCliente.getPuntoDeEntregaPrincipal(),
            FactoriaDeAlbaranesParaPruebas.getUnasCuantasLineasDePrueba(8));
    }

    public static Albaran getAlbaranDePrueba(int n) {
        Cliente cliente = FactoriaDeClientesParaPruebas.getClienteDePrueba(n);
        Albaran albaran = new Albaran(
                "Alb" + n + n + n + n + n + n, cliente, cliente.getPuntoDeEntregaPrincipal(),
                FactoriaDeAlbaranesParaPruebas.getUnasCuantasLineasDePrueba(n));
        return albaran;
    }

    public static HashSet<LineaDeAlbaran> getUnasCuantasLineasDePrueba(int n) {
        HashSet<LineaDeAlbaran> lineas = new HashSet<>();
        for (int i = 1; i < 6; i++) {
            lineas.add(new LineaDeAlbaran(FactoriaDeArticulosParaPruebas.getArticuloDePruebas(n * 10 + i), 33));
        }
        return lineas;
    }
}
