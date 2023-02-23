package codes;

public class Pangram {
	public static boolean checkPangram(String str) {
		boolean isPresent=true;
		str=str.toLowerCase();
		for (char letters='a'; letters <='z'; letters++) {
			if (!str.contains(String.valueOf(letters))) {
			isPresent=false;
			break;
			} 
		}
		if (isPresent) {
			return isPresent;
		} else {
			return isPresent;
		}
	}
	public static void main(String[] args) {
		String str="sts44";
		if (checkPangram(str)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
