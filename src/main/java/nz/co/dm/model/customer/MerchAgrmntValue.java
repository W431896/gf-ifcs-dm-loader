package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "MerchAgrmntValue")
@Table(name = "dm_merch_agrmnt_values")
public class MerchAgrmntValue {
	
	@Id
	@Column(name = "merch_agrmnt_value_oid")
	private Long merchAgrmntValueOid;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "external_code")
	private String externalCode;
	
	@Column(name = "merch_agrmnt_value_type_des")
	private String merchAgrmntValueTypeDes;
	
	@Column(name = "merch_agrmnt_value_no")
	private String merchAgrmntValueNo;

	public Long getMerchAgrmntValueOid() {
		return merchAgrmntValueOid;
	}

	public void setMerchAgrmntValueOid(Long merchAgrmntValueOid) {
		this.merchAgrmntValueOid = merchAgrmntValueOid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExternalCode() {
		return externalCode;
	}

	public void setExternalCode(String externalCode) {
		this.externalCode = externalCode;
	}

	public String getMerchAgrmntValueTypeDes() {
		return merchAgrmntValueTypeDes;
	}

	public void setMerchAgrmntValueTypeDes(String merchAgrmntValueTypeDes) {
		this.merchAgrmntValueTypeDes = merchAgrmntValueTypeDes;
	}

	public String getMerchAgrmntValueNo() {
		return merchAgrmntValueNo;
	}

	public void setMerchAgrmntValueNo(String merchAgrmntValueNo) {
		this.merchAgrmntValueNo = merchAgrmntValueNo;
	}
}
