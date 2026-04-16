public class ContaCorrente {
    private Pessoa correntista;
    private long numeroContaCorrente;
    private float saldoConta;

    public ContaCorrente(Pessoa correntista, long numero){
        this.numeroContaCorrente = numero;
        this.correntista = correntista;
    }

}
