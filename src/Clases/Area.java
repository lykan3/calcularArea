/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LYKAN
 */
public class Area {
    private int ancho;
    private int largo;

    public Area(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    
    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
   
    public static int calcularArea(int n1,int n2){
     return n1*n2;


}


}