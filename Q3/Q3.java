/************************************************
 * From the way the first question was worded, I 
 * wasn't sure if you just wanted it to print out the
 * same things. Or if you wanted it to do something
 * other than just print out hard coded values, so I
 * gave you both.
 ************************************************/

public class Q3{
	
	/**
	 * The first method is a recursive method that uses a switch case.
	 * To print out hardcoded values. This takes it down to one control
	 * structure. Just like the original code it goes from 1 to 5 and
	 * prints the same things, but it's not very expandable
	 **/
	private int p1v1(int i){
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
			
		return p1v1(i + 1);
	}
	
	/**
	 * The second method recursively builds a string of dots.
	 * Then, when 1 is reached, it is concatenated on. The string
	 * is modified and printed on the way back up. First
	 * replacing the last dot in the string with the previous int.
	 * Then replacing all the previous ints with the current int.
	 * 
	 * Ex. ....1 -> ...11 -> ...22
	 *     ...22 -> ..222 -> ..333
	 *     etc.
	 * 
	 * Unlike the method above, this version can print the pattern for
	 * any number.
	 **/
	private String p1v2(String s, int n){
		int i;
		
		if(n == 1){
			s = s.concat("1");
			System.out.println(s);
			return s;	
		} else {
			s = s.concat(".");
			s = p1v2(s, n-1);
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
		
		q.p1v1(1);
		q.p1v2("", 5);		
		
		q.p2(5);
	}
}
