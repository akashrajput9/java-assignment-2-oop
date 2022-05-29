package cnic_validation;

public class InvalidCNICException extends Exception {
	public String message;
	
	public InvalidCNICException(String cnic) {
		this.toString("WIll check what to do");
	}
	
	public boolean test() {
		int pos[] = {5,10};
		String text = "45402-6169-550-1";

		return super.checkDashes(text,pos);
	}
	
	public InvalidCNICException() {
		this.toString("Cnic No is required in constructor");
	}
	
	public String toString(String message) {
		return this.message = message;
	}

}
