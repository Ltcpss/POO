public class Funcionario extends Pessoa{
    private final String matricula;
    private float salario = Banco.salarioBase;
    private Banco empregador;

    public Funcionario(String cpf, String nome, String matricula, Banco empregador){
        super(cpf, nome);
        this.matricula = matricula;
        this.empregador = empregador;
    }

    public void ImprimirContracheque(){
        System.out.println(this.salario * 12);
    }

    @Override
    public String toString(){
        return (super.toString() + "Matricula:" + matricula + '\'' + "Salário:" + salario + '\'');
    }
}
