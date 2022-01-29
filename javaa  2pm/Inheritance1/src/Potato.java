
public class Potato extends Vegetables {
   String type;
     void preparechips()
     {
    	 System.out.println("potato chips : 400/1kg");
     }
     void preparefries()
     {
    	 System.out.println("french fries : 120/regular");
     }
	public static void main(String[] args) {
		Potato p1=new Potato();
		p1.price=255;
		p1.alrname="sweetpotato";
		p1.colour="brown";
		p1.type="hybrid";
		System.out.println(p1.price+" "+p1.alrname+" "+p1.colour+" "+p1.type);
		p1.Washveg();
		p1.Cutveg();
		p1.preparechips();
		p1.preparefries();	
	}
}
