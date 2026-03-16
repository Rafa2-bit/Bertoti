public class Estudante extends Cliente implements Emprestimo{
    String cpf;
    int idade;

    public Estudante(String nome, String cpf, int idade, int numConta){
        super(nome, numConta);
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public boolean fazerEmprestimo() {
        return false;
    }
}
