package com.unbosque.primerospring.controllers;


import com.unbosque.primerospring.dao.FacturaDAO;
import com.unbosque.primerospring.dao.UsuarioDAO;
import com.unbosque.primerospring.models.Factura;
import com.unbosque.primerospring.models.FacturaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/factura")
public class ControllerFactura {

    @Autowired
    private FacturaDAO facturaDAO;

    @GetMapping
    public List<Factura> getAll(){
        return facturaDAO.getFactura();
    }

/*    @PostMapping
    public void saveUpdate(@RequestBody Factura factura){
        facturaDAO.saveOrUpdate(factura);
    }*/

    @PostMapping
    public void insert(@RequestBody FacturaResponse factura){
        facturaDAO.insert( factura.getID_TIPOCFAC(), factura.getCLIENTE_FACTURA(),factura.getTOTAL_FACTURA(),
                factura.getDESCUENTO_FACTURA());
    }


    @DeleteMapping("/{ID_FACTURA}")
    public void delete(@PathVariable("ID_FACTURA") Integer ID_FACTURA){
        facturaDAO.delete(ID_FACTURA);
    }

    @GetMapping("/{ID_FACTURA}")
    public Optional<Factura> getById(@PathVariable("ID_FACTURA") Integer ID_FACTURA){
        return facturaDAO.getFacturaId(ID_FACTURA);
    }
}
