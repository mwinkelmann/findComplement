package leetCode;

public class findComplement {
	
	public static void main(String args[]) {
		findComplement(5);
	}
	
	public static int findComplement(int num) {
		int mask = 0;
		//mask will be used to be XORed with our number input
		//use XORed because it can flip our bits
		//EX: 5 = 101 + comp = 111 so 101 ^(XORed) 111 = 010 = 2
		int temp = num;
		
		while(temp != 0) {
			if(mask != 0) {
				mask <<= 1;
			}
			
			mask += 1;
			
			temp >>>= 1;
		}
		
		int comp = mask ^ num; 
		
		return comp;
		
	}

}
