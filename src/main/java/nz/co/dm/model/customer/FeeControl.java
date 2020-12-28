package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "FeeControl")
@Table(name = "dm_fee_controls")
public class FeeControl {
	
	@Id
	@Column(name = "fee_control_oid")
	private Long feeControlOid;
	
	@Column(name = "fee_description")
	private String feeDescription;
	
	@Column(name = "msf_description")
	private String msfDescription;
	
	@Column(name = "initial_delay_months")
	private Long initialDelayMonths;
	
	@Column(name = "is_fee_charged")
    private boolean isFeeCharged;
    
	@Column(name = "apply_months")
	private Long applyMonths;

	public Long getFeeControlOid() {
		return feeControlOid;
	}

	public void setFeeControlOid(Long feeControlOid) {
		this.feeControlOid = feeControlOid;
	}

	public String getFeeDescription() {
		return feeDescription;
	}

	public void setFeeDescription(String feeDescription) {
		this.feeDescription = feeDescription;
	}

	public String getMsfDescription() {
		return msfDescription;
	}

	public void setMsfDescription(String msfDescription) {
		this.msfDescription = msfDescription;
	}

	public Long getInitialDelayMonths() {
		return initialDelayMonths;
	}

	public void setInitialDelayMonths(Long initialDelayMonths) {
		this.initialDelayMonths = initialDelayMonths;
	}

	public boolean isFeeCharged() {
		return isFeeCharged;
	}

	public void setFeeCharged(boolean isFeeCharged) {
		this.isFeeCharged = isFeeCharged;
	}

	public Long getApplyMonths() {
		return applyMonths;
	}

	public void setApplyMonths(Long applyMonths) {
		this.applyMonths = applyMonths;
	}	
}
