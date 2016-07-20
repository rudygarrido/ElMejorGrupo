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
public class Electronico extends Juguete{

    public Electronico() {
    }

    public Electronico(String codigo, double valorUnitario, Proveedor proveedor, String marca, int edad, double valorAdicional, boolean tipoJuguete) {
        super(codigo, valorUnitario, proveedor, marca, edad, valorAdicional, tipoJuguete);
    }
    
}
