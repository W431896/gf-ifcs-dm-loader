package nz.co.dm.model.customer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "FeeProfile")
@Table(name = "dm_fee_profiles")
public class FeeProfile {
	
	@Id
	@Column(name = "fee_profile_oid")
	private Long feeProfileOid;
	
	@Column(name = "card_offer_description")
	private String cardOfferDescription;
	
	@Column(name = "card_type_description")
	private String cardTypeDescription;
    
	@Column(name = "fee_type_description")
	private String feeTypeDescription;
	
    @OneToOne(targetEntity = Profile.class, cascade = CascadeType.ALL)
    @JoinColumn(name="profile_oid")
    private Profile profile;
    
    @OneToOne(targetEntity = CardProduct.class, cascade = CascadeType.ALL)
    @JoinColumn(name="card_product_oid")
    private CardProduct cardProduct;
    
    @OneToOne(targetEntity = CardFeeControl.class, cascade = CascadeType.ALL)
    @JoinColumn(name="card_fee_control_oid")
    private CardFeeControl cardFeeControl;

	public Long getFeeProfileOid() {
		return feeProfileOid;
	}

	public void setFeeProfileOid(Long feeProfileOid) {
		this.feeProfileOid = feeProfileOid;
	}

	public String getCardOfferDescription() {
		return cardOfferDescription;
	}

	public void setCardOfferDescription(String cardOfferDescription) {
		this.cardOfferDescription = cardOfferDescription;
	}

	public String getCardTypeDescription() {
		return cardTypeDescription;
	}

	public void setCardTypeDescription(String cardTypeDescription) {
		this.cardTypeDescription = cardTypeDescription;
	}

	public String getFeeTypeDescription() {
		return feeTypeDescription;
	}

	public void setFeeTypeDescription(String feeTypeDescription) {
		this.feeTypeDescription = feeTypeDescription;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public CardProduct getCardProduct() {
		return cardProduct;
	}

	public void setCardProduct(CardProduct cardProduct) {
		this.cardProduct = cardProduct;
	}

	public CardFeeControl getCardFeeControl() {
		return cardFeeControl;
	}

	public void setCardFeeControl(CardFeeControl cardFeeControl) {
		this.cardFeeControl = cardFeeControl;
	}
}
