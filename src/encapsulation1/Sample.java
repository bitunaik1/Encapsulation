package encapsulation1;
import  encapsulation.*;
public class Sample extends Test{
public static void main(String[] args) {
	Test t2 = new Test();
	t2.setId(101);
	t2.setName("Kiran");
	System.out.println(t2.getId());
	System.out.println(t2.getName());	
}
}


