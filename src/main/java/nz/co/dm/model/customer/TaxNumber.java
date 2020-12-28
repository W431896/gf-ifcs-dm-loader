package nz.co.dm.model.customer;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "TaxNumber")
@Table(name = "dm_tax_numbers")
public class TaxNumber {
	
	@Id
	@Column(name = "tax_number_oid")
	private Long taxNumberOid;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "tax_no")
	private String taxNo;
	
	@Column(name = "member_no")
	private String memberNo;
	
	@Column(name = "member_type_description")
	private String memberTypeDescription;
	
	@Column(name = "effective_on")
	private LocalDate effectiveOn;
	
	@Column(name = "expires_on")
	private LocalDate expiresOn;

	@Column(name = "tax_type_description")
	private String taxTypeDescription;
	
	@Column(name = "tax_no_reg_type_description")
	private String taxNoRegTypeDescription;
	
	@Column(name = "is_recovery_by_agency")
	private boolean isRecoveryByAgency;
	
    @OneToOne(targetEntity = Contact.class, cascade = CascadeType.ALL)
    @JoinColumn(name="contact_oid")
    private Contact contact;

	public Long getTaxNumberOid() {
		return taxNumberOid;
	}

	public void setTaxNumberOid(Long taxNumberOid) {
		this.taxNumberOid = taxNumberOid;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberTypeDescription() {
		return memberTypeDescription;
	}

	public void setMemberTypeDescription(String memberTypeDescription) {
		this.memberTypeDescription = memberTypeDescription;
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

	public String getTaxTypeDescription() {
		return taxTypeDescription;
	}

	public void setTaxTypeDescription(String taxTypeDescription) {
		this.taxTypeDescription = taxTypeDescription;
	}

	public String getTaxNoRegTypeDescription() {
		return taxNoRegTypeDescription;
	}

	public void setTaxNoRegTypeDescription(String taxNoRegTypeDescription) {
		this.taxNoRegTypeDescription = taxNoRegTypeDescription;
	}

	public boolean isRecoveryByAgency() {
		return isRecoveryByAgency;
	}

	public void setRecoveryByAgency(boolean isRecoveryByAgency) {
		this.isRecoveryByAgency = isRecoveryByAgency;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
