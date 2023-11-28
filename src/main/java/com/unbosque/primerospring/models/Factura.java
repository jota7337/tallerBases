package com.unbosque.primerospring.models;

import jakarta.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_FACTURA;
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime FECHA_FACTURA = LocalDateTime.now();
    private int ID_TIPOFAC;
    private int CLIENTE_FACTURA;
    private double TOTAL_FACTURA;
    private double DESCUENTO_FACTURA;
    private double IVA_FACTURA;
    private double SUBTOTAL_FACTURA;
    private double SALDO_FACTURA;
    private String ESTADO_FACTURA = "Z";




    public int getID_FACTURA() {
        return ID_FACTURA;
    }

    public void setID_FACTURA(int ID_FACTURA) {
        this.ID_FACTURA = ID_FACTURA;
    }

    public LocalDateTime getFECHA_FACTURA() {
        return FECHA_FACTURA;
    }

    public void setFECHA_FACTURA(LocalDateTime FECHA_FACTURA) {
        this.FECHA_FACTURA = FECHA_FACTURA;
    }

    public int getID_TIPOFAC() {
        return ID_TIPOFAC;
    }

    public void setID_TIPOFAC(int ID_TIPOFAC) {
        this.ID_TIPOFAC = ID_TIPOFAC;
    }

    public int getCLIENTE_FACTURA() {
        return CLIENTE_FACTURA;
    }

    public void setCLIENTE_FACTURA(int CLIENTE_FACTURA) {
        this.CLIENTE_FACTURA = CLIENTE_FACTURA;
    }

    public double getTOTAL_FACTURA() {
        return TOTAL_FACTURA;
    }

    public void setTOTAL_FACTURA(double TOTAL_FACTURA) {
        this.TOTAL_FACTURA = TOTAL_FACTURA;
    }

    public double getDESCUENTO_FACTURA() {
        return DESCUENTO_FACTURA;
    }

    public void setDESCUENTO_FACTURA(double DESCUENTO_FACTURA) {
        this.DESCUENTO_FACTURA = DESCUENTO_FACTURA;
    }

    public double getIVA_FACTURA() {
        return IVA_FACTURA;
    }

    public void setIVA_FACTURA(double IVA_FACTURA) {
        this.IVA_FACTURA = IVA_FACTURA;
    }

    public double getSUBTOTAL_FACTURA() {
        return SUBTOTAL_FACTURA;
    }

    public void setSUBTOTAL_FACTURA(double SUBTOTAL_FACTURA) {
        this.SUBTOTAL_FACTURA = SUBTOTAL_FACTURA;
    }

    public double getSALDO_FACTURA() {
        return SALDO_FACTURA;
    }

    public void setSALDO_FACTURA(double SALDO_FACTURA) {
        this.SALDO_FACTURA = SALDO_FACTURA;
    }

    public String getESTADO_FACTURA() {
        return ESTADO_FACTURA;
    }

    public void setESTADO_FACTURA(String ESTADO_FACTURA) {
        this.ESTADO_FACTURA = ESTADO_FACTURA;
    }
}
