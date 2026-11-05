package questao1;

public class Main {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado Mecanico", 15);
        AreaCompras compras = new AreaCompras(teclado);
        AreaVendas vendas = new AreaVendas(teclado);
        AreaAuditoria auditoria = new AreaAuditoria(teclado);

        System.out.println("Estoque de 15 para 9");
        teclado.setQuantidade(9);
        System.out.println("Estoque de 9 para 4");
        teclado.setQuantidade(4);
        System.out.println("Estoque de 4 para 4");
        teclado.setQuantidade(4);
        System.out.println("Estoque de 4 para 0");
        teclado.setQuantidade(0);
        System.out.println("Estoque de 0 para 6");
        teclado.setQuantidade(6);

        System.out.println("Removendo a area de Vendas");
        teclado.detach(vendas);

        System.out.println("Estoque de 6 para 0");
        teclado.setQuantidade(0);
        System.out.println("Estoque de 0 para 8");
        teclado.setQuantidade(8);
    }
}
