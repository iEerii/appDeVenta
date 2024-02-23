package mundopc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanho;

    private static int contadorMonitores;

    private Monitor(){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanho){
        this();
        this.marca = marca;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
