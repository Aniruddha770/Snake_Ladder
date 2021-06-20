import java.util.Scanner;

public class UC2_DieRolling {
	public static void main(String[] args) {
		int playerposition=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player Name: ");
		String playername = s.next();
		int DieRoll = (int)(Math.floor(Math.random()*10 %6 +1)) ;
		System.out.println("The no on dice is:"+ DieRoll);
		
				
	}


}
