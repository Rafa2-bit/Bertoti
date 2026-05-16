// Interface para quem quer ouvir os eventos
interface Observer {
    void atualizar(String produto, int quantidade);
}

// Interface para quem gera os eventos
interface Subject {
    void registrarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers();
}