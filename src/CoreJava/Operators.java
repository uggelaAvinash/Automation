package CoreJava;

public class Operators {

	public static void main(String[] args) {
		         // Arithmetic Operators
				int a =20;
				int b =40;
				
				System.out.println(a+b);    // 60;
				System.out.println(a-b);    // -20
				System.out.println(a*b);    // 800
				System.out.println(a/b);    // 0
				System.out.println(a%b);    //20
				
				// Comparison Operators
				System.out.println(a>b);     //  False
				System.out.println(a<b);     // True
				System.out.println(a!=b);     // True
				System.out.println(a==b);     // False
			
				// Logical Operators
				boolean x =true;
				boolean y =false;
				
				System.out.println(x&&y);      // False
				System.out.println(x||y);      // True
				System.out.println(!x);        // False
				System.out.println(!y);       // True
				
				//Incremental Operators
				int i=10;
				i++; // i=i+1; 
				System.out.println(i);          // 11
				i--;  // i=i-1;                 
				System.out.println(i);           //10
				i+=5;
				System.out.println(i);           //15
				++i;
				System.out.println(i);           //16
				i=i+5;                           
				System.out.println(i);           //21
				i-=5;
				System.out.println(i);           //16
	}

}
