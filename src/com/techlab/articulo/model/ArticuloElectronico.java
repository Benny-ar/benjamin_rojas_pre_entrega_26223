package com.techlab.articulo.model;

public class ArticuloElectronico extends Articulo{
    private int garantiaMeses;

    public ArticuloElectronico(int codigo, String nombre, double precio, Categoria categoria, int garantiaMeses){
        super(codigo, nombre, precio, categoria); //super() <-- Se usa el constructor de la clase padre Articulo
        this.garantiaMeses = garantiaMeses;
    }
    
    //Getters y Setters
    public int getGarantiaMeses(){
        return garantiaMeses;
    }
    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }

    public String nroTelMesaDeAyudaParaReclamos(){
        return "0800-123-4567";
    }

    @Override 
    public String getTipoArticulo(){
        return "Electrónico";
    }
    @Override 
    public String getDetalleEspecifico(){
        return "garantía= " + garantiaMeses + " meses";
    }

    @Override 
    public String toString(){ //super.toString() llama al método toString() de Articulo .
        return super.toString() + " [subtipo electrónico]";
    }
}
