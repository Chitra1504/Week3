package week3.homework;

public class JavaConnection extends MySqlConnection{

	public static void main(String[] args) {
		//Home Assignment <3B>: Demonstrating Abstraction in Java
		// TODO Auto-generated method stub
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.executeQuery();
		jc.executeUpdate();
		jc.disconnect();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute Update");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Execute Query");
	}

}
