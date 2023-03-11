// NIM : 13020211075
// NAMA : YULIANA NGGOHELE
// HARI/TGL/WAKTU : MINGGU, 05 MARET 2023 12.20

import java.util.Scanner;
import java.io.Console;
import javax.swing.JOptionPane;

public class Bacakar {
	
	public static void main (String[] args) {
		char cc;
		int bil;
		
		// using Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1 character: ");
		cc = scanner.nextLine().charAt(0);
		System.out.print("Enter an integer: ");
		bil = scanner.nextInt();
		System.out.println(cc + "\n" + bil);
		
		// using Console class
		Console console = System.console();
		System.out.print("Enter a character: ");
		cc = console.readLine().charAt(0);
		System.out.print("Enter an integer: ");
		bil = Integer.parseInt(console.readLine());
		System.out.println(cc + "\n" + bil);
		
		// using JOptionPane class
		cc = JOptionPane.showInputDialog(null, "Enter a character: ").charAt(0);
		bil = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer: "));
		JOptionPane.showMessageDialog(null, cc + "\n" + bil);
	}
}
