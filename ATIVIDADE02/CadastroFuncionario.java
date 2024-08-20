package pjBancario;

	import java.util.Scanner;

	public class Funcionario {
	    private String nome;
	    private double salarioBruto;
	    private double imposto;

	    // Construtor
	    public Funcionario(String nome, double salarioBruto, double imposto) {
	        this.nome = nome;
	        this.salarioBruto = salarioBruto;
	        this.imposto = imposto;
	    }

	    // Getters e Setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getSalarioBruto() {
	        return salarioBruto;
	    }

	    public void setSalarioBruto(double salarioBruto) {
	        this.salarioBruto = salarioBruto;
	    }

	    public double getImposto() {
	        return imposto;
	    }

	    public void setImposto(double imposto) {
	        this.imposto = imposto;
	    }

	    public double calcularSalarioLiquido() {
	        return salarioBruto - imposto;
	    }

	    public void aumentarSalario(double percentual) {
	        salarioBruto += salarioBruto * percentual / 100;
	    }

	    public void exibirInformacoes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Salário Bruto: " + salarioBruto);
	        System.out.println("Imposto: " + imposto);
	        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome: ");
	        String nome = scanner.nextLine();
	        System.out.print("Digite o salário bruto: ");
	        double salarioBruto = scanner.nextDouble();
	        System.out.print("Digite o valor do imposto: ");
	        double imposto = scanner.nextDouble();

	        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

	        funcionario.exibirInformacoes();

	        System.out.print("Digite o percentual de aumento do salário: ");
	        double percentual = scanner.nextDouble();
	        funcionario.aumentarSalario(percentual);

	        funcionario.exibirInformacoes();

	        scanner.close();
	    }
	}

}
