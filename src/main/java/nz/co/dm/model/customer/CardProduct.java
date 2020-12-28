package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CardProduct")
@Table(name = "dm_card_products")
public class CardProduct  {
	
	@Id
	@Column(name = "card_product_oid")
	private Long cardProductOid;
		
	@Column(name = "card_offer_description")
	private String cardOfferDescription;
	
	@Column(name = "application_type_description")
	private String applicationTypeDescription;
	
	@Column(name = "card_type_description")
	private String cardTypeDescription;
	
	@Column(name = "card_product_description")
	private String cardProductDescription;
	
	@Column(name = "plastic_code")
	private String plasticCode;

	public Long getCardProductOid() {
		return cardProductOid;
	}

	public void setCardProductOid(Long cardProductOid) {
		this.cardProductOid = cardProductOid;
	}

	public String getCardOfferDescription() {
		return cardOfferDescription;
	}

	public void setCardOfferDescription(String cardOfferDescription) {
		this.cardOfferDescription = cardOfferDescription;
	}

	public String getApplicationTypeDescription() {
		return applicationTypeDescription;
	}

	public void setApplicationTypeDescription(String applicationTypeDescription) {
		this.applicationTypeDescription = applicationTypeDescription;
	}

	public String getCardTypeDescription() {
		return cardTypeDescription;
	}

	public void setCardTypeDescription(String cardTypeDescription) {
		this.cardTypeDescription = cardTypeDescription;
	}

	public String getCardProductDescription() {
		return cardProductDescription;
	}

	public void setCardProductDescription(String cardProductDescription) {
		this.cardProductDescription = cardProductDescription;
	}

	public String getPlasticCode() {
		return plasticCode;
	}

	public void setPlasticCode(String plasticCode) {
		this.plasticCode = plasticCode;
	}	
}
