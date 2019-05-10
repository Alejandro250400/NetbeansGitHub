/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comentarios;

/*
 * Ejercicio: círculos
 * 
 * @author Alejandro
 * @version 29-03-2019 
 */
public class Circulo1 {

    private double centroX;
    private double centroY;
    private double radio;
    
    /**
     * Constructor
     * @param x centro: coordenada X
     * @param y centro: coordenada Y
     * @param r radio
     */
    public Circulo1(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }
    /**
     * Getter
     * @return centro: coordenada X
     */
    public double getCentroX() {
        return centroX;
    }
    /**
     * Calculamos la longitud de la circunferencia (perímetro del círculo)
     * @return perímetro
     * 
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    /**
     * Desplaza el círculo a otro lugar
     * @param despX movimiento en el eje X
     * @param despY movimiento en el eje Y
    */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
    
}
