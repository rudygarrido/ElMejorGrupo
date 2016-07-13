public class juguete{
  private String codigo, marca;
  private Integer edad, numProveedor;
  private double valorUnitario, valorAdicional;

  public juguete(String codigo, String marca, Integer edad, Integer numProveedor, double valorUnitario, double valorAdicional){
    this.codigo = codigo;
    this.marca = marca;
    this.edad = edad;
    this.valorUnitario = valorUnitario;
    this.valorAdicional = valorAdicional;
  }

  public void setCodigo(String codigo){
    this.codigo = codigo;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public void setEdad(Integer edad){
    this.edad = edad;
  }

  public void setNumProveedor(Integer numProveedor){
    this.numProveedor = numProveedor;
  }

  public void setValorUnitario(double valorUnitario){
    this.valorUnitario = valorUnitario;
  }

  public void setValorAdicional(double valorAdicional){
    this.valorAdicional = valorAdicional;
  }

  public String getCodigo(){
    return this.codigo;
  }

  public String getMarca(){
    return this.marca;
  }

  public Integer getEdad(){
    return this.edad;
  }

  public Integer getNumProveedor(){
    return this.numProveedor;
  }

  public double getValorUnitario(){
    return this.valorUnitario;
  }

  public double getValorAdicional(){
    return this.valorAdicional;
  }

  public double getPrecioFinal(){
    return 0.0;
  }

  public String toString(){
    return ("Objeto tipo Jueguete, con código "+this.codigo+", con un valor unitario "+this.valorUnitario+", marca "+this.marca+", edad minima del niño "+this.edad+" y el número de proveedor "+this.numProveedor);
  }
}
