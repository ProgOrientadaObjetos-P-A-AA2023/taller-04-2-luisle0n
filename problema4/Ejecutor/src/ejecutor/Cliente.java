/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

/**
 *
 * @author luisa
 */
class Cliente {
    private String nombres;
    private String apellidos;
    private String cedula;

    public Cliente(String n, String ap, String cd) {
        nombres = n;
        apellidos = ap;
        cedula = cd;
    }

    public Cliente(String n, String ap) {
        nombres = n;
        apellidos = ap;
        cedula = "1150489750";
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String a) {
        apellidos = a;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerCedula() {
        return cedula;
    }
}
