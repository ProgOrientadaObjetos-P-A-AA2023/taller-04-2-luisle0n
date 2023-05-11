
package ejecutor;

class Banco {
      private String nombre;
    private int numeroSucursales;
    
    public Banco(){
        nombre = "Banco Pichincha";
        numeroSucursales = 20;
    }
    
    public Banco(String n, int num){
        nombre = n;
        numeroSucursales = num;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroSucursales(int n){
        numeroSucursales = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }

    public int obtenerNumeroSucursales(){
        return numeroSucursales;
    }
}
