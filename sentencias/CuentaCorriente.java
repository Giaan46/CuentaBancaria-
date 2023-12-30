package school;

import java.util.Scanner;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(Scanner sc, float saldo, int numeroDeIngresos, int numeroDeRetiros, float tasaAnual, float comisionMensual) {
        super(sc, saldo, numeroDeIngresos, numeroDeRetiros, tasaAnual, comisionMensual);
    }


    public void RetiraDineroCuentaCorriente() {
        System.out.println("Ingrese el monto a retirar. ");
        float retiro = sc.nextFloat();
        if (retiro < saldo ) {
            saldo = saldo - retiro;
            System.out.println("usted ha retirado " + retiro);
            System.out.println("su saldo actual es de : " + saldo);
            numeroDeRetiros++;

        }else if(retiro > saldo) {
            saldo = saldo - retiro;
            System.out.println(" su cuenta esta en sobregiro. ");
            System.out.println(" su saldo actual es de : " + saldo);
            System.out.println("___________________________________");
            numeroDeRetiros++;
        }
    }
    public void Deposito() {
        if(saldo < 0 ){
            System.out.println("su saldo esta en negativo, debe ingresar " + saldo +" lo antes posible para no generar intereses. ");
        }else {
            System.out.println("Ingrese el monto que desea depositar. ");
            float depocito = sc.nextFloat();
            saldo = depocito + saldo;
            System.out.println(" Usted a ingresado un total de : " + depocito + " euros ");
            System.out.println("su saldo actual es de : " + saldo);
            numeroDeIngresos++;
        }
    }
    public void TransaccionesMensuales() {
        ExtractoMensual();

    }
    public void ImprimirCorriente() {
        Imprimir();

    }


}


