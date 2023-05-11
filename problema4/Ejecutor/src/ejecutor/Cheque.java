/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

/**
 *
 * @author luisa
 */
class Cheque {
     private Cliente cliente;
    private Banco banco;
    private double valorCheque;
    private double comision;

    public Cheque(Cliente c, Banco b, double v) {
        cliente = c;
        banco = b;
        valorCheque = v;
    }

    public Cheque(Cliente c, Banco b) {
        cliente = c;
        banco = b;
        valorCheque = 10000001;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }

    public void establecerValorCheque(double v) {
        valorCheque = v;
    }

    public void calcularComision() {
        comision = valorCheque * 0.00003;
    }

    
    public Cliente obtenerCliente() {
        return cliente;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombres del Cliente: %s\nApellidos del Cliente: %s\nCédula del Cliente: %s\n"
                + "Nombre del Banco: %s\nSucursales del Banco: %d\nValor del cheque: %.2f\nValor de la comisión: %.2f"                                      
                , obtenerCliente().obtenerNombres()
                , obtenerCliente().obtenerApellidos()
                , obtenerCliente().obtenerCedula()
                , obtenerBanco().obtenerNombre()
                , obtenerBanco().obtenerNumeroSucursales()
                , obtenerValorCheque()
                , obtenerComision());
        return cadena;
    }
}
