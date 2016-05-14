package br.arnhold;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int qtdeJogadores = 3; // Integer.parseInt(JOptionPane.showInputDialog("Quantos
								// Jogadores iram participar?"));

		ArrayList<Player> jogadores = new ArrayList<>();

		if (qtdeJogadores < 2) {
			System.out.println("Deverá possuir pelo menos 2(dois) jogadores!!!");
		} else {
			for (int i = 0; i < qtdeJogadores; i++) {
				Player pi = new Player("Jogador" + i);
				// Adiciona os jogadores ao ArrayList
				jogadores.add(pi);
				System.out.println(jogadores.get(i).getNome());
			}

			startPartida(jogadores);
		}

	}

	private static void startPartida(ArrayList<Player> jogadores) {
		int tirouUm = 0;
		int tirouDois = 0;
		
	while (jogadores.size() != 2) {
			//doisOuUm(jogadores);
		
	}
		
	
			
	
		

	}

	private static void doisOuUm(ArrayList<Player> jogadores) {
		for (int i = 0; i < jogadores.size(); i++) {
			escolheNumero(jogadores.get(i));
			System.out.println(jogadores.get(i).getNome() + " tirou " + jogadores.get(i).getValorjogado());
		}
		
	}

	private static void escolheNumero(Player player) {
		Random ran = new Random();
		// é incluido o + 1 Para sempre gerar 1 ou 2
		player.setValorjogado(ran.nextInt(2) + 1);

	}

}
