package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.modelo.Monitor;

public class Main {
    public static void main(String[] args) {
        //Crear objetos
        Raton ratonLenovo = new Raton("Fisica", "Lenovo");
        Teclado tecladoLenovo = new Teclado("Fisica", "Lenovo");
        Monitor monitorLenovo = new Monitor("Lenovo", 27);

        //Creamos un objeto tipo Computadora
        Computadora computadoraLenovo =
                new Computadora("Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);
    }
}