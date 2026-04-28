public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banquinho");

        //Adição de funcionarios
        meuBanco.adicionarFuncionario("482.391.657-09", "Selton Melo", "M2847", false);
        meuBanco.adicionarFuncionario("295.618.473-81", "Fernanda Montenegro", "M7062", false); // Gerente
        meuBanco.adicionarFuncionario("864.237.915-36", "Wagner Moura", "M4381", false);
        meuBanco.adicionarFuncionario("319.284.756-03", "Rodrigo Santoro", "M3516", false);
        meuBanco.adicionarFuncionario("628.413.597-28", "Alessandra Negrini", "M6749", false);

        //Adição de Gerentes
        meuBanco.adicionarFuncionario("547.923.186-52", "Débora Falabella", "M9274", true);
        meuBanco.adicionarFuncionario("731.045.892-14", "Lazaro Ramos", "M1593", true);

        Gerente gerente1 = meuBanco.localizarGerente("M9274");
        Gerente gerente2 = meuBanco.localizarGerente("M1593");

        //Distribuição de funcionários entre gerentes
        if (gerente1 != null){
            gerente1.adicionarSubordinado(meuBanco.localizarFuncionario("M2847"));
            gerente1.adicionarSubordinado(meuBanco.localizarFuncionario("M7062"));
            gerente1.adicionarSubordinado(meuBanco.localizarFuncionario("M4381"));
        }

        if(gerente2 != null){
            gerente2.adicionarSubordinado(meuBanco.localizarFuncionario("M3516"));
            gerente2.adicionarSubordinado(meuBanco.localizarFuncionario("M6749"));
        }

        //Promover 1 funcionario e 1 gerente
        meuBanco.promoverFuncionario(meuBanco.localizarFuncionario("M2847"));
        meuBanco.promoverFuncionario(meuBanco.localizarFuncionario("M9274"));
    }
}