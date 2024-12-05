/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico4;
import javax.swing.JOptionPane;
/**
 *
 * @author sazaf
 */
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Maraton maraton = new Maraton();
        maraton.generarParticipantesIniciales();
        int opc;
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                "*** Menú Maratón ***\n\n" +
                "1. Registrar participante\n" +
                "2. Buscar participante\n" +
                "3. Listar por categoría\n" +
                "4. Eliminar participante\n" +
                "5. Salir\n\n" +
                "Digite su opción:"
            ));

            switch (opc) {
                case 1 -> maraton.registrarParticipante();
                case 2 -> {
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de corredor:"));
                    Participante p = maraton.buscarParticipante(numero);
                    JOptionPane.showMessageDialog(null, p != null ? p.toString() : "No se encontró el participante.");
                }
                case 3 -> {
                    String categoria = JOptionPane.showInputDialog("Ingrese la categoría (Juvenil, Adulto, Master):");
                    maraton.listarPorCategoria(categoria);
                }
                case 4 -> maraton.eliminarParticipante();
                case 5 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                default -> JOptionPane.showMessageDialog(null, "¡Opción incorrecta!");
            }
        } while (opc != 5);
    }

    }
    
