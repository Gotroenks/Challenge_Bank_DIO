
public class ContaPoupança extends Conta {

	@Override
	public void imprimeExtrato() {
		System.out.print("\n\nConta Poupanca");
		super.imprimirExtrato();
	}
}
