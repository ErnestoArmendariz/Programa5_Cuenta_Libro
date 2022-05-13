/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa5_cuenta_libro;

/**
 *
 * @author ernes
 */
public class Programa5_Cuenta_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        
        Cuenta cuenta001 = new Cuenta();
        
        Cuenta cuenta002 = new Cuenta();
        cuenta002.setNombre("Ernesto");
        
        System.out.println(cuenta002.getNombre());
    }
}
