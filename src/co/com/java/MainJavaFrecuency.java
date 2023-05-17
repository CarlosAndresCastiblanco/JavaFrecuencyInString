/**
 * 
 */
package co.com.java;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author carlos.castiblanco
 *
 */
public class MainJavaFrecuency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
		
		String arg = "hola hol hola si si no ok bueno";
		countFrecuency(arg);
	}
	
	public static void countFrecuency(String args){
		final String SPACE = " ";
		String[] words = args.split(SPACE);
		Stream.of(words)
				.distinct()
				.peek(a -> {
					Long count = Stream.of(words).filter(b -> b.equals(a)).count();
					System.out.println(a + " " + count);
				})
				.collect(Collectors.toList());
	}

}
