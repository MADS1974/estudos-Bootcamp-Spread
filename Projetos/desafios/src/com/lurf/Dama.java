//teste essa implementação
import java.util.Scanner;

public class Dama {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int x1,y1,x2,y2,moves;
		boolean sameRow, sameColumn, diagonal;
		//se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
		//se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

	    while(true){
	    	x1 = sc.nextInt();
	    	y1 = sc.nextInt();
	    	x2 = sc.nextInt();
	    	y2 = sc.nextInt();

	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada

	    	sameRow = (x2 == x1);
	    	sameColumn = (y2 == y1);
	    	diagonal = (Math.abs(x2-x1) == Math.abs(y2-y1));
	    	
	    	if(sameRow && sameColumn)		
	    		moves = 0;
	      else if(sameRow || sameColumn || diagonal)	
	        moves = 1;
	    	else 
	        moves = 2;

	      System.out.println(moves);
	    }
		sc.close();
	}
}
