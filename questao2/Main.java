package questao2;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("QWE-4F56", 200, new RotativoStrategy());
        System.out.println("Placa " + ticket.getPlaca() + ", permanencia de " + ticket.getMinutos() + " minutos");
        System.out.println("Valor rotativo: " + ticket.executeStrategy());
        ticket.setStrategy(new MensalistaStrategy());
        System.out.println("Valor mensalista: " + ticket.executeStrategy());
        ticket.setStrategy(new ConveniadoStrategy());
        System.out.println("Valor conveniado: " + ticket.executeStrategy());
    }
}
