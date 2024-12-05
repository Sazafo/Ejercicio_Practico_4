/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico4;

import javax.swing.JOptionPane;

/**
 *
 * @author sazaf
 */
public class Maraton {

    private Participante[] participantes = new Participante[10]; // Capacidad máxima de 10 participantes
    private int contador = 0; // Número actual de participantes registrados

    public void registrarParticipante() {
        if (contador < participantes.length) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de corredor:"));
            int tiempoEstimado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo estimado (min):"));
            if (buscarParticipante(numero) == null) {
                participantes[contador] = new Participante(nombre, edad, numero, tiempoEstimado);
                contador++;
                JOptionPane.showMessageDialog(null, "Participante registrado.");
            } else {
                JOptionPane.showMessageDialog(null, "El número de corredor ya está registrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden registrar más participantes.");
        }
    }

    public Participante buscarParticipante(int numero) {
        for (int i = 0; i < contador; i++) {
            if (participantes[i].getNumeroCorredor() == numero) {
                return participantes[i];
            }
        }
        return null;
    }

    public void listarPorCategoria(String categoria) {
        String mensaje = "Participantes en la categoría " + categoria + ":\n";
        for (int i = 0; i < contador; i++) {
            if (participantes[i].getCategoria().equalsIgnoreCase(categoria)) {
                mensaje += "Nombre: " + participantes[i].getNombreCompleto() + "\n"
                        + "Edad: " + participantes[i].getEdad() + "\n"
                        + "Número: " + participantes[i].getNumeroCorredor() + "\n"
                        + "Tiempo Estimado: " + participantes[i].getTiempoEstimado() + " min\n"
                        + "Categoría: " + participantes[i].getCategoria() + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void eliminarParticipante() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de corredor a eliminar:"));
        boolean eliminado = false;
        for (int i = 0; i < contador; i++) {
            if (participantes[i].getNumeroCorredor() == numero) {
                // Desplazar los elementos del arreglo hacia la izquierda
                for (int j = i; j < contador - 1; j++) {
                    participantes[j] = participantes[j + 1];
                }
                participantes[contador - 1] = null; // Limpiar el último elemento
                contador--;
                eliminado = true;
                JOptionPane.showMessageDialog(null, "Participante eliminado.");
                break;
            }
        }
        if (!eliminado) {
            JOptionPane.showMessageDialog(null, "No se encontró el participante.");
        }
    }

    public void generarParticipantesIniciales() {
        participantes[0] = new Participante("Juan Pérez", 25, 1, 120);
        participantes[1] = new Participante("Ana Gómez", 17, 2, 130);
        participantes[2] = new Participante("Carlos López", 45, 3, 140);
        contador = 3;
    }
}
