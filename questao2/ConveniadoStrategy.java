package questao2;

public class ConveniadoStrategy implements Strategy {
    private static final int MINUTOS_GRATIS = 30;
    private static final double VALOR_HORA = 6.50;
    private static final double DESCONTO = 0.50;

    @Override
    public double execute(int minutos) {
        if (minutos <= MINUTOS_GRATIS) {
            return 0.0;
        }
        int horasIniciadas = (minutos - MINUTOS_GRATIS + 59) / 60;
        return horasIniciadas * VALOR_HORA * (1 - DESCONTO);
    }
}
