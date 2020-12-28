package nz.co.dm.model.customer;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "RebateValue")
@Table(name = "dm_rebate_values")
public class RebateValue {
	
	@Id
	@Column(name = "rebate_value_oid")
	private Long rebateValueOid;
	
	@Column(name = "rate")
	private BigDecimal rate;
	
	@Column(name = "value_range_from")
	private BigDecimal valueRangeFrom;
	
	@Column(name = "value_range_to")
	private BigDecimal valueRangeTo;

	public Long getRebateValueOid() {
		return rebateValueOid;
	}

	public void setRebateValueOid(Long rebateValueOid) {
		this.rebateValueOid = rebateValueOid;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getValueRangeFrom() {
		return valueRangeFrom;
	}

	public void setValueRangeFrom(BigDecimal valueRangeFrom) {
		this.valueRangeFrom = valueRangeFrom;
	}

	public BigDecimal getValueRangeTo() {
		return valueRangeTo;
	}

	public void setValueRangeTo(BigDecimal valueRangeTo) {
		this.valueRangeTo = valueRangeTo;
	}	
}
