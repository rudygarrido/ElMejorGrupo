public class proveedor{
  private List<juguete> juguetesMecanicos, juguetesElectronicos;
  private Integer id;
  private String nombre;

  public proveedor(Integer id, String nombre){
    juguetesMecanicos = new ArrayList<juguete>();
    juguetesElectronicos = new ArrayList<juguete>();
    this.id = id;
    this.nombre = nombre;
  }

  public setNombre(String nombre){
    this.nombre = nombre;
  }

  public setId(Integer id){
    this.id = id;
  }

  public void setJuguetesMecanicos(juguete mecanico){
    juguetesMecanicos.add(mecanico);
  }

  public void setJuguetesElectronicos(juguete electronico){
    juguetesElectronicos.add(electronico);
  }
}
