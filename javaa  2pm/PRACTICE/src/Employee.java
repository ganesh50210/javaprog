
public class Employee {
	int id;
	String name;
      Employee(int i,String j){
    	  
		System.out.println("this is paramater constructor");
	}
	public static void main(String[] args) {
	  Employee q =new Employee(10,"gana");
	  System.out.println(q);	  
	}

}