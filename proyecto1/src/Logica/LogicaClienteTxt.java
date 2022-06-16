/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Archivos.ClienteTxt;
import clases.Cliente;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 15 de Junio
 */
public class LogicaClienteTxt {

    ClienteTxt objclientetxt = new ClienteTxt();
    public boolean validadIden(Cliente objcliente) throws IOException {
        // valida si el echivo es correcto
        if (objcliente.getIdentidad() > 0){
            // agregar ala archivo texto
            
            return objclientetxt.AgregarCliente(objcliente);
        }    
        return false;
    }
    
    public void ListarClientes(ArrayList<Cliente> ArrayClientes){
        objclientetxt.leerClientes(ArrayClientes);
        
    }
    
}
