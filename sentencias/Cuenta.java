package school;

import java.util.Scanner;

public class Cuenta {
    Scanner sc = new Scanner(System.in);
    protected float saldo ;
    protected int numeroDeIngresos ;
    protected int numeroDeRetiros;
    protected float tasaAnual;
    protected float comisionMensual;

    public Cuenta(Scanner sc, float saldo, int numeroDeIngresos, int numeroDeRetiros, float tasaAnual, float comisionMensual) {
        this.saldo = saldo;
        this.numeroDeIngresos = numeroDeIngresos;
        this.numeroDeRetiros = numeroDeRetiros;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = comisionMensual;
//    }
//    public Cuenta(){

    }
    public void IngresarCantidad(float saldo,int numeroDeIngresos){

        System.out.println("su saldo actual es de "+ saldo +"ntroduzca la cantidad que desea depositar. ");
        float depocito = sc.nextFloat();
        System.out.println("usted a depocitado " + depocito );
        numeroDeIngresos++;
        System.out.println("su saldo actual es de "+ saldo + depocito);
    }
    public void RetirarCantidad() {
        System.out.println("Ingrese el monto que desea retirar de la cuenta. ");
        float retiro = sc.nextFloat();
        if (retiro < saldo) {
            saldo = saldo - retiro;
            System.out.println("usted ha retirado " + retiro);
            System.out.println("su saldo actual es de : " + saldo);
            numeroDeRetiros++;
        }else{
            System.out.println("Saldo insuficiente. ");
        }

    }
    public void CalcularInteres(){
        comisionMensual = (tasaAnual / 12);
        System.out.println(saldo - comisionMensual);
    }
    public void Imprimir() {
        comisionMensual = (tasaAnual / 12);
        System.out.println("##################################");
        System.out.println(" su saldo actual es de : " + saldo);
        System.out.println("este mes ha realizado un total de : " + numeroDeRetiros + " retiros " + " \n y : " + numeroDeIngresos + " de depositos  ");
        System.out.println(" se le ha descontado un total de : " + comisionMensual + " de comision mensual");
        System.out.println("__________________________________");
    }
    public void ExtractoMensual(){
        comisionMensual = (tasaAnual / 12);
        saldo = saldo - comisionMensual;
        System.out.println(" se le han descontado : " + comisionMensual + " de la comision mensual");
        System.out.println("su saldo actual es de : " + saldo);
        System.out.println("usted a realizado " + numeroDeRetiros + " extracciones este mes ");
    }



    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDeIngresos() {
        return numeroDeIngresos;
    }

    public void setNumeroDeIngresos(int numeroDeIngresos) {
        this.numeroDeIngresos = numeroDeIngresos;
    }

    public int getNumeroDeRetiros() {
        return numeroDeRetiros;
    }

    public void setNumeroDeRetiros(int numeroDeRetiros) {
        this.numeroDeRetiros = numeroDeRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
}
