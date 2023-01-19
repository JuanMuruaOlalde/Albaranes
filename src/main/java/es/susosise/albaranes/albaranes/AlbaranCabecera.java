package es.susosise.albaranes.albaranes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

import es.susosise.albaranes.clientes.Cliente;
import es.susosise.albaranes.clientes.PuntoDeEntrega;

@Entity
@Table(name = "albaranes_cabeceras")
public class AlbaranCabecera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterno;

    @GeneratedValue(strategy = GenerationType.UUID)
    UUID idPublico;

    String numeroDeAlbaran;
    Cliente cliente;
    PuntoDeEntrega destino;

    List<AlbaranLinea> lineas;

}
