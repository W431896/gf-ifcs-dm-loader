package nz.co.dm.model.customer;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "DiaryNote")
@Table(name = "dm_diary_notes")
public class DiaryNote {
	
	@Id
	@Column(name = "diary_note_oid")
	private Long diaryNoteOid;
	
	@Column(name = "short_note")
	private String shortNote;
	
	@Column(name = "detailed_note")
	private String detailedNote;
	
	@Column(name = "bring_up_at")
    private LocalDateTime bringUpAt;
    
	@Column(name = "is_high_priority")
    private boolean isHighPriority;
    
	@Column(name = "work_queue_client_mid")
	private Long workQueueCientMid;
	
	@Column(name = "work_queue_external_code")
	private String workQueueExternalCode;
	
	@Column(name = "work_queue_description")
	private String workQueueDescription;

	public Long getDiaryNoteOid() {
		return diaryNoteOid;
	}

	public void setDiaryNoteOid(Long diaryNoteOid) {
		this.diaryNoteOid = diaryNoteOid;
	}

	public String getShortNote() {
		return shortNote;
	}

	public void setShortNote(String shortNote) {
		this.shortNote = shortNote;
	}

	public String getDetailedNote() {
		return detailedNote;
	}

	public void setDetailedNote(String detailedNote) {
		this.detailedNote = detailedNote;
	}

	public LocalDateTime getBringUpAt() {
		return bringUpAt;
	}

	public void setBringUpAt(LocalDateTime bringUpAt) {
		this.bringUpAt = bringUpAt;
	}

	public boolean isHighPriority() {
		return isHighPriority;
	}

	public void setHighPriority(boolean isHighPriority) {
		this.isHighPriority = isHighPriority;
	}

	public Long getWorkQueueCientMid() {
		return workQueueCientMid;
	}

	public void setWorkQueueCientMid(Long workQueueCientMid) {
		this.workQueueCientMid = workQueueCientMid;
	}

	public String getWorkQueueExternalCode() {
		return workQueueExternalCode;
	}

	public void setWorkQueueExternalCode(String workQueueExternalCode) {
		this.workQueueExternalCode = workQueueExternalCode;
	}

	public String getWorkQueueDescription() {
		return workQueueDescription;
	}

	public void setWorkQueueDescription(String workQueueDescription) {
		this.workQueueDescription = workQueueDescription;
	}	
}
