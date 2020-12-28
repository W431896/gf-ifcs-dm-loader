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

@Entity(name = "PricingProfile")
@Table(name = "dm_pricing_profiles")
public class PricingProfile {

	@Id
	@Column(name = "pricing_profile_oid")
	private Long pricingProfileOid;
	
    @OneToOne(targetEntity = Profile.class, cascade = CascadeType.ALL)
    @JoinColumn(name="profile_oid")
    private Profile profile;
	
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="pricing_profile_oid")
    private List<PricingControl> pricingControls;

	public Long getPricingProfileOid() {
		return pricingProfileOid;
	}

	public void setPricingProfileOid(Long pricingProfileOid) {
		this.pricingProfileOid = pricingProfileOid;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<PricingControl> getPricingControls() {
		return pricingControls;
	}

	public void setPricingControls(List<PricingControl> pricingControls) {
		this.pricingControls = pricingControls;
	}    
}
