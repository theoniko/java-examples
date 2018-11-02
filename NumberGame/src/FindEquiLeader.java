/*
 * 
 * Goal:Find the equi leader in a given array A. 
 * 		A is a non-empty array consisting of N integers.
 * 	
 * 		The leader is the value that occurs in more than 
 * 		half of elements of the array 
 * 		
 * 		The equi leader is an index that split the given
 * 		array in two intervals which have leaders of the 
 * 		same value
 * 
 * Solution: 
 * 		1)Find the leader value of the array and count
 * 		the occurrences of this value in the array.
 * 		2)Calculate the number of equi leader indexes.
 * 				  
 */
public class FindEquiLeader {
	public int solution(int[] A) {
		
		int candidateCounter=1;
		int candidateLeader=A[0];
		//Find the leader from A[] array
		for(int i=1;i<A.length;i++) {
			if(A[i]==candidateLeader)
				candidateCounter++;
			else
				candidateCounter--;
			
			if(candidateCounter== 0) {
				candidateLeader=A[i];
				candidateCounter++;
			}
		}
		
		//Count the occurrences of leader value in the array
		int totalLeaderCounter=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]==candidateLeader)
				totalLeaderCounter++;
		}
		
		int leader=0;
		if(totalLeaderCounter <= A.length/2) {
			System.out.println("There is no leader value in this array");
			return 0;
		}else { 
			leader=candidateLeader;
		}
		
		//Calculate the number of equi leader indexes
		int countEquiLeader = 0;
		int currentleaderCounter=0;
		for(int i=0;i<A.length;i++){
			if(A[i] == leader) currentleaderCounter++;
			if(currentleaderCounter>(i+1)/2 && (totalLeaderCounter-currentleaderCounter)>(A.length-i-1)/2){
				countEquiLeader++;
			}
				
		}
		System.out.println(countEquiLeader);
		return  countEquiLeader;
	}
	
	public static void main(String[] args){

		int A[]= {4,3,4,4,4,2};
		FindEquiLeader test=new FindEquiLeader();
		test.solution(A);
	}
}
