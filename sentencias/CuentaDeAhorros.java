package school;

import java.util.Scanner;

public class CuentaDeAhorros extends Cuenta{
    public CuentaDeAhorros(Scanner sc, float saldo, int numeroDeIngresos, int numeroDeRetiros, float tasaAnual,
                           float comisionMensual) {
        super(sc, saldo, numeroDeIngresos, numeroDeRetiros, tasaAnual, comisionMensual);
        // TODO Auto-generated constructor stub
    }
    public void Actividad() {
        if(saldo < 100) {
            System.out.println("la cuenta esta inactiva, el saldo debe superar los 100 euros para activar la cuenta ");
        }else {
            System.out.println("la cuenta esta incativa. ");
        }
    }
    public void Deposito() {
        Actividad();
        System.out.println("Ingrese el monto que desea depositar. ");
        float depocito = sc.nextFloat();
        saldo = depocito + saldo;
        System.out.println(" Usted a ingresado un total de : " + depocito + " euros ");
        System.out.println("su saldo actual es de : " + saldo );
        numeroDeIngresos++;
    }
    public void RetiroAhorro() {

        RetirarCantidad();
    }
    public  void TransaccionesMensuales() {

        System.out.println( "usted a realizado una cantidad de  " + numeroDeRetiros+ " extractos y " + numeroDeIngresos + " de ingresos.");
    }

    public void ImprimirAhorros() {
        Imprimir();
    }
}

