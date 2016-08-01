import java.util.*;

public class Q2{
	private Set<Integer> setA, setB, setC;
	private List<Integer> listA;
	private Iterator<Integer> itr;
	private Random r;
	
	/**
	 * Randomly adds all the numbers from min to max, both inclusive, to
	 * the given set.
	 */
	private void addRand(Set<Integer> s, int min, int max){
		int i, j;
		i = j = max - min + 1;
			
		while(i > 0){
			if(s.add(r.nextInt(j) + min)){
				i--;
			}
		}
	}
	
	/**
	 * Adds the requested number of random key/value pairs to the
	 * given Map.
	 */
	private void randMap(Map<String, Integer> m, int num){
		Integer nCheck = null;
		int tmp;
		
		while(num > 0){
			tmp = r.nextInt();
			nCheck = m.putIfAbsent("s" + String.valueOf(tmp), tmp);
			if(nCheck == null){
				num--;
			}
		}
	}
	
	/**
	 * For the first, step I used a LinkedHashSet since it
	 * 1. Doesn't have duplicates
	 * 2. Keeps the insertion order
	 * 
	 * So when I input the randomly generated values, it guarantees
	 * that they'll stay in that random order, and there wont be
	 * duplicates.
	 * 
	 * While HashSets don't guarantee that they will be orderd, integers
	 * hash to themselves, so it would wind up ordered anyways.
	 */
	private void step1(){
		System.out.println("------------ Step 1 ------------");
		r = new Random();
		setA = new LinkedHashSet<Integer>();
		setB = new LinkedHashSet<Integer>();
		
		addRand(setA, 1, 10);
		addRand(setB, 6, 15);
		
		System.out.println("First Collection: " + setA);
		System.out.println("Second Collection: " + setB);
		
		System.out.println("First Collection Size: " + setA.size());
		System.out.println("Second Collection Size: " + setB.size());
	}
	
	/**
	 * For the second step, I used two different collections.
	 * 
	 * The first is a TreeSet which I used for two reasons.
	 * 1. It doesn't have duplicates
	 * 2. It is ordered
	 * 
	 * So when I combined the two sets from the first step, it
	 * automatically removed duplicates and ordered the set.
	 * 
	 * The second is an ArrayList, which I also used for two reasons.
	 * 1. You can remove by index
	 * 2. It has a reverse method
	 * 
	 * So I could easily remove the integer in the middle, and reverse
	 * the collection
	 */
	private void step2(){
		System.out.println("------------ Step 2 ------------");
		setC = new TreeSet<Integer>(setA);
		setC.addAll(setB);
		
		listA = new ArrayList<Integer>(setC);
		listA.remove(listA.size()/2);
		Collections.reverse(listA);
		
		System.out.println("Third Collection: " + listA);
		System.out.println("Third Collection Size: " + listA.size());
	}
	
	/**
	 * For the third step, I used a HashMap since this collection didn't
	 * have any order requirements, and it has the putIfAbsent method
	 * which checks for duplicates when inserting key/value pairs.
	 * 
	 * I used an ArrayList in order to get the keys in the set, and
	 * then used that to insert a duplicate key/value pair.
	 */
	private void step3(){
		System.out.println("------------ Step 3 ------------");
		Map<String, Integer> mapA = new HashMap<String, Integer>();
		
		randMap(mapA, 5);
		List<String> listB = new ArrayList<String>(mapA.keySet());
		
		String s = listB.get(0);
		if(mapA.putIfAbsent(s, mapA.get(s)) != null){
			System.out.println("{" + s + "=" + mapA.get(s) + "}");
		}
		
		System.out.println("Fourth Collection: " + mapA);
		System.out.println("Fourth Collection Size: " + mapA.size());
	}
	
	public static void main(String[] args){
		Q2 t = new Q2();
		t.step1();
		t.step2();
		t.step3();
	}
}
