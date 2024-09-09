import java.util.List;

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
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void imprimirClientes() {
		if (contas == null || contas.isEmpty()) {
			System.out.println("Nenhuma conta encontrada.");
			return;
		}
		System.out.println("Lista de Clientes do Banco: " + nome);
		for (Conta conta : contas) {
			System.out.println("Cliente: " + conta.getCliente().getNome());
			// ou outra informação da conta
		}
	}

}
