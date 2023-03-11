// NIM : 13020210175
// NAMA : Yuliana Nggohele
// HARI/TANGGAL dan WAKTU : Jum'at, 10 Maret 2023 20:37

import java.util.Scanner;

public class KonversiWaktu {

	private int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
	
	public void konversiWaktu() {
		Scanner input = new Scanner(System.in);
		System.out.print ("Masukkan Totak Detik : ");
		totalDetik = input.nextInt();
		detikSekarang = totalDetik%60;
		totalMenit = totalDetik/60;
		menitSekarang = totalMenit%60;
		totalJam = totalMenit/60;
		jamSekarang = totalJam%24;
	}
	
	public void tampilWaktu() {
		System.out.printf("%02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang);
	
	}
	
	public static void main(String[] args) {
		KonversiWaktu kw = new KonversiWaktu();
		kw.konversiWaktu();
		kw.tampilWaktu();

	}
}