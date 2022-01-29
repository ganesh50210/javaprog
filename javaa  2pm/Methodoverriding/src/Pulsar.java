
public class Pulsar extends Bike  {
	void runeng()
	{
		System.out.println("after complete start eng and stop eng and run eng");
	}
	public static void main(String[] args) {
	Pulsar p1 =new Pulsar();
	p1.price=150000;
	p1.name="yamahaa";
	p1.place="banglore";
	System.out.println(p1.price+" "+p1.name+" "+p1.place);
	Bike b=new Bike();
	b.runeng();
	p1.starteng();
	p1.stopeng();
	p1.runeng();
	}

}
