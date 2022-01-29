
public class Rakhi {
	 int id;
	 String name;
	 boolean number;
	 char brand;
	 Rakhi(int i)
	 {
		 id=i;
		 System.out.println("this is rakhi");
	 }
	 

	public static void main(String[] args) {
		Rakhi d =new Rakhi(100);
		Rakhi d1 =new Rakhi(500);
		System.out.println(d.id);
		System.out.println(d1.id
				);
		
		
	}

}