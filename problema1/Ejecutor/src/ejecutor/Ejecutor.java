package ejecutor;


import ejecutor.Universidad;
public class Ejecutor {
    public static void main(String[] args) {
        
         Universidad universidad=new Universidad();
        Notas nota =new Notas("Luis Leon",8,9,10,universidad);
        nota.calcularPromedio();
        System.out.printf("%s\n ",nota);
       
        
        System.out.println("------------------------------------------");
        
         Universidad universidad1 = new Universidad("NASA", "Argelia");
        Notas notas2 = new Notas(10,9,4,universidad1);
        notas2.calcularPromedio();
        System.out.printf("%s\n",notas2);
    }

}
