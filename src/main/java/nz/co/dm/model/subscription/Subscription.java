package nz.co.dm.model.subscription;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Subscription")
@Table(name = "dm_subscription")
public class Subscription {
	
	@Id
	@Column(name = "subscription_oid")
	private long subscriptionOid;

	@Column(name = "client_mid")
	private long clientMid;

	@Column(name = "customer_no")
	private String customerNo;
	
	@Column(name = "external_code")
	private String ExternalCode;
	
	@Column(name = "opted_in")
	private boolean isOptIn;
	
	@Column(name = "effective_on")
	private LocalDateTime effectiveOn;
	
	@Column(name = "expires_on")
	private LocalDateTime expiresOn;

	public long getSubscriptionOid() {
		return subscriptionOid;
	}

	public void setSubscriptionOid(long subscriptionOid) {
		this.subscriptionOid = subscriptionOid;
	}

	public long getClientMid() {
		return clientMid;
	}

	public void setClientMid(long clientMid) {
		this.clientMid = clientMid;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getExternalCode() {
		return ExternalCode;
	}

	public void setExternalCode(String externalCode) {
		ExternalCode = externalCode;
	}

	public boolean isOptIn() {
		return isOptIn;
	}

	public void setOptIn(boolean isOptIn) {
		this.isOptIn = isOptIn;
	}

	public LocalDateTime getEffectiveOn() {
		return effectiveOn;
	}

	public void setEffectiveOn(LocalDateTime effectiveOn) {
		this.effectiveOn = effectiveOn;
	}

	public LocalDateTime getExpiresOn() {
		return expiresOn;
	}

	public void setExpiresOn(LocalDateTime expiresOn) {
		this.expiresOn = expiresOn;
	}	
}
