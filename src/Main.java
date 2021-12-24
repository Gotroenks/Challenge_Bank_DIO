
public class Main {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupança();

		cc.depositar(100);
		cc.imprimeExtrato();
		cp.imprimeExtrato();
		cc.transferir(50, cp);
		cc.imprimeExtrato();
		cp.imprimeExtrato();
		cp.transferir(150, cc);
		cc.imprimeExtrato();
		cp.imprimeExtrato();
		cp.transferir(30, cc);
		cc.imprimeExtrato();
		cp.imprimeExtrato();
	}
}
