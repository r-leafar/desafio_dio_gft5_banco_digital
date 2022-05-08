package instituicao;

public class GUI {
	public static void main(String[] args) {

		Cliente c1 = new Cliente("JOAO FERREIRA");
		Cliente c2 = new Cliente("RAFAEL DIEGO");

		Conta cc1 = new ContaCorrente(c1);
		Conta cc2 = new ContaPoupanca(c2);

		cc1.depositar(100);
		cc1.transferir(50, c2);
		cc1.imprimirExtrato();

		System.out.println("________\n");
		cc2.depositar(100);
		cc2.transferir(50, c2);
		cc2.imprimirExtrato();

	}
}
