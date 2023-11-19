//Atributos:
//1. private List<Produto> produtos; - Lista de produtos no pedido.
//2. private double total; - Valor total do pedido.
//3. private boolean pago; - Indica se o pedido foi pago ou não.

//Métodos:
//1 public Pedido() - Construtor que inicializa a lista de produtos, o total e define que o pedido não foi pago.
//2. public void adicionarProduto(Produto produto, int quantidade) - Adiciona produtos ao pedido, atualizando a lista de produtos e o total.
//3. public void calcularTotal() - Calcula e exibe o valor total do pedido.
//4. public void efetuarPagamento() - Simula o pagamento do pedido, marcando-o como pago.
//5. public void exibirItensDoPedido() - Exibe os itens presentes no pedido.
//6. public void cancelarPedido() - Cancela o pedido se ainda não foi pago, exibindo mensagens apropriadas.

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private double total;
    private boolean pago;

    public Pedido() {
        this.produtos = new ArrayList<>();
        this.total = 0.0;
        this.pago = false;
    }

    // Adiciona produtos ao pedido
    public void adicionarProduto(Produto produto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            this.produtos.add(produto);
            this.total += produto.getValorUnitario();
        }
        System.out.println(quantidade + "x " + produto.getNome() + " adicionado ao pedido.");
    }

    // Calcula e exibe o valor total do pedido
    public void calcularTotal() {
        System.out.println("Total do pedido: R$ " + this.total);
    }

    // Simula o pagamento do pedido
    public void efetuarPagamento() {
        this.pago = true;
        System.out.println("Pagamento efetuado. Aguardando entrega.");
    }

    // Exibe os itens presentes no pedido
    public void exibirItensDoPedido() {
        System.out.println("Itens do Pedido:");
        for (Produto produto : this.produtos) {
            System.out.println("- " + produto.getNome() + " | R$ " + produto.getValorUnitario());
        }
    }

    // Cancela o pedido se ainda não foi pago
    public void cancelarPedido() {
        if (!this.pago) {
            System.out.println("Pedido cancelado. Aguarde o reembolso.");
        } else {
            System.out.println("Não é possível cancelar um pedido já pago.");
        }
    }
}
