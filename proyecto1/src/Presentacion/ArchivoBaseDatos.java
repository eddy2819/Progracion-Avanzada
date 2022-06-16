/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.util.Scanner;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 15 de Junio
 */
public class ArchivoBaseDatos {
    void menuArchivoBD(){
        Scanner sc = new Scanner(System.in);
        int ic = 0;
        while (ic < 4){
            System.out.println("agregar    1");
            System.out.println("eliminar   2");
            System.out.println("listar     3");
            System.out.println("Salir      4");
            ic = sc.nextInt();
            
            switch(ic){
                case 1: AgregarClienteBD();
                break;
                
                case 2: EliminarClieinteBD();
                break;
                
                case 3: ListarClienteBD(); 
                break;
            }
            
        }
    }

    private void EliminarClieinteBD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ListarClienteBD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void AgregarClienteBD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
