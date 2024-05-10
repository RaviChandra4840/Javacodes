import java.util.regex.*;
public class ExampleOne {
    private final int id; 
	public ExampleOne(int id) {
		this.id = id;
	}
	public void updateId(int newId)  { 
		id = newId; 
	} 
	public static void main(String[] args)  { 
		ExampleOne fa = new ExampleOne(42); 
		fa.updateId(69); 
		System.out.println(fa.id); 
}}