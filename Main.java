package base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
//		inciando vetor de posiçao das variaveis vazias, onde seria cada lugar no jogo.
//		CRIANDO ESPAÇOS VAZIOS
		String posicao[] = new String[9];
		int loopVetorPosicao;
		for (loopVetorPosicao = 0; loopVetorPosicao < 9; loopVetorPosicao++){
			posicao[loopVetorPosicao] = " ";
		}
		int loopVitoriaX;
		int loopVitoriaO;
//		MECANISMO JOGO
		Scanner comecarJogo = new Scanner(System.in);
		Scanner pararJogo = new Scanner(System.in);
		Scanner respPosicaoNovaX = new Scanner(System.in);
		Scanner respPosicaoNovaO = new Scanner(System.in);
//		MECANISNO JOGO
		int comecou;
		int contJogo = 1;
		int avancar = 9;
		int parar = 0;
		int pararResp;
		int respPosicaoX;
		int respPosicaoO; 
		String erroPosicao = "Preenchido";
		boolean vezX = true;
		int limite = 0;
//		START
		System.out.println("Vamos jogar? (1) sim (2)nao");
		comecou = comecarJogo.nextInt();
		if (comecou == 1) {
			while (contJogo == 1){
//				inicia jogada X
				
				if(vezX == true) {
					
//					impressao
					System.out.println(" " + posicao[0] + " " + "|" + " " + posicao[1] + " " + "|" + " " + posicao[2] + " ");
					System.out.println("-----------");
					System.out.println(" " + posicao[3] + " " + "|" + " " + posicao[4] + " " + "|" + " " + posicao[5] + " ");
					System.out.println("-----------");
					System.out.println(" " + posicao[6] + " " + "|" + " " + posicao[7] + " " + "|" + " " + posicao[8] + " ");
					
					if (posicao[0].equals("O") == true && posicao[1].equals("O") == true && posicao[2].equals("O") == true ||
							posicao[3].equals("O") == true && posicao[4].equals("O") == true && posicao[5].equals("O") == true ||
							posicao[6].equals("O") == true && posicao[7].equals("O") == true && posicao[8].equals("O") == true ||
							posicao[0].equals("O") == true && posicao[3].equals("O") == true && posicao[6].equals("O") == true ||
							posicao[1].equals("O") == true && posicao[4].equals("O") == true && posicao[7].equals("O") == true ||
							posicao[2].equals("O") == true && posicao[5].equals("O") == true && posicao[8].equals("O") == true ||
							posicao[0].equals("O") == true && posicao[4].equals("O") == true && posicao[8].equals("O") == true ||
							posicao[6].equals("O") == true && posicao[4].equals("O") == true && posicao[2].equals("O") == true
							) {
							System.out.println("O GANHOU!");
							break;
						}
//				JOGADA
				System.out.println("Vez do ( X ) escolha uma posiçao: ");
				respPosicaoX = respPosicaoNovaX.nextInt();
//				VERIFICANDO JOGADA
				if(respPosicaoX <= 9 && respPosicaoX > 0) {
					// SE SIM DIMINUI 1 PARA COMPARAR POSIÇAO NO VETOR
					respPosicaoX--;			
					if(posicao[respPosicaoX] != " ") {

						// SE PREENCHIDO ALERTA
						System.out.println(erroPosicao);
					} else { 
//						PREENCHE A STRING, CONTA O ESPAÇO PARA DEFINIR LIMITE
						posicao[respPosicaoX] = "X";
						++limite;
						vezX = false;
//						CONFIRMA JOGADA
							System.out.println("(9)Avançar (0)Fechar jogo");
							pararResp = pararJogo.nextInt();
								if (pararResp == avancar) {
//									VERIFICAR SE GANHOU
//									if() {
//										System.out.println("X ganhou!");
//									}
//									AVANÇANDO O vezX false HABILITA A vez do O
 									vezX = false;
//									SENAO A RESPOSTA DE PARAR OU QUALQUER OUTRO NUMERO ENCERRA JOGO
								} else if (pararResp == parar || pararResp != 0 || pararResp !=9 ) {break;}
							}
					} else {
//						SE JOGADA DIFERENTE DA 1 DE 9 POSIÇAO ENCERRA JOGO
						break;
					}
				//condiçao x
					
				}
				
//				inicia jogada O

				if (vezX == false) {
						
//					impressao 
					System.out.println(" " + posicao[0] + " " + "|" + " " + posicao[1] + " " + "|" + " " + posicao[2] + " ");
					System.out.println("-----------");
					System.out.println(" " + posicao[3] + " " + "|" + " " + posicao[4] + " " + "|" + " " + posicao[5] + " ");
					System.out.println("-----------");
					System.out.println(" " + posicao[6] + " " + "|" + " " + posicao[7] + " " + "|" + " " + posicao[8] + " ");
					
					if (posicao[0].equals("X") == true && posicao[1].equals("X") == true && posicao[2].equals("X") == true ||
							posicao[3].equals("X") == true && posicao[4].equals("X") == true && posicao[5].equals("X") == true ||
							posicao[6].equals("X") == true && posicao[7].equals("X") == true && posicao[8].equals("X") == true ||
							posicao[0].equals("X") == true && posicao[3].equals("X") == true && posicao[6].equals("X") == true ||
							posicao[1].equals("X") == true && posicao[4].equals("X") == true && posicao[7].equals("X") == true ||
							posicao[2].equals("X") == true && posicao[5].equals("X") == true && posicao[8].equals("X") == true ||
							posicao[0].equals("X") == true && posicao[4].equals("X") == true && posicao[8].equals("X") == true ||
							posicao[6].equals("X") == true && posicao[4].equals("X") == true && posicao[2].equals("X") == true
							) {
							System.out.println("X GANHOU!");
							break;
						}
					
//					RESPOSTA
					System.out.println("Vez do ( O ) escolha uma posiçao: ");
					respPosicaoO = respPosicaoNovaO.nextInt();
					
					if(respPosicaoO <= 9 && respPosicaoO > 0) {
						respPosicaoO--;			
						if(posicao[respPosicaoO] != " ") {
							System.out.println("Preenchido");
						} else { 
							posicao[respPosicaoO] = "O";
							++limite;
							vezX = true;
								System.out.println("(9)Avançar (0)Fechar jogo");
								pararResp = pararJogo.nextInt();
								if (pararResp == avancar) {
									vezX = true;
								} else if (pararResp == parar || pararResp != 0 || pararResp !=9 ) {break;}
						}
					} else {
						break;
					}//condicao O
					
				}
//			se todos espaçoes preenchidos
			if(limite == 9) {
				System.out.println("O jogo empatou!");
				break;
			}		
			//finalizando o game
			 
		}// fim condicao while
		System.out.println("Finalizado");
	}
}
}