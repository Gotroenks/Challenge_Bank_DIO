
public interface IConta {

	double sacar(double valor);

	double depositar(double valor);

	void transferir(double valor, Conta destino);

	void imprimeExtrato();
}
