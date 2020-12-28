package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Address")
@Table(name = "dm_addresses")
public class Address {
	
	@Id
	@Column(name = "address_oid")
	private Long addressOid;
	
    @Column(name = "street_address_line_1")
    private String streetAddressLine1;
    
    @Column(name = "street_address_line_2")
    private String streetAddressLine2;
    
    @Column(name = "street_address_line_3")
    private String streetAddressLine3;
    
    @Column(name = "street_address_line_4")
    private String streetAddressLine4;
    
    @Column(name = "street_address_line_5")
    private String streetAddressLine5;
    
    @Column(name = "street_address_country_code")
    private String streetAddressCountryCode;
    
    @Column(name = "street_address_state_des")
    private String streetAddressStateDes;
    
    @Column(name = "street_address_postal_code")
    private String streetAddressPostalCode;
    
    @Column(name = "street_address_suburb")
    private String streetAddressSuburb;
    
    @Column(name = "postal_address_line_1")
    private String postalAddressLine1;
    
    @Column(name = "postal_address_line_2")
    private String postalAddressLine2;
    
    @Column(name = "postal_address_line_3")
    private String postalAddressLine3;
    
    @Column(name = "postal_address_line_4")
    private String postalAddressLine4;
    
    @Column(name = "postal_address_line_5")
    private String postalAddressLine5;
    
    @Column(name = "postal_address_country_code")
    private String postalAddressCountryCode;
    
    @Column(name = "postal_address_state_des")
    private String postalAddressStateDes;
    
    @Column(name = "postal_address_postal_code")
    private String postalAddressPostalCode;
    
    @Column(name = "postal_address_suburb")
    private String postalAddressSuburb;

	public Long getAddressOid() {
		return addressOid;
	}

	public void setAddressOid(Long addressOid) {
		this.addressOid = addressOid;
	}

	public String getStreetAddressLine1() {
		return streetAddressLine1;
	}

	public void setStreetAddressLine1(String streetAddressLine1) {
		this.streetAddressLine1 = streetAddressLine1;
	}

	public String getStreetAddressLine2() {
		return streetAddressLine2;
	}

	public void setStreetAddressLine2(String streetAddressLine2) {
		this.streetAddressLine2 = streetAddressLine2;
	}

	public String getStreetAddressLine3() {
		return streetAddressLine3;
	}

	public void setStreetAddressLine3(String streetAddressLine3) {
		this.streetAddressLine3 = streetAddressLine3;
	}

	public String getStreetAddressLine4() {
		return streetAddressLine4;
	}

	public void setStreetAddressLine4(String streetAddressLine4) {
		this.streetAddressLine4 = streetAddressLine4;
	}

	public String getStreetAddressLine5() {
		return streetAddressLine5;
	}

	public void setStreetAddressLine5(String streetAddressLine5) {
		this.streetAddressLine5 = streetAddressLine5;
	}

	public String getStreetAddressCountryCode() {
		return streetAddressCountryCode;
	}

	public void setStreetAddressCountryCode(String streetAddressCountryCode) {
		this.streetAddressCountryCode = streetAddressCountryCode;
	}

	public String getStreetAddressStateDes() {
		return streetAddressStateDes;
	}

	public void setStreetAddressStateDes(String streetAddressStateDes) {
		this.streetAddressStateDes = streetAddressStateDes;
	}

	public String getStreetAddressPostalCode() {
		return streetAddressPostalCode;
	}

	public void setStreetAddressPostalCode(String streetAddressPostalCode) {
		this.streetAddressPostalCode = streetAddressPostalCode;
	}

	public String getStreetAddressSuburb() {
		return streetAddressSuburb;
	}

	public void setStreetAddressSuburb(String streetAddressSuburb) {
		this.streetAddressSuburb = streetAddressSuburb;
	}

	public String getPostalAddressLine1() {
		return postalAddressLine1;
	}

	public void setPostalAddressLine1(String postalAddressLine1) {
		this.postalAddressLine1 = postalAddressLine1;
	}

	public String getPostalAddressLine2() {
		return postalAddressLine2;
	}

	public void setPostalAddressLine2(String postalAddressLine2) {
		this.postalAddressLine2 = postalAddressLine2;
	}

	public String getPostalAddressLine3() {
		return postalAddressLine3;
	}

	public void setPostalAddressLine3(String postalAddressLine3) {
		this.postalAddressLine3 = postalAddressLine3;
	}

	public String getPostalAddressLine4() {
		return postalAddressLine4;
	}

	public void setPostalAddressLine4(String postalAddressLine4) {
		this.postalAddressLine4 = postalAddressLine4;
	}

	public String getPostalAddressLine5() {
		return postalAddressLine5;
	}

	public void setPostalAddressLine5(String postalAddressLine5) {
		this.postalAddressLine5 = postalAddressLine5;
	}

	public String getPostalAddressCountryCode() {
		return postalAddressCountryCode;
	}

	public void setPostalAddressCountryCode(String postalAddressCountryCode) {
		this.postalAddressCountryCode = postalAddressCountryCode;
	}

	public String getPostalAddressStateDes() {
		return postalAddressStateDes;
	}

	public void setPostalAddressStateDes(String postalAddressStateDes) {
		this.postalAddressStateDes = postalAddressStateDes;
	}

	public String getPostalAddressPostalCode() {
		return postalAddressPostalCode;
	}

	public void setPostalAddressPostalCode(String postalAddressPostalCode) {
		this.postalAddressPostalCode = postalAddressPostalCode;
	}

	public String getPostalAddressSuburb() {
		return postalAddressSuburb;
	}

	public void setPostalAddressSuburb(String postalAddressSuburb) {
		this.postalAddressSuburb = postalAddressSuburb;
	}   
}
