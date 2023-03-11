// NIM : 13020211075
// NAMA : YULIANA NGGOHELE
// HARI/TGL/WAKTU : MINGGU, 05 MARET 2023 03.20

public class OperatorRelasionalNumerik1 {

	public static void main(String[] args) {
		boolean Bool1, Bool2, TF ; 
		
		int x = 5;
		int y = 10;
		
		System.out.println("x = " + x);
        	System.out.println("y = " + y);

		TF = (x != y);
        	System.out.println("x != y : " + TF);

        	TF = (x < y);
        	System.out.println("x < y  : " + TF);

       		TF = (x > y);
        	System.out.println("x > y  : " + TF);

        	TF = (x <= y);
        	System.out.println("x <= y : " + TF);

        	TF = (x >= y);
        	System.out.println("x >= y : " + TF);
	}
}