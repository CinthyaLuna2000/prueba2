import java.util.Scanner;
 public class clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int personas, per;
		double gasto, total;
		per=0;
		total=0;
		System.out.println("ingrese el numero de personas");
		personas=leer.nextInt(); 
		
		
		do {
			per++;
			System.out.println("ingrese el gasto de la persona" + per);
			gasto=leer.nextDouble();	
			
			total+=gasto; 
		}while(per<personas);
		
		System.out.println("El numero de personas ingresadas es:"+per);
		System.out.println("El gasto total es"+total);
			
		
		
			}

}
