/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;
import java.util.ArrayList;
/**
 *
 * @author Rudy Alex
 */
public class Proveedor {
    private int id;
    private ArrayList<Mecanico> juguetesMecanicos;
    private ArrayList<Electronico> juguetesElectronicos;
    private String nombre;

    public Proveedor(int id, ArrayList<Mecanico> juguetesMecanicos, ArrayList<Electronico> juguetesElectronicos, String nombre) {
        this.id = id;
        this.juguetesMecanicos = juguetesMecanicos;
        this.juguetesElectronicos = juguetesElectronicos;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Mecanico> getJuguetesMecanicos() {
        return juguetesMecanicos;
    }

    public ArrayList<Electronico> getJuguetesElectronicos() {
        return juguetesElectronicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJuguetesMecanicos(ArrayList<Mecanico> juguetesMecanicos) {
        this.juguetesMecanicos = juguetesMecanicos;
    }

    public void setJuguetesElectronicos(ArrayList<Electronico> juguetesElectronicos) {
        this.juguetesElectronicos = juguetesElectronicos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
