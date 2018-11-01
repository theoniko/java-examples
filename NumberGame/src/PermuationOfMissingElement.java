/*
 * 
 * Goal:Find the missing element in a given permutation A. 
 * 		A is a non-empty array consisting of N integers.
 * 	
 * 		A permutation is a sequence containing each element from 1 to N once, and 
 * 		only once.
 * 
 * Solution1: Find the sum of all numbers in A and substract N*(N+1)/2  
 * Solution2: Substract from N*(N+1)/2 all numbers of A 	   
 * Complexity of Solution1,2: O(n)
 * 
 * 		Proof:Adding the following equations Sum=1+2+...+(N-1)+N , Sum=N+(N-1)+...+2+1
 *            is equal to 2Sum=(N+1)+(N+1)+...+(N+1)=N(N+1)==>Sum=N*(N+1)/2
 * 
 */
public class PermuationOfMissingElement {
	
	public int solution1 (int[] A) {
		int N=A.length+1;//+1 because one number is missing
		int totalSum=N*(N+1)/2;
		
		int Sum=0;
		for(int i=0;i<A.length;i++) {
			Sum+=A[i];
		}
		System.out.println(totalSum-Sum);
		return (totalSum-Sum);
	}
	
	public int solution2 (int[] A) {
		int N=A.length+1;//+1 because one number is missing
		int totalSum=N*(N+1)/2;
	
		for(int i=0;i<A.length;i++) {
			totalSum-=A[i];
		}
		System.out.println(totalSum);
		return (totalSum);
	}
	
	public static void main(String[] args){

		int A[]= {2,3,1,5};
		PermuationOfMissingElement test=new PermuationOfMissingElement();
		test.solution1(A);
		test.solution2(A);
	}

}
