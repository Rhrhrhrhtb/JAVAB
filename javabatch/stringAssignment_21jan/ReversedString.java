package stringAssignment_21jan;

public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "JAVA";
		String reversed = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			reversed = reversed+s.charAt(i);
			
		}
		System.out.println(reversed);
	}

}
