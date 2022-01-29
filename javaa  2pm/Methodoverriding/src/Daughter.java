
public class Daughter {
	void smoking() {
		System.out.println("smoking : will wont kills ur health ");		
	}
	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.smoking();
		Son s = new Son();
		s.smoking();
		Father f=new Father();
		f.smoking();
		f.walking();

	}

}