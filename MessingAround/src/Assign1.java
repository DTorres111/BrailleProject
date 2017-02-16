
public class Assign1 {

	public static void main(String[] args){

		int A[]= {2,3,4,5, 6,7,8,9,10,11};
		int n=10;
		
		System.out.println(missingNum(A,n));
	}
	
	public static int missingNum(int A[], int n){
	
		int result=0;
		
		if (A[n-1]==n){
		return n+1;
		}else{
			for(int i=0;i<n;i++){
		  
				if(A[i]!=i+1){
					return i+1;
				}
		  }
		}	
	return result;
	}
	
	public static int unsortedNum(int A[], int n){
		
		int result=0;
		
		if (A[n-1]==n){
		return n+1;
		}else{
			for(int i=0;i<n;i++){
		  
				if(A[i]!=i+1){
					return i+1;
			}
		  }
		}	
	return result;
  }
}
