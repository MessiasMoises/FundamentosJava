package Fundamentos;

public class Inferencias {

	public static void main(String[] args) {
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "..."; não pode usar como texto porque ka foi declarada como double (numero)
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; // variavel foi declarada 
		d = 123.65; // variavel foi inicializada
		System.out.println(d); // usada
	}
	
}
