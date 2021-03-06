// Tyler Herrin
// Strategy Pattern

public class GuitarHero {

	public static void main(String[] args) 
	{	
		GameCharacter player1 = new GameCharacterSlash(new GibsonFlyingVGuitar(), new SmashSolo()); //note that constructor could be designed to accept initial behaviors
        GameCharacter player2 = new GameCharacterHendrix(new FenderTelecasterGuitar(), new FireSolo());
        GameCharacter player3 = new GameCharacterAngusYoung(new GibsonSGGuitar(), new JumpOffStageSolo());
        
        System.out.println("PLAYER 1");
        player1.whoAmI();
        player1.playGuitar();
        player1.playSolo();       
        System.out.println();
        
        System.out.println("PLAYER 2");
        player2.whoAmI();
        player2.playGuitar();
        player2.playSolo();
        System.out.println();
        
        System.out.println("PLAYER 3");
        player3.whoAmI();
        player3.playGuitar();
        player3.playSolo();
        System.out.println("\n");

        //add code below to show the swapping of behaviors
        
        // Player 1 swap
        player1.setGuitarBehavior(new GibsonSGGuitar());
        player1.setSoloBehavior(new FireSolo());
        
        System.out.println("PLAYER 1 HAS CHANGED GUITAR AND SOLO");
        player1.whoAmI();
        player1.playGuitar();
        player1.playSolo();
        System.out.println();
        
        // Player 2 swap
        player2.setGuitarBehavior(new GibsonFlyingVGuitar());
        player2.setSoloBehavior(new JumpOffStageSolo());
        
        System.out.println("PLAYER 2 HAS CHANGED GUITAR AND SOLO");
        player2.whoAmI();
        player2.playGuitar();
        player2.playSolo();
        System.out.println();
        
        
        

	}

}
