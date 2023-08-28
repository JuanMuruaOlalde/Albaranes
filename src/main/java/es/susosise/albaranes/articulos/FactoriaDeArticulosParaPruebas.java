package es.susosise.albaranes.articulos;

public class FactoriaDeArticulosParaPruebas {
    
    public static Articulo getArticuloDePruebas(int n){
        return new Articulo(
            "A" + n + n + n + n + n + n
            , "Articulo" + n + "DePruebas"
            , "Este es el articulo de pruebas " + n
        );
    }
}
