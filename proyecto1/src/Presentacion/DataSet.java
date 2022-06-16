/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 15 de Junio
 */
public class DataSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArchivoTxt objArchiTexto = new ArchivoTxt();
        int ic = 0;
        while (ic < 4){
            System.out.println("Texto      1");
            System.out.println("Binario    2");
            System.out.println("Data Base  3");
            System.out.println("Salir      4");
            ic = sc.nextInt();
            
            switch(ic){
                case 1: objArchiTexto.menuArchivoTxt();
                break;
                
             /*   case 2: menuBin();
                break;
                
                case 3: MenuSalida(); 
                break;
*/
            }
            
        }
    }

    
}
