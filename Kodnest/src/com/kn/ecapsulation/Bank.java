package com.kn.ecapsulation;

class Bank {
private int amount;
	public void setamount(int x){
	if(x>0) {
		System.out.println("valid amt");
			amount = x;
		}
		else {
		System.out.println("invalid amt");
			}
		}
	
		public int getamount(){
		return amount;
			}	
		}
	
