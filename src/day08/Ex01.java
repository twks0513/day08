package day08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = new String("abcdefg");
//		String str; // = String str = new String();
//		System.out.println("문자열 입력");
//		str = scan.next();
//		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(0)=='a');
		System.out.println(str.charAt(1)=='a');
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		
		str+="z";
		System.out.println(str);
		
		str = "    aaaa aaa   aaa   ";
		System.out.println(str);
		String re = str.trim();
		System.out.println(re);
		
		String name = "홍길동     ";
		if(name.equals("홍길동")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		String addr;
		addr = "047869 서울시 종로구 종로3가 3층";
		String[] ad = addr.split(" ");
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		
		String replace = addr.replace("", ""); 
	}

}
