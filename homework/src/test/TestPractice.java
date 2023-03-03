package test;

public class TestPractice {

	public static void main(String[] args) {
		
		// commit Å×½ºÆ®
		
		String str = "abcdefg";
		String str1 = "ABCDEFG";
		String str2 = "±è¹Î¼ö, ÁøÇâÀº, ±è¾È³ª";
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.length());
		System.out.println(str.substring(0, 5));
		
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		String[] arr = str2.split(",");
		System.out.println(arr[0]);
		
		System.out.println(Math.min(5, 1));
		System.out.println(Math.max(1, -5));
		System.out.println(Math.abs(-45));
		System.out.println(Math.round(3.49));
		System.out.println(Math.floor(3.52));
		
		System.out.println(Double.parseDouble("134.54") + Integer.parseInt("55"));
		
	}

}
