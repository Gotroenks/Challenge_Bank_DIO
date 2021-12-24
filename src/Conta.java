
public abstract class Conta implements IConta {

	private static final int agenciaA = 1;

	private static int number = 0;

	private int agencia;
	private int numero;
	private double saldo;

	public Conta() {
		this.agencia = agenciaA;
		this.numero = ++number;
	}

	public double sacar(double valor) {
		return saldo = saldo < valor ? saldo : (saldo - valor);
	}

	public double depositar(double valor) {
		return saldo = valor < 0 ? saldo : (saldo + valor);
	}

	public void transferir(double valor, Conta destino) {
		if (this.saldo > valor) {
			this.sacar(valor);
			destino.depositar(valor);
			System.out.printf("\n\nTransferencia efetuada para %s\n no valor de R$%.2f",
					destino.toString().charAt(5) == 'C' ? "Conta Corrente" : "Conta Poupança", valor);
		} else
			System.err.print("\nSaldo insuficiente para transferencia");
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirExtrato() {
		System.out.printf("\nAgencia: 000%d", this.agencia);
		System.out.printf("\nNumero: %d", this.numero);
		System.out.printf("\nSaldo: %.2f", this.saldo);
	}
}
