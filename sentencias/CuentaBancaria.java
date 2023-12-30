package school;


import java.util.Scanner;

public class CuentaBancaria {
    private static Object String;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        CuentaDeAhorros c1 = new CuentaDeAhorros(sc, 1000, 2, 1, 60, 0);
        CuentaCorriente c2 = new CuentaCorriente(sc, 1000, 10, 5, 60, 0);


        System.out.println(" seleccione la accion que desea efectuar. ");
        System.out.println("1- Ingresar dinero a la cuenta.");
        System.out.println("2- retirar dinero de la cuenta.");
        System.out.println("3- movimientos realizados.");
        System.out.println("4- ver extracto mensual.");
        System.out.println("5- salir.");
        int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" 1-Cuenta corriente ");
                    System.out.println(" 2-Cuenta de ahorros");
                    int opcion2 = sc.nextInt();
                    if (opcion2 == 1) {
                        c2.Deposito();
                        break;
                    } else if (opcion2 == 2) {
                        c1.Deposito();
                        break;
                    } else {
                        System.out.println("la opcion no es correcta");
                        System.out.println("vuelva a intentar mas tarde.");
                        break;
                    }

                case 2:
                    System.out.println(" 1-Cuenta corriente ");
                    System.out.println(" 2-Cuenta de ahorros");
                    int opcion3 = sc.nextInt();
                    if (opcion3 == 1) {
                        c2.RetiraDineroCuentaCorriente();
                        break;

                    } else if (opcion3 == 2) {
                        c1.RetiroAhorro();
                       break;
                    } else {
                        System.out.println("la opcion no es correcta");
                        System.out.println("vuelva a intentar mas tarde.");
                        break;
                    }
                case 3:
                    System.out.println(" 1-Cuenta corriente ");
                    System.out.println(" 2-Cuenta de ahorros");
                    int opc = sc.nextInt();
                    if (opc == 1) {
                        c2.ExtractoMensual();
                        break;
                    } else if (opc == 2) {
                        c1.ExtractoMensual();
                        break;
                    } else {
                        System.out.println("la opcion no es correcta");
                        System.out.println("vuelva a intentar mas tarde.");
                        break;
                    }
                case 4:

                    System.out.println(" 1-Cuenta corriente ");
                    System.out.println(" 2-Cuenta de ahorros");
                    int opc1 = sc.nextInt();
                    if (opc1 == 1) {
                        c2.Imprimir();
                        break;
                    } else if (opc1 == 2) {
                        c1.Imprimir();
                        break;
                    } else {
                        System.out.println("la opcion no es correcta");
                        System.out.println("vuelva a intentar mas tarde.");
                        break;
                    }
                case 5:
                    System.out.println("gracias por usar nuestros servicios !!");
                    break;
            }
        }

    }

