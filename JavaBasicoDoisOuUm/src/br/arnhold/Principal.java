package br.arnhold;

import java.util.ArrayList;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		int qtdeJogadores = 3;// Integer.parseInt(JOptionPane.showInputDialog("Quantos
								// Jogadores iram participar?"));

		ArrayList<Player> jogadores = new ArrayList<>();

		if (qtdeJogadores < 2) {
			System.out.println("Deverá possuir pelo menos 2(dois) jogadores!!!");
		} else {
			for (int i = 0; i < qtdeJogadores; i++) {
				Player pi = new Player("Jogador" + i);
				//Adiciona os jogadores ao ArrayList
				jogadores.add(pi);
/*
				System.out.print(jogadores.get(i).getNome()+" Escolheu: " );
				System.out.println(escolheNumero(jogadores));*/
			}
			
			doisOuUm(jogadores);
			
			
			parOuImpar(jogadores);

		}
	}

	private static void doisOuUm(ArrayList<Player> jogadores) {
		while (jogadores.size() != 2) {
			doisOuUm(jogadores);	
			
		}
		
	}

	private static void parOuImpar(ArrayList<Player> jogadores) {
		// TODO Auto-generated method stub

	}

	private static int escolheNumero(ArrayList<Player> jogadores) {
		Random ran = new Random();
		// é incluido o + 1 Para sempre gerar 1 ou 2
		return (ran.nextInt(2) + 1);

	}

}
