package nz.co.dm.model.customer;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "RebateContribution")
@Table(name = "dm_rebate_contributions")
public class RebateContribution {
	
	@Id
	@Column(name = "rebate_contribution_oid")
	private Long rebateContributionOid;
	
	@Column(name = "member_type_description")
	private String memberTypeDescription;
    
	@Column(name = "member_no")
	private String memberNo;
	
	@Column(name = "percentage")
	private BigDecimal percentage;

	public Long getRebateContributionOid() {
		return rebateContributionOid;
	}

	public void setRebateContributionOid(Long rebateContributionOid) {
		this.rebateContributionOid = rebateContributionOid;
	}

	public String getMemberTypeDescription() {
		return memberTypeDescription;
	}

	public void setMemberTypeDescription(String memberTypeDescription) {
		this.memberTypeDescription = memberTypeDescription;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}
}
