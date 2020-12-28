package nz.co.dm.model.customer;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "Profile")
@Table(name = "dm_profiles")
public class Profile  {
	
	@Id
	@Column(name = "profile_oid")
	private Long profileOid;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "effective_on")
	private LocalDate effectiveOn;
	
	@Column(name = "expires_on")
	private LocalDate expiresOn;
	
	@Column(name = "is_default")
    private boolean isDefault;
	
	@Column(name = "client_name")
    private String clientName;
	
	@Column(name = "client_mid")
	private Long clientMid;
	
	@Column(name = "card_program_description")
    private String cardProgramDescription;
	
	@Column(name = "application_type_description")
    private String applicationTypeDescription;
	
	@Column(name = "application_no")
    private String applicationNo;
	
	@Column(name = "customer_no")
    private String customerNo;
	
	@Column(name = "card_no")
    private String cardNo;
	
	@Column(name = "merchant_no")
    private String merchantNo;
	
	public Long getProfileOid() {
		return profileOid;
	}

	public void setProfileOid(Long profileOid) {
		this.profileOid = profileOid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getEffectiveOn() {
		return effectiveOn;
	}

	public void setEffectiveOn(LocalDate effectiveOn) {
		this.effectiveOn = effectiveOn;
	}

	public LocalDate getExpiresOn() {
		return expiresOn;
	}

	public void setExpiresOn(LocalDate expiresOn) {
		this.expiresOn = expiresOn;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Long getClientMid() {
		return clientMid;
	}

	public void setClientMid(Long clientMid) {
		this.clientMid = clientMid;
	}

	public String getCardProgramDescription() {
		return cardProgramDescription;
	}

	public void setCardProgramDescription(String cardProgramDescription) {
		this.cardProgramDescription = cardProgramDescription;
	}

	public String getApplicationTypeDescription() {
		return applicationTypeDescription;
	}

	public void setApplicationTypeDescription(String applicationTypeDescription) {
		this.applicationTypeDescription = applicationTypeDescription;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
}
