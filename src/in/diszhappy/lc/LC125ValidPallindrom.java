package in.diszhappy.lc;

public class LC125ValidPallindrom {

	public static void main(String[] args) {
		String s = ".";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		if ("".equals(s.trim()))
			return true;
		
		System.out.println(s);
		
		int len = s.length()-1;
		for(int i=0;i<=len/2;i++) {
			if(s.charAt(i) != s.charAt(len-i)) {
				return false;
			}
		}

		return true;
	}

}
