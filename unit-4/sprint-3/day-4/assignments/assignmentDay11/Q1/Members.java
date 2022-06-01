package com.assignmentDay11.Q1;

import java.time.LocalDate;
import java.util.Objects;

public class Members implements Comparable<Members> {
	
	private double memberId;
	private String memberName;
	private double membershipNo;
	private LocalDate membershipEnddate;
	public Members() {
		// TODO Auto-generated constructor stub
	}
	public Members(double memberId, String memberName, double membershipNo, LocalDate membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}
	public double getMemberId() {
		return memberId;
	}
	public void setMemberId(double memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public double getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(double membershipNo) {
		this.membershipNo = membershipNo;
	}
	public LocalDate getMembershipEnddate() {
		return membershipEnddate;
	}
	public void setMembershipEnddate(LocalDate membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}
	@Override
	public int hashCode() {
		return (int) membershipNo;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Members other = (Members) obj;
		return (this.memberId==other.memberId ||this.membershipNo==other.membershipNo);
	}
	@Override
	public int compareTo(Members o) {
		
			return this.getMembershipEnddate().compareTo(o.getMembershipEnddate());
	
//			return o.getMembershipEnddate().compareTo(this.getMembershipEnddate());
			
		
		     
	}
	
	
	
}
