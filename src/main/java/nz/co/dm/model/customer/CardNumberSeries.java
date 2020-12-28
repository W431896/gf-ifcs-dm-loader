package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CardNumberSeries")
@Table(name = "dm_card_number_series")
public class CardNumberSeries {
	
	@Id
	@Column(name = "card_number_series_oid")
	private Long cardNumberSeriesOid;
	
	@Column(name = "series_number")
	private Long seriesNumber;
	
	@Column(name = "sequence_number")
	private Long sequenceNumber;

	public Long getCardNumberSeriesOid() {
		return cardNumberSeriesOid;
	}

	public void setCardNumberSeriesOid(Long cardNumberSeriesOid) {
		this.cardNumberSeriesOid = cardNumberSeriesOid;
	}

	public Long getSeriesNumber() {
		return seriesNumber;
	}

	public void setSeriesNumber(Long seriesNumber) {
		this.seriesNumber = seriesNumber;
	}

	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
}
