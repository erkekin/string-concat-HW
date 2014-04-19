package hw3;
public class Number implements Summable, Comparable {
	
	Integer nmb;

	// Don't change
	public Number(Integer nmb) {
		super();
		this.nmb = nmb;
	}

	// Change it
	// Return 1, if given number bigger than this number
	// Return -1, if given number smaller than this number
	// Return 0, if given number equals to this number
	// Return -2, if given object is not a Number
	@Override
	public int compareTo(Object obj) {
		if (! (obj instanceof Number)) 

			return -2;


		if (this.nmb < ((Number) obj).nmb) {
			return 1;
		}else if(this.nmb == ((Number) obj).nmb) 
			return 0;
		else return -1;
	}

	// Change it
	// Add given number to this number and return result
	// Return null, if given object is not a Number
	@Override
	public Object sum(Object obj) {
		if (obj instanceof Number) 

			return this.nmb + ((Number) obj).nmb;

		else
			return null;
	}

}
