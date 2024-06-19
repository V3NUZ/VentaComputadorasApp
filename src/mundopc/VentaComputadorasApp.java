package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.modelo.Monitor;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        //Crear objetos
        Raton ratonLenovo = new Raton("Fisica", "Lenovo");
        Teclado tecladoLenovo = new Teclado("Fisica", "Lenovo");
        Monitor monitorLenovo = new Monitor("Lenovo", 27);

        //Creamos un objeto tipo Computadora
        Computadora computadoraLenovo =
                new Computadora("Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);

        //Objeto computadora 2
        Monitor monitorDell = new Monitor("Dell", 27);
        Teclado tecladoDell = new Teclado("Usb", "Dell");
        Raton ratonDell = new Raton("Usb", "Dell");
        Computadora computadoraDell =
                new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //Orden computadora 3
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("Mac", "Mac");
        Raton ratonMac = new Raton("Mac", "Mac");
        Computadora computadoraMac =
                new Computadora("Computadora Mac", monitorMac, tecladoMac, ratonMac);


        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraMac);
        orden1.mostrarOrden();
    }
}