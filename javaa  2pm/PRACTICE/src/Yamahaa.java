
public class Yamahaa {
     int id;
     String name;
     String brand;
     Yamahaa()
     {
    	 System.out.println("this is parameter constructor call");
     }
     
	public static void main(String[] args) {
	 Yamahaa y1=new Yamahaa();
	 Yamahaa y2=new Yamahaa();
	 Yamahaa y3=new Yamahaa();
	 Yamahaa y4=new Yamahaa();
	 Yamahaa y5=new Yamahaa();
	 y1.id=5555;
	 y1.name="sunitha";
	 y1.brand="gfhf";
	 y2.id=55;
	 y2.name="sunit";
	 y2.brand="gf";
	 y3.id=555;
	 y3.name="sunith";
	 y3.brand="gf"; 
	 y4.id=77;
	 y4.name="hhhh";
	 y4.brand="sdjisdo";
	 y5.id=7;
	 y5.name="hh";
	 y5.brand="sdjis";
	 System.out.println(y1.id+" "+y1.name+" "+y1.brand);
	 System.out.println(y2.id+" "+y2.name+" "+y2.brand);
	 System.out.println(y3.id+" "+y3.name+" "+y3.brand); 
	 System.out.println(y4.id+" "+y4.name+" "+y4.brand);
	 System.out.println(y5.id+" "+y5.name+" "+y5.brand);

	
	
	}

}