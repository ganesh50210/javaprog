
public class Bike {
  int i;
  String name;
  String brand;
	public static void main(String[] args) {
		Bike b1=new Bike();
		Bike b2=new Bike();
		Bike b3=new Bike();
		b1.i=152;
		b1.name="gana";
		b1.brand="eclipse";
		b2.i=8888;
		b2.brand="string";
		b2.name="harsha";
		b3.i=5555;
		b3.name="santhuu";
		b3.brand="google";
		System.out.println(b1.i+" "+b1.name+" "+b1.brand);
		System.out.println(b2.i+" "+b2.name+" "+b2.brand);
		System.out.println(b3.i+" "+b3.name+" "+b3.brand);
	}

}
