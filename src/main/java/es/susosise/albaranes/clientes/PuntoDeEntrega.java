package es.susosise.albaranes.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "puntos_de_entrega")
public class PuntoDeEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    String aliasIdentificativo;

    Poblacion poblacion;
    String zonaOpoligono;
    String calle;
    String portal;
    String pisoYmano;

    String telefonoDeContacto;
    CoordenadasGPS coordenadas;

    public PuntoDeEntrega(String aliasIdentificativo, Poblacion poblacion, String zonaOpoligono,
            String calle, String portal, String pisoYmano, String telefonoDeContacto, CoordenadasGPS coordenadas) {
        this.aliasIdentificativo = aliasIdentificativo;
        this.poblacion = poblacion;
        this.zonaOpoligono = zonaOpoligono;
        this.calle = calle;
        this.portal = portal;
        this.pisoYmano = pisoYmano;
        this.telefonoDeContacto = telefonoDeContacto;
        this.coordenadas = coordenadas;
    }

}
