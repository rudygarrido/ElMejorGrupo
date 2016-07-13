import java.util.ArrayList;

public class proveedor{
  private ArrayList<juguete> juguetesMecanicos, juguetesElectronicos;
  private Integer id;
  private String nombre;

  public proveedor(Integer id, String nombre){
    juguetesMecanicos = new ArrayList<juguete>();
    juguetesElectronicos = new ArrayList<juguete>();
    this.id = id;
    this.nombre = nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public void setJuguetesMecanicos(juguete mecanico){
    juguetesMecanicos.add(mecanico);
  }

  public void setJuguetesElectronicos(juguete electronico){
    juguetesElectronicos.add(electronico);
  }

  public String toString(){
    String temp = "Proveedor "+ this.nombre+ " y ID "+ this.id;
    return temp;
  }
}
