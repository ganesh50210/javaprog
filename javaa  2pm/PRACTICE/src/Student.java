
public class Student {
  int  id;
  String  name;
   Student(int i,String n) {
	  this.id=i;
	  this.name=n;
  }
	public static void main(String[] args) {
		Student s=new  Student(10,"gana");
        System.out.println(s.id+" "+s.name);
	  
	}

}
