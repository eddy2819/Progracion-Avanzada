/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.LogicaClienteTxt;
import clases.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eddy Guarnizo Fecha: 15 de junio
 */
public class ArchivoTxt {
    static LogicaClienteTxt objlogClientetxt = new LogicaClienteTxt();

    public static void main(String[] args) throws IOException {
        AgregarClientetxt();
        AgregarClientetxt();
        ListarClientestxt();
    }

    void menuArchivoTxt() throws IOException {
        Scanner sc = new Scanner(System.in);
        int ic = 0;
        while (ic < 4) {
            System.out.println("agregar    1");
            System.out.println("eliminar   2");
            System.out.println("listar     3");
            System.out.println("Salir      4");
            ic = sc.nextInt();

            switch (ic) {
                case 1:
                    AgregarClientetxt();

                    break;

                case 2:
                    EliminarClieintetxt();
                    break;

                case 3:
                    ListarClientestxt();
                    break;
            }

        }
    }

    private static void AgregarClientetxt() throws IOException {
       
        Cliente objcliente = new Cliente();
        objcliente.setIdentidad(1);
        objcliente.setNombres("Eddy");
        objcliente.setFechaInicio("15/06/2022");
        if (objlogClientetxt.validadIden(objcliente)) 
            System.out.println("cliente agregado");
        else 
            System.out.println("codigo cliente no agregado");
        

    }

    private void EliminarClieintetxt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ListarClientestxt() {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente> ();
        objlogClientetxt.ListarClientes(ArrayClientes);
        for(Cliente tmCliente : ArrayClientes){
            System.out.println(tmCliente.toString());
        }
        
        System.out.println(objlogClientetxt);

    }

}
