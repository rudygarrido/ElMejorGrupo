public class mecanico extends juguete{
  private Integer complejidad;

  public mecanico(String codigo, String marca, Integer edad, Integer numProveedor, double valorUnitario, double valorAdicional, Integer complejidad){
    super(codigo, marca, edad, numProveedor, valorUnitario, valorAdicional);
    this.complejidad = complejidad;
  }

  @Override
  public double getPrecioFinal(){
    double temp = this.getValorUnitario() + (this.getValorAdicional()*this.complejidad);
    return temp;
  }
}
