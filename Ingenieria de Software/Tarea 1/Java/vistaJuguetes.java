import java.util.Scanner;
import java.util.ArrayList;
public class vistaJuguetes{

public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Bienvenido al Jugueton\n CEMACO");
    Controlador cemaco = new Controlador();
    System.out.println("Elija uno de los siguientes perfiles:\n1.Empleado de Caja. \n2.Encargado de Inventario. \n3.Director.");
	ArrayList<Mecanico> juguetesMecanicos = new ArrayList<Mecanico>();
	ArrayList<Electronico> juguetesElectronicos = new ArrayList<Electronico>();
            int perfil = teclado.nextInt();
            teclado.nextLine();
            while(perfil == 1 ){
					try{
						Thread.sleep(2000);//2000ms = 2s
					}catch(InterruptedException ex){
					}
                    System.out.println("EMPLEADO");
					try{
						Thread.sleep(500);//2000ms = 2s
					}catch(InterruptedException ex){
					}
                    System.out.println("Desea Visualizar:\n  1. Codigo del juguete con mayor precio. \n  2. Lista de juguetes mecánicos. \n  3. Lista de juguetes electronicos. \n  4. Cantidad de juguetes por proveedor. \n  5. Lista de proveedores de un tipo de juguete. \n  6. Salir. ");
                    int op1 = teclado.nextInt();
                    teclado.nextLine();
                    switch (op1){

                        case 1:
							System.out.println(cemaco.jugueteMasValorado());
                          
                            break;

                        case 2:
							System.out.println("Ingrese La complejidad");
							int complejidad = teclado.nextInt();
							teclado.nextLine();
                            System.out.println("Lista\n"+cemaco.juguetesMecanicos(complejidad));
                            break;


                        case 3:
                            System.out.println("Lista\n"+cemaco.juguetesElectronicos());
							break;

                        case 4:
                            System.out.println("Ingrese nombre del proveedor");
							String nomP = teclado.nextLine();
							System.out.println("Ingrese (1) para electronico o (0) para mecanico");
							boolean tipo = teclado.nextBoolean();
							teclado.nextLine();
							System.out.println("cantidad = "+cemaco.numJuguetesPorProveedor(nomP, tipo));
							break;
                        case 5:
                        //cemaco.jugueteMasValorado();
                            System.out.println("funciona proveedores");
                            break;

						case 6:
							try{
							Thread.sleep(500);//2000ms = 2s
							}catch(InterruptedException ex){
							}
							System.out.println("ADIOOOOOOOS 0/");
							perfil = 0;
                    }

            }

			while(perfil == 2 ){
					try{
						Thread.sleep(2000);//2000ms = 2s
					}catch(InterruptedException ex){
					}
                    System.out.println("ENCARGADO \n   DE   \nINVENTARIO");
					System.out.println("");
					try{
						Thread.sleep(500);//2000ms = 2s
					}catch(InterruptedException ex){
					}
                    System.out.println("Desea :\n  1. Ingresar Juguete. \n  2. Modificar Juguete. \n  3. Eliminar Juguete. \n  4. Ingresar Proveedor. \n  5. Modificar proveedor. \n  6. Eliminar Proveedor. \n  7. Salir. ");
                    int op1 = teclado.nextInt();
                    teclado.nextLine();
                    switch (op1){

                        case 1:
							
                            System.out.println("Ingrese el codigo, valor unitario, marca, \nedad, tipo juguete (1/0), complejida en su respectivo orden:");
							
							String codigo = teclado.nextLine();
							double valorUnitario = teclado.nextDouble();
							teclado.nextLine();
							Proveedor proveedor = new Proveedor();
							double valorAdicional = 5.0;
							String marca= teclado.nextLine();
							int edad = teclado.nextInt();
							teclado.nextLine();
							int tipo = teclado.nextInt();
                            boolean tipoJuguete =false;
                            if(tipo==0){
                                tipoJuguete =false;
                            }else{
                                tipoJuguete=true;
                            }
              
							int complejidad = teclado.nextInt();
							System.out.println("Juguete Ingresado");
							cemaco.ingresarJuguete( codigo, valorUnitario, proveedor, marca, edad, valorAdicional, tipoJuguete, complejidad);
							
						
                            break;


                        case 2:
                            System.out.println("Ingrese el codigo, valor unitario, marca, \nedad, tipo juguete (1/0), complejida en su respectivo orden:");
							codigo = teclado.nextLine();
							valorUnitario = teclado.nextDouble();
							teclado.nextLine();
							Proveedor proveedor = new Proveedor();
							valorAdicional = 5.0;
							marca= teclado.nextLine();
							edad = teclado.nextInt();
							teclado.nextLine();
							tipo = teclado.nextInt();
                            boolean tipoJuguete =false;
                            if(tipo==0){
                                tipoJuguete =false;
                            }else{
                                tipoJuguete=true;
                            }
              
							complejidad = teclado.nextInt();
							cemaco.modificarJuguete( codigo, valorUnitario, proveedor, marca, edad, valorAdicional, tipoJuguete, complejidad);
							System.out.println("Juguete Ingresado");
                            break;


                        case 3:
							System.out.println("Ingrese codigo del Juguete que desea eliminar");
							codigo = teclado.nextLine();
							cemaco.eliminarJuguete(codigo);
							System.out.println("Juguete Eliminado");
                            break;

                        case 4:
                            System.out.println("Ingrese el ID");
							int id = teclado.nextInt();
							teclado.nextLine();
							System.out.println("Ingrese el Nombre");
							String nombre = teclado.nextLine();
							cemaco.ingresarProveedor(id, juguetesMecanicos, juguetesElectronicos, nombre);
                            break;

                        case 5:
							System.out.println("Ingrese el ID");
							id = teclado.nextInt();
							teclado.nextLine();
							System.out.println("Ingrese el Nombre");
							nombre = teclado.nextLine();
							//cemaco.modificarProveedor(id, juguetesMecanicos, juguetesElectronicos, nombre);

						case 6:
							System.out.println("Ingrese el ID");
							id = teclado.nextInt();
							teclado.nextLine();
							cemaco.eliminarProveedor(id);
                            break;
						case 7:
							try{
								Thread.sleep(500);//2000ms = 2s
							}catch(InterruptedException ex){
							}
							System.out.println("ADIOOOOOOOS 0/");
							perfil = 0;
                    }

				}
				while(perfil == 3 ){
					try{
						Thread.sleep(2000);//2000ms = 2s
					}catch(InterruptedException ex){
					}
                    System.out.println("DIRECTOR");
					System.out.println("");
					try{
						Thread.sleep(500);//2000ms = 2s
					}catch(InterruptedException ex){
					}
                    System.out.println("Desea :\n  1. Editar Permisos. \n  2. Gestionar Productos. \n  3. Obtener Reportes de estadisticas. \n  4. Salir. ");
                    int op1 = teclado.nextInt();
                    teclado.nextLine();
                    switch (op1){

                        case 1:
                        //cemaco.jugueteMasValorado();
                            System.out.println("EDITAR PERMISOS");

                            break;


                        case 2:
                            System.out.println("GESTION DE PRODUCTOS");
							
                            break;


                        case 3:
							System.out.println("REPORTE DE ESTADISTICAS");
							System.out.println("|            .       ");
							System.out.println("|        . .         ");
							System.out.println("|       .            ");
							System.out.println("|  . . .             ");
							System.out.println("| .                  ");
							System.out.println("|.                   ");
							System.out.println("|--------------------");

                            break;


						case 4:
							try{
								Thread.sleep(500);//2000ms = 2s
							}catch(InterruptedException ex){
							}
							System.out.println("ADIOOOOOOOS 0/");
							perfil = 0;
                    }

				}

	}
}
