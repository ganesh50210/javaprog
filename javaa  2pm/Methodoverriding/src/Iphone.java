
public class Iphone extends Mobile {
	void camdetails()
	   {
		   System.out.println("mobile cam : 4-8");
	   }
	public static void main(String[] args) {
	Iphone  ip=new Iphone();
	ip.price=1500000;
	ip.name="iphone7";
	ip.type="MAC";
	System.out.println(ip.price+" "+ip.name+" "+ip.type);
	ip.camdetails();
	ip.processor();
	ip.ram();
	Mobile mb= new Mobile();
	mb.camdetails();
	}

}
