package week3.homework;

public class Elements extends Button {
	public static void main(String args[]) {
		System.out.println("Calling methods from Check box button child");
		CheckBoxButton cb=new CheckBoxButton();
		cb.clickCheckButton();
		System.out.println("Calling methods from Radio button child");
		RadioButton rb=new RadioButton();
		rb.selectRadioButton();
		System.out.println("Calling methods from Parent(uncle) class");
		TextField tf=new TextField();
		tf.getText();
	}
}
