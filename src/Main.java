public class Main {
    public static void main(String[] args) {
        Cliente ketilen= new Cliente();
        ketilen.setNome("Ketilen");;

        Conta cc= new ContaPoupanca(ketilen);
        Conta poupanca= new ContaPoupanca(ketilen);

        cc.depositar(1000);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
