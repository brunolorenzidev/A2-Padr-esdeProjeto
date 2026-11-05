package questao2;

public class MensalistaStrategy implements Strategy {
    private static final double VALOR_FIXO = 250.00;

    @Override
    public double execute(int minutos) {
        return VALOR_FIXO;
    }
}
