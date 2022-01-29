
public class Grandson extends Son {
	String cycle="yamaha";
	void ride()
	{
		System.out.println("min one hour");
		
	}
	public static void main(String[] args) {
    Grandson gs=new Grandson();
 	System.out.println(gs.money);
	gs.walking();
	gs.doyoga();
	gs.smoke();
	gs.drinking();
	gs.ride();
	}
}
