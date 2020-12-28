package nz.co.dm.model.customer;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ReportAssignment")
@Table(name = "dm_report_assignments")
public class ReportAssignment {
	
	@Id
	@Column(name = "report_assignment_oid")
	private Long reportAssignmentOid;
	
	@Column(name = "report_type_description")
	private String reportTypeDescription;
	
	@Column(name = "frequency_description")
	private String frequencyDescription;
	
	@Column(name = "delivery_type_description")
	private String deliveryTypeDescription;
	
	@Column(name = "created_on")
	private LocalDate createdOn;
	
	@Column(name = "last_reported_on")
	private LocalDate lastReportedOn;
	
	@Column(name = "previous_reported_on")
	private LocalDate previousReportedOn;
	
	@Column(name = "is_pull_code_used")
	private boolean isPullCodeUsed;
	
	@Column(name = "is_enabled")
	private boolean isEnabled;
	
	@Column(name = "is_adhoc_report")
	private boolean isAdhocReport;
	
	@Column(name = "is_internet_user")
	private boolean isInternetUser;
	
	@Column(name = "is_card_details_required")
	private boolean isCardDetailsRequired;
	
	@Column(name = "is_attachment_compressed")
	private boolean isAttachmentCompressed;
	
	@Column(name = "contact_hierarchy_description")
	private String contactHierarchyDescription;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "email_address")
	private String emailAddress;
	
	@Column(name = "member_type_description")
	private String memberTypeDescription;
	
	@Column(name = "fee_description")
	private String feeDescription;
	
	@Column(name = "sort_option_description")
	private String sortOptionDescription;

	public Long getReportAssignmentOid() {
		return reportAssignmentOid;
	}

	public void setReportAssignmentOid(Long reportAssignmentOid) {
		this.reportAssignmentOid = reportAssignmentOid;
	}

	public String getReportTypeDescription() {
		return reportTypeDescription;
	}

	public void setReportTypeDescription(String reportTypeDescription) {
		this.reportTypeDescription = reportTypeDescription;
	}

	public String getFrequencyDescription() {
		return frequencyDescription;
	}

	public void setFrequencyDescription(String frequencyDescription) {
		this.frequencyDescription = frequencyDescription;
	}

	public String getDeliveryTypeDescription() {
		return deliveryTypeDescription;
	}

	public void setDeliveryTypeDescription(String deliveryTypeDescription) {
		this.deliveryTypeDescription = deliveryTypeDescription;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getLastReportedOn() {
		return lastReportedOn;
	}

	public void setLastReportedOn(LocalDate lastReportedOn) {
		this.lastReportedOn = lastReportedOn;
	}

	public LocalDate getPreviousReportedOn() {
		return previousReportedOn;
	}

	public void setPreviousReportedOn(LocalDate previousReportedOn) {
		this.previousReportedOn = previousReportedOn;
	}

	public boolean isPullCodeUsed() {
		return isPullCodeUsed;
	}

	public void setPullCodeUsed(boolean isPullCodeUsed) {
		this.isPullCodeUsed = isPullCodeUsed;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public boolean isAdhocReport() {
		return isAdhocReport;
	}

	public void setAdhocReport(boolean isAdhocReport) {
		this.isAdhocReport = isAdhocReport;
	}

	public boolean isInternetUser() {
		return isInternetUser;
	}

	public void setInternetUser(boolean isInternetUser) {
		this.isInternetUser = isInternetUser;
	}

	public boolean isCardDetailsRequired() {
		return isCardDetailsRequired;
	}

	public void setCardDetailsRequired(boolean isCardDetailsRequired) {
		this.isCardDetailsRequired = isCardDetailsRequired;
	}

	public boolean isAttachmentCompressed() {
		return isAttachmentCompressed;
	}

	public void setAttachmentCompressed(boolean isAttachmentCompressed) {
		this.isAttachmentCompressed = isAttachmentCompressed;
	}

	public String getContactHierarchyDescription() {
		return contactHierarchyDescription;
	}

	public void setContactHierarchyDescription(String contactHierarchyDescription) {
		this.contactHierarchyDescription = contactHierarchyDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMemberTypeDescription() {
		return memberTypeDescription;
	}

	public void setMemberTypeDescription(String memberTypeDescription) {
		this.memberTypeDescription = memberTypeDescription;
	}

	public String getFeeDescription() {
		return feeDescription;
	}

	public void setFeeDescription(String feeDescription) {
		this.feeDescription = feeDescription;
	}

	public String getSortOptionDescription() {
		return sortOptionDescription;
	}

	public void setSortOptionDescription(String sortOptionDescription) {
		this.sortOptionDescription = sortOptionDescription;
	}
}
