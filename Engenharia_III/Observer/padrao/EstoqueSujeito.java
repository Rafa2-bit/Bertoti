import java.util.ArrayList;
import java.util.List;

class EstoqueSujeito implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String produto;
    private int quantidade;

    public EstoqueSujeito(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantitySetup(quantidade);
    }

    private int quantitySetup(int q) { return q; } // Auxiliar

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
        // Quando o estado muda, notificamos todos automaticamente
        notificarObservers();
    }

    @Override
    public void registrarObserver(Observer o) { observers.add(o); }

    @Override
    public void removerObserver(Observer o) { observers.remove(o); }

    @Override
    public void notificarObservers() {
        for (Observer o : observers) {
            o.atualizar(produto, quantidade);
        }
    }
}
