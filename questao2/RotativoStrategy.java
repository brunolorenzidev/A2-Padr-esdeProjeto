package questao2;

public class RotativoStrategy implements Strategy {
    private static final double VALOR_HORA = 6.50;

    @Override
    public double execute(int minutos) {
        int horasIniciadas = (minutos + 59) / 60;
        return horasIniciadas * VALOR_HORA;
    }
}
