package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Samsung", 32);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Genius");
        Computadora computadoraGamer = new Computadora("Minecraft", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.mostrarOrden();
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraGamer);
        orden2.mostrarOrden();
      }
    }

