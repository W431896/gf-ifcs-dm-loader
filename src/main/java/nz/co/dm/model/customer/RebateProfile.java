package nz.co.dm.model.customer;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "RebateProfile")
@Table(name = "dm_rebate_profiles")
public class RebateProfile {
	
	@Id
	@Column(name = "rebate_profile_oid")
	private Long rebateProfileOid;
	
	@Column(name = "rebate_user")
	private String rebateUser;
	
    @OneToOne(targetEntity = Profile.class, cascade = CascadeType.ALL)
    @JoinColumn(name="profile_oid")
    private Profile profile;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="rebate_profile_oid")
    private List<Rebate> rebates;

	public Long getRebateProfileOid() {
		return rebateProfileOid;
	}

	public void setRebateProfileOid(Long rebateProfileOid) {
		this.rebateProfileOid = rebateProfileOid;
	}
	
	public String getRebateUser() {
		return rebateUser;
	}

	public void setRebateUser(String rebateUser) {
		this.rebateUser = rebateUser;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<Rebate> getRebates() {
		return rebates;
	}

	public void setRebates(List<Rebate> rebates) {
		this.rebates = rebates;
	}
}
