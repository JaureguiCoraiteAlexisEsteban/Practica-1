/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

/**
 *
 * @author aalex
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto p = new Punto(3, 4);
        double[] cartesianas = p.coordCartesianas();
        System.out.println("Coordenadas Cartesianas: ("+ cartesianas[0] + ", " + cartesianas[1] + ")");
        double[] polares = p.coordPolares();
        System.out.println("Coordenadas Polares: (r=" + polares[0] + ", 0=" + polares[1] + " rad)");
        System.out.println("Representacion de texto: " + p);
    }
    
}
