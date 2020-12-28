package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PricingControl")
@Table(name = "dm_pricing_controls")
public class PricingControl {
	
	@Id
	@Column(name = "pricing_control_oid")
	private Long pricingControlOid;
	
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "product_des")
	private String productDes;
	
	@Column(name = "pricing_scheme_id")
	private Long pricingSchemeId;
	
	@Column(name = "pricing_scheme_des")
	private String pricingSchemeDes;

	public Long getPricingControlOid() {
		return pricingControlOid;
	}

	public void setPricingControlOid(Long pricingControlOid) {
		this.pricingControlOid = pricingControlOid;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductDes() {
		return productDes;
	}

	public void setProductDes(String productDes) {
		this.productDes = productDes;
	}

	public Long getPricingSchemeId() {
		return pricingSchemeId;
	}

	public void setPricingSchemeId(Long pricingSchemeId) {
		this.pricingSchemeId = pricingSchemeId;
	}

	public String getPricingSchemeDes() {
		return pricingSchemeDes;
	}

	public void setPricingSchemeDes(String pricingSchemeDes) {
		this.pricingSchemeDes = pricingSchemeDes;
	}	
}
