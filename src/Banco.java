import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return this.contas;
	}
	public void addConta(Conta conta){
		contas.add(conta);
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public List<Conta> findContasByNomeTitular(String nome){
		if(contas.size() <= 0) return null; 
		return this.contas.stream()
		.filter(conta -> conta.getCliente().getNome().equalsIgnoreCase(nome))
		.collect(Collectors.toList());

}
}