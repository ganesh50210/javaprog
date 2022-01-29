 class Operation {
     int cube(int i)
     {
    	 int result=i*i*i;
    	 return result;
     }
     int Square(int k)
     {
    	 int result=k*k;
    	 return result;
     }
     int triangle(int l,int b)
     {
    	 int result=1/2*l*b;
    	 return result;
     }
     String display()
     {
    	
    	 return "ganesh";
     }
     
	public static void main(String[] args) {
		Operation oo=new Operation();
		System.out.println(oo.cube(3));
		System.out.println(oo.Square(55));
		System.out.println(oo.triangle(88,66));
		System.out.println(oo.display());
	}
}
