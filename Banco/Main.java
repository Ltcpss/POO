public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banquinho");

        //acrescentar 5 funcionarios e 2 gerentes a um banco

        meuBanco.adicionarFuncionario("482.391.657-09", "Fulano", "M2847", false);
        meuBanco.adicionarFuncionario("731.045.892-14", "Sicrano", "M1593", true);
        meuBanco.adicionarFuncionario("295.618.473-81", "Beltrano", "M7062", false); // Gerente
        meuBanco.adicionarFuncionario("864.237.915-36", "Fulana", "M4381", false);
        meuBanco.adicionarFuncionario("547.923.186-52", "Sicrana", "M9274", true);

        //promover 1 funcionario e 1 gerente
        meuBanco.promoverFuncionario(meuBanco.localizarFuncionario("M2847"));
        meuBanco.promoverFuncionario(meuBanco.localizarFuncionario("M9274"));
    }
}