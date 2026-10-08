package com.techlab.articulo.model;

// Una clase abstracta es una clase que no se puede instanciar directamente.
public abstract class Articulo {
    private int codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;

    public Articulo(int codigo, String nombre, double precio, Categoria categoria){

    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    //metodos abstractos
    public abstract String getTipoArticulo();

    public abstract String getDetalleEspecifico();

    @Override 
    public String toString(){
        return "Articulo {" +
                "código=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                ", nombre de categoria='" + categoria + '\'' +
                ", tipo de articulo='" + getTipoArticulo() + '\'' +
                ", detalle especifico='" + getDetalleEspecifico() + '\'' +
                '}';
    }


}
