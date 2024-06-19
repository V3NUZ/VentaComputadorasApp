package mundopc;

import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.modelo.Monitor;

public class Main {
    public static void main(String[] args) {
        //Crear objetos
        Raton ratonLenovo = new Raton("Fisica", "Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("Fisica", "Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);
    }
}