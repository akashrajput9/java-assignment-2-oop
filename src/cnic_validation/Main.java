package cnic_validation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InvalidCNICException exception = new InvalidCNICException("45402-6169-550-1");
		System.out.println(exception.test());
	}

}
