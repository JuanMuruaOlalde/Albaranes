package es.susosise.albaranes.albaranes;

import java.util.ArrayList;

import es.susosise.albaranes.articulos.ManejoDeArticulosParaPruebas;
import es.susosise.albaranes.clientes.Cliente;
import es.susosise.albaranes.clientes.ManejoDeClientesParaPruebas;

public class ManejoDeAlbaranesParaPruebas {

    public static Albaran getAlbaranDePrueba(int n){
        Cliente cliente = ManejoDeClientesParaPruebas.getClienteDePrueba(n);
        return new Albaran(
            "Alb" + n + n + n + n + n + n
            , cliente
            , cliente.getRazonSocialPrincipal()
            , ManejoDeAlbaranesParaPruebas.getUnasCuantasLineasDePrueba(n)
        );
    }
    

    public static ArrayList<LineaDeAlbaran> getUnasCuantasLineasDePrueba(int n){
        ArrayList<LineaDeAlbaran> lineas = new ArrayList<>();
        for (int i = 1; i < 6; i++){
            lineas.add(new LineaDeAlbaran(ManejoDeArticulosParaPruebas.getArticuloDePruebas(n * 10 + i), 33));
        }
        return lineas;
    }
}
