package com.demo.entities;
// Generated Nov 23, 2021, 8:37:11 AM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * TransactionDetails generated by hbm2java
 */
@Entity
@Table(name = "transaction_details", catalog = "ecommerce_db")
public class TransactionDetails implements java.io.Serializable {

	private Integer id;
	private Users users;
	private String name;
	private String payment;
	private String address;
	private int quantity;
	private double discount;
	private double vat;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date created;
	
	private Set<Transactions> transactionses = new HashSet<Transactions>(0);

	public TransactionDetails() {
	}

	public TransactionDetails(Users users, String name, String payment, String address, int quantity, double discount,
			double vat, Date created) {
		this.users = users;
		this.name = name;
		this.payment = payment;
		this.address = address;
		this.quantity = quantity;
		this.discount = discount;
		this.vat = vat;
		this.created = created;
	}

	public TransactionDetails(Users users, String name, String payment, String address, int quantity, double discount,
			double vat, Date created, Set<Transactions> transactionses) {
		this.users = users;
		this.name = name;
		this.payment = payment;
		this.address = address;
		this.quantity = quantity;
		this.discount = discount;
		this.vat = vat;
		this.created = created;
		this.transactionses = transactionses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "name", nullable = false, length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "payment", length = 100)
	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Column(name = "address", length = 500)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "quantity", nullable = true)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "discount", precision = 22, scale = 0)
	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Column(name = "vat", precision = 22, scale = 0)
	public double getVat() {
		return this.vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transactionDetails")
	public Set<Transactions> getTransactionses() {
		return this.transactionses;
	}

	public void setTransactionses(Set<Transactions> transactionses) {
		this.transactionses = transactionses;
	}

}