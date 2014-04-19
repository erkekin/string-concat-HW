package hw3;

public class Letter implements Summable, Comparable {

	String ltr;

	// Don't change
	public Letter(String ltr) {
		super();
		this.ltr = ltr;
	}

	// Change it
	// Return 1, if given letter bigger than this letter
	// Return -1, if given letter smaller than this letter
	// Return 0, if given letter equals to this letter
	// Return -2, if given object is not a Letter
	// use alphabet in class Alphabet to get position of letter
	// Example: Is "c" smaller than "k"? Yes.
	// Because position of "c" is smaller than position of "k"
	@Override
	public int compareTo(Object obj) {
		if (! (obj instanceof Letter)) 

			return -2;

		if (Alphabet.alphabet.indexOf(((Letter)obj).ltr) > Alphabet.alphabet.indexOf(this.ltr)) {
			
			return 1;
		}else if(Alphabet.alphabet.indexOf(((Letter)obj).ltr) < Alphabet.alphabet.indexOf(this.ltr)) {
			return -1;}
		else if(Alphabet.alphabet.indexOf(((Letter)obj).ltr) == Alphabet.alphabet.indexOf(this.ltr)) return 0;
		else return 0;
	}

	// Change it
	// Add given letter to this letter and return result
	// Return null, if given object is not a Letter 
	// Use "concat"
	
	@Override
	public Object sum(Object obj) {


		if (obj instanceof Letter) 
			
			return this.ltr.concat(((Letter) obj).ltr);

		else
			return null;

	}

	// Change it
	// Apply a sum for given letter
	// Sort the result alphabetically. 
	// Example: add b to a => ab, add a to b => ab, add a to a => a (return one letter if they equal)
	// Use "compareTo" in the method.

	public Object sortedSum(Object obj) {

		if (compareTo(obj) == 0) 
			return this.ltr;
		
		else if	 (compareTo(obj) == -1) {

			return ((Letter)obj).sum(this);
		}else if (compareTo(obj) == 1) {

			return this.sum(obj);	
		}else if (compareTo(obj) == -2) {

			return null;	
		}else{
			return null;	
		}
	}
}


