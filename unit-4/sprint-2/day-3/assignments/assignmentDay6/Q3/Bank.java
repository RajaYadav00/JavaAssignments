package com.assignmentDay6.Q3;

public class Bank {
 private String branchName; 
  private   String ifscCode; 
	
	 public String getBranchName() {
	return branchName;
}

public void setBranchName(String branchName) {
	this.branchName = branchName;
}

public String getIfscCode() {
	return ifscCode;
}

public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}

	void	displayDetails() {
		 System.out.println(this.branchName);
		 System.out.println(this.ifscCode);
	 }

}
