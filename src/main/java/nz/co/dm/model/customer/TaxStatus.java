package nz.co.dm.model.customer;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TaxStatus")
@Table(name = "dm_tax_status")
public class TaxStatus {
	
	@Id
	@Column(name = "tax_status_oid")
	private Long taxStatusOid;
	
	@Column(name = "tax_type_description")
	private String taxTypeDescription;
	
	@Column(name = "status_description")
	private String statusDescription;
	
	@Column(name = "status_external_code")
	private String statusExternalCode;
	
	@Column(name = "effective_on")
	private LocalDate effectiveOn;
	
	@Column(name = "expires_on")
	private LocalDate expiresOn;

	public Long getTaxStatusOid() {
		return taxStatusOid;
	}

	public void setTaxStatusOid(Long taxStatusOid) {
		this.taxStatusOid = taxStatusOid;
	}

	public String getTaxTypeDescription() {
		return taxTypeDescription;
	}

	public void setTaxTypeDescription(String taxTypeDescription) {
		this.taxTypeDescription = taxTypeDescription;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getStatusExternalCode() {
		return statusExternalCode;
	}

	public void setStatusExternalCode(String statusExternalCode) {
		this.statusExternalCode = statusExternalCode;
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
}
