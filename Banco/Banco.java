import java.util.ArrayList;

public class Banco {

    public final static int TAMANHO_MAX_PRO_NOME = 10;

    public static final float salarioBase = 1621;

    private String nome;

    private ArrayList<ContaCorrente> contasCorrentes;

    private ArrayList<Funcionario> listaFuncionarios;

    public Banco(String nome) {
        setNome(nome);
        this.contasCorrentes = new ArrayList<>();
        this.listaFuncionarios = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        if (novoNome.length() >  TAMANHO_MAX_PRO_NOME) {
            return;  // o correto seria lançar uma exceção
        }
        this.nome = novoNome;
    }

    public int getNumeroDeContasCorrentes() {
        return contasCorrentes.size();
    }

    public void adicionarFuncionario(String cpf, String nome, String matricula){
        Funcionario novo = new Funcionario(cpf, nome, matricula, this);
        listaFuncionarios.add(novo);
    }

    public Funcionario localizarFuncionario(String matricula){}
}
