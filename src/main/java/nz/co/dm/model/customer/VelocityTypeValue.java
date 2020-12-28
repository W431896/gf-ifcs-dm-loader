package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "VelocityTypeValue")
@Table(name = "dm_velocity_type_values")
public class VelocityTypeValue {
	
	@Id
	@Column(name = "velocity_type_value_oid")
	private Long velocityTypeValueOid;
	
	@Column(name = "type_column_name")
	private String typeColumnName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "is_error_type_auth")
	private boolean isErrorTypeAuth;
	
	@Column(name = "is_error_type_collect")
	private boolean isErrorTypeCollect;

	public Long getVelocityTypeValueOid() {
		return velocityTypeValueOid;
	}

	public void setVelocityTypeValueOid(Long velocityTypeValueOid) {
		this.velocityTypeValueOid = velocityTypeValueOid;
	}

	public String getTypeColumnName() {
		return typeColumnName;
	}

	public void setTypeColumnName(String typeColumnName) {
		this.typeColumnName = typeColumnName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isErrorTypeAuth() {
		return isErrorTypeAuth;
	}

	public void setErrorTypeAuth(boolean isErrorTypeAuth) {
		this.isErrorTypeAuth = isErrorTypeAuth;
	}

	public boolean isErrorTypeCollect() {
		return isErrorTypeCollect;
	}

	public void setErrorTypeCollect(boolean isErrorTypeCollect) {
		this.isErrorTypeCollect = isErrorTypeCollect;
	}
}
