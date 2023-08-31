/* 
1- Utilizando o modificador 'private'
2- O método 'TestaConta' não consegue reconhecer 
os atributos com o modificador 'private'

5, 6, 7 (Opcional) Não fiz!! 

*/

class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta("Pedro");

        minhaConta.Depositar(1000);

        System.out.println("Saldo atual: " + minhaConta.getSaldo());

        minhaConta.Depositar(1000);

        System.out.println("Meu nome: " + minhaConta.getTitular());
    }
}
