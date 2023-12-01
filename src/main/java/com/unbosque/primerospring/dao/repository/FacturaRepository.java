package com.unbosque.primerospring.dao.repository;


import com.unbosque.primerospring.models.Factura;
import com.unbosque.primerospring.models.FacturaResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    @Modifying
    @Query(value = "CALL insert_factura(:ID_TIPOFAC, :CLIENTE_FACTURA,:TOTAL_FACTURA,:DESCUENTO_FACTURA)", nativeQuery = true)
    @Transactional
     void insert(Long ID_TIPOFAC,  Long CLIENTE_FACTURA, double TOTAL_FACTURA,  double DESCUENTO_FACTURA);

}
