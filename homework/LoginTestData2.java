package week3.homework;

public class LoginTestData2 extends TestData {
	//Sub Class2 in Classroom Assignment <1>: Demonstrating Inheritance in Java
	public void enterUsername() {
		System.out.println("Enter User Name");
	}
	public void enterPassword() {
		System.out.println("Enter Password");
	}
	public static void main(String args[]){
		LoginTestData2 ltd2=new LoginTestData2();
		ltd2.enterCredentials();
		ltd2.enterUsername();
		ltd2.enterPassword();
		ltd2.navigateToHomePage();
	}
}
