package nz.co.dm.model.customer;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Hierarchy")
@Table(name = "dm_hierarchies")
public class Hierarchy {
	
	@Id
	@Column(name = "hierarchy_oid")
	private Long hierarchyOid;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "is_merch_agreeemnt_report")
	private boolean isMerchAgreeemntReport;
    
	@Column(name = "is_location")
	private boolean isLocation;
	
	@Column(name = "is_customer_report")
	private boolean isCustomerReport;
	
	@Column(name = "is_customer_financial")
	private boolean isCustomerFinancial;
	
	@Column(name = "is_fund_transfer")
	private boolean isFundTransfer;
	
	@Column(name = "is_customer_credit_limit")
	private boolean isCustomerCreditLimit;
	
	@Column(name = "is_period_rebate")
	private boolean isPeriodRebate;
	
	@Column(name = "parent_search_number")
	private String parentSearchNumber;
	
	@Column(name = "is_enforce_creation")
	private boolean isEnforceCreation;
	
	@Column(name = "is_enforce_finan_hie_creation")
	private boolean isEnforceFinanHieCreation;
	
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="hierarchy_oid")
    private List<RelationshipAssignment> relationshipAssignments;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="hierarchy_oid")
    private List<ReportAssignment> reportAssignments;

	public Long getHierarchyOid() {
		return hierarchyOid;
	}

	public void setHierarchyOid(Long hierarchyOid) {
		this.hierarchyOid = hierarchyOid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isMerchAgreeemntReport() {
		return isMerchAgreeemntReport;
	}

	public void setMerchAgreeemntReport(boolean isMerchAgreeemntReport) {
		this.isMerchAgreeemntReport = isMerchAgreeemntReport;
	}

	public boolean isLocation() {
		return isLocation;
	}

	public void setLocation(boolean isLocation) {
		this.isLocation = isLocation;
	}

	public boolean isCustomerReport() {
		return isCustomerReport;
	}

	public void setCustomerReport(boolean isCustomerReport) {
		this.isCustomerReport = isCustomerReport;
	}

	public boolean isCustomerFinancial() {
		return isCustomerFinancial;
	}

	public void setCustomerFinancial(boolean isCustomerFinancial) {
		this.isCustomerFinancial = isCustomerFinancial;
	}

	public boolean isFundTransfer() {
		return isFundTransfer;
	}

	public void setFundTransfer(boolean isFundTransfer) {
		this.isFundTransfer = isFundTransfer;
	}

	public boolean isCustomerCreditLimit() {
		return isCustomerCreditLimit;
	}

	public void setCustomerCreditLimit(boolean isCustomerCreditLimit) {
		this.isCustomerCreditLimit = isCustomerCreditLimit;
	}

	public boolean isPeriodRebate() {
		return isPeriodRebate;
	}

	public void setPeriodRebate(boolean isPeriodRebate) {
		this.isPeriodRebate = isPeriodRebate;
	}

	public String getParentSearchNumber() {
		return parentSearchNumber;
	}

	public void setParentSearchNumber(String parentSearchNumber) {
		this.parentSearchNumber = parentSearchNumber;
	}

	public boolean isEnforceCreation() {
		return isEnforceCreation;
	}

	public void setEnforceCreation(boolean isEnforceCreation) {
		this.isEnforceCreation = isEnforceCreation;
	}

	public boolean isEnforceFinanHieCreation() {
		return isEnforceFinanHieCreation;
	}

	public void setEnforceFinanHieCreation(boolean isEnforceFinanHieCreation) {
		this.isEnforceFinanHieCreation = isEnforceFinanHieCreation;
	}

	public List<RelationshipAssignment> getRelationshipAssignments() {
		return relationshipAssignments;
	}

	public void setRelationshipAssignments(List<RelationshipAssignment> relationshipAssignments) {
		this.relationshipAssignments = relationshipAssignments;
	}

	public List<ReportAssignment> getReportAssignments() {
		return reportAssignments;
	}

	public void setReportAssignments(List<ReportAssignment> reportAssignments) {
		this.reportAssignments = reportAssignments;
	}	
}
