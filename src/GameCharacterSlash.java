// Tyler Herrin
// Strategy Pattern
public class GameCharacterSlash extends GameCharacter 
{

	public GameCharacterSlash(GuitarBehavior guitar, SoloBehavior solo) 
	{
		super(guitar, solo);
	}

	@Override
	public void whoAmI() 
	{
		System.out.println("I am Slash!");
	}

}
