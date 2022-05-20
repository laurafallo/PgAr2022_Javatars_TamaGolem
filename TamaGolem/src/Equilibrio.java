import java.util.Random;

public class Equilibrio {
	
	Random random = new Random();
	int inter[][] = new int[6][6]; //matrice per i valori dell'equilibrio
	
	public void creaEquilibrio() {
		int i = 1, j = 2;
		int contaS = 0, contaD = 0, n, potenza, diff = 0, somma = 0;

		while (i < 5 ) {
		while (contaS + contaD != 3 && j < 5) {
			n = random.nextInt(2);
			if (n == 1) {//elemento debole
				potenza = random.nextInt(8-diff) + 1;
				inter[j][i] = potenza;
				inter[i][j] = -potenza;
				diff += potenza;
				contaD++;
			}
			else{//elemento forte
				potenza = random.nextInt(8-somma) + 1;
				inter[i][j] = potenza;
				inter[j][i] = -potenza;
				somma += potenza;
				contaS++;	
			}
			j++;
		}
		if (diff > somma) {
			inter[5][i] = inter[i][1]+ inter[i][2]+ inter[i][3]+ inter[i][4];
			int s = inter[i][5];
			inter[i][5] = -(inter[i][1]+ inter[i][2]+ inter[i][3]+ inter[i][4]);
		}
		else if (diff < somma){
			inter [i][5] = -(inter[i][1]+ inter[i][2]+ inter[i][3]+ inter[i][4]);
			inter [5][i] = inter[i][1]+ inter[i][2]+ inter[i][3]+ inter[i][4];
		}
		else if (somma == 0 && diff == 0) {
			inter [4][5] = -(inter[4][1] + inter[4][2] + inter[4][3]);
			inter [5][4] = - inter[4][5];
		}
		i++;		
		j= i+1;
		contaS = 0;
		contaD = 0;
		diff = 0;
		somma = 0;
		}
		inter [5][5] = 0;	
	}
	
	
	public int valoreDanno (int riga, int colonna) {
		int potenza = 0;
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++)
				potenza = inter[riga][colonna];
		}
		return potenza;
	}
	
	
	public void stampa() {		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) 
				System.out.printf("%3d |", inter[i][j]);
			System.out.print("\n");	
		}
	}
	}

