/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Archivos.ClienteBina;
import Archivos.ClienteTxt;
import clases.Cliente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 15 de Junio
 */
public class LogicaClienteBina {
    ClienteBina objclientebina = new ClienteBina();
    public boolean validadIden(Cliente objcliente) throws IOException {
        
       ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>(); 
        if (objcliente.getIdentidad() > 0){
            ArrayClientes.add(objcliente) ;
            
            
            return objclientebina.GrabarClienteBin(ArrayClientes);
        }    
        return false;
    }
    
    public void ListarClientes(ArrayList<Cliente> ArrayClientes) throws IOException, FileNotFoundException,ClassNotFoundException{
        objclientebina.ImportarClienteBin(ArrayClientes);
        
    }
    
}
