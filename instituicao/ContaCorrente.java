package instituicao;

public class ContaCorrente extends Conta {

	private final double TAXA_TRANSFERENCIA = 0.025;
	private final double LIMITE_CHEQUE_ESPECIAL = -200;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void transferir(double valor,Cliente cli) {
		this.livroregistro.AddRegistro(new Registro("TRANFERENCIA",Registro.DIMINUI,valor));
		this.livroregistro.AddRegistro(new Registro("TAXA DE TRANSF. ",Registro.DIMINUI,valor*this.TAXA_TRANSFERENCIA));
		
	}
}
