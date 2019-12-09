import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class LesText{
	
	public static void main(String[] args) throws Exception{ //throws pga. ikke try/catch pensum ennå ;P Usikker på om jeg legger til dette på eksamen?

		/*
    int a, b, c;
		a = 12;
		b = 15;
		c = 22;

		int s = (a+b+c)/2;

		int x = (int)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    //over regner vi ut areal på en trekant med tre ulike sider.

		System.out.println(x);
    */

		average();
	}


	public static void average() throws Exception{
		String filnavn = "firma1.txt";
		File fil = new File(filnavn);
		Scanner les = new Scanner(fil);
		int[][] grp = new int[6][2];

		while (les.hasNextLine()){
			String s = les.nextLine();
			Scanner linje = new Scanner(s);
			int count = 0;
			while (linje.hasNextInt()){
				int aktiv = 0;
				if (count == 0){
					//age
					int ageGrp = linje.nextInt();
					ageGrp = ageGrp/10;
					aktiv = ageGrp;
					grp[aktiv][0]++;
					count++;
				}

				if (count == 1){
					//time with company
					int cashe = linje.nextInt();
					count++;
				} 

				if (count == 2){
					grp[aktiv][1] += linje.nextInt();
					count++;
				}
			}
			linje.close();
			
		}
		les.close();
		for (int i = 0; i < grp.length; i++){
			System.out.print(grp[i][0] + " ");
			System.out.println(grp[i][1]);
		}
	}

}
