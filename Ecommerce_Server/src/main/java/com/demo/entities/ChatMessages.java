package com.demo.entities;
// Generated Nov 23, 2021, 8:37:11 AM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ChatMessages generated by hbm2java
 */
@Entity
@Table(name = "chat_messages", catalog = "ecommerce_db")
public class ChatMessages implements java.io.Serializable {

	private Integer id;
	private Stores stores;
	private Users users;
	private boolean isUserSender;
	private Date timeSent;
	private String content;

	public ChatMessages() {
	}

	public ChatMessages(Stores stores, Users users, boolean isUserSender, Date timeSent, String content) {
		this.stores = stores;
		this.users = users;
		this.isUserSender = isUserSender;
		this.timeSent = timeSent;
		this.content = content;
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
	@JoinColumn(name = "store_id", nullable = false)
	public Stores getStores() {
		return this.stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "isUser_sender", nullable = false)
	public boolean isIsUserSender() {
		return this.isUserSender;
	}

	public void setIsUserSender(boolean isUserSender) {
		this.isUserSender = isUserSender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "time_sent", nullable = false, length = 10)
	public Date getTimeSent() {
		return this.timeSent;
	}

	public void setTimeSent(Date timeSent) {
		this.timeSent = timeSent;
	}

	@Column(name = "content", nullable = false, length = 500)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}