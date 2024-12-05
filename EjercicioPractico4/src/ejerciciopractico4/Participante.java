/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico4;

/**
 *
 * @author sazaf
 */
public class Participante {
    private String nombreCompleto;
    private int edad;
    private int numeroCorredor;
    private int tiempoEstimado;
    private String categoria;
    
    
    public Participante(String nombreCompleto, int edad, int numeroCorredor, int tiempoEstimado){
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.numeroCorredor = numeroCorredor;
        this.tiempoEstimado = tiempoEstimado;
        calcularCategoria();
    }
    
    private void calcularCategoria(){
        if (edad < 18 ){
            this.categoria = "Juvenil";
        } else if(edad <= 40){
            this.categoria = "Adulto";
        } else {
            this.categoria = "Master";
        }
        
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroCorredor() {
        return numeroCorredor;
    }     

    Object getCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
