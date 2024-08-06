package week3.homework;

public class TextField extends WebElement {
	public void getText() {
		//Subclass2 in Home Assignment <1>: Demonstrating Inheritance in Java -> Parent
		String text=setText("Ram");
		System.out.println("The text sent to web element is "+text);
	}
}
