public class Aposentado extends Cliente implements Emprestimo{
    String cpf;
    int idade;

    public Aposentado(String nome, String cpf, int idade, int numConta){
        super(nome, numConta);
        this.cpf = cpf;
        this.idade = idade;
    }
    @Override
    public boolean fazerEmprestimo() {
        return true;
    }
}
