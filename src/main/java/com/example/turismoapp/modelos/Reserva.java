package com.example.turismoapp.modelos;
import java.util.Date;

public class Reserva {
//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private Date fechaReserva;


//CONSTRUCTOR VACIO
    public Reserva() {
    }


//CONSTRUCTOR LLENO
    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, Date fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }


//GETTERS Y SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
