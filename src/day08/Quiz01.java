package day08;

public class Quiz01 {

	public static void main(String[] args) {
		String str1 = "Have a nice day Have a nice day Have a nice day";
		System.out.print("결과 : [");
		int strarr[] = new int[str1.length()];
		for(int i =0; i<str1.length();i++) {
			if(str1.charAt(i)=='a') {
				System.out.print(i+" ");				
			}			
		}
		System.out.print("]");
		System.out.println();
		
		String str2 = "It is a fun java programming";
		int acnt=0, gcnt=0 ;
		for(int i =0; i<str2.length();i++) {
			if(str2.charAt(i)=='a') {
				acnt++;
			}else if(str2.charAt(i)=='g') {
				gcnt++;
			}
		}
		System.out.println("총 개수 : "+str2.length());	
		System.out.println("a 개수 : "+acnt);	
		System.out.println("g 개수 : "+gcnt);	
		System.out.println();
		
		String str3= new String("tESt sTring    change      first");
		String changeStr = new String();
		int i=0;

		str3 = str3.toLowerCase();
		if(str3.charAt(0) >='a' && str3.charAt(0) <='z') {  //맨첫글자 대문자변환
			changeStr+=(char)(str3.charAt(i)-32);
			i++;
		}
		while(i<str3.length()) {
			if(str3.charAt(i) != ' ') { // 공백이 아니면
				changeStr+=str3.charAt(i); // changeStr에 한개씩 쌓기
				i++;
				continue;
			}
			while(str3.charAt(i) == ' ') { // 공백일때까지
				changeStr+=str3.charAt(i); // changeStr에 한개씩 쌓기
				i++;
			}
			if(str3.charAt(i) >= 'a' && str3.charAt(i) <='z') // 첫글자가 소문자이면
				changeStr+=(char)(str3.charAt(i)-32); // 대문자로 만들고 쌓기
			i++;
		}
		System.out.println(str3);
		System.out.println(changeStr);
		System.out.println();
		
		String str4 = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		System.out.println(str4);
		
		str4 = str4.replace("-", ":");
		System.out.println();		
		str4 = str4.replace("20", "19");		
		str4 = str4.replace("17", "99");
		str4 = str4.replace("15", "99");
		str4 = str4.replace("18", "99");
		System.out.println(str4);
	}

}
