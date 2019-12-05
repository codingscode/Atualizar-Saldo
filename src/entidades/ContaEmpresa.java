package entidades;

public class ContaEmpresa extends Conta {

	private Double emprestimolimite;
	
	public ContaEmpresa() {
	  super();
	}

	public ContaEmpresa(Integer numero, String titular, Double saldo, Double emprestimolimite) {
		super(numero, titular, saldo);
		this.emprestimolimite = emprestimolimite;
	}

	public Double getEmprestimolimite() {
		return emprestimolimite;
	}

	public void setEmprestimolimite(Double emprestimolimite) {
		this.emprestimolimite = emprestimolimite;
	}
	
	public void emprestimo(double quantidade) {
	  if(quantidade <= emprestimolimite) {
	    saldo += quantidade - 10.0;
	  }
	}
	
	@Override
	public void retirar(double quantidade) {
	   super.retirar(quantidade);
		saldo -= 2.0; 
	}
	
}
