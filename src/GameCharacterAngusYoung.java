
public class GameCharacterAngusYoung extends GameCharacter 
{

	public GameCharacterAngusYoung(GuitarBehavior guitar, SoloBehavior solo) 
	{
		super(guitar, solo);
	}

	@Override
	public void whoAmI() 
	{
		System.out.println("I am Angus Young!");
	}

}
