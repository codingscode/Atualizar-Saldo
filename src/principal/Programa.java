package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaPoupanca(123, "Marco", 1000.0, 0.01));
		lista.add(new ContaEmpresa(222, "Luíza", 3000.0, 1000.0));
		lista.add(new ContaPoupanca(333, "Bob", 20000.0, 0.01));
		lista.add(new ContaEmpresa(444, "Maria", 4000.0, 1500.0));
		
		double soma = 0.0;
		for (Conta conta : lista) {
		  soma += conta.getSaldo();
		}
		
		System.out.printf("Saldo Total : %.2f%n", soma);
		
		for (Conta conta : lista) {
		  conta.depositar(10.0);
		}
		
		for (Conta conta : lista) {
		  System.out.printf("Saldo Atualizado para conta: %d: %.2f%n", conta.getNumero(), conta.getSaldo());
		}

	}

}
