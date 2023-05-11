/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

/**
 *
 * @author luisa
 */
public class Ejecutor {

    public static void main(String[] args) {
       Banco bannco = new Banco();
        Cliente cliente = new Cliente("Luis Fernando", "Leon Tene","132131123");
        Cheque cheque = new Cheque(cliente, bannco, 10000001);
        cheque.calcularComision();
        System.out.printf("%s\n",cheque);
       
        System.out.println("-----------------------------------");        
        
        Banco banco2 = new Banco("Banco del Barrio", 3);
        Cliente cliente2 = new Cliente("Omer Alexis", "Benitez");
        Cheque cheque2 = new Cheque(cliente2, banco2);
        cheque2.calcularComision();
        System.out.printf("%s\n",cheque2);
    }
    
}
