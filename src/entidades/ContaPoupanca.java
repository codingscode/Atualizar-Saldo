package entidades;

public class ContaPoupanca extends Conta {

	private Double taxajuro;
	
	public ContaPoupanca() {
	   super();	
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxajuro) {
		super(numero, titular, saldo);
		this.taxajuro = taxajuro;
	}

	public Double getTaxajuro() {
		return taxajuro;
	}

	public void setTaxajuro(Double taxajuro) {
		this.taxajuro = taxajuro;
	}
	
	public void atualizarSaldo() {
	  saldo += saldo*taxajuro;
	}
	
	@Override
	public final void retirar(double quantidade) {
	   saldo -= quantidade;
	}
	
}
