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
public class Adaptador implements CargadorIPhone36Plus {
    private CargadorIPhone4s cargador4s;

    public Adaptador(CargadorIPhone4s cargador4s) {
        this.cargador4s = cargador4s;
    }
    

    @Override
    public void CargarCelular() {
       cargador4s.cargarIPhone4s();
    }
    
}
