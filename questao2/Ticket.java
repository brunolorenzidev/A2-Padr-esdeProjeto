package questao2;

public class Ticket {
    private String placa;
    private int minutos;
    private Strategy strategy;

    public Ticket(String placa, int minutos, Strategy strategy) {
        this.placa = placa;
        this.minutos = minutos;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public double executeStrategy() {
        return strategy.execute(minutos);
    }
}
