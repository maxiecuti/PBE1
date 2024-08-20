package pjBancario;

public class ContaBanco {

	public class ContaBancaria {
	    private int numeroConta;
	    private String nomeTitular;
	    private double saldo;
	    
        //Construtor com saldo inicial opcional
	    public void Banco(int numeroConta, String nomeTitular, double saldoInicial) {
	        this.numeroConta = numeroConta;
	        this.nomeTitular = nomeTitular;
	        this.saldo = saldoInicial;
	    }
	    
	    public int getNumeroConta() {
	        return numeroConta;
	    }

	    public void setNumeroConta(int numeroConta) {
	        this.numeroConta = numeroConta;
	    }

	    public String getNomeTitular() {
	        return nomeTitular;
	    }

	    public void setNomeTitular(String nomeTitular) {
	        this.nomeTitular = nomeTitular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Novo saldo: " + saldo);
	             
	        } else {
	            System.out.println("O valor deve ser positivo.");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > 0) {
	            if (valor <= saldo) {
	                saldo -= valor;
	                System.out.println("Saque realizado, novo saldo: " + saldo);
	            } else {
	                System.out.println("Saldo insuficiente.");
	            }
	        } else {
	            System.out.println("O saque deve ser positivo.");
	        }
	    }
	}

}
