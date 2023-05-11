
package ejecutor;

public class Ejecutor {

    public static void main(String[] args) {
         Provincia provincia = new Provincia();
        Profesor profesor = new Profesor("Elvio", "Franco", 800,
                "1108974536", provincia);
        profesor.calcularSueldoTotal();
        System.out.printf("%s\n", profesor);
        
        
        System.out.println("-----------------------------------------------");
        
        Provincia provincia2 = new Provincia("Loja",180054);
        Profesor profesor2 = new Profesor(900, "1950010312", provincia2);
        profesor2.calcularSueldoTotal();
        System.out.printf("%s\n", profesor2);
        
    }
    
}
