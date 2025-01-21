

package encapsulation1;
import  encapsulation.*;
public class Sample extends Test{
public static void main(String[] args) {
	Test t2 = new Test();
	t2.setId(101);

	System.out.println("Hi");
	t2.setName("Sachin");
    System.out.println("Hi");
	System.out.println(t2.getId());

   
   
}
}

