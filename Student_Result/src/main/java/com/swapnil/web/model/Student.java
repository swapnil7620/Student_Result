package com.Swapnil.web.model;

public class Student {

	private int ID;
	private String NAME; 
	private int AGE;
	private Double MARKS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public Double getMARKS() {
		return MARKS;
	}
	public void setMARKS(Double mARKS) {
		MARKS = mARKS;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", MARKS=" + MARKS + "]";
	}
	
}
