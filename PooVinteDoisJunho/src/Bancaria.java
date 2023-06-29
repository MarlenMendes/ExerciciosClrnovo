interface Tributavel {
    double calcularTributos();
}

class ContaPoupancadois implements Tributavel {

    @Override
    public double calcularTributos() {
        return 0;
    }

}

class ContaCorrente implements Tributavel {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calcularTributos() {
        return saldo * 0.01;
    }

}

class SeguroDeVida implements Tributavel {

    @Override
    public double calcularTributos() {
        return 42;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente(5000);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        double tributosContaPoupanca = contaPoupanca.calcularTributos();
        double tributosContaCorrente = contaCorrente.calcularTributos();
        double tributosSeguroDeVida = seguroDeVida.calcularTributos();

        System.out.println("Tributos da Conta Poupança: " + tributosContaPoupanca);
        System.out.println("Tributos da Conta Corrente: " + tributosContaCorrente);
        System.out.println("Tributos do Seguro de Vida: " + tributosSeguroDeVida);


    }
}