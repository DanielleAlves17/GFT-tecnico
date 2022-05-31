public class Agenda {

    int codigoPessoa;
    int telefone;
    int idade;

    public Agenda(int codigoPessoa, int telefone, int idade) {
        this.codigoPessoa = codigoPessoa;
        this.telefone = telefone;
        this.idade = idade;
    }

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void contato(){
        System.out.println("Codigo da Pessoa: " +this.codigoPessoa);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Idade: " + this.idade);
    }


    public void inserir(){
        getCodigoPessoa();
        getTelefone();
        getIdade();

    }


    public void remover(){
        // é alguma coisa que tem que deletar mas eu não sei mesmo


    }

    public void editar(){
        setCodigoPessoa(this.codigoPessoa);
        setTelefone(this.telefone);
        setIdade(this.idade);


    }
}
