package day08;

public class Quiz01 {

	public static void main(String[] args) {
		String str1 = "Have a nice day Have a nice day Have a nice day";
		System.out.print("��� : [");
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
		System.out.println("�� ���� : "+str2.length());	
		System.out.println("a ���� : "+acnt);	
		System.out.println("g ���� : "+gcnt);	
		System.out.println();
		
		String str3= new String("tESt sTring    change      first");
		String changeStr = new String();
		int i=0;

		str3 = str3.toLowerCase();
		if(str3.charAt(0) >='a' && str3.charAt(0) <='z') {  //��ù���� �빮�ں�ȯ
			changeStr+=(char)(str3.charAt(i)-32);
			i++;
		}
		while(i<str3.length()) {
			if(str3.charAt(i) != ' ') { // ������ �ƴϸ�
				changeStr+=str3.charAt(i); // changeStr�� �Ѱ��� �ױ�
				i++;
				continue;
			}
			while(str3.charAt(i) == ' ') { // �����϶�����
				changeStr+=str3.charAt(i); // changeStr�� �Ѱ��� �ױ�
				i++;
			}
			if(str3.charAt(i) >= 'a' && str3.charAt(i) <='z') // ù���ڰ� �ҹ����̸�
				changeStr+=(char)(str3.charAt(i)-32); // �빮�ڷ� ����� �ױ�
			i++;
		}
		System.out.println(str3);
		System.out.println(changeStr);
		System.out.println();
		
		String str4 = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
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
