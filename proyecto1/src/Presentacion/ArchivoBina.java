/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.LogicaClienteBina;
import Logica.LogicaClienteTxt;
import static Presentacion.ArchivoTxt.objlogClientetxt;
import clases.Cliente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 15 de Junio
 */
public class ArchivoBina {
    static LogicaClienteBina objlogClientebina = new LogicaClienteBina();
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        AgregarClienteBina();
        ListarClienteBina();
    }
    
    
    void menuArchivoBina() throws IOException, FileNotFoundException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        int ic = 0;
        while (ic < 4){
            System.out.println("agregar    1");
            System.out.println("eliminar   2");
            System.out.println("listar     3");
            System.out.println("Salir      4");
            ic = sc.nextInt();
            
            switch(ic){
                case 1: AgregarClienteBina();
                break;
                
                case 2: EliminarClieinteBina();
                break;
                
                case 3: ListarClienteBina(); 
                break;
            }
            
        }
    }

     static private void AgregarClienteBina() throws IOException {
         
        Cliente objcliente = new Cliente();
        objcliente.setIdentidad(1);
        objcliente.setNombres("Eddy");
        objcliente.setFechaInicio("15/06/2022");
        objlogClientebina.validadIden(objcliente);
        if (objlogClientebina.validadIden(objcliente)) 
            System.out.println("clieinte agregado");
        else 
            System.out.println("codigo cliente no agregado");
    }

    private void EliminarClieinteBina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     static private void ListarClienteBina() throws IOException, FileNotFoundException, ClassNotFoundException {
       ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente> ();
        objlogClientebina.ListarClientes(ArrayClientes);
        for(Cliente tmCliente : ArrayClientes){
            System.out.println(tmCliente.toString());
        }
         System.out.println(objlogClientebina);
    }
    
}
