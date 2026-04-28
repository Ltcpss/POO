Exercício

    Crie uma classe Pessoa

        atributos:
            cpf (final)
            nome (com getter e setter)

        (ambos informados no construtor)

        métodos:
            override no toString() mostrando cpf e nome de forma organizada

    modifique a classe ContaCorrente para que, ao invés de possuir o cpf do dono da conta, ela passe a ter uma referência para o correntista, que será um objeto da classe Pessoa

    crie um construtor em ContaCorrente para receber o número da conta corrente (novo atributo, do tipo long, que você acrescentará), e o correntista (um objeto do tipo Pessoa)

    crie uma classe Funcionario que herde da classe Pessoa, acrescentando:
        novos atributos:
            matricula (deve ser passada no construtor de Funcionario)
            salario (deve ser inicializado com o valor do salário-base padrão para todos os funcionários do banco, definido na classe Banco como public static final)
            o Banco onde o Funcionario trabalha (passado no construtor)
        novos métodos:
            imprimirContracheque(), que printa o salário atual
        override no método toString(), que deve conter as mesmas informações de Pessoa, e também a matrícula do funcionário e seu salário.

    na classe Banco, crie um ArrayList de Funcionario, contendo todos os funcionários do banco, e um método adicionarFuncionario(), que recebe as informações necessárias para a criação de um Funcionario e o acrescenta à lista de funcionários do banco; crie também um método localizarFuncionario(), que recebe uma matrícula como parâmetro e retorna o Funcionario que tem aquela matrícula, se existir, ou null, caso não exista.

    na classe Banco, crie um método promoverFuncionario(), que recebe como parâmetro um Funcionario e printa o nome daquele Funcionario, dizendo que ele será promovido. O salário daquele funcionário deve aumentar em 30 porcento. Após o reajuste do salário, imprima o toString() daquele funcionário, verificando que seu salário aumentou.

    crie uma classe Gerente, que herda de Funcionario, e que possui:
        novos atributos:
            subordinados, uma lista (ArrayList) de objetos Funcionario, que serão aqueles funcionários do banco que respondem diretamente àquele gerente
        novos métodos:
            adicionarSubordinado(), que recebe um Funcionario como parâmetro e o adiciona à lista de subordinados daquele gerente; é necessário verificar se o Funcionario informado é de fato um funcionário do banco do gerente; se não for, lance uma RuntimeException
            imprimirEquipe(), que printa a lista de subordinados do gerente, chamando o toString() de cada um dos funcionários subordinados
        override no metodo toString(), que deve conter as mesmas informações de Funcionário, e também o tamanho da sua equipe
        no construtor de Gerente, o salário deve ser inicializado como sendo o dobro do salário-base definido na classe Banco

    finalmente, no main(), acrescente cinco funcionários e dois gerentes no banco. Os funcionários devem estar distribuídos entre os dois gerentes como você quiser. Promova um dos funcionários e um dos gerentes.
