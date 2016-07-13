public class electronico extends juguete{

  public electronico(String codigo, String marca, Integer edad, Integer numProveedor, double valorUnitario, double valorAdicional){
    super(codigo, marca, edad, numProveedor, valorUnitario, valorAdicional);
  }

  @Override
  public double getPrecioFinal(){
    double temp = this.getValorUnitario() + (this.getValorAdicional()*2);
    return temp;
  }
}
