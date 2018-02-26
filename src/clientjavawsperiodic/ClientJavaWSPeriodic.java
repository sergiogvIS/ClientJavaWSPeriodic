/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodic;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.Root;

/**
 *
 * @author entrar
 */
public class ClientJavaWSPeriodic {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException, Exception {
        while(true){
            // TODO code application logic here
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Obtener todos los elementos");
            System.out.println("2. Obtener simbolo de elemento");
            System.out.println("3. Obtener peso atómico");
            System.out.println("4. Obtener número atómico");
            System.out.println("5. Salir");
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = sc.nextInt();
            ejecuta(a); 
        }
    }
    
    public static void ejecuta(int a) throws Exception{
        switch (a){
            case 1:
                obtenElem();
                break;
            case 2:
                muestraSimb();
                break;
            case 3:
                muestraPesA();
                break;
            case 4:
                muestraNumA();
                break;
            case 5:
                System.exit(0);
            default:
                break; 

        }
    
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }
    
    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }
    
    private static void muestraNumA() throws IOException, Exception{
        System.out.println("Introduzca el elemento");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();
        Serializer serializer = new Persister();
        String source = getAtomicNumber(b);
        DataSet dataset = new DataSet();
        serializer.read(dataset, source);
        String res = dataset.getTable().getAtomicNumber();
        System.out.println("El número atómico de " + b + " es: "+ res);
    
    }
    private static void muestraPesA() throws IOException, Exception{
        System.out.println("Introduzca el elemento");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();
        Serializer serializer = new Persister();
        String source = getAtomicNumber(b);
        DataSet dataset = new DataSet();
        serializer.read(dataset, source);
        String res = dataset.getTable().getAtomicWeight();
        System.out.println("El peso atómico de " + b + " es: "+ res);
    }
    private static void muestraSimb() throws IOException, Exception{
        System.out.println("Introduzca el elemento");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();
        Serializer serializer = new Persister();
        String source = getAtomicNumber(b);
        DataSet dataset = new DataSet();
        serializer.read(dataset, source);
        String res = dataset.getTable().getSymbol();
        System.out.println("El simbolo de " + b + " es: "+ res);
    }
    private static void obtenElem(){
        System.out.println(getAtoms());
        /*serializer = new Persister();
        source = getAtoms();
        dataset = new DataSet();
        serializer.read(dataset, source);
        res = dataset.getTable().getElementName();
        System.out.println( res);*/
    }
}