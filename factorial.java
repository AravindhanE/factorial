import java.util.*;

class factorial{
	public static void main (String[] args) {
		 Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int ab=1;
	    for(int i=2;i<n;i++)
	    {
	        ab=ab*i;
	    }
         System.out.println(ab); 
	}
}
	
