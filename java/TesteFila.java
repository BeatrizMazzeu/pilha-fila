package lg2;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void moin(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Mauricio");
		fila.adiciona("Guilherme");
		
		System.out.println(fila);
		
		String x1 = fila.remove();
		
		System.out.println(x1);
		System.out.println(fila);
		
		Queue<String> FilaDoJava = new LinkedList<String>();
		
		FilaDoJava.add("Mauricio");
		String x2 = FilaDoJava.poll(); 
		
		System.out.println(x2);
	}
}
