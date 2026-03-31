package Fracao;

public class Fracao {
        // Atributos da classe
    public int numerador;
    public int denominador;

    // Definição do boolean
    boolean sinal = true;

    // Construtor 1
    public Fracao(int numerador, int denominador){
        getNumerador(numerador);
        getDenominador(denominador);

        this.sinal = !((denominador<0) ^ (numerador<0));
    }

    // Construtor 2
    public Fracao(int numerador, int denominador, boolean sinal){
        getNumerador(numerador);
        getDenominador(denominador);

        if(denominador<0 || numerador<0){
            throw new RuntimeException("Denominador e numerador devem ser não negativos");
        }

        this.sinal = sinal;
    }

    // Métodos
    public String toString(){
        String s = "";
        if(!this.sinal){
           s = "-";
        }
        String result;
        if(this.denominador == 1){
            result = s + Integer.toString(this.numerador);
        }
        else {
            result = s + Integer.toString(this.numerador) + '/' + Integer.toString(this.denominador);
        }
        return result;
    }

    public double getValorNumerico(){
        double quociente = (double) this.numerador / (double) this.denominador;

        if(!this.sinal){
            quociente = quociente * (-1);
        }
        return quociente;
    }

    public void getNumerador(int novoNumerador){
        this.numerador = Math.abs(novoNumerador);
    }

    public void getDenominador(int novoDenominador){
        this.denominador = Math.abs(novoDenominador);
        if(denominador == 0) {
            throw new RuntimeException("O denominador não pode ser 0");
        }
    }

    public Fracao getFracaoIrredutivel() {
        int mdc = Aritmetica.mdc(this.numerador, this.denominador);
        if (mdc == 1){
            return this;
        }
        else{
            Fracao irredutivel = new Fracao(this.numerador/mdc, this.denominador/mdc, this.sinal);
            return irredutivel;
        }
    }    

    public boolean equals(Fracao outra){
        Fracao f1 = this.getFracaoIrredutivel();
        Fracao f2 = outra.getFracaoIrredutivel();

        return (f1.numerador == f2.numerador && f1.denominador == f2.denominador && f1.sinal == f2.sinal);
    }
}
