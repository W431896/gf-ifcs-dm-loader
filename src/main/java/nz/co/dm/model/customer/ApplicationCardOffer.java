package nz.co.dm.model.customer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "ApplicationCardOffer")
@Table(name = "dm_application_card_offers")
public class ApplicationCardOffer {
	
	@Id
	@Column(name = "application_card_offer_oid")
	private Long applicationCardOfferOid;
	
	@Column(name = "card_offer_description")
	private String cardOfferDescription;
	
	@Column(name = "init_card_status_description")
	private String initialCardStatusDescription;
	
	@Column(name = "is_init_card_status_override")
	private boolean isInitCardStatusOverride;
	
	@Column(name = "is_card_req_validation_rule")
	private boolean isCardReqValidationRule;
	
	@Column(name = "ext_embosser_customer_ref")
	private String extEmbosserCustomerRef;
	
    @OneToOne(targetEntity = CardProduct.class, cascade = CascadeType.ALL)
    @JoinColumn(name="card_product_oid")
    private CardProduct cardProduct;

	public Long getApplicationCardOfferOid() {
		return applicationCardOfferOid;
	}

	public void setApplicationCardOfferOid(Long applicationCardOfferOid) {
		this.applicationCardOfferOid = applicationCardOfferOid;
	}

	public String getCardOfferDescription() {
		return cardOfferDescription;
	}

	public void setCardOfferDescription(String cardOfferDescription) {
		this.cardOfferDescription = cardOfferDescription;
	}

	public String getInitialCardStatusDescription() {
		return initialCardStatusDescription;
	}

	public void setInitialCardStatusDescription(String initialCardStatusDescription) {
		this.initialCardStatusDescription = initialCardStatusDescription;
	}

	public boolean isInitCardStatusOverride() {
		return isInitCardStatusOverride;
	}

	public void setInitCardStatusOverride(boolean isInitCardStatusOverride) {
		this.isInitCardStatusOverride = isInitCardStatusOverride;
	}

	public boolean isCardReqValidationRule() {
		return isCardReqValidationRule;
	}

	public void setCardReqValidationRule(boolean isCardReqValidationRule) {
		this.isCardReqValidationRule = isCardReqValidationRule;
	}

	public String getExtEmbosserCustomerRef() {
		return extEmbosserCustomerRef;
	}

	public void setExtEmbosserCustomerRef(String extEmbosserCustomerRef) {
		this.extEmbosserCustomerRef = extEmbosserCustomerRef;
	}

	public CardProduct getCardProduct() {
		return cardProduct;
	}

	public void setCardProduct(CardProduct cardProduct) {
		this.cardProduct = cardProduct;
	}
}
