import java.util.ArrayList;

public class Gerente extends Funcionario{
    // Atributos
    private ArrayList<Funcionario> subordinados;

    // Construtor
    public Gerente(String cpf, String nome, String matricula, Banco empregador){
        super(cpf, nome, matricula, empregador);
        this.setSalario(2*Banco.salarioBase);
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Funcionario funcionario){
        if(funcionario.getEmpregador() != this.getEmpregador()){
            throw new RuntimeException("Funcionário pertence a outro banco");
        }
        subordinados.add(funcionario);
    }

    public void imprimirEquipe(){
        for(Funcionario f: subordinados){
            System.out.println(f.toString());
        }
    }

    @Override
    public String toString(){
        return (super.toString() + "Tamanho da Equipe:" + subordinados.size()) + '\n';
    }
}
