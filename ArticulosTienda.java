
package com.mycompany.proyectofinal2;

public class ArticulosTienda {
   private String date;
    private String cliente;
    private String cedula;
    private String codigo;
    private String nomArticulo;
    private String tipo;
    private String cantidad;
    private String prePorUnidad;
    private String subtotal;
    private String iva;
    private String totalPagar;

    public ArticulosTienda(String date, String cliente, String cedula, String codigo, String nomArticulo, String tipo, String cantidad, String prePorUnidad, String subtotal, String iva, String totalPagar) {
        this.date = date;
        this.cliente = cliente;
        this.cedula = cedula;
        this.codigo = codigo;
        this.nomArticulo = nomArticulo;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.prePorUnidad = prePorUnidad;
        this.subtotal = subtotal;
        this.iva = iva;
        this.totalPagar = totalPagar;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomArticulo() {
        return nomArticulo;
    }

    public void setNomArticulo(String nomArticulo) {
        this.nomArticulo = nomArticulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrePorUnidad() {
        return prePorUnidad;
    }

    public void setPrePorUnidad(String prePorUnidad) {
        this.prePorUnidad = prePorUnidad;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(String totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    
}
