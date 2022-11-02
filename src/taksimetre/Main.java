package taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Kaç km gideceksiniz : ");

float km = scan.nextFloat();

if((km * 2.20f)+ 10 < 20)
{
	System.out.println("20 TL Ödeyeceksiniz");
} else {
	System.out.println((km * 2.20f)+ 10 +" Tl ödeyeceksiniz");
}

scan.close();
	}

}
