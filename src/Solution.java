
public class Solution {
	
	static long superDigit(long m) {
		System.out.println(m);
		if (m == 0) {
			return 1;
		}
	    int d=countDigit(m);
	    if(d == 1){
	        return m;
	    }
	    long s = sumDigit(m);
	    return superDigit(s);
	}

	static int countDigit(long n) 
	{ 
	    int count = 0; 
	    while (n != 0) { 
	        n = n / 10; 
	        ++count; 
	    }
//	    if (n != 0) {
//	    	n = n / 10; 
//	        ++count;
//	        countDigit(n);
//	    } else {
//		    return count; 
//	    }
	    return count; 
	}

	static long sumDigit(long n) 
	{ 
	    long sum = 0; 
	    while (n != 0) {
	        sum += n % 10; 
	        n = n / 10;  
	    } 
	    return sum; 
	}
	
	public static void main(String[] args) {
		System.out.println("Germans Mjagkihs 171RDB031\n");

		System.out.println("Number 9875:");
		superDigit(9875);
		System.out.println("Number 0:");
		superDigit(0);
		System.out.println("Number 53:");
		superDigit(53);
		System.out.println("Number 10:");
		superDigit(10);
		System.out.println("Number 77:");
		superDigit(77);
		System.out.println("Number 5:");
		superDigit(5);
	}

}
