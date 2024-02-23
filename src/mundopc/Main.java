package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 25);
        System.out.println(monitorLenovo);

        //se crea un objeto de tipo computadora

        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo,
                        tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);

    }
}