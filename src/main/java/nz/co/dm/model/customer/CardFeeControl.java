package nz.co.dm.model.customer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "CardFeeControl")
@Table(name = "dm_card_fee_controls")
public class CardFeeControl {
	
	@Id
	@Column(name = "card_fee_control_oid")
	private Long cardFeeControlOid;
	
    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name="card_issue_fee_oid", referencedColumnName = "fee_control_oid")
    private FeeControl cardIssueFee;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="periodic_card_fee_1_oid", referencedColumnName = "fee_control_oid")
    private FeeControl periodicCardFee1;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="periodic_card_fee_2_oid", referencedColumnName = "fee_control_oid")
    private FeeControl periodicCardFee2;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="periodic_card_fee_3_oid", referencedColumnName = "fee_control_oid")
    private FeeControl periodicCardFee3;

	public Long getCardFeeControlOid() {
		return cardFeeControlOid;
	}

	public void setCardFeeControlOid(Long cardFeeControlOid) {
		this.cardFeeControlOid = cardFeeControlOid;
	}

	public FeeControl getCardIssueFee() {
		return cardIssueFee;
	}

	public void setCardIssueFee(FeeControl cardIssueFee) {
		this.cardIssueFee = cardIssueFee;
	}

	public FeeControl getPeriodicCardFee1() {
		return periodicCardFee1;
	}

	public void setPeriodicCardFee1(FeeControl periodicCardFee1) {
		this.periodicCardFee1 = periodicCardFee1;
	}

	public FeeControl getPeriodicCardFee2() {
		return periodicCardFee2;
	}

	public void setPeriodicCardFee2(FeeControl periodicCardFee2) {
		this.periodicCardFee2 = periodicCardFee2;
	}

	public FeeControl getPeriodicCardFee3() {
		return periodicCardFee3;
	}

	public void setPeriodicCardFee3(FeeControl periodicCardFee3) {
		this.periodicCardFee3 = periodicCardFee3;
	}
}
