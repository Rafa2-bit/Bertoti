
public class Main {
    public static void main(String[] args) {

        Estudante carlin = new Estudante("Carlin", "101010.010101-04",16,625476138);
        Aposentado seu_ze = new Aposentado("Seu Zé","757712.7612211-22",72,655826389);
        Empresa telecom = new Empresa("Telecom","642.6523/12",2461731);
        ClienteComum ze_ninguem = new ClienteComum("Zé Ninguém","657.231-23",30,5431672);

        System.out.println(carlin.fazerEmprestimo());
        System.out.println(seu_ze.fazerEmprestimo());
        System.out.println(telecom.fazerEmprestimo());
        System.out.println(ze_ninguem.fazerEmprestimo());


    }
}



