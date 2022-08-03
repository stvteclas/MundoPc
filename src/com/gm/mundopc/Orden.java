package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("has superado el límite:" + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println("Orden #:" +this.idOrden);
        System.out.println("Computadoras de la orden #:" +this.idOrden);
        for (int i = 0; i<this.contadorComputadoras;i++){
            System.out.println(this.computadoras[i]);
        }
    }
}
