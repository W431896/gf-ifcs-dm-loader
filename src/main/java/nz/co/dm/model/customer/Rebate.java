package nz.co.dm.model.customer;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Rebate")
@Table(name = "dm_rebates")
public class Rebate {
	
	@Id
	@Column(name = "rebate_oid")
	private Long rebateOid;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "rebate_category_des")
	private String rebateCategoryDes;
	
	@Column(name = "effective_on")
	private LocalDate effectiveOn;
	
	@Column(name = "expires_on")
	private LocalDate expiresOn;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_group_name")
	private String productGroupName;
	
	@Column(name = "product_group_type_des")
	private String productGroupTypeDes;
	
	@Column(name = "external_client_code")
	private String externalClientCode;
	
	@Column(name = "third_party_customer_no")
	private String thirdPartyCustomerNo;
	
	@Column(name = "member_type_description")
	private String memberTypeDescription;
	
	@Column(name = "member_no")
	private String memberNo;
	
	@Column(name = "current_client_mid")
	private Long currentClientMid;
	
	@Column(name = "current_client_name")
	private String currentClientName;
	
	@Column(name = "current_card_program_des")
	private String currentCardProgramDes;
	
    @OneToOne(targetEntity = MerchAgrmntValue.class, cascade = CascadeType.ALL)
    @JoinColumn(name="merch_agrmnt_value_oid")
    private MerchAgrmntValue merchAgrmntValue;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="rebate_oid")
    private List<RebateValue> rebateValues;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="rebate_oid")
    private List<RebateContribution> rebateContributions;

	public Long getRebateOid() {
		return rebateOid;
	}

	public void setRebateOid(Long rebateOid) {
		this.rebateOid = rebateOid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRebateCategoryDes() {
		return rebateCategoryDes;
	}

	public void setRebateCategoryDes(String rebateCategoryDes) {
		this.rebateCategoryDes = rebateCategoryDes;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductGroupName() {
		return productGroupName;
	}

	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}

	public String getProductGroupTypeDes() {
		return productGroupTypeDes;
	}

	public void setProductGroupTypeDes(String productGroupTypeDes) {
		this.productGroupTypeDes = productGroupTypeDes;
	}

	public String getExternalClientCode() {
		return externalClientCode;
	}

	public void setExternalClientCode(String externalClientCode) {
		this.externalClientCode = externalClientCode;
	}

	public String getThirdPartyCustomerNo() {
		return thirdPartyCustomerNo;
	}

	public void setThirdPartyCustomerNo(String thirdPartyCustomerNo) {
		this.thirdPartyCustomerNo = thirdPartyCustomerNo;
	}

	public String getMemberTypeDescription() {
		return memberTypeDescription;
	}

	public void setMemberTypeDescription(String memberTypeDescription) {
		this.memberTypeDescription = memberTypeDescription;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public Long getCurrentClientMid() {
		return currentClientMid;
	}

	public void setCurrentClientMid(Long currentClientMid) {
		this.currentClientMid = currentClientMid;
	}

	public String getCurrentClientName() {
		return currentClientName;
	}

	public void setCurrentClientName(String currentClientName) {
		this.currentClientName = currentClientName;
	}

	public String getCurrentCardProgramDes() {
		return currentCardProgramDes;
	}

	public void setCurrentCardProgramDes(String currentCardProgramDes) {
		this.currentCardProgramDes = currentCardProgramDes;
	}

	public MerchAgrmntValue getMerchAgrmntValue() {
		return merchAgrmntValue;
	}

	public void setMerchAgrmntValue(MerchAgrmntValue merchAgrmntValue) {
		this.merchAgrmntValue = merchAgrmntValue;
	}

	public List<RebateValue> getRebateValues() {
		return rebateValues;
	}

	public void setRebateValues(List<RebateValue> rebateValues) {
		this.rebateValues = rebateValues;
	}

	public List<RebateContribution> getRebateContributions() {
		return rebateContributions;
	}

	public void setRebateContributions(List<RebateContribution> rebateContributions) {
		this.rebateContributions = rebateContributions;
	}
}
