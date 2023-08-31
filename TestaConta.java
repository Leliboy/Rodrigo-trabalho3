public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("Jonas");
        c1.Depositar(100);
        System.out.println(c1.getSaldo());
        System.out.println(c1.Titular());
    }

}
