package nz.co.dm.convert;

import static nz.co.dm.utility.DateUtil.convertToXMLDate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import nz.co.dm.model.customer.Customer;
import nz.co.dm.schemas.dto.Account;
import nz.co.dm.schemas.dto.AccountControl;
import nz.co.dm.schemas.dto.AccountControlProfile;
import nz.co.dm.schemas.dto.AccountStatusLog;
import nz.co.dm.schemas.dto.Address;
import nz.co.dm.schemas.dto.ApplicationCardOffer;
import nz.co.dm.schemas.dto.ApplicationWithAdditionalInfo;
import nz.co.dm.schemas.dto.BankAccount;
import nz.co.dm.schemas.dto.CardControl;
import nz.co.dm.schemas.dto.CardControlProfile;
import nz.co.dm.schemas.dto.CardFeeControl;
import nz.co.dm.schemas.dto.CardNumberSeries;
import nz.co.dm.schemas.dto.CardProduct;
import nz.co.dm.schemas.dto.CardReissueProfile;
import nz.co.dm.schemas.dto.Contact;
import nz.co.dm.schemas.dto.Country;
import nz.co.dm.schemas.dto.CustomerValue;
import nz.co.dm.schemas.dto.DefaultPricingProfile;
import nz.co.dm.schemas.dto.DiaryNote;
import nz.co.dm.schemas.dto.EntitySpecCharacteristic;
import nz.co.dm.schemas.dto.EntitySpecification;
import nz.co.dm.schemas.dto.FeeControl;
import nz.co.dm.schemas.dto.FeeProfile;
import nz.co.dm.schemas.dto.Hierarchy;
import nz.co.dm.schemas.dto.MerchAgrmntValue;
import nz.co.dm.schemas.dto.MerchAgrmntValueType;
import nz.co.dm.schemas.dto.OidDescription;
import nz.co.dm.schemas.dto.PricingControl;
import nz.co.dm.schemas.dto.PricingProfile;
import nz.co.dm.schemas.dto.Profile;
import nz.co.dm.schemas.dto.Rebate;
import nz.co.dm.schemas.dto.RebateContribution;
import nz.co.dm.schemas.dto.RebateProfile;
import nz.co.dm.schemas.dto.RebateValue;
import nz.co.dm.schemas.dto.RelationshipAssignment;
import nz.co.dm.schemas.dto.ReportAssignment;
import nz.co.dm.schemas.dto.State;
import nz.co.dm.schemas.dto.TaxNumbers;
import nz.co.dm.schemas.dto.TaxStatus;
import nz.co.dm.schemas.dto.VelocityTypeValue;
import nz.co.dm.schemas.dto.WorkQueue;

public class ApplicationConverter {
	
	public static ApplicationWithAdditionalInfo convertToApplication(Customer customer) throws Exception {
		ApplicationWithAdditionalInfo application = new ApplicationWithAdditionalInfo();
		application.setUser(customer.getInterfaceUser());
		application.setClientMid(customer.getClientMid());
		application.setClientName(customer.getClientName());
		application.setCouponCode(customer.getCouponCode());
		application.setAlertThresholdPercentage(customer.getAlertThresholdPercentage());
		application.setAdminTerritoryDescription(customer.getAdminTerritoryDes());
		application.setApplicationNo(customer.getApplicationNo());
		application.setApplicationTypeDesc(customer.getApplicationTypeDes());
		application.setCustomerType(customer.getCustomerType());
		application.setCustomerTypeExtCode(customer.getCustomerTypeExtCode());
		LocalDate receivedOn = customer.getReceivedOn();
		application.setReceivedOn(receivedOn != null ? convertToXMLDate(receivedOn) : null);
		application.setBillingPlan(customer.getBillingPlan());
		application.setBillingPlanExtCode(customer.getBillingPlanExtCode());
		application.setBillingFrequencyDesc(customer.getBillingFrequencyDes());
		application.setBillingFrequencyExtCode(customer.getBillingFrequencyExtCode());
		application.setCycleFrequencyDesc(customer.getCycleFrequencyDes());
		application.setBusinessType(customer.getBusinessType());
		application.setBusinessTypeExtCode(customer.getBusinessTypeExtCode());
		application.setBankGuaranteeAmount(customer.getBankGuaranteeAmount());
		application.setBuyerClass(customer.getBuyerClass());
		application.setCardRequired(customer.getCardRequired());
		application.setContactName(customer.getContactName());
		application.setCompanyNo(customer.getCompanyNo());
		application.setContactTitle(customer.getContactTitle());
		application.setCreditLimit(customer.getCreditLimit());
		application.setCreditPlanDesc(customer.getCreditPlanDesc());
		application.setCurrencyCode(customer.getCurrencyCode());
		application.setCurrentSupplier(customer.getCurrentSupplier());
		application.setCustomerNumber(customer.getCustomerNumber());
		application.setEmailAddress(customer.getEmailAddress());
		application.setEmbossingName(customer.getEmbossingName());
		application.setExternalAccountId(customer.getExternalAccountId());
		application.setExternalAccountRef(customer.getExternalAccountRef());
		application.setExternalDeliveryRef(customer.getExternalDeliveryRef());
		application.setExternalDeliveryName(customer.getExternalDeliveryName());
		application.setExternalCustomerCode(customer.getExternalCustomerCode());
		application.setFinancialYearEndMonth(customer.getFinancialYearEndMonth());
		application.setGlChannelDesc(customer.getGlChannelDes());
		application.setGlCostCentreCode(customer.getGlCostCentreCode());
		application.setIndustryDesc(customer.getIndustryDes());
		application.setIndustryCode(customer.getIndustryCode());
		application.setIsBankOpinion(customer.isBankOpinion());
		application.setIsCardSystemOnly(customer.isCardSystemOnly());
		application.setIsCheckCompleted(customer.isCheckCompleted());
		application.setIsDirectorsCheque(customer.isDirectorsCheque());
		application.setIsDirectorsGuarantee(customer.isDirectorsGuarantee());
		application.setIsDunnBradstreetCheck(customer.isDunnBradstreetCheck());
		application.setIsFinancialReference(customer.isFinancialReference());
		application.setIsIncorporationCert(customer.isIncorporationCert());
		application.setIsPinRequired(customer.isPinRequired());
		application.setIsPromotionalMaterial(customer.isPromotionalMaterial());
		application.setIsRiskAssessment(customer.isRiskAssessment());
		application.setIsSecurityHeld(customer.isSecurityHeld());
		application.setIsSignatureRequired(customer.isSignatureRequired());
		application.setIsTradeReference(customer.isTradeReference());
		application.setIsUsingElectronicMarketing(customer.isUsingElectronicMarketing());
		application.setIsUsingElectronicReporting(customer.isUsingElectronicReporting());
		application.setIsWebAccessRequired(customer.isWebAccessRequired());
		application.setIsTrustee(customer.isTrustee());
		application.setIsTrustDeedReceived(customer.isTrustDeedReceived());
		application.setLanguageCode(customer.getLanguageCode());
		application.setLanguageDescription(customer.getLanguageDescription());
		application.setMailIndicatiorDesc(customer.getMailIndicatiorDes());
		application.setMarketingTerritoryDescription(customer.getMarketingTerritoryDes());
		application.setName(customer.getName());
		application.setPhoneBusiness(customer.getPhoneBusiness());
		application.setPhoneFax(customer.getPhoneFax());
		application.setPhoneMobile1(customer.getPhoneMobile1());
		application.setPhoneMobile2(customer.getPhoneMobile2());
		application.setPumpControlDesc(customer.getPumpControlDes());
		application.setTradingName(customer.getTradingName());
		application.setTaxNo(customer.getTaxNo());
		application.setParentCompany(customer.getParentCompany());
		application.setRiskGradeExtCode(customer.getRiskGradeExtCode());
		application.setRiskGradeDescription(customer.getRiskGradeDescription());
		application.setBehaviouralScore(customer.getBehaviouralScore());
		LocalDate businessCommencedOnDate = customer.getBusinessCommencedOn();
		application.setBusinessCommencedOn(businessCommencedOnDate != null ? convertToXMLDate(businessCommencedOnDate) : null);
		application.setSpeedPassIndicator(customer.getSpeedPassIndicator());
		application.setTerritoriesDepartment(customer.getTerritoriesDepartment());
		application.setExternalApplicationRef(customer.getExternalApplicationRef());
		application.setSecurityIndicator(customer.getSecurityIndicator());
		application.setTotalSecurityValue(customer.getTotalSecurityValue());
		application.setIsClientSecurityDeposit(customer.isClientSecurityDeposit());
		application.setIsResetClientSecurityDeposit(customer.isResetClientSecurityDeposit());
		application.setTradeExposureLimit(customer.getTradeExposureLimit());
		application.setParentCompanyNo(customer.getParentCompanyNo());
		application.setEmbassyCode(customer.getEmbassyCode());
		application.setIsoLanguageCode(customer.getIsoLanguageCode());
		application.setEnquirySourceExtCode(customer.getEnquirySourceExtCode());
		application.setIsTaxExempt(customer.isTaxExempt());
		LocalDate maxCardExpiryDate = customer.getMaxCardExpiryDate();
		application.setMaxCardExpiryDate(maxCardExpiryDate != null ? convertToXMLDate(maxCardExpiryDate): null);
		application.setPinOptionDescription(customer.getPinOptionDescription());
		application.setApAccountCode(customer.getApAccountCode());
		application.setContraAccountCode(customer.getContraAccountCode());
		application.setMainBusiness(customer.getMainBusiness());
		application.setGender(customer.getGender());
		LocalDate birthDate = customer.getBirthDate();
		application.setBirthDate(birthDate != null ? convertToXMLDate(birthDate) : null);
		
		application.getCustomerValues().addAll(convertCustomerValue(customer.getCustomerValues()));
		nz.co.dm.model.customer.Account accountFromDB = customer.getAccount();
		application.setAccount(accountFromDB != null ? convertAccount(accountFromDB) : null);
		
		nz.co.dm.model.customer.Address addressFromDB = customer.getAddress();
		application.setAddress(addressFromDB != null ? convertAddress(addressFromDB) : null);
		
		application.getContacts().addAll(convertContact(customer.getContacts()));
		application.getCardControlProfiles().addAll(convertCardControlProfile(customer.getCardControlProfiles()));
		application.getCardReissueProfiles().addAll(convertCardReissueProfile(customer.getCardReissueProfiles()));
		application.getFeeProfiles().addAll(convertFeeProfile(customer.getFeeProfiles()));
		application.getPricingProfiles().addAll(convertPricingProfile(customer.getPricingProfiles()));
		application.getRebateProfiles().addAll(convertRebateProfile(customer.getRebateProfiles()));
		application.getHierarchies().addAll(convertHierarchy(customer.getHierarchies()));
		application.getReportAssignments().addAll(convertReportAssignment(customer.getReportAssignments()));
		application.getApplicationCardOffers().addAll(convertApplicationCardOffer(customer.getApplicationCardOffers()));
		application.getCardNumberSeries().addAll(convertCardNumberSeries(customer.getCardNumberSeriess()));
		application.getDiaryNotes().addAll(convertDiaryNote(customer.getDiaryNotes()));
		application.getTaxNumbers().addAll(convertTaxNumber(customer.getTaxNumbers()));
		application.getTaxStatus().addAll(convertTaxStatus(customer.getTaxStatuses()));
		application.getDefaultPricingProfiles().addAll(convertDefaultPricingProfile(customer.getDefaultPricingProfiles()));
		application.getEntitySpecification().addAll(convertEntitySpecification(customer.getEntitySpecifications()));
		application.getAccountControlProfiles().addAll(convertAccountControlProfile(customer.getAccountControlProfiles()));
		nz.co.dm.model.customer.BankAccount bankAccountFromDB = customer.getBankAccount();
		application.setApplicationBankAccount(bankAccountFromDB != null ? convertBankAccount(bankAccountFromDB) : null);
		
		return application;
	}

	public static List<CustomerValue> convertCustomerValue(List<nz.co.dm.model.customer.CustomerValue> customerValuesFromDB) {
		List<CustomerValue> customerValueList = new ArrayList<>();
		for (nz.co.dm.model.customer.CustomerValue customerValueFromDB : customerValuesFromDB) {			
			CustomerValue customerValue = new CustomerValue();
			customerValue.setCustomerValueDesc(customerValueFromDB.getCustomerValueDes());
			customerValue.setCustomerValueNo(customerValueFromDB.getCustomerValueNo());
			customerValueList.add(customerValue);
		}
		return customerValueList;
	}
	
	public static Account convertAccount(nz.co.dm.model.customer.Account accountFromDB) throws Exception {
		Account account = new Account();
		account.setAccountNo(accountFromDB.getAccountNo());
		BigDecimal actualBalance = accountFromDB.getActualBalance();
		account.setActualBalance(actualBalance != null ? actualBalance.toString() : null);
		BigDecimal creditLimit = accountFromDB.getCreditLimit();
		account.setCreditLimit(creditLimit != null ? creditLimit.toString() : null);
		BigDecimal depositBalance = accountFromDB.getDepositBalance();
		account.setDepositBalance(depositBalance != null ? depositBalance.toString() : null);
		account.setExternalAccountCode(accountFromDB.getExternalAccountCode());
		LocalDate lastPaymentMadeOn = accountFromDB.getLastPaymentMadeOn();
		account.setLastPaymentMadeOn(lastPaymentMadeOn != null ? convertToXMLDate(lastPaymentMadeOn) : null);
		BigDecimal lastPaymentAmount = accountFromDB.getLastPaymentAmount();
		account.setLastPaymentAmount(lastPaymentAmount != null ? lastPaymentAmount.toString() : null);
		LocalDate lastBilledOn = accountFromDB.getLastBilledOn();
		account.setLastBilledOn(lastBilledOn != null ? convertToXMLDate(lastBilledOn) : null);
		BigDecimal lastBilledAmount = accountFromDB.getLastBilledAmount();
		account.setLastBilledAmount(lastBilledAmount != null ? lastBilledAmount.toString() : null);
		LocalDate openedOn = accountFromDB.getOpenedOn();
		account.setOpenedOn(openedOn != null ? convertToXMLDate(openedOn) : null);
		LocalDate reinstatedOn = accountFromDB.getReinstatedOn();
		account.setReinstatedOn(reinstatedOn != null ? convertToXMLDate(reinstatedOn) : null);
		account.setRiskGradeExtCode(accountFromDB.getRiskGradeExtCode());
		account.setRiskGradeDescription(accountFromDB.getRiskGradeDescription());
		account.setSecurityIndicator(accountFromDB.getSecurityIndicator());
		account.setTotalSecurityValue(accountFromDB.getTotalSecurityValue());
		account.setTradeExposureLimit(accountFromDB.getTradeExposureLimit());
		LocalDate closedOn = accountFromDB.getClosedOn();
		account.setClosedOn(closedOn != null ? convertToXMLDate(closedOn) : null);
		account.setAccountStatusDesc(accountFromDB.getAccountStatusDescription());
		account.setTaxNo(accountFromDB.getTaxNo());
		BigDecimal tempCreditAmount = accountFromDB.getTempCreditAmount();
		account.setTempCreditAmount(tempCreditAmount != null ? tempCreditAmount.toString() : null);
		account.setTempCreditReasonDescription(accountFromDB.getTempCreditReasonDes());
		LocalDate tempCreditExpiresOn = accountFromDB.getTempCreditExpiresOn();
		account.setTempCreditExpiresOn(tempCreditExpiresOn != null ? convertToXMLDate(tempCreditExpiresOn) : null);
		account.setBehaviouralScore(accountFromDB.getBehaviouralScore());
		account.getAccountStatusLogs().addAll(convertAccountStatusLog(accountFromDB.getAccountStatusLog()));
		nz.co.dm.model.customer.BankAccount bankAccountFromDB = accountFromDB.getBankAccount();
		account.setBankAccount(bankAccountFromDB != null ? convertBankAccount(bankAccountFromDB) : null);
		return account;
	}
	
	public static List<AccountStatusLog> convertAccountStatusLog(List<nz.co.dm.model.customer.AccountStatusLog> accountStatusLogsFromDB) throws Exception {
		List<AccountStatusLog> accountStatusLogList = new ArrayList<>();
		for(nz.co.dm.model.customer.AccountStatusLog accountStatusLogFromDB : accountStatusLogsFromDB) {
			AccountStatusLog accountStatusLog = new AccountStatusLog();
			accountStatusLog.setAccountStatusCode(accountStatusLogFromDB.getAccountStatusCode());
			accountStatusLog.setAccountStatusDesc(accountStatusLogFromDB.getAccountStatusDes());
			accountStatusLog.setAccountSubStatusDesc(accountStatusLogFromDB.getAccountSubStatusDes());
			LocalDateTime effectiveAt = accountStatusLogFromDB.getEffectiveAt();
			accountStatusLog.setEffectiveAt(effectiveAt != null ? convertToXMLDate(effectiveAt) : null);
			LocalDateTime expiresAt = accountStatusLogFromDB.getExpiresAt();
			accountStatusLog.setExpiresAt(expiresAt != null ? convertToXMLDate(expiresAt) : null);
			accountStatusLogList.add(accountStatusLog);
		}
		return accountStatusLogList;
	}
	
	public static BankAccount convertBankAccount(nz.co.dm.model.customer.BankAccount bankAccountFromDB) throws Exception {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setBankNo(bankAccountFromDB.getBankNo());
		bankAccount.setBankName(bankAccountFromDB.getBankName());
		bankAccount.setBankBranchNo(bankAccountFromDB.getBankBranchNo());
		bankAccount.setBankAccountNo(bankAccountFromDB.getBankAccountNo());
		bankAccount.setBankAccountName(bankAccountFromDB.getBankAccountName());
		bankAccount.setBic(bankAccountFromDB.getBic());
		bankAccount.setSwiftCode(bankAccountFromDB.getSwiftCode());
		bankAccount.setIban(bankAccountFromDB.getIban());
		bankAccount.setUmrNo(bankAccountFromDB.getUmrNo());
		LocalDate createdOn = bankAccountFromDB.getCreatedOn();
		bankAccount.setCreatedOn(createdOn != null ? convertToXMLDate(createdOn) : null);
		LocalDate letterOn = bankAccountFromDB.getLetterOn();
		bankAccount.setLetterOn(letterOn != null ? convertToXMLDate(letterOn) : null);
		return bankAccount;
	}
	
	public static Address convertAddress(nz.co.dm.model.customer.Address addressFromDB) {
		Address address = new Address();
		address.setAddressLine1(addressFromDB.getStreetAddressLine1());
		address.setAddressLine2(addressFromDB.getStreetAddressLine2());
		address.setAddressLine3(addressFromDB.getStreetAddressLine3());
		address.setAddressLine4(addressFromDB.getStreetAddressLine4());
		address.setAddressLine5(addressFromDB.getStreetAddressLine5());
		Country streetAddressCountry = new Country();
		streetAddressCountry.setCountryCode(addressFromDB.getStreetAddressCountryCode());
		address.setCountry(streetAddressCountry);
		address.setSuburb(addressFromDB.getStreetAddressSuburb());
		address.setPostalCode(addressFromDB.getStreetAddressPostalCode());
		State streetAddressState = new State();
		streetAddressState.setDescription(addressFromDB.getStreetAddressStateDes());
		address.setState(streetAddressState);
		
		address.setPostalAddressLine1(addressFromDB.getPostalAddressLine1());
		address.setPostalAddressLine2(addressFromDB.getPostalAddressLine2());
		address.setPostalAddressLine3(addressFromDB.getPostalAddressLine3());
		address.setPostalAddressLine4(addressFromDB.getPostalAddressLine4());
		address.setPostalAddressLine5(addressFromDB.getPostalAddressLine5());
		Country postalAddressCountry = new Country();
		postalAddressCountry.setCountryCode(addressFromDB.getPostalAddressCountryCode());
		address.setPostalCountry(postalAddressCountry);
		address.setPostalSuburb(addressFromDB.getPostalAddressSuburb());
		address.setPostalPostalCode(addressFromDB.getStreetAddressPostalCode());
		State postalAddressState = new State();
		postalAddressState.setDescription(addressFromDB.getPostalAddressStateDes());
		address.setPostalState(postalAddressState);
		return address;
	} 
	
	public static List<Contact> convertContact(List<nz.co.dm.model.customer.Contact> contactsFromDB) throws Exception {
		List<Contact> contactList = new ArrayList<>();
		for (nz.co.dm.model.customer.Contact contactFromDB : contactsFromDB) {
			Contact contact = new Contact();
			nz.co.dm.model.customer.Address addressFromDB = contactFromDB.getAddress();
			contact.setAddress(addressFromDB != null ? convertAddress(contactFromDB.getAddress()) : null);
			contact.setContactName(contactFromDB.getContactName());
			contact.setContactTitle(contactFromDB.getContactTitle());
			contact.setContactTypeDesc(contactFromDB.getContactTypeDes());
			contact.setContactTypeExtCode(contactFromDB.getContactTypeExtCode());
			contact.setEmailAddress(contactFromDB.getEmailAddress());
			contact.setPhoneBusiness(contactFromDB.getPhoneBusiness());
			contact.setPhoneFax(contactFromDB.getPhoneFax());
			contact.setPhoneMobile1(contactFromDB.getPhoneMobile1());
			contact.setPhoneMobile2(contactFromDB.getPhoneMobile2());
			contact.setIsDefault(contactFromDB.isDefault());
			contact.setMemberType(contactFromDB.getMemberTypeDescription());
			contact.setGender(contactFromDB.getGender());
			LocalDate birthDate = contactFromDB.getBirthDate();
			contact.setBirthDate(birthDate != null ? convertToXMLDate(birthDate) : null);
			contactList.add(contact);
		}
		return contactList;
	}
	
	public static List<CardControlProfile> convertCardControlProfile(List<nz.co.dm.model.customer.CardControlProfile> cardControlProfilesFromDB) throws Exception  {
		List<CardControlProfile> cardControlProfileList = new ArrayList<>();
		for(nz.co.dm.model.customer.CardControlProfile cardControlProfileFromDB : cardControlProfilesFromDB) {
			CardControlProfile cardControlProfile = new CardControlProfile();
			cardControlProfile.setCardOfferDescription(convertToOidDescription(cardControlProfileFromDB.getCardOfferDescription()));
			nz.co.dm.model.customer.CardControl cardControl = cardControlProfileFromDB.getCardControl();
			cardControlProfile.setCardControl(cardControl != null ? convertCardControl(cardControl) : null);
			nz.co.dm.model.customer.CardProduct cardProduct = cardControlProfileFromDB.getCardProduct();
			cardControlProfile.setCardProduct(cardProduct != null ? convertCardProduct(cardProduct) : null);
			nz.co.dm.model.customer.Profile profileFromDB = cardControlProfileFromDB.getProfile();
			cardControlProfile = addProfileDetails(cardControlProfile, convertProfile(profileFromDB));
			cardControlProfileList.add(cardControlProfile);			
		}
		return cardControlProfileList;
	}
	
	public static CardProduct convertCardProduct(nz.co.dm.model.customer.CardProduct cardProductFromDB) {
		CardProduct cardProduct = new CardProduct();
		cardProduct.setCardOfferDescription(convertToOidDescription(cardProductFromDB.getCardOfferDescription()));
		cardProduct.setApplicationTypeDescription(convertToOidDescription(cardProductFromDB.getApplicationTypeDescription()));
		cardProduct.setCardType(cardProductFromDB.getCardTypeDescription());
		cardProduct.setCardProductDescription(convertToOidDescription(cardProductFromDB.getCardProductDescription()));
		cardProduct.setPlasticCode(cardProductFromDB.getPlasticCode());
		return cardProduct;
	}
	
	public static CardControl convertCardControl(nz.co.dm.model.customer.CardControl cardControlFromDB) throws Exception {
		CardControl cardControl = new CardControl();
		cardControl.setExtVelocityProfileNumber(cardControlFromDB.getExtVelocityProfileNumber());
		cardControl.setProductRestrictionDesc(convertToOidDescription(cardControlFromDB.getProductRestrictionDes()));
		cardControl.setProductRestrictionCode(convertToOidDescription(cardControlFromDB.getProductRestrictionCode()));
		cardControl.setProductRestrictionCardOfferDesc(cardControlFromDB.getProductRestrictionCardOfferDes());
		cardControl.setTimeLimitDesc(convertToOidDescription(cardControlFromDB.getTimeLimitDes()));
		cardControl.setTimeLimitCode(convertToOidDescription(cardControlFromDB.getTimeLimitCode()));
		cardControl.setLocationRestrictionType(cardControlFromDB.getLocationRestrictionType());
		cardControl.setLocationRestrictionDescription(convertToOidDescription(cardControlFromDB.getLocationRestrictionDes()));
		cardControl.setIsErrorProdRestColl(cardControlFromDB.isErrorProdRestColl());
		cardControl.setIsErrorProdRestAuth(cardControlFromDB.isErrorProdRestAuth());
		cardControl.setIsErrorTimeLimitColl(cardControlFromDB.isErrorTimeLimitColl());
		cardControl.setIsErrorTimeLimitAuth(cardControlFromDB.isErrorTimeLimitAuth());
		cardControl.setIsErrorLocRestricColl(cardControlFromDB.isErrorLocRestricColl());
		cardControl.setIsErrorLocRestricAuth(cardControlFromDB.isErrorLocRestricAuth());
		cardControl.setIsVehicleIdReq(cardControlFromDB.isVehicleIdReq());
		cardControl.setIsOrderNumberReq(cardControlFromDB.isOrderNumberReq());
		cardControl.setIsDriverIdReq(cardControlFromDB.isDriverIdReq());
		cardControl.setIsFleetIdReq(cardControlFromDB.isFleetIdReq());
		cardControl.setIsCustomerSelectionReq(cardControlFromDB.isCustomerSelectionReq());
		cardControl.setIsOdometerReq(cardControlFromDB.isOdoMeterReq());
		cardControl.setIsOdometerValidation(cardControlFromDB.isOdoMeterValidation());
		cardControl.setIsPosPinChangeAllowed(cardControlFromDB.isPosPinChangeAllowed());
		LocalDate effectiveOn = cardControlFromDB.getEffectiveOn();
		cardControl.setEffectiveOn(effectiveOn != null ? convertToXMLDate(effectiveOn) : null);
		LocalDate expiresOn = cardControlFromDB.getExpiresOn();
		cardControl.setExpiresOn(expiresOn != null ? convertToXMLDate(expiresOn) : null);
		cardControl.getVelocityTypeValues().addAll(convertVelocityTypeValue(cardControlFromDB.getVelocityTypeValues()));
		return cardControl;
	}
	
	public static Profile convertProfile(nz.co.dm.model.customer.Profile profileFromDB) throws Exception  {
		Profile profile = new Profile();
		profile.setDescription(profileFromDB.getDescription());
		LocalDate effectiveOn = profileFromDB.getEffectiveOn();
		profile.setEffectiveOn(effectiveOn != null ? convertToXMLDate(effectiveOn) : null);
		LocalDate expiresOn = profileFromDB.getExpiresOn();
		profile.setExpiresOn(expiresOn != null ? convertToXMLDate(expiresOn) : null);
		profile.setIsDefault(profileFromDB.isDefault());
		profile.setClientName(profileFromDB.getClientName());
		profile.setClientMid(profileFromDB.getClientMid());
		profile.setCardProgramDescription(profileFromDB.getCardProgramDescription());
		profile.setApplicationTypeDescription(profileFromDB.getApplicationTypeDescription());
		profile.setApplicationNumber(profileFromDB.getApplicationNo());
		profile.setCustomerNumber(profileFromDB.getCustomerNo());
		profile.setCardNumber(profileFromDB.getCardNo());
		profile.setMerchantNo(profileFromDB.getMerchantNo());
		return profile;
	}
	
	public static <T extends Profile>T addProfileDetails(T anyProfile, Profile profile) {
		anyProfile.setDescription(profile.getDescription());
		anyProfile.setEffectiveOn(profile.getEffectiveOn());
		anyProfile.setExpiresOn(profile.getExpiresOn());
		anyProfile.setIsDefault(profile.isIsDefault());
		anyProfile.setClientName(profile.getClientName());
		anyProfile.setClientMid(profile.getClientMid());
		anyProfile.setCardProgramDescription(profile.getCardProgramDescription());
		anyProfile.setApplicationTypeDescription(profile.getApplicationTypeDescription());
		anyProfile.setApplicationNumber(profile.getApplicationNumber());
		anyProfile.setCustomerNumber(profile.getCustomerNumber());
		anyProfile.setCardNumber(profile.getCardNumber());
		anyProfile.setMerchantNo(profile.getMerchantNo());
		return anyProfile;
	}
	
	public static List<VelocityTypeValue> convertVelocityTypeValue(List<nz.co.dm.model.customer.VelocityTypeValue> velocityTypeValuesFromDB) {		
		List<VelocityTypeValue> velocityTypeValueList = new ArrayList<>();
		for (nz.co.dm.model.customer.VelocityTypeValue velocityTypeValueFromDB : velocityTypeValuesFromDB) {
			VelocityTypeValue velocityTypeValue = new VelocityTypeValue();
			velocityTypeValue.setTypeColumnName(velocityTypeValueFromDB.getTypeColumnName());
			velocityTypeValue.setDescription(velocityTypeValueFromDB.getDescription());
			velocityTypeValue.setIsErrorTypeAuth(velocityTypeValueFromDB.isErrorTypeAuth());
			velocityTypeValue.setIsErrorTypeCollect(velocityTypeValueFromDB.isErrorTypeCollect());
			velocityTypeValueList.add(velocityTypeValue);
		}
		return velocityTypeValueList;
	}
	
	public static List<CardReissueProfile> convertCardReissueProfile(List<nz.co.dm.model.customer.CardReissueProfile> cardReissueProfilesFromDB) throws Exception {
		List<CardReissueProfile> cardReissueProfileList = new ArrayList<>();
		for (nz.co.dm.model.customer.CardReissueProfile cardReissueProfileFromDB : cardReissueProfilesFromDB) {
			CardReissueProfile cardReissueProfile = new CardReissueProfile();
			cardReissueProfile.setCardReissueConfirmMonth(cardReissueProfileFromDB.getCardReissueConfirmMonth());
			cardReissueProfile.setCardReissueOnDays(cardReissueProfileFromDB.getCardReissueOnDays());
			cardReissueProfile.setCardReissueActiveDays(cardReissueProfileFromDB.getCardReissueActiveDays());
			cardReissueProfile.setCardReissueOverrideExclusion(cardReissueProfileFromDB.getCardReissueOverrideExclusion());
			cardReissueProfile.setIsAutoReissue(cardReissueProfileFromDB.isAutoReissue());
			nz.co.dm.model.customer.Profile profileFromDB = cardReissueProfileFromDB.getProfile();
			cardReissueProfile = addProfileDetails(cardReissueProfile, convertProfile(profileFromDB));
			cardReissueProfileList.add(cardReissueProfile);	
		}
		return cardReissueProfileList;
	}
	
	public static List<FeeProfile> convertFeeProfile(List<nz.co.dm.model.customer.FeeProfile> feeProfilesFromDB) throws Exception {
		List<FeeProfile> feeProfileList = new ArrayList<>();
		for (nz.co.dm.model.customer.FeeProfile feeProfileFromDB : feeProfilesFromDB) {
			FeeProfile feeProfile = new FeeProfile();
			feeProfile.setCardOfferDescription(convertToOidDescription(feeProfileFromDB.getCardOfferDescription()));
			feeProfile.setCardType(feeProfileFromDB.getCardTypeDescription());
			feeProfile.setFeeType(feeProfileFromDB.getFeeTypeDescription());
			nz.co.dm.model.customer.CardProduct cardProductFromDB = feeProfileFromDB.getCardProduct();
			feeProfile.setCardProduct(cardProductFromDB != null ? convertCardProduct(cardProductFromDB) : null);
			nz.co.dm.model.customer.CardFeeControl cardFeeControlFromDB = feeProfileFromDB.getCardFeeControl();
			feeProfile.setCardFeeControl(cardFeeControlFromDB != null ? convertCardFeeControl(cardFeeControlFromDB) : null);
			nz.co.dm.model.customer.Profile profileFromDB = feeProfileFromDB.getProfile();
			feeProfile = addProfileDetails(feeProfile, convertProfile(profileFromDB));
			feeProfileList.add(feeProfile);
		}
		return feeProfileList;
	}
	
	public static CardFeeControl convertCardFeeControl(nz.co.dm.model.customer.CardFeeControl cardFeeControlFromDB) {
		CardFeeControl cardFeeControl = new CardFeeControl();
		nz.co.dm.model.customer.FeeControl cardIssueFeeFromDB = cardFeeControlFromDB.getCardIssueFee();
		cardFeeControl.setCardIssueFeeVO(cardIssueFeeFromDB != null ? convertFeeControl(cardIssueFeeFromDB) : null);
		nz.co.dm.model.customer.FeeControl periodicCardFee1FromDB = cardFeeControlFromDB.getPeriodicCardFee1();
		cardFeeControl.setPeriodicCardFeeVO1(periodicCardFee1FromDB != null ? convertFeeControl(periodicCardFee1FromDB) : null);
		nz.co.dm.model.customer.FeeControl periodicCardFee2FromDB = cardFeeControlFromDB.getPeriodicCardFee2();
		cardFeeControl.setPeriodicCardFeeVO2(periodicCardFee2FromDB != null ? convertFeeControl(periodicCardFee2FromDB) : null);
		nz.co.dm.model.customer.FeeControl periodicCardFee3FromDB = cardFeeControlFromDB.getPeriodicCardFee3();
		cardFeeControl.setPeriodicCardFeeVO3(periodicCardFee3FromDB != null ? convertFeeControl(periodicCardFee3FromDB) : null);
		return cardFeeControl;
	}
	
	public static FeeControl convertFeeControl(nz.co.dm.model.customer.FeeControl feeControlFromDB) {
		FeeControl feeControl = new FeeControl();
		feeControl.setFeeDescription(convertToOidDescription(feeControlFromDB.getFeeDescription()));
		feeControl.setMsfDescription(convertToOidDescription(feeControlFromDB.getMsfDescription()));
		feeControl.setInitialDelayMonths(feeControlFromDB.getInitialDelayMonths());
		feeControl.setIsFeeCharged(feeControlFromDB.isFeeCharged());
		feeControl.setApplyMonths(feeControlFromDB.getApplyMonths());
		return feeControl;
	}
	
	public static List<PricingProfile> convertPricingProfile(List<nz.co.dm.model.customer.PricingProfile> pricingProfilesFromDB) throws Exception {
		List<PricingProfile> pricingProfileList = new ArrayList<>();
		for (nz.co.dm.model.customer.PricingProfile pricingProfileFromDB : pricingProfilesFromDB) {
			PricingProfile pricingProfile = new PricingProfile();
			pricingProfile.getPricingControls().addAll(convertPricingControl(pricingProfileFromDB.getPricingControls()));
			nz.co.dm.model.customer.Profile profileFromDB = pricingProfileFromDB.getProfile();
			pricingProfile = addProfileDetails(pricingProfile, convertProfile(profileFromDB));
			pricingProfileList.add(pricingProfile);				
		}
		return pricingProfileList;
	}
	
	public static List<PricingControl> convertPricingControl(List<nz.co.dm.model.customer.PricingControl> pricingControlsFromDB) {
		List<PricingControl> pricingControlList = new ArrayList<>();
		for (nz.co.dm.model.customer.PricingControl pricingControlFromDB : pricingControlsFromDB) {
			PricingControl pricingControl = new PricingControl();
			pricingControl.setProductId(pricingControlFromDB.getProductId());
			pricingControl.setProductDesc(pricingControlFromDB.getProductDes());
			pricingControl.setPricingSchemeId(pricingControlFromDB.getPricingSchemeId());
			pricingControl.setPricingSchemeDesc(pricingControlFromDB.getPricingSchemeDes());
			pricingControlList.add(pricingControl);
		}
		return pricingControlList;
	}
	
	public static List<RebateProfile> convertRebateProfile(List<nz.co.dm.model.customer.RebateProfile> rebateProfilesFromDB) throws Exception {
		List<RebateProfile> rebateProfileList = new ArrayList<>();
		for (nz.co.dm.model.customer.RebateProfile rebateProfileFromDB : rebateProfilesFromDB) {
			RebateProfile rebateProfile = new RebateProfile();
			rebateProfile.setUser(rebateProfileFromDB.getRebateUser());
			nz.co.dm.model.customer.Profile profileFromDB = rebateProfileFromDB.getProfile();
			rebateProfile = addProfileDetails(rebateProfile, convertProfile(profileFromDB));
			rebateProfile.getRebates().addAll(convertRebate(rebateProfileFromDB.getRebates()));
			rebateProfileList.add(rebateProfile);
		}
		return rebateProfileList;
	}
	
	public static List<RebateContribution> convertRebateContribution(List<nz.co.dm.model.customer.RebateContribution> rebateContributionsFromDB) {
		List<RebateContribution> rebateContributionList = new ArrayList<>();
		for (nz.co.dm.model.customer.RebateContribution rebateContributionFromDB : rebateContributionsFromDB) {
			RebateContribution rebateContribution = new RebateContribution();
			rebateContribution.setMemberType(rebateContributionFromDB.getMemberTypeDescription());
			rebateContribution.setMemberNo(rebateContributionFromDB.getMemberNo());
			rebateContribution.setPercentage(rebateContributionFromDB.getPercentage());
			rebateContributionList.add(rebateContribution);
		}
		return rebateContributionList;
	}
	
	public static MerchAgrmntValue convertMerchAgrmntValue(nz.co.dm.model.customer.MerchAgrmntValue merchAgrmntValueFromDB) {
		MerchAgrmntValue merchAgrmntValue = new MerchAgrmntValue();
		merchAgrmntValue.setDescription(merchAgrmntValueFromDB.getDescription());
		merchAgrmntValue.setExternalCode(merchAgrmntValueFromDB.getExternalCode());
		MerchAgrmntValueType merchAgrmntValueType = new MerchAgrmntValueType();
		merchAgrmntValueType.setDescription(merchAgrmntValueFromDB.getMerchAgrmntValueTypeDes());
		merchAgrmntValueType.setMerchAgrmntValueNo(merchAgrmntValueFromDB.getMerchAgrmntValueNo());
		merchAgrmntValue.setMerchAgrmntValueType(merchAgrmntValueType);
		return merchAgrmntValue;
	}
	
	public static List<Rebate> convertRebate(List<nz.co.dm.model.customer.Rebate> rebatesFromDB) throws Exception {
		List<Rebate> rebateList = new ArrayList<>();
		for (nz.co.dm.model.customer.Rebate rebateFromDB : rebatesFromDB) {
			Rebate rebate = new Rebate();
			rebate.setDescription(rebateFromDB.getDescription());
			rebate.setRebateCategoryDesc(rebateFromDB.getRebateCategoryDes());
			LocalDate effectiveOn = rebateFromDB.getEffectiveOn();
			rebate.setEffectiveOn(effectiveOn != null ? convertToXMLDate(effectiveOn) : null);
			LocalDate expiresOn = rebateFromDB.getExpiresOn();
			rebate.setExpiresOn(expiresOn != null ? convertToXMLDate(expiresOn) : null);
			rebate.setProductName(rebateFromDB.getProductName());
			rebate.setProductGroupName(rebateFromDB.getProductGroupName());
			rebate.setProductGroupTypeDescription(rebateFromDB.getProductGroupTypeDes());
			rebate.setExternalClientCode(rebateFromDB.getExternalClientCode());
			rebate.setThirdPartyCustomerNumber(rebateFromDB.getThirdPartyCustomerNo());
			rebate.setMemberType(rebateFromDB.getMemberTypeDescription());
			rebate.setMemberNo(rebateFromDB.getMemberNo());
			Long currentClientMid = rebateFromDB.getCurrentClientMid();
			rebate.setCurrentClientMid(currentClientMid != null ? currentClientMid : null);
			rebate.setCurrentClientName(rebateFromDB.getCurrentClientName());
			rebate.setCurrentCardProgramDescription(rebateFromDB.getCurrentCardProgramDes());
			nz.co.dm.model.customer.MerchAgrmntValue merchAgrmntValueFromDB = rebateFromDB.getMerchAgrmntValue();
			rebate.setMerchAgrmntValue(merchAgrmntValueFromDB != null ? convertMerchAgrmntValue(merchAgrmntValueFromDB) : null);
			rebate.getRebateValues().addAll(convertRebateValue(rebateFromDB.getRebateValues()));
			rebate.getRebateContributions().addAll(convertRebateContribution(rebateFromDB.getRebateContributions()));
			rebateList.add(rebate);
		}
		return rebateList;
	}
	
	public static List<RebateValue> convertRebateValue(List<nz.co.dm.model.customer.RebateValue> rebateValuesFromDB) {
		List<RebateValue>  rebateValueList = new ArrayList<>();
		for (nz.co.dm.model.customer.RebateValue rebateValueFromDB : rebateValuesFromDB) {
			RebateValue rebateValue = new RebateValue();
			rebateValue.setRate(rebateValueFromDB.getRate());
			rebateValue.setValueRangeFrom(rebateValueFromDB.getValueRangeFrom());
			rebateValue.setValueRangeTo(rebateValueFromDB.getValueRangeTo());
			rebateValueList.add(rebateValue);
		}
		return rebateValueList;
	}
	
	public static List<Hierarchy> convertHierarchy(List<nz.co.dm.model.customer.Hierarchy> hierarchiesFromDB) throws Exception {
		List<Hierarchy> hierarchyList = new ArrayList<>();
		for (nz.co.dm.model.customer.Hierarchy hierarchyFromDB :  hierarchiesFromDB) {
			Hierarchy hierarchy = new Hierarchy();
			hierarchy.setDescription(hierarchyFromDB.getDescription());
			hierarchy.setIsMerchAgreeemntAndReports(hierarchyFromDB.isMerchAgreeemntReport());
			hierarchy.setIsLocation(hierarchyFromDB.isLocation());
			hierarchy.setIsCustomerReports(hierarchyFromDB.isCustomerReport());
			hierarchy.setIsCustomerFinancial(hierarchyFromDB.isCustomerFinancial());
			hierarchy.setIsFundsTransfer(hierarchyFromDB.isFundTransfer());
			hierarchy.setIsCustomerCreditLimit(hierarchyFromDB.isCustomerCreditLimit());
			hierarchy.setIsPeriodRebate(hierarchyFromDB.isPeriodRebate());
			hierarchy.setParentSearchNumber(hierarchyFromDB.getParentSearchNumber());
			hierarchy.setEnforceCreation(hierarchyFromDB.isEnforceCreation());
			hierarchy.setEnforceFinancialHierarchyCreation(hierarchyFromDB.isEnforceFinanHieCreation());
			hierarchy.getRelationshipAssignments().addAll(convertRelationshipAssignment(hierarchyFromDB.getRelationshipAssignments()));
			hierarchy.getReportAssignments().addAll(convertReportAssignment(hierarchyFromDB.getReportAssignments()));
			hierarchyList.add(hierarchy);
		}
		return hierarchyList;
	}
	
	public static List<RelationshipAssignment> convertRelationshipAssignment(List<nz.co.dm.model.customer.RelationshipAssignment> relationshipAssignmentsFromDB) throws Exception {
		List<RelationshipAssignment> relationshipAssignmentList = new ArrayList<>();
		for (nz.co.dm.model.customer.RelationshipAssignment relationshipAssignmentFromDB : relationshipAssignmentsFromDB) {
			RelationshipAssignment relationshipAssignment = new RelationshipAssignment();
			LocalDate effectiveOn = relationshipAssignmentFromDB.getEffectiveOn();
			relationshipAssignment.setEffectiveOn(effectiveOn != null ? convertToXMLDate(effectiveOn) : null);
			LocalDate expiresOn = relationshipAssignmentFromDB.getExpiresOn();
			relationshipAssignment.setExpiresOn(expiresOn != null ? convertToXMLDate(expiresOn) : null);
			relationshipAssignment.setIsBillingEntity(relationshipAssignmentFromDB.isBillingEntity());
			relationshipAssignment.setIsBalanceEntity(relationshipAssignmentFromDB.isBalanceEntity());
			relationshipAssignment.setIsAuthorisationEntity(relationshipAssignmentFromDB.isAuthorisationEntity());
			relationshipAssignment.setIsPayerEntity(relationshipAssignmentFromDB.isPayerEntity());
			relationshipAssignmentList.add(relationshipAssignment);
		}
		return relationshipAssignmentList;
	}
	
	public static List<ReportAssignment> convertReportAssignment(List<nz.co.dm.model.customer.ReportAssignment> reportAssignmentsFromDB) throws Exception {
		List<ReportAssignment> reportAssignmentList = new ArrayList<>();
		for (nz.co.dm.model.customer.ReportAssignment reportAssignmentFromDB : reportAssignmentsFromDB) {
			ReportAssignment reportAssignment = new ReportAssignment();
			reportAssignment.setReportTypeDescription(reportAssignmentFromDB.getReportTypeDescription());
			reportAssignment.setFrequencyDescription(reportAssignmentFromDB.getFrequencyDescription());
			reportAssignment.setDeliveryTypeDescription(reportAssignmentFromDB.getDeliveryTypeDescription());
			LocalDate createdOn = reportAssignmentFromDB.getCreatedOn();
			reportAssignment.setCreatedOn(createdOn != null ? convertToXMLDate(createdOn) : null);
			LocalDate lastReportedOn = reportAssignmentFromDB.getLastReportedOn();
			reportAssignment.setLastReportedOn(lastReportedOn != null ? convertToXMLDate(lastReportedOn) : null);
			LocalDate previousReportedOn = reportAssignmentFromDB.getPreviousReportedOn();
			reportAssignment.setPreviousReportedOn(previousReportedOn != null ? convertToXMLDate(previousReportedOn) : null);
			reportAssignment.setIsPullCodeUsed(reportAssignmentFromDB.isPullCodeUsed());
			reportAssignment.setIsEnabled(reportAssignmentFromDB.isEnabled());
			reportAssignment.setIsAdhocReport(reportAssignmentFromDB.isAdhocReport());
			reportAssignment.setIsInternetUser(reportAssignmentFromDB.isInternetUser());
			reportAssignment.setIsCardDetailsRequired(reportAssignmentFromDB.isCardDetailsRequired());
			reportAssignment.setIsAttachmentCompressed(reportAssignmentFromDB.isAttachmentCompressed());
			reportAssignment.setContactHierarchyDescription(reportAssignmentFromDB.getContactHierarchyDescription());
			reportAssignment.setDescription(reportAssignmentFromDB.getDescription());
			reportAssignment.setEmailAddress(reportAssignmentFromDB.getEmailAddress());
			reportAssignment.setMemberType(reportAssignmentFromDB.getMemberTypeDescription());
			reportAssignment.setFeeDescription(convertToOidDescription(reportAssignmentFromDB.getFeeDescription()));
			reportAssignment.setSortOptionDescription(convertToOidDescription(reportAssignmentFromDB.getSortOptionDescription()));
			reportAssignmentList.add(reportAssignment);
		}
		return reportAssignmentList;
	}
	
	public static List<ApplicationCardOffer> convertApplicationCardOffer(List<nz.co.dm.model.customer.ApplicationCardOffer> applicationCardOffersFromDB) {
		List<ApplicationCardOffer> applicationCardOfferList = new ArrayList<>();
		for (nz.co.dm.model.customer.ApplicationCardOffer applicationCardOfferFromDB : applicationCardOffersFromDB) {
			ApplicationCardOffer applicationCardOffer = new ApplicationCardOffer();
			applicationCardOffer.setCardOfferDescription(applicationCardOfferFromDB.getCardOfferDescription());
			applicationCardOffer.setInitialCardStatusDescription(applicationCardOfferFromDB.getInitialCardStatusDescription());
			applicationCardOffer.setIsCardInitialCardStatusOverride(applicationCardOfferFromDB.isInitCardStatusOverride());
			applicationCardOffer.setIsCardReqValidationRule(applicationCardOfferFromDB.isCardReqValidationRule());
			applicationCardOffer.setExtEmbosserCustomerRef(applicationCardOfferFromDB.getExtEmbosserCustomerRef());
			nz.co.dm.model.customer.CardProduct cardProduct = applicationCardOfferFromDB.getCardProduct();
			applicationCardOffer.setCardProduct(cardProduct != null ? convertCardProduct(cardProduct) : null);
			applicationCardOfferList.add(applicationCardOffer);
		}
		return applicationCardOfferList;
	}
	
	public static List<CardNumberSeries> convertCardNumberSeries(List<nz.co.dm.model.customer.CardNumberSeries> cardNumberSeriessFromDB) {
		List<CardNumberSeries> cardNumberSeriesList = new ArrayList<>();
		for (nz.co.dm.model.customer.CardNumberSeries cardNumberSeriesFromDB : cardNumberSeriessFromDB) {
			CardNumberSeries cardNumberSeries = new CardNumberSeries();
			cardNumberSeries.setSeriesNumber(cardNumberSeriesFromDB.getSeriesNumber());
			cardNumberSeries.setSequenceNumber(cardNumberSeriesFromDB.getSequenceNumber());
			cardNumberSeriesList.add(cardNumberSeries);
		}
		return cardNumberSeriesList;
	}
	
	public static List<DiaryNote> convertDiaryNote(List<nz.co.dm.model.customer.DiaryNote> diaryNotesFromDB) throws Exception {
		List<DiaryNote> diaryNoteList = new ArrayList<>();
		for (nz.co.dm.model.customer.DiaryNote diaryNoteFromDB : diaryNotesFromDB) {
			DiaryNote diaryNote = new DiaryNote();
			diaryNote.setShortNote(diaryNoteFromDB.getShortNote());
			diaryNote.setDetailedNote(diaryNoteFromDB.getDetailedNote());
			LocalDateTime bringUpAt = diaryNoteFromDB.getBringUpAt();
			diaryNote.setBringUpAt(bringUpAt != null ? convertToXMLDate(bringUpAt) : null);
			diaryNote.setIsHighPriority(diaryNoteFromDB.isHighPriority());
			WorkQueue workQueue = new WorkQueue();
			workQueue.setClientMid(diaryNoteFromDB.getWorkQueueCientMid());
			workQueue.setExternalCode(diaryNoteFromDB.getWorkQueueExternalCode());
			workQueue.setDescription(diaryNoteFromDB.getWorkQueueDescription());
			diaryNote.setWorkQueue(workQueue);
			diaryNoteList.add(diaryNote);
		}
		return diaryNoteList;
	}
	
	public static List<TaxNumbers> convertTaxNumber(List<nz.co.dm.model.customer.TaxNumber> taxNumbersFromDB) throws Exception {
		List<TaxNumbers>  taxNumberList = new ArrayList<>();
		for (nz.co.dm.model.customer.TaxNumber taxNumberFromDB : taxNumbersFromDB) {
			TaxNumbers taxNumber = new TaxNumbers();
			taxNumber.setCountryCode(taxNumberFromDB.getCountryCode());
			taxNumber.setTaxNo(taxNumberFromDB.getTaxNo());
			taxNumber.setMemberNo(taxNumberFromDB.getMemberNo());
			taxNumber.setMemberTypeDescription(convertToOidDescription(taxNumberFromDB.getMemberTypeDescription()));
			LocalDate effectiveOn = taxNumberFromDB.getEffectiveOn();
			taxNumber.setEffectiveOn(effectiveOn != null ? convertToXMLDate(effectiveOn) : null);
			LocalDate expiresOn = taxNumberFromDB.getExpiresOn();
			taxNumber.setExpiresOn(expiresOn != null ? convertToXMLDate(expiresOn) : null);
			taxNumber.setTaxTypeDescription(convertToOidDescription(taxNumberFromDB.getTaxTypeDescription()));
			taxNumber.setTaxNoRegTypeDescription(convertToOidDescription(taxNumberFromDB.getTaxNoRegTypeDescription()));
			taxNumber.setIsRecoveryByAgency(taxNumberFromDB.isRecoveryByAgency());
			nz.co.dm.model.customer.Contact contact = taxNumberFromDB.getContact();
			List<nz.co.dm.model.customer.Contact> contactList = new ArrayList<>();
			contactList.add(contact);			
			taxNumber.setContact(contact != null ? convertContact(contactList).get(0) : null);
			taxNumberList.add(taxNumber);
		}
		return taxNumberList;
	}
	
	public static List<TaxStatus> convertTaxStatus(List<nz.co.dm.model.customer.TaxStatus> taxStatusesFromDB) throws Exception {
		List<TaxStatus>  taxStatusList = new ArrayList<>();
		for (nz.co.dm.model.customer.TaxStatus taxStatusFromDB : taxStatusesFromDB) {
			TaxStatus taxStatus = new TaxStatus();
			taxStatus.setTaxTypeDescription(taxStatusFromDB.getTaxTypeDescription());
			taxStatus.setStatusDescription(taxStatusFromDB.getStatusDescription());
			taxStatus.setStatusExternalCode(taxStatusFromDB.getStatusExternalCode());
			LocalDate effectiveOn = taxStatusFromDB.getEffectiveOn();
			taxStatus.setEffectiveOn(effectiveOn != null ? convertToXMLDate(effectiveOn) : null);
			LocalDate expiresOn = taxStatusFromDB.getExpiresOn();
			taxStatus.setExpiresOn(expiresOn != null ? convertToXMLDate(expiresOn) : null);
			taxStatusList.add(taxStatus);
		}
		return taxStatusList;
	}
	
	public static List<DefaultPricingProfile> convertDefaultPricingProfile(List<nz.co.dm.model.customer.DefaultPricingProfile> defaultPricingProfilesFromDB) throws Exception {
		List<DefaultPricingProfile> defaultPricingProfileList = new  ArrayList<>();
		for (nz.co.dm.model.customer.DefaultPricingProfile defaultPricingProfileFromDB : defaultPricingProfilesFromDB) {
			DefaultPricingProfile defaultPricingProfile = new DefaultPricingProfile();
			defaultPricingProfile.setClientMid(defaultPricingProfileFromDB.getClientMid());
			defaultPricingProfile.setClientName(defaultPricingProfileFromDB.getClientName());
			defaultPricingProfile.setMerchantAgreementValueNo(defaultPricingProfileFromDB.getMerchantAgreementValueNo());
			defaultPricingProfile.setMerchantAgreementValueDescription(defaultPricingProfileFromDB.getMerchantAgreementValueDes());
			defaultPricingProfile.setMerchantAgreementValueTypeDescription(defaultPricingProfileFromDB.getMerchantAgreementValueTypeDes());
			defaultPricingProfile.setProductGroupDescription(defaultPricingProfileFromDB.getProductGroupDescription());
			defaultPricingProfile.setProductGroupTypeDescription(defaultPricingProfileFromDB.getProductGroupTypeDescription());
			defaultPricingProfile.setProductGroupExternalClientCode(defaultPricingProfileFromDB.getProductGroupExtClientCode());
			defaultPricingProfile.setCardProductGroupDescription(defaultPricingProfileFromDB.getCardProductGroupDescription());
			defaultPricingProfile.setCardProductGroupExternalCode(defaultPricingProfileFromDB.getCardProductGroupExternalCode());
			nz.co.dm.model.customer.PricingProfile pricingProfileFromDB = defaultPricingProfileFromDB.getPricingProfile();
			List<nz.co.dm.model.customer.PricingProfile> pricingProfileList = new ArrayList<>();
			pricingProfileList.add(pricingProfileFromDB);			
			defaultPricingProfile.setPricingProfile(pricingProfileFromDB != null ? convertPricingProfile(pricingProfileList).get(0) : null);
			defaultPricingProfileList.add(defaultPricingProfile);
		}
		return defaultPricingProfileList;
	}
	
	public static List<EntitySpecification> convertEntitySpecification(List<nz.co.dm.model.customer.EntitySpecification> entitySpecificationsFromDB) {
		List<EntitySpecification> entitySpecificationList = new  ArrayList<>();
		for (nz.co.dm.model.customer.EntitySpecification entitySpecificationFromDB : entitySpecificationsFromDB) {
			EntitySpecification entitySpecification = new EntitySpecification();
			entitySpecification.setName(entitySpecificationFromDB.getName());
			entitySpecification.setEntityType(entitySpecificationFromDB.getEntityType());
			entitySpecification.getEntitySpecCharacteristic().addAll(convertEntitySpecCharacteristic(entitySpecificationFromDB.getEntitySpecCharacteristics()));
			entitySpecificationList.add(entitySpecification);
		}
		return entitySpecificationList;
	}
	
	public static List<EntitySpecCharacteristic> convertEntitySpecCharacteristic(List<nz.co.dm.model.customer.EntitySpecCharacteristic> entitySpecCharacteristicsFromDB) {
		List<EntitySpecCharacteristic> entitySpecCharacteristicList = new  ArrayList<>();
		for (nz.co.dm.model.customer.EntitySpecCharacteristic entitySpecCharacteristicFromDB : entitySpecCharacteristicsFromDB) {
			EntitySpecCharacteristic entitySpecCharacteristic = new EntitySpecCharacteristic();
			entitySpecCharacteristic.setCharacteristic(entitySpecCharacteristicFromDB.getCharacteristic());
			entitySpecCharacteristic.setCharacteristicValue(entitySpecCharacteristicFromDB.getCharacteristicValue());
			entitySpecCharacteristicList.add(entitySpecCharacteristic);
		}
		return entitySpecCharacteristicList;
	}
	
	public static List<AccountControlProfile> convertAccountControlProfile(List<nz.co.dm.model.customer.AccountControlProfile> accountControlProfilesFromDB) throws Exception  {
		List<AccountControlProfile> accountControlProfileList = new ArrayList<>();
		for(nz.co.dm.model.customer.AccountControlProfile accountControlProfileFromDB : accountControlProfilesFromDB) {
			AccountControlProfile accountControlProfile = new AccountControlProfile();
			nz.co.dm.model.customer.CardControl cardControl = accountControlProfileFromDB.getCardControl();
			accountControlProfile.setAccountControl(cardControl != null ? convertAccountControl(cardControl) : null);
			nz.co.dm.model.customer.Profile profileFromDB = accountControlProfileFromDB.getProfile();
			accountControlProfile = addProfileDetails(accountControlProfile, convertProfile(profileFromDB));
			accountControlProfileList.add(accountControlProfile);			
		}
		return accountControlProfileList;
	}

	public static AccountControl convertAccountControl(nz.co.dm.model.customer.CardControl cardControlFromDB) throws Exception {
		AccountControl accountControl = new AccountControl();
		accountControl.setExtVelocityProfileNumber(cardControlFromDB.getExtVelocityProfileNumber());
//		accountControl.setProductRestrictionDesc(convertToOidDescription(cardControlFromDB.getProductRestrictionDes()));
//		accountControl.setProductRestrictionCode(convertToOidDescription(cardControlFromDB.getProductRestrictionCode()));
//		accountControl.setProductRestrictionCardOfferDesc(cardControlFromDB.getProductRestrictionCardOfferDes());
//		accountControl.setTimeLimitDesc(convertToOidDescription(cardControlFromDB.getTimeLimitDes()));
//		accountControl.setTimeLimitCode(convertToOidDescription(cardControlFromDB.getTimeLimitCode()));
		accountControl.setLocationRestrictionType(cardControlFromDB.getLocationRestrictionType());
		accountControl.setLocationRestrictionDescription(convertToOidDescription(cardControlFromDB.getLocationRestrictionDes()));
		accountControl.setIsErrorProdRestColl(cardControlFromDB.isErrorProdRestColl());
		accountControl.setIsErrorProdRestAuth(cardControlFromDB.isErrorProdRestAuth());
		accountControl.setIsErrorTimeLimtColl(cardControlFromDB.isErrorTimeLimitColl());
		accountControl.setIsErrorTimeLimtAuth(cardControlFromDB.isErrorTimeLimitAuth());
		accountControl.setIsErrorLocRestricColl(cardControlFromDB.isErrorLocRestricColl());
		accountControl.setIsErrorLocRestricAuth(cardControlFromDB.isErrorLocRestricAuth());
		accountControl.setIsVehicleIdReq(cardControlFromDB.isVehicleIdReq());
		accountControl.setIsOrderNumberReq(cardControlFromDB.isOrderNumberReq());
		accountControl.setIsDriverIdReq(cardControlFromDB.isDriverIdReq());
		accountControl.setIsFleetIdReq(cardControlFromDB.isFleetIdReq());
		accountControl.setIsCustomerSelectionReq(cardControlFromDB.isCustomerSelectionReq());
		accountControl.setIsOdometerReq(cardControlFromDB.isOdoMeterReq());
		accountControl.setIsOdometerValidation(cardControlFromDB.isOdoMeterValidation());
		accountControl.setIsPosPinChangeAllowed(cardControlFromDB.isPosPinChangeAllowed());
		LocalDate effectiveOn = cardControlFromDB.getEffectiveOn();
		accountControl.setEffectiveOn(effectiveOn != null ? convertToXMLDate(effectiveOn) : null);
		LocalDate expiresOn = cardControlFromDB.getExpiresOn();
		accountControl.setExpiresOn(expiresOn != null ? convertToXMLDate(expiresOn) : null);
		accountControl.getVelocityTypeValues().addAll(convertVelocityTypeValue(cardControlFromDB.getVelocityTypeValues()));
		return accountControl;
	}

	public static OidDescription convertToOidDescription(String value) {
		if (value == null) return null;
		OidDescription oidDescription = new OidDescription();
		oidDescription.setValue(value);
		return oidDescription;
	}
}
