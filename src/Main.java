import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente jose = new Cliente();
		jose.setNome("jose");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		Conta ccj = new ContaCorrente(jose);
		Conta poupancaj = new ContaPoupanca(jose);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco banco = new Banco();
		banco.setContas(new ArrayList<>(Arrays.asList(ccj, cc)));
		System.out.println(banco.getContas());
		banco.getContas().get(0).getCliente().getNome();
		System.out.println(banco.findContasByNomeTitular("jose"));
	}

}
