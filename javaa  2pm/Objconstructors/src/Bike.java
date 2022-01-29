class Bike{
 int price;
  String name;
 String colour;
 boolean phoneno;
 char gender;
public static void main(String args[]) {
Bike b=new Bike();
	b.price=1500000;
	b.name="gayathri";
	b.colour="pink";
	b.gender='m';
    b.phoneno = true;
 Bike b1= new Bike(); 
     b1.price=888888888;
	 b1.name="ganesh";
	 b1.colour="purple";
	 b1.gender='k';
	 b1.phoneno = false;
	System.out.println(b.price+" "+b.name+" "+b.colour+" "+b.gender+" "+b.phoneno);
	System.out.println(b1.price+" "+b1.name+" "+b1.colour+" "+b1.gender+" "+b1.phoneno);
}	
}