/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

private ArrayList<Proveedor> proveedores;
private int tipoUsuario=0;
/**
 *
 * @author Rudy Alex
 */
public class Controlador {


    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }


    public void ingresarJuguete(String codigo, double valorUnitario, Proveedor proveedor,
                                        String marca, int edad, double valorAdicional,
                                                boolean tipoJuguete, int complejidad){
        if(tipoJuguete){
            proveedor.getJuguetesElectronicos().add( new Electronico(codigo,  valorUnitario,  proveedor,
                                         marca,  edad,  valorAdicional,
                                                 tipoJuguete));
        }else{
            proveedor.getJuguetesMecanicos().add( new Mecanico(codigo,  valorUnitario,  proveedor,
                                         marca,  edad,  valorAdicional,
                                                 tipoJuguete, complejidad));
        }
    }

    public void modificarJuguete(String codigo, double valorUnitario, Proveedor proveedor,
                                        String marca, int edad, double valorAdicional,
                                                boolean tipoJuguete, int complejidad){
        if(tipoJuguete){
            for(Electronico juguete : proveedor.getJuguetesElectronicos()){
                if(juguete.getCodigo().equals(codigo)){
                    juguete.setValorUnitario(valorUnitario);
                    juguete.setMarca(marca);
                    juguete.setEdad(edad);
                    juguete.setValorAdicional(valorAdicional);
                    juguete.setTipoJuguete(tipoJuguete);
                }
            }
        }else{
            for(Mecanico juguete : proveedor.getJuguetesMecanicos()){
                if(juguete.getCodigo().equals(codigo)){
                    juguete.setValorUnitario(valorUnitario);
                    juguete.setMarca(marca);
                    juguete.setEdad(edad);
                    juguete.setValorAdicional(valorAdicional);
                    juguete.setTipoJuguete(tipoJuguete);
                    juguete.setComplejidad(complejidad);
                }
            }
        }
    }

    public void eliminarJuguete(String codigo){
        Proveedor proveedorElegido = null;
        Juguete jugueteEliminar = null;
        boolean tipo = false;
        for(Proveedor proveedor: proveedores){
            for(Electronico electronico : proveedor.getJuguetesElectronicos()){
                if(electronico.getCodigo().equals(codigo)){
                    proveedorElegido = proveedor;
                    jugueteEliminar = electronico;
                    tipo = true;
                }
            }
            for(Mecanico mecanico : proveedor.getJuguetesMecanicos()){
                if(mecanico.getCodigo().equals(codigo)){
                    proveedorElegido = proveedor;
                    jugueteEliminar = mecanico;
                }
            }
        }
        if(tipo){
            proveedorElegido.getJuguetesElectronicos().remove(jugueteEliminar);
        }else{
            proveedorElegido.getJuguetesMecanicos().remove(jugueteEliminar);
        }
    }

    public void ingresarProveedor(int id, ArrayList<Mecanico> juguetesMecanicos,
                            ArrayList<Electronico> juguetesElectronicos, String nombre){
        proveedores.add(new Proveedor(id,juguetesMecanicos, juguetesElectronicos, nombre));
    }

    public void modificarProveedor(int id, ArrayList<Juguete> juguetesMecanicos,
                            ArrayList<Juguete> juguetesElectronicos, String nombre){
        for(Proveedor proveedor : proveedores){
            if(proveedor.getId() == id){
                proveedor.setId(id);
                proveedor.setNombre(nombre);
            }
        }
    }

    public void eliminarProveedor(int id){
        Proveedor proveedorEliminar=null;
        for(Proveedor proveedor : proveedores){
            if(proveedor.getId() == id){
                proveedorEliminar = proveedor;
            }
        }
        proveedores.remove(proveedorEliminar);
    }

    public String listarProveedores(){
        String lista = "Los proveedores son: \n";
        for(Proveedor proveedor: proveedores){
            if((proveedor.getJuguetesElectronicos().size()+proveedor.getJuguetesMecanicos().size())>10){
               lista = lista + proveedor.getNombre() +"\n";
            }
        }
        return lista;
    }

    public String listarProveedor(String nombre){
        String lista = "El proveedor "+ nombre +" suministra ";
        for(Proveedor proveedor: proveedores){
            if((proveedor.getNombre().equals(nombre))){
                int numeroJuguetes= proveedor.getJuguetesElectronicos().size()+proveedor.getJuguetesMecanicos().size();
               lista = lista + numeroJuguetes  +" juguetes";
            }
        }
        return lista;
    }
    public String juguetesMecanicos(int complejidad){
        String lista = "Los juguetes mecanicos con complejidad "+complejidad+" son: \n";
        for(Proveedor proveedor: proveedores){
            for(Mecanico mecanico : proveedor.getJuguetesMecanicos()){
                if(mecanico.getComplejidad()== complejidad){
                    lista = lista + mecanico.getCodigo()+" \n";
                }
            }
        }
        return lista;
    }

    public String jugueteMasValorado(){
        ArrayList<Juguete> juguetes =  new ArrayList <Juguete>();
        for(Proveedor proveedor: proveedores){
            for(Electronico electronico : proveedor.getJuguetesElectronicos()){
                juguetes.add(electronico);
            }
            for(Mecanico mecanico : proveedor.getJuguetesMecanicos()){
                juguetes.add(mecanico);
            }
        }
        Collections.sort(juguetes, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                    Juguete e1 = (Juguete)o1;
                    Juguete e2 = (Juguete)o2;
                    return new Float(e1.getValorUnitario()+e1.getValorAdicional()).compareTo(new Float(e2.getValorUnitario()+e2.getValorAdicional()));
            }
        });

        return "El juguete con mayor precio de venta tiene el codigo "+ juguetes.get(0).getCodigo() ;
    }

    public String juguetesElectronicos(){
        ArrayList<Electronico> juguetesElectronicos = new ArrayList<Electronico>();
        for(Proveedor proveedor: proveedores){
            for(Electronico electronico : proveedor.getJuguetesElectronicos()){
                juguetesElectronicos.add(electronico);
            }
        }
        Collections.sort(juguetesElectronicos, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                    Electronico e1 = (Electronico)o1;
                    Electronico e2 = (Electronico)o2;
                    return new Float(e1.getValorUnitario()+e1.getValorAdicional()).compareTo(new Float(e2.getValorUnitario()+e2.getValorAdicional()));
            }
        });
        String lista = "Los juguetes son: \n";
        for(Electronico electronico :juguetesElectronicos){
            lista = lista + electronico.getCodigo() + " \n";
        }
        return lista;
    }

    public int numJuguetesPorProveedor(String nombre, boolean tipo){
        Proveedor proveedorCheck=null;
        for(Proveedor proveedor: proveedores){
            if((proveedor.getNombre().equals(nombre))){
                proveedorCheck= proveedor;
            }
        }
        if(tipo){
            return proveedorCheck.getJuguetesElectronicos().size();
        }else{

            return proveedorCheck.getJuguetesMecanicos().size();
        }
    }

    public String juguetesPorTipo(boolean tipo){
        String lista = "Los proveedores son \n";
        for(Proveedor proveedor: proveedores){
            if(tipo){
                if(proveedor.getJuguetesElectronicos().size()>0){
                    lista = lista + proveedor.getNombre()+" \n";
                }
            }else{
                if(proveedor.getJuguetesMecanicos().size()>0){
                    lista = lista + proveedor.getNombre()+" \n";
                }

            }
        }
        return lista;
    }
}
