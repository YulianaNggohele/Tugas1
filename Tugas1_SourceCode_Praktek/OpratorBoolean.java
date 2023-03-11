// NIM : 13020211075
// NAMA : YULIANA NGGOHELE
// HARI/TGL/WAKTU : MINGGU, 05 MARET 2023 03.47

public class OpratorBoolean {

	public static void main(String[] args) {
		boolean Bool1, Bool2, TF ; 
		
		Bool1 = true;
		Bool2 = false;
		
		TF = Bool1 && Bool2 ;
		System.out.println("Bool1 && Bool2 = "+ 0);

		TF = Bool1 || Bool2 ; 
		System.out.println("Bool1 || Bool2 = "+ TF);
 
		TF = !Bool1 ;
		System.out.println("!Bool1 = "+ TF);
		
		TF = Bool1 ^Bool2;
		System.out.println("Bool1 ^ Bool2 = "+ TF);
	}
}