package questao1;

public class AreaCompras extends Observer {
    public AreaCompras(Produto produto) {
        this.produto = produto;
        this.produto.attach(this);
    }

    @Override
    public void update() {
        if (produto.getQuantidade() < 5) {
            System.out.println("Compras: alerta, " + produto.getNome()
                    + " com estoque abaixo de 5 unidades. Quantidade: " + produto.getQuantidade());
        }
    }
}
