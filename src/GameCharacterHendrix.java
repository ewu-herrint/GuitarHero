// Tyler Herrin
// Strategy Pattern
public class GameCharacterHendrix extends GameCharacter 
{

	public GameCharacterHendrix(GuitarBehavior guitar, SoloBehavior solo) 
	{
		super(guitar, solo);
	}

	@Override
	public void whoAmI() 
	{
		System.out.println("I am Jimi Hendrix!");
	}

}
