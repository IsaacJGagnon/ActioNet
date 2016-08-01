/************************************************
 * I wasn't 100% sure what the question meant by
 * 1 control structure. Weather it wanted to replace
 * the two inner for loops with a single control structure
 * or to replace the three with a single control
 * structure.
 * 
 * I decided the best route might be to come up with
 * several different ways of lowering the number of
 * control structures.
 ************************************************/

public class Q3{
	/**
	 * This first method replaces the two inner for
	 * loops with a single switch case. Given that it
	 * requires hard coded output, it's not exactly the
	 * most flexible option. But the document requested
	 * the same output with fewer control structures, and
	 * this meets both those requirements.
	 **/
	private void p1v1(){
		for(int i = 1; i<=5; i++){
			switch(i){
				case 1: System.out.println("....1");
					break;
				case 2: System.out.println("...22");
					break;
				case 3: System.out.println("..333");
					break;
				case 4: System.out.println(".4444");
					break;
				case 5: System.out.println("55555");
					break;
			}
		}
	}
	
	/**
	 * The second method is similar to the one above but
	 * runs recursively. This takes it down to one control
	 * structure, but again isn't very flexible.
	 **/
	private int p1v2(int i){
		switch(i){
			case 1: System.out.println("....1");
				break;
			case 2: System.out.println("...22");
				break;
			case 3: System.out.println("..333");
				break;
			case 4: System.out.println(".4444");
				break;
			case 5: System.out.println("55555");
				return 0;
			}
			
		return p1v2(i + 1);
	}
	
	/**
	 * The third method recursively builds a string of dots.
	 * Then, when 1 is reached, it is added on, and the string
	 * is modified and printed on the way back up. First
	 * replacing the last dot in the string with the previous int.
	 * Then replacing all the previous ints with the current int.
	 * 
	 * Unlike the above two, this version can print the pattern for
	 * any number.
	 **/
	private String p1v3(String s, int n){
		int i;
		
		if(n == 1){
			s = s.concat("1");
			System.out.println(s);
			return s;	
		} else {
			s = s.concat(".");
			s = p1v3(s, n-1);
		}
		
		i = s.lastIndexOf(".", s.length()-n);
		s = s.substring(0,i) + (n-1) + s.substring(i+1);
		s = s.replaceAll(String.valueOf(n-1), String.valueOf(n));
		System.out.println(s);
		return s;
	}
	
	/**
	 * This is how you would re-write the original code to go
	 * to the nth number instead of ending at 5. The p1v3 method
	 * above also prints till the nth number.
	 */
	private void p2(int n){
		for(int i = 1; i<=n; i++){
			for(int j = 1; j <= (n - i); j++){
				System.out.print(".");
			}
			for(int k = 1; k <= i; k++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Q3 q = new Q3();
		
		q.p1v1();
		q.p1v2(1);		
		q.p1v3("", 5);
		
		q.p2(5);
	}
}
