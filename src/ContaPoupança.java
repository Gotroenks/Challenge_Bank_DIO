
public class ContaPoupanša extends Conta {

	@Override
	public void imprimeExtrato() {
		System.out.print("\n\nConta Poupanca");
		super.imprimirExtrato();
	}
}
