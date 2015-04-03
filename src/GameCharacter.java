
public abstract class GameCharacter 
{
	private GuitarBehavior guitar;
	private SoloBehavior solo;
	
	public GameCharacter()
	{
		
	}
	
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
