


import java.util.Scanner;

public class UC6_DieCounter {
	

    static int count=0;
public static void main(String[] args) {
	
		int playerposition=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player Name: ");
		String playername = s.next();
		int winningposition = 100;
		int remainingposition = winningposition - playerposition;
		
		while (winningposition > playerposition) {
		
		int DieRoll = (int)(Math.floor(Math.random()*10 %6 +1)) ;
		System.out.println("The no on dice is:"+ DieRoll);
		
		
		int option =(int)(Math.floor(Math.random()*10 %3));
		if (remainingposition >= DieRoll) {
		 
		if(option == 0) {
			//System.out.println("No Play");
			playerposition += 0;
		} else if(option == 1) {
			//System.out.println("Ladder");
			playerposition += DieRoll;
		} 
		 else{
			//System.out.println("Snake");
			playerposition -= DieRoll;
			 if(playerposition < 0) {
				 playerposition =0;
			 }
				 count++;
		}
        System.out.println("Player Position is:" + playerposition);
		
		 }
	}
	System.out.println("The "+ count+" times Die is Rolled");
	}

}


