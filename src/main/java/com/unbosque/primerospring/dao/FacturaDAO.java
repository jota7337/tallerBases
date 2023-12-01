package com.unbosque.primerospring.dao;


import com.unbosque.primerospring.dao.repository.FacturaRepository;
import com.unbosque.primerospring.models.Factura;
import com.unbosque.primerospring.models.FacturaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaDAO {
    @Autowired
    FacturaRepository facturaRepository;


    public List<Factura> getFactura(){
        return facturaRepository.findAll();
    }

    public Optional<Factura> getFacturaId(Integer id){
        return facturaRepository.findById(id);
    }

    public void insert(Long ID_TIPOFAC,  Long CLIENTE_FACTURA, double TOTAL_FACTURA,  double DESCUENTO_FACTURA){
        facturaRepository.insert(ID_TIPOFAC, CLIENTE_FACTURA,  TOTAL_FACTURA, DESCUENTO_FACTURA);
    };

    public void saveOrUpdate(Factura factura){
        facturaRepository.save(factura);
    }


    public void delete(Integer id){
        facturaRepository.deleteById(id);
    }





}
