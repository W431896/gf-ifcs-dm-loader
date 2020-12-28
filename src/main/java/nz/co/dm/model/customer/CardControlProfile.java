package nz.co.dm.model.customer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "CardControlProfile")
@Table(name = "dm_card_control_profiles")
public class CardControlProfile {
	

	@Id
	@Column(name = "card_control_profile_oid")
	private Long cardControlProfileOid;
	
	@Column(name = "card_offer_description")
	private String cardOfferDescription;
	
    @OneToOne(targetEntity = CardProduct.class, cascade = CascadeType.ALL)
    @JoinColumn(name="card_product_oid")
    private CardProduct cardProduct;
	
    @OneToOne(targetEntity = CardControl.class, cascade = CascadeType.ALL)
    @JoinColumn(name="card_control_oid")
    private CardControl cardControl;
    
    @OneToOne(targetEntity = Profile.class, cascade = CascadeType.ALL)
    @JoinColumn(name="profile_oid")
    private Profile profile;

	public Long getCardControlProfileOid() {
		return cardControlProfileOid;
	}

	public void setCardControlProfileOid(Long cardControlProfileOid) {
		this.cardControlProfileOid = cardControlProfileOid;
	}

	public String getCardOfferDescription() {
		return cardOfferDescription;
	}

	public void setCardOfferDescription(String cardOfferDescription) {
		this.cardOfferDescription = cardOfferDescription;
	}

	public CardProduct getCardProduct() {
		return cardProduct;
	}

	public void setCardProduct(CardProduct cardProduct) {
		this.cardProduct = cardProduct;
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
