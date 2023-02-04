package encapsulation;

public class ATMPin {
	private int pin;
public void setPin(int pin) {
	this.pin = pin;
}
public int getPin() {
	return pin;
}
}
class ATMPinInfo{
	public static void main(String[] args) {
		ATMPin p = new ATMPin();
		p.setPin(1234);
		System.out.println(p.getPin());
		System.out.println("Jagan is a bitch.");
		System.out.println("No a bitch");
	}
}
