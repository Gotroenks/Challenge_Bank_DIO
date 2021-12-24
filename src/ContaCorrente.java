
public class ContaCorrente extends Conta {

	@Override
	public void imprimeExtrato() {
		System.out.print("\n\n\nConta Corrente");
		super.imprimirExtrato();
	}
}
