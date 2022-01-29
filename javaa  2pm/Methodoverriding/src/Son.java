
public class Son extends Father {
	void smoking() {
		System.out.println("smoking : will  kills ur health ");		
	}
	public static void main(String args[]) {
		Son s=new Son();
		System.out.println("money:"+s.money);		
		System.out.println("house:"+s.house);		
		System.out.println("name:"+s.name);		
		s.walking();
		s.smoking();
		
		
		
	}
}
