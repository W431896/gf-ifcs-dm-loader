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

@Entity(name = "Account")
@Table(name = "dm_accounts")
public class Account {
	
	@Id
	@Column(name = "account_oid")
	private Long accountOid;
    
    @Column(name = "account_no")
    private String accountNo;
    
    @Column(name = "actual_balance")
    private BigDecimal actualBalance;
    
    @Column(name = "credit_limit")
    private BigDecimal creditLimit;
    
    @Column(name = "deposit_balance")
    private BigDecimal depositBalance;
    
    @Column(name = "external_account_code")
    private String externalAccountCode;
    
	@Column(name = "last_payment_made_on")
	private LocalDate lastPaymentMadeOn;
	
    @Column(name = "last_payment_amount")
    private BigDecimal lastPaymentAmount;
    
	@Column(name = "last_billed_on")
	private LocalDate lastBilledOn;
	
    @Column(name = "last_billed_amount")
    private BigDecimal lastBilledAmount;
    
	@Column(name = "opened_on")
	private LocalDate openedOn;
	
	@Column(name = "reinstated_on")
	private LocalDate reinstatedOn;
	
    @Column(name = "risk_grade_ext_code")
    private String riskGradeExtCode;
    
    @Column(name = "risk_grade_description")
    private String riskGradeDescription;
    
    @Column(name = "security_indicator")
    private String securityIndicator;
    
    @Column(name = "total_security_value")
    private BigDecimal totalSecurityValue;
    
    @Column(name = "trade_exposure_limit")
    private BigDecimal tradeExposureLimit;
    
	@Column(name = "closed_on")
	private LocalDate closedOn;
    
    @Column(name = "tax_no")
    private String taxNo;
    
    @Column(name = "temp_credit_amount")
    private BigDecimal tempCreditAmount;
    
    @Column(name = "temp_credit_reason_des")
    private String tempCreditReasonDes;
    
	@Column(name = "temp_credit_expires_on")
	private LocalDate tempCreditExpiresOn;
	
    @Column(name = "behavioural_score")
    private String behaviouralScore;
    
    @Column(name = "account_status_description")
    private String accountStatusDescription;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="account_oid")
    private List<AccountStatusLog> accountStatusLog;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="account_oid")
    private BankAccount bankAccount;

	public Long getAccountOid() {
		return accountOid;
	}

	public void setAccountOid(Long accountOid) {
		this.accountOid = accountOid;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getActualBalance() {
		return actualBalance;
	}

	public void setActualBalance(BigDecimal actualBalance) {
		this.actualBalance = actualBalance;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getDepositBalance() {
		return depositBalance;
	}

	public void setDepositBalance(BigDecimal depositBalance) {
		this.depositBalance = depositBalance;
	}

	public String getExternalAccountCode() {
		return externalAccountCode;
	}

	public void setExternalAccountCode(String externalAccountCode) {
		this.externalAccountCode = externalAccountCode;
	}

	public LocalDate getLastPaymentMadeOn() {
		return lastPaymentMadeOn;
	}

	public void setLastPaymentMadeOn(LocalDate lastPaymentMadeOn) {
		this.lastPaymentMadeOn = lastPaymentMadeOn;
	}

	public BigDecimal getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	public LocalDate getLastBilledOn() {
		return lastBilledOn;
	}

	public void setLastBilledOn(LocalDate lastBilledOn) {
		this.lastBilledOn = lastBilledOn;
	}

	public BigDecimal getLastBilledAmount() {
		return lastBilledAmount;
	}

	public void setLastBilledAmount(BigDecimal lastBilledAmount) {
		this.lastBilledAmount = lastBilledAmount;
	}

	public LocalDate getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(LocalDate openedOn) {
		this.openedOn = openedOn;
	}

	public LocalDate getReinstatedOn() {
		return reinstatedOn;
	}

	public void setReinstatedOn(LocalDate reinstatedOn) {
		this.reinstatedOn = reinstatedOn;
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

	public BigDecimal getTradeExposureLimit() {
		return tradeExposureLimit;
	}

	public void setTradeExposureLimit(BigDecimal tradeExposureLimit) {
		this.tradeExposureLimit = tradeExposureLimit;
	}

	public LocalDate getClosedOn() {
		return closedOn;
	}

	public void setClosedOn(LocalDate closedOn) {
		this.closedOn = closedOn;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public BigDecimal getTempCreditAmount() {
		return tempCreditAmount;
	}

	public void setTempCreditAmount(BigDecimal tempCreditAmount) {
		this.tempCreditAmount = tempCreditAmount;
	}

	public String getTempCreditReasonDes() {
		return tempCreditReasonDes;
	}

	public void setTempCreditReasonDes(String tempCreditReasonDes) {
		this.tempCreditReasonDes = tempCreditReasonDes;
	}

	public LocalDate getTempCreditExpiresOn() {
		return tempCreditExpiresOn;
	}

	public void setTempCreditExpiresOn(LocalDate tempCreditExpiresOn) {
		this.tempCreditExpiresOn = tempCreditExpiresOn;
	}

	public String getBehaviouralScore() {
		return behaviouralScore;
	}

	public void setBehaviouralScore(String behaviouralScore) {
		this.behaviouralScore = behaviouralScore;
	}

	public String getAccountStatusDescription() {
		return accountStatusDescription;
	}

	public void setAccountStatusDescription(String accountStatusDescription) {
		this.accountStatusDescription = accountStatusDescription;
	}

	public List<AccountStatusLog> getAccountStatusLog() {
		return accountStatusLog;
	}

	public void setAccountStatusLog(List<AccountStatusLog> accountStatusLog) {
		this.accountStatusLog = accountStatusLog;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
}
