package es.susosise.albaranes.albaranes;

import java.util.HashSet;

import es.susosise.albaranes.articulos.FactoriaDeArticulosParaPruebas;
import es.susosise.albaranes.clientes.Cliente;
import es.susosise.albaranes.clientes.FactoriaDeClientesParaPruebas;

public class FactoriaDeAlbaranesParaPruebas {

    public static Albaran getAlbaranDePrueba(int n) {
        Cliente cliente = FactoriaDeClientesParaPruebas.getClienteDePrueba(n);
        Albaran albaran = new Albaran(
                "Alb" + n + n + n + n + n + n, cliente, cliente.getRazonSocialPrincipal(),
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
