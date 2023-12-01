package com.unbosque.primerospring.models;

import jakarta.persistence.*;
@Entity
@Table(name ="mostrar_rol_fun")
public class RolComplete {


        @Column(name="id")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name="descripcion_rol")
        private String descripcion;
        @Column(name="descripcion")
        private String estado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
