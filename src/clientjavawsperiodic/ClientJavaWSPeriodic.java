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

/**
 *
 * @author entrar
 */
public class ClientJavaWSPeriodic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {
        // TODO code application logic here
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Obtener todos los elementos");
        System.out.println("2. Obtener simbolo de elemento");
        System.out.println("3. Obtener peso atómico");
        System.out.println("4. Obtener número atómico");
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println(getAtoms());
                break;
            case 2:
                System.out.println("Introduzca el elemento");
                String b = br.readLine();
                Serializer serializer = new Persister();
                Elemento elemento = new Elemento();
                serializer.read(elemento, getElementSymbol(b));
                System.out.println(elemento.getSymbol());
                System.out.println(getElementSymbol(b));
                break;
            case 3:
                System.out.println("Introduzca el elemento");
                b = br.readLine();
                System.out.println(getAtomicWeight(b));
                break;
            case 4:
                System.out.println("Introduzca el elemento");
                b = br.readLine();
                System.out.println(getAtomicNumber(b));                
                break;
            default:
                break;          
        }        
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }
    public static class Elemento {
        @Element
        private String Table;
        @Element
        private String AtomicNumber;
        @Element
        private String Symbol;
        @Element
        private String ElementName;
        
        public Elemento(){
            super();
        }
        public Elemento(String table, String atomicNumber, String symbol, String elementName) {
            this.Table = table;
            this.AtomicNumber= atomicNumber;
            this.Symbol= symbol;
            this.ElementName= elementName;
        }

        public String getSymbol() {
            return Table;
        }

        public String getTable() {
            return Table;
        }

        public String getAtomicNumber() {
            return AtomicNumber;
        }

        public String getElementName() {
            return ElementName;
        }       
    }
    
}
