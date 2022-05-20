import java.util.*;

public class Main {

	public static void main(String[] args) {
		final int N = 5; //numero di elementi
		final int G = 2; //tamagaolem per ogni giocatore
		final int V = 10; //punti vita
		final int P = 3; //pietre per ogni tamagolem
		final int S = 15; //pietre totali nel sacco
				
		//creo i set 
		

		Deque<String> A = new ArrayDeque<>();    
        A.addAll(Arrays.asList(new String [] {"farina", "uova", "zucchero"}));    
        Deque<String> B = new ArrayDeque<>();
        B.addAll(Arrays.asList(new String [] {"zucchero", "farina", "cacao"}));  
        Deque<String> C = new ArrayDeque<>();    
        C.addAll(Arrays.asList(new String [] {"cacao", "latte", "farina"}));  
        Deque<String> D = new ArrayDeque<>();    
        D.addAll(Arrays.asList(new String [] {"uova", "zucchero", "latte"}));  
        Deque<String> E = new ArrayDeque<>();    
        E.addAll(Arrays.asList(new  String [] {"latte", "cacao", "uova"}));  
	 

        String nomeInizio = null;
		int giocatoreG = 0;
		
		Scanner lettore = new Scanner (System.in);
		
		Tamagolem tamaG = new Tamagolem(nomeInizio, V, giocatoreG);		
		tamaG.nomeG.add("pancake");
		tamaG.nomeG.add("waffle");
		tamaG.nomeG.add("biscotto");
		tamaG.nomeG.add("crepe");
		tamaG.nomeG.add("torta");
		
		
		Equilibrio equilibrio = new Equilibrio();
		
		System.out.println("Okaaaaaaaaaaay, lesssgo");
		
		//viene stabilito l'equilibrio fra le forze del mondo
		equilibrio.creaEquilibrio();
		equilibrio.stampa();
	
		
		//inizio scontro
		System.out.println("Giocatore 1 scegli il tamagolem con cui vuoi combattere!");
		tamaG.stampaTamagolem(tamaG.getGiocatore());
		String scelta1 = lettore.nextLine();
		if(scelta1.equals("pancake"))
			tamaG.nomeG.remove(0);
		if(scelta1.equals("waffle"))
			tamaG.nomeG.remove(1);
		if(scelta1.equals("biscotto"))
			tamaG.nomeG.remove(2);
		if(scelta1.equals("crepe"))
			tamaG.nomeG.remove(3);
		if(scelta1.equals("torta"))
			tamaG.nomeG.remove(4);
			
		System.out.println("Giocatore 2 è il tuo turno");
		tamaG.stampaTamagolem(tamaG.getGiocatore());
		String scelta2 = lettore.nextLine();
		if(scelta1.equals("pancake"))
			tamaG.nomeG.remove(0);
		if(scelta1.equals("waffle"))
			tamaG.nomeG.remove(1);
		if(scelta1.equals("biscotto"))
			tamaG.nomeG.remove(2);
		if(scelta1.equals("crepe"))
			tamaG.nomeG.remove(3);
		if(scelta1.equals("torta"))
			tamaG.nomeG.remove(4);
	

		tamaG.scontro(scelta1, scelta2, A, B, C, D, E);

		equilibrio.stampa();

	}
}
