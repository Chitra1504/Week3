package week3.homework;

public class LoginTestData1 extends TestData{
	//Sub Class1 in Classroom Assignment <1>: Demonstrating Inheritance in Java
	public void enterUsername() {
		System.out.println("Enter User Name");
	}
	public void enterPassword() {
		System.out.println("Enter Password");
	}
	public static void main(String args[]){
		LoginTestData1 ltd1=new LoginTestData1();
		ltd1.enterCredentials();
		ltd1.enterUsername();
		ltd1.enterPassword();
		ltd1.navigateToHomePage();
	}
}
