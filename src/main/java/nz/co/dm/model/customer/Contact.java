package nz.co.dm.model.customer;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Contact")
@Table(name = "dm_contacts")
public class Contact {
	
	@Id
	@Column(name = "contact_oid")
	private Long contactOid;
	
	@Column(name = "contact_type_des")
    private String contactTypeDes;
	
	@Column(name = "contact_name")
    private String contactName;
	
	@Column(name = "contact_title")
    private String contactTitle;
	
	@Column(name = "email_address")
    private String emailAddress;
	
	@Column(name = "phone_business")
    private String phoneBusiness;
	
	@Column(name = "phone_fax")
    private String phoneFax;
	
	@Column(name = "phone_mobile_1")
    private String phoneMobile1;
	
	@Column(name = "phone_mobile_2")
    private String phoneMobile2;
	
	@Column(name = "is_default")
    private boolean isDefault;
	
	@Column(name = "member_type_description")
    private String memberTypeDescription;
	
	@Column(name = "contact_type_ext_code")
    private String contactTypeExtCode;
	
	@Column(name = "gender")
    private String gender;
	
	@Column(name = "birth_date")
    private LocalDate birthDate;
	
    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name="address_oid")
    private Address address;

	public Long getContactOid() {
		return contactOid;
	}

	public void setContactOid(Long contactOid) {
		this.contactOid = contactOid;
	}

	public String getContactTypeDes() {
		return contactTypeDes;
	}

	public void setContactTypeDes(String contactTypeDes) {
		this.contactTypeDes = contactTypeDes;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneBusiness() {
		return phoneBusiness;
	}

	public void setPhoneBusiness(String phoneBusiness) {
		this.phoneBusiness = phoneBusiness;
	}

	public String getPhoneFax() {
		return phoneFax;
	}

	public void setPhoneFax(String phoneFax) {
		this.phoneFax = phoneFax;
	}

	public String getPhoneMobile1() {
		return phoneMobile1;
	}

	public void setPhoneMobile1(String phoneMobile1) {
		this.phoneMobile1 = phoneMobile1;
	}

	public String getPhoneMobile2() {
		return phoneMobile2;
	}

	public void setPhoneMobile2(String phoneMobile2) {
		this.phoneMobile2 = phoneMobile2;
	}
	
	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getMemberTypeDescription() {
		return memberTypeDescription;
	}

	public void setMemberTypeDescription(String memberTypeDescription) {
		this.memberTypeDescription = memberTypeDescription;
	}

	public String getContactTypeExtCode() {
		return contactTypeExtCode;
	}

	public void setContactTypeExtCode(String contactTypeExtCode) {
		this.contactTypeExtCode = contactTypeExtCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}	
}
