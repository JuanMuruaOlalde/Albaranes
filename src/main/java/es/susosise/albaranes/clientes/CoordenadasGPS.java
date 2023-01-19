package es.susosise.albaranes.clientes;

public class CoordenadasGPS {
    // Las coordenadas se guardaran en formato ISO 6709/F con 6 decimales, por
    // ejemplo [1.286795, 103.854511]
    // https://en.wikipedia.org/wiki/Discrete_global_grid#Geocode_variants
    String latitud;
    String longitud;

    public CoordenadasGPS(String latitud, String longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

}
