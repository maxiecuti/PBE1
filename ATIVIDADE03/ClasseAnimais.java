package prjZoologico;

public class ClasseAnimais {

	//Atributos
      String atributoNome;
	  String atributoRaca;
	  String atributoSexo;
	  double atributoPeso;
		  
	//Construtores
		  
	  public ClasseAnimais() {
			 
	}
	  public ClasseAnimais(String parametroNome, String parametroRaca, String parametroSexo, double parametroPeso) {
		  this.atributoNome = parametroNome;
		  this.atributoRaca = parametroRaca;
		  this.atributoSexo = parametroSexo;
		  this.atributoPeso = parametroPeso;
		  
	  }
	  
	  //Metodos
	  public void metodoComer() {
		  if(this.atributoPeso >= 170) {
			  System.out.println(this.atributoNome + " está obeso, melhor se exercitar!");
			  
		  }
		  else {
		      this.atributoPeso = this.atributoPeso + 10;
			  
		  }
		  
	  }
	  public void metodoExercitar() {
		  if (this.atributoPeso <= 50) {
			  System.out.println(this.atributoNome + " está magro demais, vai comer!");
		  }
	  
		  else {
		  this.atributoPeso -= 10;
		  }
    }
	  public void exibirInfo() {
		  System.out.println("Nome: " + this.atributoNome);
		  System.out.println("Peso: " + this.atributoPeso);
		  
	  }

}
