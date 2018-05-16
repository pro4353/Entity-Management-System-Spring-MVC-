package com.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	private int acc_no;
	private String f_name,l_name,e_mail;
	private double amount;
	
	public int getAcc_no()
	{
		return acc_no;
	}
	public void setAcc_no(int acc_no)
	{
		this.acc_no=acc_no;
	}
	
	public String getF_name()
	{
		return f_name;
	}
	public void setF_name(String f_name)
	{
		this.f_name=f_name;
	}
	
	public String getL_name()
	{
		return l_name;
	}
	public void setL_name(String l_name)
	{
		this.l_name=l_name;
	}
	public String getE_mail()
	{
		return e_mail;
	}
	public void setE_mail(String e_mail)
	{
		this.e_mail=e_mail;
	}
	public double getAmount()
	{
		return amount;
	}
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	

}
