package nz.co.dm.model.customer;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "RelationshipAssignment")
@Table(name = "dm_relationship_assignments")
public class RelationshipAssignment {
	
	@Id
	@Column(name = "relationship_assignment_oid")
	private Long relationshipAssignmentOid;
	
	@Column(name = "effective_on")
	private LocalDate effectiveOn;
	
	@Column(name = "expires_on")
	private LocalDate expiresOn;
	
	@Column(name = "is_billing_entity")
	private boolean isBillingEntity;
	
	@Column(name = "is_balance_entity")
	private boolean isBalanceEntity;
	
	@Column(name = "is_authorisation_entity")
	private boolean isAuthorisationEntity;
	
	@Column(name = "is_payer_entity")
	private boolean isPayerEntity;

	public Long getRelationshipAssignmentOid() {
		return relationshipAssignmentOid;
	}

	public void setRelationshipAssignmentOid(Long relationshipAssignmentOid) {
		this.relationshipAssignmentOid = relationshipAssignmentOid;
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

	public boolean isBillingEntity() {
		return isBillingEntity;
	}

	public void setBillingEntity(boolean isBillingEntity) {
		this.isBillingEntity = isBillingEntity;
	}

	public boolean isBalanceEntity() {
		return isBalanceEntity;
	}

	public void setBalanceEntity(boolean isBalanceEntity) {
		this.isBalanceEntity = isBalanceEntity;
	}

	public boolean isAuthorisationEntity() {
		return isAuthorisationEntity;
	}

	public void setAuthorisationEntity(boolean isAuthorisationEntity) {
		this.isAuthorisationEntity = isAuthorisationEntity;
	}

	public boolean isPayerEntity() {
		return isPayerEntity;
	}

	public void setPayerEntity(boolean isPayerEntity) {
		this.isPayerEntity = isPayerEntity;
	}
}
