package instituicao;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected LivroRegistro livroregistro;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.livroregistro= new LivroRegistro();
	}
	
	public void sacar(double valor) {
		livroregistro.AddRegistro(new Registro("SACAR",Registro.DIMINUI,valor));
		
	}
	public void depositar(double valor) {
		livroregistro.AddRegistro(new Registro("DEPOSITO",Registro.AUMENTA,valor));
		
	}
	public void transferir(double valor,Cliente cli) {
		livroregistro.AddRegistro(new Registro("TRANFERENCIA",Registro.DIMINUI,valor));
		
	}
	
	protected void imprimirExtrato() {
		System.out.println("#### EXTRATO ######");
		int i=1;
		for(Registro r : livroregistro.getRegistros()) {
			String valor = r.getValor()>0?" "+r.getValor()+" ":" ("+r.getValor()+")";
			System.out.println(i+++" - "+r.getDescricao()+valor);
		}
		System.out.println(String.format("SALDO: %.2f", this.livroregistro.getSaldo()));
		
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.livroregistro.getSaldo()));
	}
}
