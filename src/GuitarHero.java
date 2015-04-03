
public class GuitarHero {

	public static void main(String[] args) 
	{
		GameCharacter player1 = new GameCharacterSlash(); //note that constructor could be designed to accept initial behaviors
        GameCharacter player2 = new GameCharacterHendrix();
        player1.playGuitar();
        player2.playGuitar();
        player1.playSolo();
        player2.playSolo();

        //add code below to show the swapping of behaviors

	}

}
