package nz.co.dm.model.customer;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "AccountStatusLog")
@Table(name = "dm_account_status_logs")
public class AccountStatusLog {
	
	@Id
	@Column(name = "account_status_log_oid")
	private Long accountStatusLogOid;

    @Column(name = "account_status_code")
    private String accountStatusCode;
    
    @Column(name = "account_status_des")
    private String accountStatusDes;
    
    @Column(name = "account_sub_status_des")
    private String accountSubStatusDes;
    
	@Column(name = "effective_at")
	private LocalDateTime effectiveAt;
    
	@Column(name = "expires_at")
	private LocalDateTime expiresAt;

	public Long getAccountStatusLogOid() {
		return accountStatusLogOid;
	}

	public void setAccountStatusLogOid(Long accountStatusLogOid) {
		this.accountStatusLogOid = accountStatusLogOid;
	}

	public String getAccountStatusCode() {
		return accountStatusCode;
	}

	public void setAccountStatusCode(String accountStatusCode) {
		this.accountStatusCode = accountStatusCode;
	}

	public String getAccountStatusDes() {
		return accountStatusDes;
	}

	public void setAccountStatusDes(String accountStatusDes) {
		this.accountStatusDes = accountStatusDes;
	}

	public String getAccountSubStatusDes() {
		return accountSubStatusDes;
	}

	public void setAccountSubStatusDes(String accountSubStatusDes) {
		this.accountSubStatusDes = accountSubStatusDes;
	}

	public LocalDateTime getEffectiveAt() {
		return effectiveAt;
	}

	public void setEffectiveAt(LocalDateTime effectiveAt) {
		this.effectiveAt = effectiveAt;
	}

	public LocalDateTime getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(LocalDateTime expiresAt) {
		this.expiresAt = expiresAt;
	}
}
