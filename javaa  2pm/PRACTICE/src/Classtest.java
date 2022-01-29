
public class Classtest {
	boolean display() {
		return true;
	}
	String display3() {
		return "gana";
	}
	char display5() {
		return 'd';
	}
	int display55() {
		return 59;
	}
	int square(int i) {
		int  result=i*i;
		return result;	
	}
	int triangle(  int l,int b,int h) {
		int  triangle=l*b*h;
		return triangle;	
	}

	public static void main(String[] args) {
		Classtest t=new Classtest();
		System.out.println(t.display());
		System.out.println(t.display3());
		System.out.println(t.display5());
		System.out.println(t.display55());
		System.out.println(t.square(22));
		System.out.println(t.triangle(66,55,88));
		

	}

}
