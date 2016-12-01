package com.pos.system.model;
// Generated Nov 30, 2016 5:14:00 PM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * TblEmployee generated by hbm2java
 */
public class TblEmployee implements java.io.Serializable {

	private int intId;
	private TblTitle tblTitle;
	private String strGivenName;
	private String strSurname;
	private String strStreet;
	private Integer intPostcode;
	private String strCity;
	private String strPassword;
	private Boolean bitManagementArea;
	private Set<TblCashBalance> tblCashBalances = new HashSet<TblCashBalance>(0);
	private Set<TblOpeningBalance> tblOpeningBalances = new HashSet<TblOpeningBalance>(0);
	private Set<TblReceiptHead> tblReceiptHeads = new HashSet<TblReceiptHead>(0);

	public TblEmployee() {
	}

	public TblEmployee(int intId, String strSurname) {
		this.intId = intId;
		this.strSurname = strSurname;
	}

	public TblEmployee(int intId, TblTitle tblTitle, String strGivenName, String strSurname, String strStreet,
			Integer intPostcode, String strCity, String strPassword, Boolean bitManagementArea,
			Set<TblCashBalance> tblCashBalances, Set<TblOpeningBalance> tblOpeningBalances,
			Set<TblReceiptHead> tblReceiptHeads) {
		this.intId = intId;
		this.tblTitle = tblTitle;
		this.strGivenName = strGivenName;
		this.strSurname = strSurname;
		this.strStreet = strStreet;
		this.intPostcode = intPostcode;
		this.strCity = strCity;
		this.strPassword = strPassword;
		this.bitManagementArea = bitManagementArea;
		this.tblCashBalances = tblCashBalances;
		this.tblOpeningBalances = tblOpeningBalances;
		this.tblReceiptHeads = tblReceiptHeads;
	}

	public int getIntId() {
		return this.intId;
	}

	public void setIntId(int intId) {
		this.intId = intId;
	}

	public TblTitle getTblTitle() {
		return this.tblTitle;
	}

	public void setTblTitle(TblTitle tblTitle) {
		this.tblTitle = tblTitle;
	}

	public String getStrGivenName() {
		return this.strGivenName;
	}

	public void setStrGivenName(String strGivenName) {
		this.strGivenName = strGivenName;
	}

	public String getStrSurname() {
		return this.strSurname;
	}

	public void setStrSurname(String strSurname) {
		this.strSurname = strSurname;
	}

	public String getStrStreet() {
		return this.strStreet;
	}

	public void setStrStreet(String strStreet) {
		this.strStreet = strStreet;
	}

	public Integer getIntPostcode() {
		return this.intPostcode;
	}

	public void setIntPostcode(Integer intPostcode) {
		this.intPostcode = intPostcode;
	}

	public String getStrCity() {
		return this.strCity;
	}

	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}

	public String getStrPassword() {
		return this.strPassword;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	public Boolean getBitManagementArea() {
		return this.bitManagementArea;
	}

	public void setBitManagementArea(Boolean bitManagementArea) {
		this.bitManagementArea = bitManagementArea;
	}

	public Set<TblCashBalance> getTblCashBalances() {
		return this.tblCashBalances;
	}

	public void setTblCashBalances(Set<TblCashBalance> tblCashBalances) {
		this.tblCashBalances = tblCashBalances;
	}

	public Set<TblOpeningBalance> getTblOpeningBalances() {
		return this.tblOpeningBalances;
	}

	public void setTblOpeningBalances(Set<TblOpeningBalance> tblOpeningBalances) {
		this.tblOpeningBalances = tblOpeningBalances;
	}

	public Set<TblReceiptHead> getTblReceiptHeads() {
		return this.tblReceiptHeads;
	}

	public void setTblReceiptHeads(Set<TblReceiptHead> tblReceiptHeads) {
		this.tblReceiptHeads = tblReceiptHeads;
	}

}