/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import connection_pkg.Connection_principal;
import java.sql.Connection;
import views_pkg.VistaUsuario;

/**
 *
 * @author karen
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection c = Connection_principal.iniciar();
        VistaUsuario vu = new VistaUsuario(c);
        
        vu.setVisible(true);// 
    }
    
}
