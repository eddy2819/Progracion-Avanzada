/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import clases.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Eddy Guarnizo 
 * Fecha: 15 de Junio
 */
public class ClienteTxt {

    public boolean AgregarCliente(Cliente objcliente) throws IOException {
        File f = new File("Cliente txt");
        FileWriter fw = new FileWriter(f, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Integer.toString(objcliente.getIdentidad()) + ",");
        bw.write(objcliente.getNombres() + ",");
        bw.write(String.valueOf(objcliente.getFechaInicio()) + "\n");
        bw.close();
        fw.close();
        return true;

    }
   

    public ArrayList<Cliente> leerClientes(ArrayList (<Cliente>) ArrayClientes ){
      File f = new File("cliente.txt");
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()) {
                    Cliente Objtmp = new Cliente(
                            Integer.valueOf(st.nextToken()), 
                            st.nextToken(), //nombre
                            st.nextToken()
                    );
                    ArrayClientes.add(Objtmp);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes ;
    }

}
