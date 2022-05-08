package instituicao;

public class Registro {



	private static int SEQUENCIAL = 1;
	private String descricao;
	public static final int AUMENTA=1;
	public static  final int DIMINUI=-1;
	private int operacao;
	private double valor;

	public Registro(String descricao,int modo,double valor){
		this.descricao =descricao;
		if(modo>0) operacao=this.AUMENTA;
		if(modo<0) operacao=this.DIMINUI;
		if(modo==0) throw new java.lang.IllegalArgumentException("atributo [operaçao] deve ser não nulo");
		this.valor =valor;
	}
	public String getDescricao() {
		return descricao;
	}


	public double getValor() {
		return valor * this.operacao;
	}
	

}
