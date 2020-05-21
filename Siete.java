package doscietossiete;
import java.util.Scanner;
public class Siete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,con1,con2,acu,acu2;
		acu=0;
		acu2=0;
		con1=0;
		con2=0;
		String res;
		num=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("quieres agregar los 207 numeros? Y/N");
		res=scan.next();
		if (res=="Y") {
			while (con1<=207) {
				con1=con1+1;
				num=scan.nextInt();
				if (num%2==0) {
					acu=acu+num;
					con2=con2+1;
				}
				else {
					acu2=acu2+num;
				}
			}
			System.out.println("el promedio de los pares es: "+" "+acu/con2);
			System.out.println("la suma de los impares es: "+" "+acu2);
			}
		else {
				while (con1<=207) {	
					con1=con1+1;
					if (con1%2==0) {
						acu=acu+con1;
						con2=con2+1;
					}
					else {
						acu2=acu2+con1;
					}
				}
			}
		System.out.println("el promedio de los pares es: "+" "+acu/con2);
		System.out.println("la suma de los impares es: "+" "+acu2);
	}			
}

