package encapsulation;

public class Demo {
public static void main(String[] args) {
	Test t = new Test();
	t.setId(10);
	t.setName("Kick");
	System.out.println(t.getId());
	System.out.println(t.getName());	
}
}
