
public class Main {
    public static void main(String[] args) {
        
        class ServicoEmail {
            public void enviarAlerta(String produto) {
                System.out.println("E-mail: Alerta de estoque baixo para o produto " + produto);
            }
        }

        // O Anti-Pattern: Estoque está totalmente acoplado
        class Estoque {
            private String produto = "Notebook";
            private int quantidade = 10;
            
            // Acoplamento direto (ruim)
            private PainelWeb painel = new PainelWeb();
            private ServicoEmail email = new ServicoEmail();

            public void setQuantidade(int novaQuantidade) {
                this.quantidade = novaQuantidade;
                
                // Disparo manual e rígido
                painel.atualizarInterface(produto, quantidade);
                if (quantidade < 3) {
                    email.enviarAlerta(produto);
                }
            }
        }

        Estoque estoque = new Estoque();
                
                // Simulando mudanças no estoque
                estoque.setQuantidade(5);  // Atualiza o painel, mas não envia alerta
                estoque.setQuantidade(2);
    }
}