package es.susosise.albaranes.clientes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManejoDeClientes {

    @Autowired
    Clientes_persistencia clientes;

    @Autowired
    PuntosDeEntrega_persistencia puntosDeEntrega;

    public ManejoDeClientes(Clientes_persistencia clientes, PuntosDeEntrega_persistencia puntosDeEntrega) {
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
