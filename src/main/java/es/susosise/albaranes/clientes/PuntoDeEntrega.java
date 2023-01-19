package es.susosise.albaranes.clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "puntos_de_entrega")
public class PuntoDeEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    @GeneratedValue(strategy = GenerationType.UUID)
    UUID idPublico;

    String aliasIdentificativo;

    Poblacion poblacion;
    String zonaOpoligono;
    String calle;
    String portal;
    String pisoYmano;

    String telefonoDeContacto;
    CoordenadasGPS coordenadas;
}
