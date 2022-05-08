package instituicao;

public class ContaPoupanca extends Conta {
	private final double TAXA_RENDIMENTO = 0.015;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void depositar(double valor) {
		livroregistro.AddRegistro(new Registro("DEPOSITO",Registro.AUMENTA,valor));
		livroregistro.AddRegistro(new Registro("RENDIMENTO DEPOSITO",Registro.AUMENTA,valor*this.TAXA_RENDIMENTO));
		
	}
}
