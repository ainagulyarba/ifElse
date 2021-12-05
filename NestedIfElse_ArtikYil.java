package ainagulOdev1;

import java.util.Scanner;

public class NestedIfElse_ArtikYil {

	public static void main(String[] args) {
		// NOT:KIZLAR GRUBU :)
		// Kural 1: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		// Kural 2: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
		// sadece 400’un kati olan yillar artik yildir

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yil giriniz");
		int yil = scan.nextInt();

		if (yil % 100 == 0) {

			if (yil % 400 == 0) {
				System.out.println("artik yildir");
			} else {
				System.out.println("artik yil degildir");
			}
		} else if (yil % 100 != 0) {
			if (yil % 4 == 0) {
				System.out.println("artik yildir1");
			} else {
				System.out.println("artik yil degildir1");
			}
		} else {
			System.out.println("gecerli yil giriniz");
		}
		{

		}

	}

}
