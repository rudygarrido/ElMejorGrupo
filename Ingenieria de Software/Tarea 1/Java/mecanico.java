/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

/**
 *
 * @author Rudy Alex
 */
public class Mecanico extends Juguete{
    private int complejidad;

    public Mecanico(int complejidad) {
        this.complejidad = complejidad;
    }

    public Mecanico( String codigo, double valorUnitario, Proveedor proveedor, String marca, int edad, double valorAdicional, boolean tipoJuguete,int complejidad) {
        super(codigo, valorUnitario, proveedor, marca, edad, valorAdicional, tipoJuguete);
        this.complejidad = complejidad;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }
    
    
    
}
