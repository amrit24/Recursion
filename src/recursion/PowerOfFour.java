package recursion;

public class PowerOfFour {
	 public static boolean isPowerOfFour(int n) {
	        if(n==1) return true;
	        if(n==0) return false;
	        if(n%4 != 0) return false;
	        return isPowerOfFour(n/4);
	    }
	 
	 public static void main(String[] args) {
		 isPowerOfFour(16);
	}
}
