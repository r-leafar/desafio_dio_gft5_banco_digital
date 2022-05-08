package instituicao;

import java.util.ArrayList;
import java.util.List;

public class LivroRegistro {
	
	private List<Registro> registros;
	private double saldo;
	
	LivroRegistro(){
		registros = new ArrayList<>();
		
	}
	public void AddRegistro(Registro r) {
		this.registros.add(r);
		this.saldo += r.getValor(); 
	}
	public List<Registro> getRegistros() {
		return this.registros;
	}
	public double getSaldo() {
		return this.saldo;
	}
}
