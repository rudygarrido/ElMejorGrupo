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
public class Juguete {
    private String codigo;
    private double valorUnitario;
    private Proveedor proveedor;
    private String marca;
    private int edad;
    private double valorAdicional;
    private boolean tipoJuguete;

    public Juguete() {
    }

    public Juguete(String codigo, double valorUnitario, Proveedor proveedor, String marca, int edad, double valorAdicional, boolean tipoJuguete) {
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
        this.proveedor = proveedor;
        this.marca = marca;
        this.edad = edad;
        this.valorAdicional = valorAdicional;
        this.tipoJuguete = tipoJuguete;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public String getMarca() {
        return marca;
    }

    public int getEdad() {
        return edad;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public boolean isTipoJuguete() {
        return tipoJuguete;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void setTipoJuguete(boolean tipoJuguete) {
        this.tipoJuguete = tipoJuguete;
    }
    
    
    
}
