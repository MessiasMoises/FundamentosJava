package Fundamentos;

public class AreaCircunferencia {
	
public static void main(String[] args) {
 	double raio = 3.4;
	final double PI = 3.14159;
	
	double area = PI * raio * raio;
	
	System.out.println(area);
	
	System.out.println(PI * raio * raio);
	
	raio = 10;
	area = PI * raio * raio;
	System.out.println(area);
	//ou pode ser
	System.out.println("Area = "+ area + "m2.");
	
  }

}
