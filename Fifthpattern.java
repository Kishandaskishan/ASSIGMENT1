package codes;

public class Fifthpattern {

	public static void main(String[] args) {
		 int n=11;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(i+j<=n/2 || i-j>=n/2||i==0||i==n-1){
	                    System.out.print("*");
	                }
	                else{
	                    System.out.print("");
	                }
	            }
	            System.out.println();
	            
	}

}
}
