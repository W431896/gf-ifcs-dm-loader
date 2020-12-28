package nz.co.dm.model.customer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "CardReissueProfile")
@Table(name = "dm_card_reissue_profiles")
public class CardReissueProfile {
	
	@Id
	@Column(name = "card_reissue_profile_oid")
	private Long cardReissueProfileOid;
	
	@Column(name = "card_reissue_confirm_month")
    private Long cardReissueConfirmMonth;
    
	@Column(name = "card_reissue_on_days")
    private Long cardReissueOnDays;
	
	@Column(name = "card_reissue_active_days")
    private Long cardReissueActiveDays;
	
	@Column(name = "card_reissue_override_exclu")
	private String cardReissueOverrideExclusion;
	
	@Column(name = "is_auto_reissue")
    private boolean isAutoReissue;
	
    @OneToOne(targetEntity = Profile.class, cascade = CascadeType.ALL)
    @JoinColumn(name="profile_oid")
    private Profile profile;

	public Long getCardReissueProfileOid() {
		return cardReissueProfileOid;
	}

	public void setCardReissueProfileOid(Long cardReissueProfileOid) {
		this.cardReissueProfileOid = cardReissueProfileOid;
	}

	public Long getCardReissueConfirmMonth() {
		return cardReissueConfirmMonth;
	}

	public void setCardReissueConfirmMonth(Long cardReissueConfirmMonth) {
		this.cardReissueConfirmMonth = cardReissueConfirmMonth;
	}

	public Long getCardReissueOnDays() {
		return cardReissueOnDays;
	}

	public void setCardReissueOnDays(Long cardReissueOnDays) {
		this.cardReissueOnDays = cardReissueOnDays;
	}

	public Long getCardReissueActiveDays() {
		return cardReissueActiveDays;
	}

	public void setCardReissueActiveDays(Long cardReissueActiveDays) {
		this.cardReissueActiveDays = cardReissueActiveDays;
	}

	public String getCardReissueOverrideExclusion() {
		return cardReissueOverrideExclusion;
	}

	public void setCardReissueOverrideExclusion(String cardReissueOverrideExclusion) {
		this.cardReissueOverrideExclusion = cardReissueOverrideExclusion;
	}

	public boolean isAutoReissue() {
		return isAutoReissue;
	}

	public void setAutoReissue(boolean isAutoReissue) {
		this.isAutoReissue = isAutoReissue;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}   
}
