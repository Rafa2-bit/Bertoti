
public class Main {

    public static void main(String[] args) {
        
        class EstoquePolling {
        private int quantidade = 10;
        public int getQuantidade() { return quantidade; }
        public void setQuantidade(int q) { this.quantidade = q; }
        }

// O Anti-Pattern: Um loop infinito que "rouba" processamento
        class MonitorWeb implements Runnable {
            private EstoquePolling estoque;
            
            public MonitorWeb(EstoquePolling estoque) { this.estoque = estoque; }

            @Override
            public void run() {
                int ultimaQuantidade = -1;
                while (true) { // Polling ativo
                    if (estoque.getQuantidade() != ultimaQuantidade) {
                        ultimaQuantidade = estoque.getQuantidade();
                        System.out.println("Painel Web (Polling): Estoque mudou para " + ultimaQuantidade);
                    }
                    try { Thread.sleep(1000); } catch (InterruptedException e) {}
                }
            }
        }
    }
}
