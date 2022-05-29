package cnic_validation;

public class Exception {

	protected boolean checkDashes(String text,int[] positions) {
		boolean checkIfAnyFailed = false;
		for(int i =0;i< positions.length;i++) {
			if(text.charAt(positions[i]) != '-') {
				checkIfAnyFailed = true;
			}
		}
		
		if(checkIfAnyFailed == false) {
			return true;
		}else {
			return false;
		}


	}
}
