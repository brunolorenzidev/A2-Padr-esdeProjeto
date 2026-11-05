package questao3;

public class Main {
    public static void main(String[] args) {
        iBebida pedido1 = new Espresso();
        pedido1 = new CaldaDecorador(pedido1);
        pedido1 = new CaldaDecorador(pedido1);
        System.out.println("Bebida pedida: " + pedido1.Descricao());
        System.out.println("Custo        : " + pedido1.Preco());

        iBebida pedido2 = new Cha();
        pedido2 = new LeiteDecorador(pedido2);
        pedido2 = new ChantillyDecorador(pedido2);
        System.out.println("Bebida pedida: " + pedido2.Descricao());
        System.out.println("Custo        : " + pedido2.Preco());

        iBebida pedido3 = new Espresso();
        pedido3 = new ChantillyDecorador(pedido3);
        pedido3 = new LeiteDecorador(pedido3);
        pedido3 = new CaldaDecorador(pedido3);
        System.out.println("Bebida pedida: " + pedido3.Descricao());
        System.out.println("Custo        : " + pedido3.Preco());
    }
}
