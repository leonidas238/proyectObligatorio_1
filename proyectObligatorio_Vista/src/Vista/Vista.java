package Vista;

import logica.Administeativo;
import logica.Empleado;
import logica.Gerente;
import logica.Operario;
import java.util.Scanner;

public class Vista {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double total_pagar = 0;
        Empleado lesEmpleades[] = new Empleado[3];

        int opcion;

        System.out.println("Bienvenido al menú principal!\n");

        do {
            System.out.println("1 - Registro de Empleados.\n"
                             + "2 - Importe total a pagar por concepto de sueldos.\n"
                             + "3 - Sair ");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    Gerente ObjetoGerente = new Gerente(1, 40000, 52177116, "Juan", "Perez", "Requena 1038", 25415411);
                    Operario ObjetoOperario = new Operario(2, 30000, 17113278, "Juana", "Pereyra", "8 de Octubre 1122", 24082019);
                    Administeativo ObjetoAdministrativo = new Administeativo(3, 20000, 44184008, "Jacinto", "Caracciolo", "Laravide 1234", 26084018);

                    
                    lesEmpleades[0] = ObjetoGerente;
                    lesEmpleades[1] = ObjetoOperario;
                    lesEmpleades[2] = ObjetoAdministrativo;
                    
                    System.out.println("Cargados por defecto.");

                    break;

                case 2:

            for (Empleado lesEmpleade : lesEmpleades) {
                System.out.println(lesEmpleade.toString() + " - Total a Pagar : " + lesEmpleade.calcularSueldo());
                total_pagar = total_pagar + lesEmpleade.calcularSueldo();
            }

                    System.out.println("Su total a pagar es: " + total_pagar);

                    break;

                case 3:

                    break;

                default:
                    System.err.println("Ingrese una opción válida");

                    break;

            }

        } while (opcion != 3);

    }

}


