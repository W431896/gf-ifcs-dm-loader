package nz.co.dm.model.customer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "AccountControlProfile")
@Table(name = "dm_account_control_profiles")
public class AccountControlProfile {
	
	@Id
	@Column(name = "account_control_profile_oid")
	private Long accountControlProfileOid;
	
    @OneToOne(targetEntity = CardControl.class, cascade = CascadeType.ALL)
    @JoinColumn(name="card_control_oid")
    private CardControl cardControl;
    
    @OneToOne(targetEntity = Profile.class, cascade = CascadeType.ALL)
    @JoinColumn(name="profile_oid")
    private Profile profile;

	public Long getAccountControlProfileOid() {
		return accountControlProfileOid;
	}

	public void setAccountControlProfileOid(Long accountControlProfileOid) {
		this.accountControlProfileOid = accountControlProfileOid;
	}

	public CardControl getCardControl() {
		return cardControl;
	}

	public void setCardControl(CardControl cardControl) {
		this.cardControl = cardControl;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}
