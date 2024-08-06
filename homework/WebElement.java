package week3.homework;

public class WebElement {
	//Base class in Home Assignment <1>: Demonstrating Inheritance in Java -> Grand Parent
	public void click() {
		System.out.println("Click the WebElement");
	}
	public String setText(String text) {
		System.out.println("Enter the text "+text+" in to the web element");
		return text;
	}
}
