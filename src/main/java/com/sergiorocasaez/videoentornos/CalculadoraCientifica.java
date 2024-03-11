package com.sergiorocasaez.videoentornos;

/**
 * Calculadora científica de las chungas
 * @author PC
 */
public class CalculadoraCientifica extends Calculadora {
     /**
      * Constructor sin parámetros
      */
    public CalculadoraCientifica(){
        tipoCalculadora = 1;
    }
     
    /**
     * Constructor completo
     * @param tipo El tipo de calculadora
     */
    public CalculadoraCientifica(int tipo){
        this.tipoCalculadora = tipo;
    }
    
}
