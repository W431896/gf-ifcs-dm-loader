package nz.co.dm.model.customer;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "BankAccount")
@Table(name = "dm_bank_accounts")
public class BankAccount {
	
	@Id
	@Column(name = "bank_account_oid")
	private Long bankAccountOid;
	
    @Column(name = "bank_no")
    private String bankNo;
    
    @Column(name = "bank_name")
    private String bankName;
    
    @Column(name = "bank_branch_no")
    private String bankBranchNo;
    
    @Column(name = "bank_account_no")
    private String bankAccountNo;
    
    @Column(name = "bank_account_name")
    private String bankAccountName;
    
    @Column(name = "bic")
    private String bic;
    
    @Column(name = "swift_code")
    private String swiftCode;
    
    @Column(name = "iban")
    private String iban;
    
    @Column(name = "umr_no")
    private String umrNo;
    
	@Column(name = "created_on")
	private LocalDate createdOn;
	
	@Column(name = "letter_on")
	private LocalDate letterOn;

	public Long getBankAccountOid() {
		return bankAccountOid;
	}

	public void setBankAccountOid(Long bankAccountOid) {
		this.bankAccountOid = bankAccountOid;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranchNo() {
		return bankBranchNo;
	}

	public void setBankBranchNo(String bankBranchNo) {
		this.bankBranchNo = bankBranchNo;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getUmrNo() {
		return umrNo;
	}

	public void setUmrNo(String umrNo) {
		this.umrNo = umrNo;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getLetterOn() {
		return letterOn;
	}

	public void setLetterOn(LocalDate letterOn) {
		this.letterOn = letterOn;
	}	
}
