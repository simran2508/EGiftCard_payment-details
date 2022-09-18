package com.ecard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="payment")
public class UserPayment {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column (name="paymentid")
	private int paymentid ;
	@Column (name="paymentdate")
	@NotEmpty
	private String paymentdate;
	@Column(name="paymentamount")
	@NotNull
	private float paymentamount;
	@Column(name="nameonthecard")
	@NotEmpty
	@Size(min=3,message="name should be of minimum 3 character")
	private String nameonthecard;
	@Column(name="cardNumber")
	@NotEmpty
	private String cardNumber;
	@Column(name="cardexpiry")
	@NotEmpty
	private String cardexpiry;
	@Column(name="cvv")
	@NotEmpty
	private String cvv;
	@Column(name="userGiftId")
	@NotNull
	private int  userGiftId;
	public UserPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	public float getPaymentamount() {
		return paymentamount;
	}
	public void setPaymentamount(float paymentamount) {
		this.paymentamount = paymentamount;
	}
	public String getNameonthecard() {
		return nameonthecard;
	}
	public void setNameonthecard(String nameonthecard) {
		this.nameonthecard = nameonthecard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardexpiry() {
		return cardexpiry;
	}
	public void setCardexpiry(String cardexpiry) {
		this.cardexpiry = cardexpiry;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public int getUserGiftId() {
		return userGiftId;
	}
	public void setUserGiftId(int userGiftId) {
		this.userGiftId = userGiftId;
	}
	@Override
	public String toString() {
		return "UserPayment [paymentid=" + paymentid + ", paymentdate=" + paymentdate + ", paymentamount="
				+ paymentamount + ", nameonthecard=" + nameonthecard + ", cardNumber=" + cardNumber + ", cardexpiry="
				+ cardexpiry + ", cvv=" + cvv + ", userGiftId=" + userGiftId + "]";
	}
	

}
