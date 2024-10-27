/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptertarea;

/**
 *
 * @author Sofía
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CargadorIPhone4s C4S = new CargadorIPhone4s();
        CargadorIPhone36Plus adaptador = new Adaptador(C4S);
        ProbarAdapter(adaptador);
        
    }
    static void ProbarAdapter(CargadorIPhone36Plus C36S){
        C36S.CargarCelular();
    }
}
