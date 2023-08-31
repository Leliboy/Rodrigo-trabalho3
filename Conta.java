class Conta {
    private double saldo;
    private String titular;
    int identificador;

    public String getTitular() {
        return this.titular;
    }

    Conta(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void Depositar(double saldo) {
        this.saldo = saldo;
    }

    public String Titular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;

    }
}
