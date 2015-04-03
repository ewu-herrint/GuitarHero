// Tyler Herrin
// Strategy Pattern
public abstract class GameCharacter 
{
	private GuitarBehavior guitar;
	private SoloBehavior solo;
	
	public GameCharacter(GuitarBehavior guitar, SoloBehavior solo)
	{
		this.guitar = guitar;
		this.solo = solo;
	}
	
	public abstract void whoAmI();
	
	public void setGuitarBehavior(GuitarBehavior guitar)
	{
		this.guitar = guitar;
	}
	
	public void setSoloBehavior(SoloBehavior solo)
	{
		this.solo = solo;
	}

	public void playGuitar() 
	{
		guitar.playGuitar();
	}

	public void playSolo() 
	{
		solo.playSolo();
	}
}
