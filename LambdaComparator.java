import java.util.Comparator;

class LambdaComparator{
	
	public static void main(String[] args) {
		
		/**
		 * Java 8 prior
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a.compareTo(b);
			}
		};
		
		System.out.println(comparator.compare(1, 2));
		
		/*
		 * Using Lambda expression
		 */
		
		Comparator<Integer> comparator1 = (Integer a, Integer b) -> {
			return a.compareTo(b);
		};
		
		System.out.println(comparator1.compare(1, 2));
		
		Comparator<Integer> comparator2 = (Integer a, Integer b) -> a.compareTo(b);
		
		System.out.println(comparator2.compare(1, 2));
		
        Comparator<Integer> comparator3 = (a, b) -> a.compareTo(b);
		
		System.out.println(comparator3.compare(1, 2));
	}
}