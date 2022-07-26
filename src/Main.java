
public class Main {

	public static void main(String[] args) {
		Cliente emerson = new Cliente();
		emerson.setNome("Emerson");
		
		Conta cc = new ContaCorrente(emerson);
		Conta poupanca = new ContaPoupanca(emerson);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}