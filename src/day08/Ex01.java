package day08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = new String("abcdefg");
//		String str; // = String str = new String();
//		System.out.println("���ڿ� �Է�");
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
		
		String name = "ȫ�浿     ";
		if(name.equals("ȫ�浿")) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		String addr;
		addr = "047869 ����� ���α� ����3�� 3��";
		String[] ad = addr.split(" ");
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		
		String replace = addr.replace("", ""); 
	}

}
