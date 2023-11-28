package com.unbosque.primerospring.models;

public class FacturaResponse {

    private long ID_TIPOCFAC ;
    private long CLIENTE_FACTURA;

    private double TOTAL_FACTURA;
    private double DESCUENTO_FACTURA;
    private String ESTADO_FACTURA;


    public long getID_TIPOCFAC() {
        return ID_TIPOCFAC;
    }

    public void setID_TIPOCFAC(int ID_TIPOCFAC) {
        this.ID_TIPOCFAC = ID_TIPOCFAC;
    }

    public long getCLIENTE_FACTURA() {
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

    public String getESTADO_FACTURA() {
        return ESTADO_FACTURA;
    }

    public void setESTADO_FACTURA(String ESTADO_FACTURA) {
        this.ESTADO_FACTURA = ESTADO_FACTURA;
    }

    public FacturaResponse(long ID_TIPOCFAC, long CLIENTE_FACTURA, double TOTAL_FACTURA, double DESCUENTO_FACTURA, String ESTADO_FACTURA) {
        this.ID_TIPOCFAC = ID_TIPOCFAC;
        this.CLIENTE_FACTURA = CLIENTE_FACTURA;
        this.TOTAL_FACTURA = TOTAL_FACTURA;
        this.DESCUENTO_FACTURA = DESCUENTO_FACTURA;
        this.ESTADO_FACTURA = ESTADO_FACTURA;
    }
}
