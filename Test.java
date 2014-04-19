
public class Test {

	// Please do not change anything.
	// If you change anything in this class, your grade will decrease minus 10!
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 0;
		
		Letter l1 = new Letter("a");
		Letter l2 = new Letter("u");
		Letter l3 = new Letter("w");
		Letter l4 = new Letter("e");
		Letter l5 = new Letter("e");
		Number n1 = new Number(2);
		Number n2 = new Number(4);
		Number n3 = new Number(4);
		
		if (l1.sum(l2).equals("au")) {
			score += 5;
		}
		if (l2.sum(l1).equals("ua")) {
			score += 5;
		}
		if (l1.compareTo(l2) == 1) {
			score += 5;
		}
		if (l2.compareTo(l1) == -1) {
			score += 5;
		}
		if (l4.compareTo(l5) == 0) {
			score += 5;
		}
		///
		if (n1.sum(n2).equals(6)) {
			score += 5;
		}
		if (n2.sum(n1).equals(6)) {
			score += 5;
		}
		if (n1.compareTo(n2) == 1) {
			score += 5;
		}
		if (n2.compareTo(n1) == -1) {
			score += 5;
		}
		if (n2.compareTo(n3) == 0) {
			score += 5;
		}
		///
		if (l1.sum(n2) == null) {
			score += 5;
		}
		if (n2.sum(l1) == null) {
			score += 5;
		}
		if (l1.compareTo(n2) == -2) {
			score += 5;
		}
		if (n2.compareTo(l1) == -2) {
			score += 5;
		}
		///
		if (l3.sortedSum(l4).equals("ew")) {
			score += 10;
		}
		if (l4.sortedSum(l3).equals("ew")) {
			score += 10;
		}
		if (l4.sortedSum(l5).equals("e")) {
			score += 10;
		}
		
		System.out.println("your grade is " + score);

	}

}
