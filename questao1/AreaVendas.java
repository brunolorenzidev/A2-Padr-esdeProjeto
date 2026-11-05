package questao1;

public class AreaVendas extends Observer {
    private int quantidadeAnterior;

    public AreaVendas(Produto produto) {
        this.produto = produto;
        this.quantidadeAnterior = produto.getQuantidade();
        this.produto.attach(this);
    }

    @Override
    public void update() {
        if (quantidadeAnterior == 0 && produto.getQuantidade() > 0) {
            System.out.println("Vendas: alerta, " + produto.getNome()
                    + " voltou a ter estoque. Quantidade: " + produto.getQuantidade());
        }
        quantidadeAnterior = produto.getQuantidade();
    }
}
