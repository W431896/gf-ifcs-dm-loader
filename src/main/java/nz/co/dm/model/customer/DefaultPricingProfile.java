package nz.co.dm.model.customer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "DefaultPricingProfile")
@Table(name = "dm_default_pricing_profiles")
public class DefaultPricingProfile {
	
	@Id
	@Column(name = "default_pricing_profile_oid")
	private Long defaultPricingProfileOid;
	
	@Column(name = "client_mid")
	private Long clientMid;
	
	@Column(name = "client_name")
	private String clientName;
	
	@Column(name = "merch_agreem_value_no")
	private String merchantAgreementValueNo;
	
	@Column(name = "merch_agreem_value_des")
	private String merchantAgreementValueDes;
	
	@Column(name = "merch_agreem_value_type_des")
	private String merchantAgreementValueTypeDes;
	
	@Column(name = "product_group_description")
	private String productGroupDescription;
	
	@Column(name = "product_group_type_description")
	private String productGroupTypeDescription;
	
	@Column(name = "product_group_ext_client_code")
	private String productGroupExtClientCode;
	
	@Column(name = "card_product_group_description")
	private String cardProductGroupDescription;
	
	@Column(name = "card_product_group_ext_code")
	private String cardProductGroupExternalCode;
	
    @OneToOne(targetEntity = PricingProfile.class, cascade = CascadeType.ALL)
    @JoinColumn(name="pricing_profile_oid")
    private PricingProfile pricingProfile;

	public Long getDefaultPricingProfileOid() {
		return defaultPricingProfileOid;
	}

	public void setDefaultPricingProfileOid(Long defaultPricingProfileOid) {
		this.defaultPricingProfileOid = defaultPricingProfileOid;
	}

	public Long getClientMid() {
		return clientMid;
	}

	public void setClientMid(Long clientMid) {
		this.clientMid = clientMid;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getMerchantAgreementValueNo() {
		return merchantAgreementValueNo;
	}

	public void setMerchantAgreementValueNo(String merchantAgreementValueNo) {
		this.merchantAgreementValueNo = merchantAgreementValueNo;
	}

	public String getMerchantAgreementValueDes() {
		return merchantAgreementValueDes;
	}

	public void setMerchantAgreementValueDes(String merchantAgreementValueDes) {
		this.merchantAgreementValueDes = merchantAgreementValueDes;
	}

	public String getMerchantAgreementValueTypeDes() {
		return merchantAgreementValueTypeDes;
	}

	public void setMerchantAgreementValueTypeDes(String merchantAgreementValueTypeDes) {
		this.merchantAgreementValueTypeDes = merchantAgreementValueTypeDes;
	}

	public String getProductGroupDescription() {
		return productGroupDescription;
	}

	public void setProductGroupDescription(String productGroupDescription) {
		this.productGroupDescription = productGroupDescription;
	}

	public String getProductGroupTypeDescription() {
		return productGroupTypeDescription;
	}

	public void setProductGroupTypeDescription(String productGroupTypeDescription) {
		this.productGroupTypeDescription = productGroupTypeDescription;
	}

	public String getProductGroupExtClientCode() {
		return productGroupExtClientCode;
	}

	public void setProductGroupExtClientCode(String productGroupExtClientCode) {
		this.productGroupExtClientCode = productGroupExtClientCode;
	}

	public String getCardProductGroupDescription() {
		return cardProductGroupDescription;
	}

	public void setCardProductGroupDescription(String cardProductGroupDescription) {
		this.cardProductGroupDescription = cardProductGroupDescription;
	}

	public String getCardProductGroupExternalCode() {
		return cardProductGroupExternalCode;
	}

	public void setCardProductGroupExternalCode(String cardProductGroupExternalCode) {
		this.cardProductGroupExternalCode = cardProductGroupExternalCode;
	}

	public PricingProfile getPricingProfile() {
		return pricingProfile;
	}

	public void setPricingProfile(PricingProfile pricingProfile) {
		this.pricingProfile = pricingProfile;
	}    
}
