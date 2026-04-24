public class Pessoa {
    // Atributos
    private final String cpf;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Pessoa(String cpf, String nome){
        setNome(nome);
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return ("Nome:" + nome +'\n'+"CPF:" + cpf + '\n');
    }
}

