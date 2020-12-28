package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CustomerValue")
@Table(name = "dm_customer_values")
public class CustomerValue {
	
	@Id
	@Column(name = "customer_value_oid")
    private long customerValueOid;
	
	@Column(name = "customer_value_no")
	private String customerValueNo;
	
	@Column(name = "customer_value_des")
	private String customerValueDes;
	
	public long getCustomerValueOid() {
		return customerValueOid;
	}
	public void setCustomerValueOid(long customerValueOid) {
		this.customerValueOid = customerValueOid;
	}
	public String getCustomerValueNo() {
		return customerValueNo;
	}
	public void setCustomerValueNo(String customerValueNo) {
		this.customerValueNo = customerValueNo;
	}
	public String getCustomerValueDes() {
		return customerValueDes;
	}
	public void setCustomerValueDes(String customerValueDes) {
		this.customerValueDes = customerValueDes;
	}
}
