package week3.homework;

public class Button extends WebElement {
	//Subclass1 in Home Assignment <1>: Demonstrating Inheritance in Java -> Parent for CheckBoxButton, RadioButton and Elements
	public void submit() {
		click();
		System.out.println("The button is clicked successfully");
	}
}
