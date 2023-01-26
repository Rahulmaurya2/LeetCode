//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	  if(str.length()==0) return 0;
	  
	  int sing=1;
	  int res=0;
	  boolean chr= false;
	  
	  int i=0;
	  if(str.charAt(i)=='-'){
	          sing=-1;
	          i++;
	      }
	      
	  
	  for(;i<str.length();i++){
	      
	      if(str.charAt(i)>= 48 && str.charAt(i) <= 57){
	          res=res*10+str.charAt(i)-48;
	      }else chr=true;
	  }
	  
	  return chr ? -1: res*sing;
    }
}
