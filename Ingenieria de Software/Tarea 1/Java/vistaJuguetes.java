import java.util.Scanner;
public class vistaJuguetes{

public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Bienvenido al Jugueton\n CEMACO");
        //Controlador cemaco = new Controlador();
            System.out.println("Elija uno de los siguientes perfiles:\n1.Empleado de Caja. \n2.Encargado de Inventario. \n3.Director.");

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
                        //cemaco.jugueteMasValorado();
                            System.out.println("funciona mas valorado");
                            break;

                        case 2:
                            System.out.println("funciona lista mecanicos");
                            break;


                        case 3:
                        //cemaco.jugueteMasValorado();
                            System.out.println("funciona lista electronicos");
							break;

                        case 4:
                            System.out.println("funciona cuantos juguetes");
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
                        //cemaco.jugueteMasValorado();
                            System.out.println("Ingrese nombre de Juguete y su proveedor");
							String juguete = teclado.nextLine();
							String proveedor = teclado.nextLine();
							System.out.println("");
							System.out.println("Juguete Ingresado\n\n");
                            break;


                        case 2:
                            System.out.println("Ingrese nombre de Juguete");
							juguete = teclado.nextLine();
							System.out.println("");
							System.out.println("Juguete Modificado");
                            break;


                        case 3:
							System.out.println("Ingrese nombre de Juguete que desea eliminar y su proveedor");
							juguete = teclado.nextLine();
							proveedor = teclado.nextLine();
							System.out.println("");
							System.out.println("Juguete Eliminado");
                            break;

                        case 4:
                            System.out.println("Ingrese el proveedor");
							proveedor = teclado.nextLine();
							System.out.println("");
							System.out.println("Proveedor ingresado");
                            break;

                        case 5:
                        //cemaco.jugueteMasValorado();
                            System.out.println("modi proveedores");

						case 6:
							System.out.println("Ingrese el proveedor");
							proveedor = teclado.nextLine();
							System.out.println("");
							System.out.println("Juguete eliminado");
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
