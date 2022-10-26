package ebobEkok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numberOne,numberTwo,ebob=1,count=1;;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz: ");
		numberOne=scan.nextInt();
		
		System.out.print("İkinci sayıyı giriniz: ");
		numberTwo=scan.nextInt();
		
		count=numberOne;
		while(count>=1) {
			if(numberOne%count==0&&numberTwo%count==0) {
				ebob=count;
				break;
			}
			count--;
		}
		
		System.out.println("EBOB: "+ebob);
		System.out.println("EKOK: "+((numberOne*numberTwo)/ebob));
		
		
	}

}
