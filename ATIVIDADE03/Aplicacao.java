package prjPokemon;

public class Aplicacao {

	public static void main(String[] args) {
		
    Pokemon pikachu = new Pokemon();
		
		pikachu.Nome = "Pikachu";
		pikachu.Elemento = "Eletrico";
		pikachu.Evolucao = 2;
		pikachu.Hp = 60;
		
    Pokemon jigglypuff = new Pokemon();
		
		jigglypuff.Nome = "Jigglypuff";
		jigglypuff.Elemento = "Normal/Fada";
		jigglypuff.Evolucao = 2;
		jigglypuff.Hp = 115;
		
    Pokemon meowth = new Pokemon();
		
		meowth.Nome = "Jigglypuff";
		meowth.Elemento = "Normal";
		meowth.Evolucao = 1;
		meowth.Hp = 40;
		
    Pokemon charizard = new Pokemon();
		
		charizard.Nome = "Charizard";
		charizard.Elemento = "Fogo/Voar";
		charizard.Evolucao = 3;
		charizard.Hp = 78;
		
    Pokemon espeon = new Pokemon();
		
		espeon.Nome = "Espeon";
		espeon.Elemento = "Pisquico";
		espeon.Evolucao = 2;
		espeon.Hp = 65;
		
		pikachu.Exibir();
		pikachu.ataque();
		pikachu.Evoluir();
		
		jigglypuff.Exibir();
		jigglypuff.ataque();
		jigglypuff.Evoluir();
		
		meowth.Exibir();
		meowth.ataque();
		meowth.Evoluir();
		
		charizard.Exibir();
		charizard.ataque();
		charizard.Evoluir();
		
		espeon.Exibir();
		espeon.ataque();
		espeon.Evoluir();
		
	}

}
