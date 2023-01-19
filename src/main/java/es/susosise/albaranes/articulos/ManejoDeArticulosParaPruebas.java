package es.susosise.albaranes.articulos;

public class ManejoDeArticulosParaPruebas {
    
    public static Articulo getArticuloDePruebas(int n){
        return new Articulo(
            "A" + n + n + n + n + n + n
            , "Articulo" + n + "DePruebas"
            , "Este es el articulo de pruebas " + n
        );
    }
}
