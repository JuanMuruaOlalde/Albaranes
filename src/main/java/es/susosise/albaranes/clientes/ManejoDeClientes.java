package es.susosise.albaranes.clientes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManejoDeClientes {

    @Autowired
    Cliente_persistencia clientes;

    @Autowired
    PuntoDeEntrega_persistencia puntosDeEntrega;

    public ManejoDeClientes(Cliente_persistencia clientes, PuntoDeEntrega_persistencia puntosDeEntrega) {
        this.clientes = clientes;
        this.puntosDeEntrega = puntosDeEntrega;
    }


    public Optional<Cliente> getCliente(Long idInterno) {
        return clientes.findById(idInterno);
    }

    public void guardar(Cliente unCliente) {
       clientes.save(unCliente);
    }

    

}
