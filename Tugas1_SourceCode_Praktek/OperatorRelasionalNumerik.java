// NIM : 13020211075
// NAMA : YULIANA NGGOHELE
// HARI/TGL/WAKTU : MINGGU, 05 MARET 2023 02.59

public class OperatorRelasionalNumerik {

	public static void main(String[] args) {
		boolean Bool1, Bool2, TF ; 
		
		int i = 5;
		int j = 10;
		
		System.out.println("i = " + i);
       		System.out.println("j = " + j);

		TF = (i == j) ;
		System.out.println("i == j : "+ TF);

		TF = (i != j) ; 
		System.out.println("i != j = "+ TF);
 
		TF = (i < j) ;
		System.out.println("i < j = "+ TF);
		
		TF = (i > j);
		System.out.println("i > j = "+ TF);

		TF = (i <= j);
        	System.out.println("i <= j : " + TF);

		TF = (i >= j);
        	System.out.println("i >= j : " + TF);
	}
}