package demopractice;

public class Demoprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Dinesh";
		String r="";
		
		for(int i=str.length()-1; i>=0; i--) 
		{
			r= r+ str.charAt(i);
			
		}
		System.out.println(r);
		if(str==r) {
			System.out.println("This reverse of string is same as original ");
          }else {
        	  System.out.println("Reverse String not matcing with original");
          }
        	
	}

}
