package nz.co.dm.model.customer;

import java.math.BigDecimal;
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

@Entity(name = "Customer")
@Table(name = "dm_customers")
public class Customer {
	
	@Id
	@Column(name = "customer_oid")
	private Long customerOid;
	
	@Column(name = "client_mid")
	private Long clientMid;
	
	@Column(name = "client_name")
	private String clientName;
	
	@Column(name = "coupon_code")
	private String couponCode;
	
	@Column(name = "alert_threshold_percentage")
	private Integer alertThresholdPercentage;
	
	@Column(name = "admin_territory_des")
	private String adminTerritoryDes;
	
	@Column(name = "application_no")
	private String applicationNo;
	
	@Column(name = "application_type_des")
	private String applicationTypeDes;
	
	@Column(name = "customer_type")
	private String customerType;
	
	@Column(name = "customer_type_ext_code")
	private String customerTypeExtCode;
	
	@Column(name = "received_on")
	private LocalDate receivedOn;
	
	@Column(name = "billing_plan")
	private String billingPlan;
	
	@Column(name = "billing_plan_ext_code")
	private String billingPlanExtCode;
	
	@Column(name = "billing_frequency_des")
	private String billingFrequencyDes;
	
	@Column(name = "billing_frequency_ext_code")
	private String billingFrequencyExtCode;
	
	@Column(name = "cycle_frequency_des")
	private String cycleFrequencyDes;
	
	@Column(name = "business_type")
	private String businessType;
	
	@Column(name = "business_type_ext_code")
	private String businessTypeExtCode;
	
	@Column(name = "bank_guarantee_amount")
	private BigDecimal bankGuaranteeAmount;
	
	@Column(name = "buyer_class")
	private String buyerClass;
	
	@Column(name = "card_required")
	private Integer cardRequired;
	
	@Column(name = "contact_name")
	private String contactName;
	
	@Column(name = "company_no")
	private String companyNo;
	
	@Column(name = "contact_title")
	private String contactTitle;
	
	@Column(name = "credit_limit")
	private BigDecimal creditLimit;
	
	@Column(name = "credit_plan_des")
	private String creditPlanDesc;
	
	@Column(name = "currency_code")
	private String currencyCode;
	
	@Column(name = "current_supplier")
	private String currentSupplier;
	
	@Column(name = "customer_number")
	private String customerNumber;
	
	@Column(name = "email_address")
	private String emailAddress;
	
	@Column(name = "embossing_name")
	private String embossingName;
	
	@Column(name = "external_account_id")
	private String externalAccountId;
	
	@Column(name = "external_account_ref")
	private String externalAccountRef;
	
	@Column(name = "external_delivery_ref")
	private String externalDeliveryRef;
	
	@Column(name = "external_delivery_name")
	private String externalDeliveryName;
	
	@Column(name = "external_customer_code")
	private String externalCustomerCode;
	
	@Column(name = "financial_year_end_month")
	private String financialYearEndMonth;
	
	@Column(name = "gl_channel_des")
	private String glChannelDes;
	
	@Column(name = "gl_cost_centre_code")
	private String glCostCentreCode;
	
	@Column(name = "industry_des")
	private String industryDes;
	
	@Column(name = "industry_code")
	private String industryCode;
	
	@Column(name = "is_bank_opinion")
	private boolean isBankOpinion;
	
	@Column(name = "is_card_system_only")
	private boolean isCardSystemOnly;
	
	@Column(name = "is_check_completed")
	private boolean isCheckCompleted;
	
	@Column(name = "is_directors_cheque")
	private boolean isDirectorsCheque;
	
	@Column(name = "is_directors_guarantee")
	private boolean isDirectorsGuarantee;
	
	@Column(name = "is_dunn_bradstreet_check")
	private boolean isDunnBradstreetCheck;
	
	@Column(name = "is_financial_reference")
	private boolean isFinancialReference;
	
	@Column(name = "is_incorporation_cert")
	private boolean isIncorporationCert;
	
	@Column(name = "is_pin_required")
	private boolean isPinRequired;
	
	@Column(name = "is_promotional_material")
	private boolean isPromotionalMaterial;
	
	@Column(name = "is_risk_assessment")
	private boolean isRiskAssessment;
	
	@Column(name = "is_security_held")
	private boolean isSecurityHeld;
	
	@Column(name = "is_signature_required")
	private boolean isSignatureRequired;
	
	@Column(name = "is_trade_reference")
	private boolean isTradeReference;
	
	@Column(name = "is_using_electronic_marketing")
	private boolean isUsingElectronicMarketing;
	
	@Column(name = "is_using_electronic_reporting")
	private boolean isUsingElectronicReporting;
	
	@Column(name = "is_web_access_required")
	private boolean isWebAccessRequired;
	
	@Column(name = "is_trustee")
	private boolean isTrustee;
	
	@Column(name = "is_trust_deed_received")
	private boolean isTrustDeedReceived;
	
	@Column(name = "language_code")
	private String languageCode;
	
	@Column(name = "language_description")
	private String languageDescription;
	
	@Column(name = "mail_indicatior_des")
	private String mailIndicatiorDes;
	
    @Column(name = "marketing_territory_des")
    private String marketingTerritoryDes;
    
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone_business")
	private String phoneBusiness;
	
	@Column(name = "phone_fax")
	private String phoneFax;
	
	@Column(name = "phone_mobile_1")
	private String phoneMobile1;
	
	@Column(name = "phone_mobile_2")
	private String phoneMobile2;
	
	@Column(name = "pump_control_des")
	private String pumpControlDes;
	
	@Column(name = "trading_name")
	private String tradingName;
	
	@Column(name = "tax_no")
	private String taxNo;
	
	@Column(name = "parent_company")
	private String parentCompany;
	
	@Column(name = "risk_grade_ext_code")
	private String riskGradeExtCode;
	
	@Column(name = "risk_grade_description")
	private String riskGradeDescription;
	
	@Column(name = "behavioural_score")
	private String behaviouralScore;
	
	@Column(name = "business_commenced_on")
	private LocalDate businessCommencedOn;
	
	@Column(name = "speed_pass_indicator")
	private String speedPassIndicator;
	
	@Column(name = "territories_department")
	private String territoriesDepartment;
	
	@Column(name = "external_application_ref")
	private String externalApplicationRef;
	
	@Column(name = "security_indicator")
	private String securityIndicator;
	
	@Column(name = "total_security_value")
	private BigDecimal totalSecurityValue;
	
	@Column(name = "is_client_security_deposit")
	private boolean isClientSecurityDeposit;
	
	@Column(name = "is_reset_client_secur_deposit")
	private boolean isResetClientSecurityDeposit;
	
	@Column(name = "trade_exposure_limit")
	private BigDecimal tradeExposureLimit;
	
	@Column(name = "parent_company_no")
	private String parentCompanyNo;
	
	@Column(name = "embassy_code")
	private String embassyCode;
	
	@Column(name = "iso_language_code")
	private String isoLanguageCode;
	
	@Column(name = "enquiry_source_ext_code")
	private String enquirySourceExtCode;
	
	@Column(name = "is_tax_exempt")
	private boolean isTaxExempt;
	
	@Column(name = "max_card_expiry_date")
	private LocalDate maxCardExpiryDate;
	
	@Column(name = "pin_option_description")
	private String pinOptionDescription;
	
	@Column(name = "ap_account_code")
	private String apAccountCode;
	
	@Column(name = "contra_account_code")
	private String contraAccountCode;
	
	@Column(name = "main_business")
	private String mainBusiness;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@Column(name = "interface_user")
	private String interfaceUser;
	
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private BankAccount bankAccount;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<CustomerValue> customerValues;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private Account account;
    
    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name="address_oid")
    private Address address;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<Contact> contacts;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<CardControlProfile> cardControlProfiles;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<CardReissueProfile> cardReissueProfiles;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<FeeProfile> feeProfiles;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<PricingProfile> pricingProfiles;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<RebateProfile> rebateProfiles;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<Hierarchy> hierarchies;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<ReportAssignment> reportAssignments;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<ApplicationCardOffer> applicationCardOffers;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<CardNumberSeries> cardNumberSeriess;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<DiaryNote> diaryNotes;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<TaxNumber> taxNumbers;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<TaxStatus> taxStatuses;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<DefaultPricingProfile> defaultPricingProfiles;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<EntitySpecification> entitySpecifications;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_oid")
    private List<AccountControlProfile> accountControlProfiles;
    
	public Long getCustomerOid() {
		return customerOid;
	}
	public void setCustomerOid(Long customerOid) {
		this.customerOid = customerOid;
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
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Integer getAlertThresholdPercentage() {
		return alertThresholdPercentage;
	}
	public void setAlertThresholdPercentage(Integer alertThresholdPercentage) {
		this.alertThresholdPercentage = alertThresholdPercentage;
	}
	public String getAdminTerritoryDes() {
		return adminTerritoryDes;
	}
	public void setAdminTerritoryDes(String adminTerritoryDes) {
		this.adminTerritoryDes = adminTerritoryDes;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getApplicationTypeDes() {
		return applicationTypeDes;
	}
	public void setApplicationTypeDes(String applicationTypeDes) {
		this.applicationTypeDes = applicationTypeDes;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCustomerTypeExtCode() {
		return customerTypeExtCode;
	}
	public void setCustomerTypeExtCode(String customerTypeExtCode) {
		this.customerTypeExtCode = customerTypeExtCode;
	}
	public LocalDate getReceivedOn() {
		return receivedOn;
	}
	public void setReceivedOn(LocalDate receivedOn) {
		this.receivedOn = receivedOn;
	}
	public String getBillingPlan() {
		return billingPlan;
	}
	public void setBillingPlan(String billingPlan) {
		this.billingPlan = billingPlan;
	}
	public String getBillingPlanExtCode() {
		return billingPlanExtCode;
	}
	public void setBillingPlanExtCode(String billingPlanExtCode) {
		this.billingPlanExtCode = billingPlanExtCode;
	}
	public String getBillingFrequencyDes() {
		return billingFrequencyDes;
	}
	public void setBillingFrequencyDes(String billingFrequencyDes) {
		this.billingFrequencyDes = billingFrequencyDes;
	}
	public String getBillingFrequencyExtCode() {
		return billingFrequencyExtCode;
	}
	public void setBillingFrequencyExtCode(String billingFrequencyExtCode) {
		this.billingFrequencyExtCode = billingFrequencyExtCode;
	}
	public String getCycleFrequencyDes() {
		return cycleFrequencyDes;
	}
	public void setCycleFrequencyDes(String cycleFrequencyDes) {
		this.cycleFrequencyDes = cycleFrequencyDes;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getBusinessTypeExtCode() {
		return businessTypeExtCode;
	}
	public void setBusinessTypeExtCode(String businessTypeExtCode) {
		this.businessTypeExtCode = businessTypeExtCode;
	}
	public BigDecimal getBankGuaranteeAmount() {
		return bankGuaranteeAmount;
	}
	public void setBankGuaranteeAmount(BigDecimal bankGuaranteeAmount) {
		this.bankGuaranteeAmount = bankGuaranteeAmount;
	}
	public String getBuyerClass() {
		return buyerClass;
	}
	public void setBuyerClass(String buyerClass) {
		this.buyerClass = buyerClass;
	}
	public Integer getCardRequired() {
		return cardRequired;
	}
	public void setCardRequired(Integer cardRequired) {
		this.cardRequired = cardRequired;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}
	public String getContactTitle() {
		return contactTitle;
	}
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}
	public BigDecimal getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getCreditPlanDesc() {
		return creditPlanDesc;
	}
	public void setCreditPlanDesc(String creditPlanDesc) {
		this.creditPlanDesc = creditPlanDesc;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrentSupplier() {
		return currentSupplier;
	}
	public void setCurrentSupplier(String currentSupplier) {
		this.currentSupplier = currentSupplier;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmbossingName() {
		return embossingName;
	}
	public void setEmbossingName(String embossingName) {
		this.embossingName = embossingName;
	}
	public String getExternalAccountId() {
		return externalAccountId;
	}
	public void setExternalAccountId(String externalAccountId) {
		this.externalAccountId = externalAccountId;
	}
	public String getExternalAccountRef() {
		return externalAccountRef;
	}
	public void setExternalAccountRef(String externalAccountRef) {
		this.externalAccountRef = externalAccountRef;
	}
	public String getExternalDeliveryRef() {
		return externalDeliveryRef;
	}
	public void setExternalDeliveryRef(String externalDeliveryRef) {
		this.externalDeliveryRef = externalDeliveryRef;
	}
	public String getExternalDeliveryName() {
		return externalDeliveryName;
	}
	public void setExternalDeliveryName(String externalDeliveryName) {
		this.externalDeliveryName = externalDeliveryName;
	}
	public String getExternalCustomerCode() {
		return externalCustomerCode;
	}
	public void setExternalCustomerCode(String externalCustomerCode) {
		this.externalCustomerCode = externalCustomerCode;
	}
	public String getFinancialYearEndMonth() {
		return financialYearEndMonth;
	}
	public void setFinancialYearEndMonth(String financialYearEndMonth) {
		this.financialYearEndMonth = financialYearEndMonth;
	}
	public String getGlChannelDes() {
		return glChannelDes;
	}
	public void setGlChannelDes(String glChannelDes) {
		this.glChannelDes = glChannelDes;
	}
	public String getGlCostCentreCode() {
		return glCostCentreCode;
	}
	public void setGlCostCentreCode(String glCostCentreCode) {
		this.glCostCentreCode = glCostCentreCode;
	}
	public String getIndustryDes() {
		return industryDes;
	}
	public void setIndustryDes(String industryDes) {
		this.industryDes = industryDes;
	}
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	public boolean isBankOpinion() {
		return isBankOpinion;
	}
	public void setBankOpinion(boolean isBankOpinion) {
		this.isBankOpinion = isBankOpinion;
	}
	public boolean isCardSystemOnly() {
		return isCardSystemOnly;
	}
	public void setCardSystemOnly(boolean isCardSystemOnly) {
		this.isCardSystemOnly = isCardSystemOnly;
	}
	public boolean isCheckCompleted() {
		return isCheckCompleted;
	}
	public void setCheckCompleted(boolean isCheckCompleted) {
		this.isCheckCompleted = isCheckCompleted;
	}
	public boolean isDirectorsCheque() {
		return isDirectorsCheque;
	}
	public void setDirectorsCheque(boolean isDirectorsCheque) {
		this.isDirectorsCheque = isDirectorsCheque;
	}
	public boolean isDirectorsGuarantee() {
		return isDirectorsGuarantee;
	}
	public void setDirectorsGuarantee(boolean isDirectorsGuarantee) {
		this.isDirectorsGuarantee = isDirectorsGuarantee;
	}
	public boolean isDunnBradstreetCheck() {
		return isDunnBradstreetCheck;
	}
	public void setDunnBradstreetCheck(boolean isDunnBradstreetCheck) {
		this.isDunnBradstreetCheck = isDunnBradstreetCheck;
	}
	public boolean isFinancialReference() {
		return isFinancialReference;
	}
	public void setFinancialReference(boolean isFinancialReference) {
		this.isFinancialReference = isFinancialReference;
	}
	public boolean isIncorporationCert() {
		return isIncorporationCert;
	}
	public void setIncorporationCert(boolean isIncorporationCert) {
		this.isIncorporationCert = isIncorporationCert;
	}
	public boolean isPinRequired() {
		return isPinRequired;
	}
	public void setPinRequired(boolean isPinRequired) {
		this.isPinRequired = isPinRequired;
	}
	public boolean isPromotionalMaterial() {
		return isPromotionalMaterial;
	}
	public void setPromotionalMaterial(boolean isPromotionalMaterial) {
		this.isPromotionalMaterial = isPromotionalMaterial;
	}
	public boolean isRiskAssessment() {
		return isRiskAssessment;
	}
	public void setRiskAssessment(boolean isRiskAssessment) {
		this.isRiskAssessment = isRiskAssessment;
	}
	public boolean isSecurityHeld() {
		return isSecurityHeld;
	}
	public void setSecurityHeld(boolean isSecurityHeld) {
		this.isSecurityHeld = isSecurityHeld;
	}
	public boolean isSignatureRequired() {
		return isSignatureRequired;
	}
	public void setSignatureRequired(boolean isSignatureRequired) {
		this.isSignatureRequired = isSignatureRequired;
	}
	public boolean isTradeReference() {
		return isTradeReference;
	}
	public void setTradeReference(boolean isTradeReference) {
		this.isTradeReference = isTradeReference;
	}
	public boolean isUsingElectronicMarketing() {
		return isUsingElectronicMarketing;
	}
	public void setUsingElectronicMarketing(boolean isUsingElectronicMarketing) {
		this.isUsingElectronicMarketing = isUsingElectronicMarketing;
	}
	public boolean isUsingElectronicReporting() {
		return isUsingElectronicReporting;
	}
	public void setUsingElectronicReporting(boolean isUsingElectronicReporting) {
		this.isUsingElectronicReporting = isUsingElectronicReporting;
	}
	public boolean isWebAccessRequired() {
		return isWebAccessRequired;
	}
	public void setWebAccessRequired(boolean isWebAccessRequired) {
		this.isWebAccessRequired = isWebAccessRequired;
	}
	public boolean isTrustee() {
		return isTrustee;
	}
	public void setTrustee(boolean isTrustee) {
		this.isTrustee = isTrustee;
	}
	public boolean isTrustDeedReceived() {
		return isTrustDeedReceived;
	}
	public void setTrustDeedReceived(boolean isTrustDeedReceived) {
		this.isTrustDeedReceived = isTrustDeedReceived;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getLanguageDescription() {
		return languageDescription;
	}
	public void setLanguageDescription(String languageDescription) {
		this.languageDescription = languageDescription;
	}
	public String getMailIndicatiorDes() {
		return mailIndicatiorDes;
	}
	public void setMailIndicatiorDes(String mailIndicatiorDes) {
		this.mailIndicatiorDes = mailIndicatiorDes;
	}
	public String getMarketingTerritoryDes() {
		return marketingTerritoryDes;
	}
	public void setMarketingTerritoryDes(String marketingTerritoryDes) {
		this.marketingTerritoryDes = marketingTerritoryDes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPumpControlDes() {
		return pumpControlDes;
	}
	public void setPumpControlDes(String pumpControlDes) {
		this.pumpControlDes = pumpControlDes;
	}
	public String getTradingName() {
		return tradingName;
	}
	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}
	public String getTaxNo() {
		return taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getParentCompany() {
		return parentCompany;
	}
	public void setParentCompany(String parentCompany) {
		this.parentCompany = parentCompany;
	}
	public String getRiskGradeExtCode() {
		return riskGradeExtCode;
	}
	public void setRiskGradeExtCode(String riskGradeExtCode) {
		this.riskGradeExtCode = riskGradeExtCode;
	}
	public String getRiskGradeDescription() {
		return riskGradeDescription;
	}
	public void setRiskGradeDescription(String riskGradeDescription) {
		this.riskGradeDescription = riskGradeDescription;
	}
	public String getBehaviouralScore() {
		return behaviouralScore;
	}
	public void setBehaviouralScore(String behaviouralScore) {
		this.behaviouralScore = behaviouralScore;
	}
	public LocalDate getBusinessCommencedOn() {
		return businessCommencedOn;
	}
	public void setBusinessCommencedOn(LocalDate businessCommencedOn) {
		this.businessCommencedOn = businessCommencedOn;
	}
	public String getSpeedPassIndicator() {
		return speedPassIndicator;
	}
	public void setSpeedPassIndicator(String speedPassIndicator) {
		this.speedPassIndicator = speedPassIndicator;
	}
	public String getTerritoriesDepartment() {
		return territoriesDepartment;
	}
	public void setTerritoriesDepartment(String territoriesDepartment) {
		this.territoriesDepartment = territoriesDepartment;
	}
	public String getExternalApplicationRef() {
		return externalApplicationRef;
	}
	public void setExternalApplicationRef(String externalApplicationRef) {
		this.externalApplicationRef = externalApplicationRef;
	}
	public String getSecurityIndicator() {
		return securityIndicator;
	}
	public void setSecurityIndicator(String securityIndicator) {
		this.securityIndicator = securityIndicator;
	}
	public BigDecimal getTotalSecurityValue() {
		return totalSecurityValue;
	}
	public void setTotalSecurityValue(BigDecimal totalSecurityValue) {
		this.totalSecurityValue = totalSecurityValue;
	}
	public boolean isClientSecurityDeposit() {
		return isClientSecurityDeposit;
	}
	public void setClientSecurityDeposit(boolean isClientSecurityDeposit) {
		this.isClientSecurityDeposit = isClientSecurityDeposit;
	}
	public boolean isResetClientSecurityDeposit() {
		return isResetClientSecurityDeposit;
	}
	public void setResetClientSecurityDeposit(boolean isResetClientSecurityDeposit) {
		this.isResetClientSecurityDeposit = isResetClientSecurityDeposit;
	}
	public BigDecimal getTradeExposureLimit() {
		return tradeExposureLimit;
	}
	public void setTradeExposureLimit(BigDecimal tradeExposureLimit) {
		this.tradeExposureLimit = tradeExposureLimit;
	}
	public String getParentCompanyNo() {
		return parentCompanyNo;
	}
	public void setParentCompanyNo(String parentCompanyNo) {
		this.parentCompanyNo = parentCompanyNo;
	}
	public String getEmbassyCode() {
		return embassyCode;
	}
	public void setEmbassyCode(String embassyCode) {
		this.embassyCode = embassyCode;
	}
	public String getIsoLanguageCode() {
		return isoLanguageCode;
	}
	public void setIsoLanguageCode(String isoLanguageCode) {
		this.isoLanguageCode = isoLanguageCode;
	}
	public String getEnquirySourceExtCode() {
		return enquirySourceExtCode;
	}
	public void setEnquirySourceExtCode(String enquirySourceExtCode) {
		this.enquirySourceExtCode = enquirySourceExtCode;
	}
	public boolean isTaxExempt() {
		return isTaxExempt;
	}
	public void setTaxExempt(boolean isTaxExempt) {
		this.isTaxExempt = isTaxExempt;
	}
	public LocalDate getMaxCardExpiryDate() {
		return maxCardExpiryDate;
	}
	public void setMaxCardExpiryDate(LocalDate maxCardExpiryDate) {
		this.maxCardExpiryDate = maxCardExpiryDate;
	}
	public String getPinOptionDescription() {
		return pinOptionDescription;
	}
	public void setPinOptionDescription(String pinOptionDescription) {
		this.pinOptionDescription = pinOptionDescription;
	}
	public String getApAccountCode() {
		return apAccountCode;
	}
	public void setApAccountCode(String apAccountCode) {
		this.apAccountCode = apAccountCode;
	}
	public String getContraAccountCode() {
		return contraAccountCode;
	}
	public void setContraAccountCode(String contraAccountCode) {
		this.contraAccountCode = contraAccountCode;
	}
	public String getMainBusiness() {
		return mainBusiness;
	}
	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
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
	public String getInterfaceUser() {
		return interfaceUser;
	}
	public void setInterfaceUser(String interfaceUser) {
		this.interfaceUser = interfaceUser;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}	
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public List<CustomerValue> getCustomerValues() {
		return customerValues;
	}
	public void setCustomerValues(List<CustomerValue> customerValues) {
		this.customerValues = customerValues;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public List<CardControlProfile> getCardControlProfiles() {
		return cardControlProfiles;
	}
	public void setCardControlProfiles(List<CardControlProfile> cardControlProfiles) {
		this.cardControlProfiles = cardControlProfiles;
	}
	public List<CardReissueProfile> getCardReissueProfiles() {
		return cardReissueProfiles;
	}
	public void setCardReissueProfiles(List<CardReissueProfile> cardReissueProfiles) {
		this.cardReissueProfiles = cardReissueProfiles;
	}
	public List<FeeProfile> getFeeProfiles() {
		return feeProfiles;
	}
	public void setFeeProfiles(List<FeeProfile> feeProfiles) {
		this.feeProfiles = feeProfiles;
	}
	public List<PricingProfile> getPricingProfiles() {
		return pricingProfiles;
	}
	public void setPricingProfiles(List<PricingProfile> pricingProfiles) {
		this.pricingProfiles = pricingProfiles;
	}
	public List<RebateProfile> getRebateProfiles() {
		return rebateProfiles;
	}
	public void setRebateProfiles(List<RebateProfile> rebateProfiles) {
		this.rebateProfiles = rebateProfiles;
	}
	public List<Hierarchy> getHierarchies() {
		return hierarchies;
	}
	public void setHierarchies(List<Hierarchy> hierarchies) {
		this.hierarchies = hierarchies;
	}
	public List<ReportAssignment> getReportAssignments() {
		return reportAssignments;
	}
	public void setReportAssignments(List<ReportAssignment> reportAssignments) {
		this.reportAssignments = reportAssignments;
	}
	public List<ApplicationCardOffer> getApplicationCardOffers() {
		return applicationCardOffers;
	}
	public void setApplicationCardOffers(List<ApplicationCardOffer> applicationCardOffers) {
		this.applicationCardOffers = applicationCardOffers;
	}
	public List<CardNumberSeries> getCardNumberSeriess() {
		return cardNumberSeriess;
	}
	public void setCardNumberSeriess(List<CardNumberSeries> cardNumberSeriess) {
		this.cardNumberSeriess = cardNumberSeriess;
	}
	public List<DiaryNote> getDiaryNotes() {
		return diaryNotes;
	}
	public void setDiaryNotes(List<DiaryNote> diaryNotes) {
		this.diaryNotes = diaryNotes;
	}
	public List<TaxNumber> getTaxNumbers() {
		return taxNumbers;
	}
	public void setTaxNumbers(List<TaxNumber> taxNumbers) {
		this.taxNumbers = taxNumbers;
	}
	public List<TaxStatus> getTaxStatuses() {
		return taxStatuses;
	}
	public void setTaxStatuses(List<TaxStatus> taxStatuses) {
		this.taxStatuses = taxStatuses;
	}
	public List<DefaultPricingProfile> getDefaultPricingProfiles() {
		return defaultPricingProfiles;
	}
	public void setDefaultPricingProfiles(List<DefaultPricingProfile> defaultPricingProfiles) {
		this.defaultPricingProfiles = defaultPricingProfiles;
	}
	public List<EntitySpecification> getEntitySpecifications() {
		return entitySpecifications;
	}
	public void setEntitySpecifications(List<EntitySpecification> entitySpecifications) {
		this.entitySpecifications = entitySpecifications;
	}
	public List<AccountControlProfile> getAccountControlProfiles() {
		return accountControlProfiles;
	}
	public void setAccountControlProfiles(List<AccountControlProfile> accountControlProfiles) {
		this.accountControlProfiles = accountControlProfiles;
	}	
}