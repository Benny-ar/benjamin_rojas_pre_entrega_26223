package com.techlab.articulo.model;

public class ArticuloAlimenticio extends Articulo{
    private int diasParaVencimiento;

    public ArticuloAlimenticio(int codigo, String nombre, double precio, Categoria categoria, int diasParaVencimiento){
        super(codigo, nombre, precio, categoria); //super() <-- Se usa el constructor de la clase padre Articulo
        this.diasParaVencimiento = diasParaVencimiento;
    }

    public int getDiasParaVencimiento(){
        return diasParaVencimiento;
    }
    public void setDiasParaVencimiento(int diasParaVencimiento){
        this.diasParaVencimiento = diasParaVencimiento;
    }

    @Override 
    public String getTipoArticulo(){
        return "Alimenticio";
    }
    @Override 
    public String getDetalleEspecifico(){
        return "días para vencimiento= " + diasParaVencimiento;
    }

    @Override 
    public String toString(){ //super.toString() llama al método toString() de Articulo .
        return super.toString() + " [subtipo alimenticio]";
    }
}
