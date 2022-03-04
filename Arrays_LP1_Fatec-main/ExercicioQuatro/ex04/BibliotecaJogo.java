import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BibliotecaJogo {

	public static void main(String[] args) {
		
		ArrayList<Jogo> jogo = new ArrayList<Jogo>();
		ArrayList<Jogador> jogador = new ArrayList<>();
		Map <Jogador, Jogo> jogoJogador = new HashMap();
		Set <String> idadeJogador = new HashSet();
		
		
		//adicionar jogadores
		Jogador a1 = new Jogador("Zaion", "18");
		Jogador a2 = new Jogador("victor", "17");
		Jogador a3 = new Jogador("Andrew", "21");
		Jogador a4 = new Jogador("Joice", "21");
		
		jogador.add(a1);
		jogador.add(a2);
		jogador.add(a3);
		jogador.add(a4);
		
		//Adicionar jogos
		Jogo b1 = new Jogo("The last of us", "Ação", "+18anos");
		Jogo b2 = new Jogo("God of War", "Ação", "+18anos");
		
		jogo.add(b1);
		jogo.add(b2);
		
		
		
		jogoJogador.put(a1, b1);
		jogoJogador.put(a2, b2);
		jogoJogador.put(a3, b1);
		jogoJogador.put(a4, b2);
		for (Map.Entry<Jogador, Jogo> entry : jogoJogador.entrySet())
		{
		    System.out.println (entry.getKey() + " | " + entry.getValue());
		}
		
		
		/*System.out.println(jogoJogador);*/
		
		/*Jogador jog = a1;
		jogo =(Jogo)jogoJogador.get(jog);
		System.out.println(jog.toString()+ " | " + jogo.toString());*/

	}

}
