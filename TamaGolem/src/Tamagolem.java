import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.Random;


public class Tamagolem {
	private String nome;
	private int vita;
	private int giocatore;
	
	
	private int farina = 1;
	private int uova = 2;
	private int zucchero = 3;
	private int cacao = 4;
	private int latte = 5;
	
	
	Elementi elementi = new Elementi(farina, uova, zucchero, cacao, latte);
	Random random = new Random();
	Deque<String> deque = new ArrayDeque<String>();
	ArrayList <String> nomeG = new ArrayList <String>();
	Equilibrio equilibrio = new Equilibrio();
	
	
	public Tamagolem(String nome, int vita, int giocatore) {
		super();
		this.nome = nome;
		this.vita = vita;
		this.giocatore = giocatore;
	}

	Scanner lettore = new Scanner (System.in);

	
	public void stampaTamagolem(int giocatore) {
		int num1, num2;
		num1 = random.nextInt(nomeG.size()+1);
		num2 = random.nextInt(nomeG.size()+1);
		System.out.println("Tamagolem " + 1 + " nome: " +  nomeG.get(num1) + " vita: 10");
		System.out.println("Tamagolem " + 2 + " nome: " +  nomeG.get(num2) + " vita: 10");
	}
	
	
	public int getVita() {
		return vita;
	}

	public int getGiocatore() {
		return giocatore;
	}
	

	public void scontro(String scelta1, String scelta2, Deque<String> A, Deque<String> B, Deque<String> C, Deque<String> D, Deque<String> E) {
		int vita1 = 10, vita2 = 10;
		int valore = 0;
		
		equilibrio.creaEquilibrio();

			
			while (vita1 > 0 && vita2 > 0) 
			{
				System.out.println("Giocatore 1 scegli il tuo set di pietre!");
				System.out.println("set A: " + A + "\n set B: " + B + "\n set C: " + C + "\n set D: " + D + "\n set E: " + E );
				String scegliSet1 = lettore.nextLine();
			
				//giocatore 1 ha scelto il set A
				if(scegliSet1.contains("A")) {
					System.out.println("Giocatore 2 scegli il tuo set di pietre!");
					System.out.println(" set B: " + B + "\n set C: " + C + "\n set D: " + D + "\n set E: " + E );
					String scegliSet2 = lettore.nextLine();

					//giocatore 2 ha scelto il set B
					if(scegliSet2.contains("B")) {
					while(vita1 > 0 && vita2 > 0) {

						valore = equilibrio.valoreDanno(1, 3);
						 
						 if (valore < 0) {
							 vita1 += valore;
							 System.out.println("vita 1 rimanente: " + vita1);
						 }
						 else {
							 vita2 -= valore;
							 System.out.println("vita 2 rimanente: " + vita2);
						 }
						if (vita1 > 0 && vita2 > 0) {

						valore = equilibrio.valoreDanno(2, 1);
						 
						 if (valore < 0) {
							 vita1 += valore;
							 System.out.println("vita 1 rimanente: " + vita1);
						 }
						 else {
							 vita2 -= valore;
							 System.out.println("vita 2 rimanente: " + vita2);
						 }
						if (vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(3, 4);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
					}
					}    						
		}
					
					if(vita1 <= 0) 
						System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
					if (vita2 <= 0)
						System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");

					
				}
					
					
					//giocatore 2 ha scelto il set C
					if(scegliSet2.contains("C")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(1, 4);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(2, 5);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

								valore = equilibrio.valoreDanno(3, 1);
								 
								 if (valore < 0) {
									 vita1 += valore;
									 System.out.println("vita 1 rimanente: " + vita1);
								 }
								 else {
									 vita2 -= valore;
									 System.out.println("vita 2 rimanente: " + vita2);
								 }
						}
						}
					}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}
                     
					//giocatore 2 ha scelto il set D
					if(scegliSet2.contains("D")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(1, 2);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(2, 3);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

								valore = equilibrio.valoreDanno(3, 5);
								 
								 if (valore < 0) {
									 vita1 += valore;
									 System.out.println("vita 1 rimanente: " + vita1);
								 }
								 else {
									 vita2 -= valore;
									 System.out.println("vita 2 rimanente: " + vita2);
								 }
						}
						}	
					}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}
					
					//giocatore 2 ha scelto il set E
					if(scegliSet2.contains("E")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(1, 5);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(2, 4);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

								valore = equilibrio.valoreDanno(3, 2);
								 
								 if (valore < 0) {
									 vita1 += valore;
									 System.out.println("vita 1 rimanente: " + vita1);
								 }
								 else {
									 vita2 -= valore;
									 System.out.println("vita 2 rimanente: " + vita2);
								 }
								}
							}
						}
					}
					if(vita1 <= 0) 
						System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
					if (vita2 <= 0)
						System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					
				}
				
				
				
				//giocatore 1 ha scelto il set B
				if(scegliSet1.contains("B")){
					System.out.println("Giocatore 2 scegli il tuo set di pietre!");
					System.out.println("set A: " + A + "\nset C: " + C + "\n set D: " + D + "\n set E: " + E );
					String scegliSet2 = lettore.nextLine();
					
					
					//giocatore 2 ha scelto il set A
					if(scegliSet2.contains("A")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(3, 1);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(1, 2);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

								valore = equilibrio.valoreDanno(4, 3);
								 
								 if (valore < 0) {
									 vita1 += valore;
									 System.out.println("vita 1 rimanente: " + vita1);
								 }
								 else {
									 vita2 -= valore;
									 System.out.println("vita 2 rimanente: " + vita2);
								 }
						}
							}
						}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
						}
				
					//giocatore 2 ha scelto il set C
						if(scegliSet2.contains("C")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(3, 4);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(1, 5);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

								valore = equilibrio.valoreDanno(4, 1);
								 
								 if (valore < 0) {
									 vita1 += valore;
									 System.out.println("vita 1 rimanente: " + vita1);
								 }
								 else {
									 vita2 -= valore;
									 System.out.println("vita 2 rimanente: " + vita2);
								 }
						}
						}
					}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}
                     
						//giocatore 2 ha scelto il set D
					if(scegliSet2.contains("D")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(3, 2);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(1, 3);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

								valore = equilibrio.valoreDanno(4, 5);
								 
								 if (valore < 0) {
									 vita1 += valore;
									 System.out.println("vita 1 rimanente: " + vita1);
								 }
								 else {
									 vita2 -= valore;
									 System.out.println("vita 2 rimanente: " + vita2);
								 }
						}
						}	
					}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}

					//giocatore 2 ha scelto il set E
					if(scegliSet2.contains("E")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(3, 5);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(1, 4);
							 
							 if (valore < 0) {
								 vita1 += valore;
								 System.out.println("vita 1 rimanente: " + vita1);
							 }
							 else {
								 vita2 -= valore;
								 System.out.println("vita 2 rimanente: " + vita2);
							 }
							if (vita1 > 0 && vita2 > 0) {

								valore = equilibrio.valoreDanno(4, 2);
								 
								 if (valore < 0) {
									 vita1 += valore;
									 System.out.println("vita 1 rimanente: " + vita1);
								 }
								 else {
									 vita2 -= valore;
									 System.out.println("vita 2 rimanente: " + vita2);
								 }
						}
						}
						}
						
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
				}	
					
				}
				
				
				
				//giocatore 1 ha scelto il set C
				if(scegliSet1.contains("C")){
					System.out.println("Giocatore 2 scegli il tuo set di pietre!");
					System.out.println("set A: " + A + "\n set B: " + B + "\n set D: " + D + "\n set E: " + E );
					String scegliSet2 = lettore.nextLine();
					
					//giocatore 2 ha scelto il set A
		       if(scegliSet2.contains("A")) {
		         	while(vita1 > 0 && vita2 > 0) {

				 valore = equilibrio.valoreDanno(4, 1);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(5, 2);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

					valore = equilibrio.valoreDanno(1, 3);
					 
					 if (valore < 0) {
						 vita1 += valore;
						 System.out.println("vita 1 rimanente: " + vita1);
					 }
					 else {
						 vita2 -= valore;
						 System.out.println("vita 2 rimanente: " + vita2);
					 }
			}
				}
			}
			if(vita1 <= 0) 
				System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
			if (vita2 <= 0)
				System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
			}
	
				//giocatore 2 ha scelto il set B
				if(scegliSet2.contains("B")) {
			while(vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(4, 3);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(5, 1);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

					valore = equilibrio.valoreDanno(1, 4);
					 
					 if (valore < 0) {
						 vita1 += valore;
						 System.out.println("vita 1 rimanente: " + vita1);
					 }
					 else {
						 vita2 -= valore;
						 System.out.println("vita 2 rimanente: " + vita2);
					 }
			}
			}
		}
			if(vita1 <= 0) 
				System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
			if (vita2 <= 0)
				System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
		}
         
				//giocatore 2 ha scelto il set D
		if(scegliSet2.contains("D")) {
			while(vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(4, 2);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(5, 3);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

					valore = equilibrio.valoreDanno(1, 5);
					 
					 if (valore < 0) {
						 vita1 += valore;
						 System.out.println("vita 1 rimanente: " + vita1);
					 }
					 else {
						 vita2 -= valore;
						 System.out.println("vita 2 rimanente: " + vita2);
					 }
			}
			}	
		}
			if(vita1 <= 0) 
				System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
			if (vita2 <= 0)
				System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
		}
		
		//giocatore 2 ha scelto il set E
		if(scegliSet2.contains("E")) {
			while(vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(4, 5);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(5, 4);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

					valore = equilibrio.valoreDanno(1, 2);
					 
					 if (valore < 0) {
						 vita1 += valore;
						 System.out.println("vita 1 rimanente: " + vita1);
					 }
					 else {
						 vita2 -= valore;
						 System.out.println("vita 2 rimanente: " + vita2);
					 }
			}
			}
			}
			
			if(vita1 <= 0) 
				System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
			if (vita2 <= 0)
				System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
	}	
		
	}
				
				
				
				
				//giocatore 1 ha scelto il set D
				if(scegliSet1.contains("D")){
					System.out.println("Giocatore 2 scegli il tuo set di pietre!");
					System.out.println("set A: " + A + "\n set B: " + B + "\n set C: " + C + "\n set E: " + E );
					String scegliSet2 = lettore.nextLine();
					
					//giocatore 2 ha scelto il set A
					if(scegliSet2.contains("A")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(2, 1);
				 
							if (valore < 0) {
								vita1 += valore;
								System.out.println("vita 1 rimanente: " + vita1);
							}
							else {
								vita2 -= valore;
								System.out.println("vita 2 rimanente: " + vita2);
							}
							if (vita1 > 0 && vita2 > 0) {
					
								valore = equilibrio.valoreDanno(3, 2);
				
								if (valore < 0) {
									vita1 += valore;
									System.out.println("vita 1 rimanente: " + vita1);
								}
								else {
									vita2 -= valore;
									System.out.println("vita 2 rimanente: " + vita2);
								}
								if (vita1 > 0 && vita2 > 0) {

									valore = equilibrio.valoreDanno(5, 3);
					 
									if (valore < 0) {
										vita1 += valore;
										System.out.println("vita 1 rimanente: " + vita1);
									}
									else {
										vita2 -= valore;
										System.out.println("vita 2 rimanente: " + vita2);
									}
								}
							}
						}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}
					
					//giocatore 2 ha scelto il set B
					if(scegliSet2.contains("B")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(2, 3);
				 
							if (valore < 0) {
								vita1 += valore;
								System.out.println("vita 1 rimanente: " + vita1);
							}
							else {
								vita2 -= valore;
								System.out.println("vita 2 rimanente: " + vita2);
							}
							if (vita1 > 0 && vita2 > 0) {
								
								valore = equilibrio.valoreDanno(3, 1);
				 
								if (valore < 0) {
									vita1 += valore;
									System.out.println("vita 1 rimanente: " + vita1);
								}
								else {
									vita2 -= valore;
									System.out.println("vita 2 rimanente: " + vita2);
								}
								if (vita1 > 0 && vita2 > 0) {
									
									valore = equilibrio.valoreDanno(5, 4);
					 
									if (valore < 0) {
										vita1 += valore;
										System.out.println("vita 1 rimanente: " + vita1);
									}
									else {
										vita2 -= valore;
										System.out.println("vita 2 rimanente: " + vita2);
									}
								}
							}
						}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
						}
         
					//giocatore 2 ha scelto il set B
					if(scegliSet2.contains("C")) {
						while(vita1 > 0 && vita2 > 0) {

							valore = equilibrio.valoreDanno(2, 4);
				 
							if (valore < 0) {
								vita1 += valore;
								System.out.println("vita 1 rimanente: " + vita1);
							}
							else {
								vita2 -= valore;
								System.out.println("vita 2 rimanente: " + vita2);
							}
							if (vita1 > 0 && vita2 > 0) {
								
								valore = equilibrio.valoreDanno(3, 5);
				 
								if (valore < 0) {
									vita1 += valore;
									System.out.println("vita 1 rimanente: " + vita1);
								}
								else {
									vita2 -= valore;
									System.out.println("vita 2 rimanente: " + vita2);
								}
								if (vita1 > 0 && vita2 > 0) {

									valore = equilibrio.valoreDanno(5, 1);
					 
									if (valore < 0) {
										vita1 += valore;
										System.out.println("vita 1 rimanente: " + vita1);
									}
									else {
										vita2 -= valore;
										System.out.println("vita 2 rimanente: " + vita2);
									}
								}
							}
						}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}
         
		//giocatore 2 ha scelto il set E
		if(scegliSet2.contains("E")) {
			while(vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(2, 5);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

				valore = equilibrio.valoreDanno(3, 4);
				 
				 if (valore < 0) {
					 vita1 += valore;
					 System.out.println("vita 1 rimanente: " + vita1);
				 }
				 else {
					 vita2 -= valore;
					 System.out.println("vita 2 rimanente: " + vita2);
				 }
				if (vita1 > 0 && vita2 > 0) {

					valore = equilibrio.valoreDanno(5, 2);
					 
					 if (valore < 0) {
						 vita1 += valore;
						 System.out.println("vita 1 rimanente: " + vita1);
					 }
					 else {
						 vita2 -= valore;
						 System.out.println("vita 2 rimanente: " + vita2);
					 }
			}
			}
			}
			
			if(vita1 <= 0) 
				System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
			if (vita2 <= 0)
				System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
		}
		
	}

				//giocatore 1 ha scelto il set E
				if(scegliSet1.contains("E")){
					System.out.println("Giocatore 2 scegli il tuo set di pietre!");
					System.out.println("set A: " + A + "\n set B: " + B + "\n set C: " + C + "\n set D: " + D );
					String scegliSet2 = lettore.nextLine();
					
					//giocatore 2 ha scelto il set A
					if(scegliSet2.contains("A")) {
						while(vita1 > 0 && vita2 > 0) {
							
							valore = equilibrio.valoreDanno(5, 1);
							
							if (valore < 0) {
								vita1 += valore;
								System.out.println("vita 1 rimanente: " + vita1);
							}
							else {
								vita2 -= valore;
								System.out.println("vita 2 rimanente: " + vita2);
							}
							if (vita1 > 0 && vita2 > 0) {
								
								valore = equilibrio.valoreDanno(4, 2);
								
								if (valore < 0) {
									vita1 += valore;
									System.out.println("vita 1 rimanente: " + vita1);
									}
								else {
									vita2 -= valore;
									System.out.println("vita 2 rimanente: " + vita2);
								}
								if (vita1 > 0 && vita2 > 0) {
									
									valore = equilibrio.valoreDanno(2, 3);
		 
									if (valore < 0) {
										vita1 += valore;
										System.out.println("vita 1 rimanente: " + vita1);
									}
									else {
										vita2 -= valore;
										System.out.println("vita 2 rimanente: " + vita2);
									}
								}
							}
						}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}	
					
					//giocatore 2 ha scelto il set B
					if(scegliSet2.contains("B")) {
						while(vita1 > 0 && vita2 > 0) {
							
							valore = equilibrio.valoreDanno(5, 3);
											
							if (valore < 0) {
								vita1 += valore;
								System.out.println("vita 1 rimanente: " + vita1);
							}
							else {
								vita2 -= valore;
								System.out.println("vita 2 rimanente: " + vita2);
							}
							if (vita1 > 0 && vita2 > 0) {
									
								valore = equilibrio.valoreDanno(4, 1);
											
								if (valore < 0) {
									vita1 += valore;
									System.out.println("vita 1 rimanente: " + vita1);
								}
								else {
									vita2 -= valore;
									System.out.println("vita 2 rimanente: " + vita2);
								}
								if (vita1 > 0 && vita2 > 0) {
									
									valore = equilibrio.valoreDanno(2, 4);
											
									if (valore < 0) {
										vita1 += valore;
										System.out.println("vita 1 rimanente: " + vita1);
									}
									else {
										vita2 -= valore;
										System.out.println("vita 2 rimanente: " + vita2);
									}
								}
							}
						}
						if(vita1 <= 0) 
							System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
						if (vita2 <= 0)
							System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}
					//giocatore 2 ha scelto il set C
					if(scegliSet2.contains("C")) {
						while(vita1 > 0 && vita2 > 0) {
					
				valore = equilibrio.valoreDanno(5, 4);
					
				if (valore < 0) {
					vita1 += valore;
		 	System.out.println("vita 1 rimanente: " + vita1);
				}
				else {
					vita2 -= valore;
					System.out.println("vita 2 rimanente: " + vita2);
				}
				if (vita1 > 0 && vita2 > 0) {
					
					valore = equilibrio.valoreDanno(4, 5);
					
					if (valore < 0) {
						vita1 += valore;
						System.out.println("vita 1 rimanente: " + vita1);
					}
					else {
						vita2 -= valore;
						System.out.println("vita 2 rimanente: " + vita2);
					}
					if (vita1 > 0 && vita2 > 0) {
						
						valore = equilibrio.valoreDanno(2, 1);
						
						if (valore < 0) {
							vita1 += valore;
							System.out.println("vita 1 rimanente: " + vita1);
						}
						else {
							vita2 -= valore;
							System.out.println("vita 2 rimanente: " + vita2);
						}
					}
				}
			}
			if(vita1 <= 0) 
				System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
			if (vita2 <= 0)
				System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
				}

					//giocatore 2 ha scelto il set D
					if(scegliSet2.contains("D")) {
						while(vita1 > 0 && vita2 > 0) {
						
							valore = equilibrio.valoreDanno(5, 2);
											
							if (valore < 0) {
								vita1 += valore;
								System.out.println("vita 1 rimanente: " + vita1);
							}
							else {
								vita2 -= valore;
								System.out.println("vita 2 rimanente: " + vita2);
							}
							if (vita1 > 0 && vita2 > 0) {
					
								valore = equilibrio.valoreDanno(4, 3);
							
								if (valore < 0) {
									vita1 += valore;
									System.out.println("vita 1 rimanente: " + vita1);
								}
								else {
									vita2 -= valore;
									System.out.println("vita 2 rimanente: " + vita2);
								}
								if (vita1 > 0 && vita2 > 0) {
						
									valore = equilibrio.valoreDanno(2, 5);
						
									if (valore < 0) {
										vita1 += valore;
										System.out.println("vita 1 rimanente: " + vita1);
									}
									else {
										vita2 -= valore;
										System.out.println("vita 2 rimanente: " + vita2);
				}
			}
		}	
	}
				if(vita1 <= 0) 
					System.out.println("Giocatore 1 hai perso gax\n giocatore 2 sei il più forte du mundu ");
				if (vita2 <= 0)
					System.out.println("Giocatore 2 hai perso gax\n giocatore 1 sei il più forte du mundu ");
					}
				}			
			}
}

	public String getNome() {
		return nome;
	}
}
	
