package nz.co.dm.model.customer;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "CardControl")
@Table(name = "dm_card_controls")
public class CardControl  {
	
	@Id
	@Column(name = "card_control_oid")
	private Long cardControlOid;
	
	@Column(name = "ext_velocity_profile_number")
	private String extVelocityProfileNumber;
	
	@Column(name = "product_restriction_des")
	private String productRestrictionDes;
	
	@Column(name = "product_restriction_code")
	private String productRestrictionCode;
	
	@Column(name = "product_restri_card_offer_des")
	private String productRestrictionCardOfferDes;
	
	@Column(name = "time_limit_des")
	private String timeLimitDes;
	
	@Column(name = "time_limit_code")
	private String timeLimitCode;
	
	@Column(name = "location_restriction_type")
	private String locationRestrictionType;
	
	@Column(name = "location_restriction_des")
	private String locationRestrictionDes;
	
	@Column(name = "is_error_prod_rest_coll")
    private boolean isErrorProdRestColl;
	
	@Column(name = "is_error_prod_rest_auth")
    private boolean isErrorProdRestAuth;
	
	@Column(name = "is_error_time_limit_coll")
    private boolean isErrorTimeLimitColl;
	
	@Column(name = "is_error_time_limit_auth")
    private boolean isErrorTimeLimitAuth;
	
	@Column(name = "is_error_loc_restric_coll")
    private boolean isErrorLocRestricColl;
	
	@Column(name = "is_error_loc_restric_auth")
    private boolean isErrorLocRestricAuth;
	
	@Column(name = "is_vehicle_id_req")
    private boolean isVehicleIdReq;
	
	@Column(name = "is_order_number_req")
    private boolean isOrderNumberReq;
	
	@Column(name = "is_driver_id_req")
    private boolean isDriverIdReq;
	
	@Column(name = "is_fleet_id_req")
    private boolean isFleetIdReq;
	
	@Column(name = "is_customer_selection_req")
    private boolean isCustomerSelectionReq;
	
	@Column(name = "is_odo_meter_req")
    private boolean isOdoMeterReq;
	
	@Column(name = "is_odo_meter_validation")
    private boolean isOdoMeterValidation;
	
	@Column(name = "is_pos_pin_change_allowed")
    private boolean isPosPinChangeAllowed;
	
	@Column(name = "effective_on")
	private LocalDate effectiveOn;
	
	@Column(name = "expires_on")
	private LocalDate expiresOn;
	
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="card_control_oid")
    private List<VelocityTypeValue> velocityTypeValues;

	public Long getCardControlOid() {
		return cardControlOid;
	}

	public void setCardControlOid(Long cardControlOid) {
		this.cardControlOid = cardControlOid;
	}

	public String getExtVelocityProfileNumber() {
		return extVelocityProfileNumber;
	}

	public void setExtVelocityProfileNumber(String extVelocityProfileNumber) {
		this.extVelocityProfileNumber = extVelocityProfileNumber;
	}

	public String getProductRestrictionDes() {
		return productRestrictionDes;
	}

	public void setProductRestrictionDes(String productRestrictionDes) {
		this.productRestrictionDes = productRestrictionDes;
	}

	public String getProductRestrictionCode() {
		return productRestrictionCode;
	}

	public void setProductRestrictionCode(String productRestrictionCode) {
		this.productRestrictionCode = productRestrictionCode;
	}

	public String getProductRestrictionCardOfferDes() {
		return productRestrictionCardOfferDes;
	}

	public void setProductRestrictionCardOfferDes(String productRestrictionCardOfferDes) {
		this.productRestrictionCardOfferDes = productRestrictionCardOfferDes;
	}

	public String getTimeLimitDes() {
		return timeLimitDes;
	}

	public void setTimeLimitDes(String timeLimitDes) {
		this.timeLimitDes = timeLimitDes;
	}

	public String getTimeLimitCode() {
		return timeLimitCode;
	}

	public void setTimeLimitCode(String timeLimitCode) {
		this.timeLimitCode = timeLimitCode;
	}

	public String getLocationRestrictionType() {
		return locationRestrictionType;
	}

	public void setLocationRestrictionType(String locationRestrictionType) {
		this.locationRestrictionType = locationRestrictionType;
	}

	public String getLocationRestrictionDes() {
		return locationRestrictionDes;
	}

	public void setLocationRestrictionDes(String locationRestrictionDes) {
		this.locationRestrictionDes = locationRestrictionDes;
	}

	public boolean isErrorProdRestColl() {
		return isErrorProdRestColl;
	}

	public void setErrorProdRestColl(boolean isErrorProdRestColl) {
		this.isErrorProdRestColl = isErrorProdRestColl;
	}

	public boolean isErrorProdRestAuth() {
		return isErrorProdRestAuth;
	}

	public void setErrorProdRestAuth(boolean isErrorProdRestAuth) {
		this.isErrorProdRestAuth = isErrorProdRestAuth;
	}

	public boolean isErrorTimeLimitColl() {
		return isErrorTimeLimitColl;
	}

	public void setErrorTimeLimitColl(boolean isErrorTimeLimitColl) {
		this.isErrorTimeLimitColl = isErrorTimeLimitColl;
	}

	public boolean isErrorTimeLimitAuth() {
		return isErrorTimeLimitAuth;
	}

	public void setErrorTimeLimitAuth(boolean isErrorTimeLimitAuth) {
		this.isErrorTimeLimitAuth = isErrorTimeLimitAuth;
	}

	public boolean isErrorLocRestricColl() {
		return isErrorLocRestricColl;
	}

	public void setErrorLocRestricColl(boolean isErrorLocRestricColl) {
		this.isErrorLocRestricColl = isErrorLocRestricColl;
	}

	public boolean isErrorLocRestricAuth() {
		return isErrorLocRestricAuth;
	}

	public void setErrorLocRestricAuth(boolean isErrorLocRestricAuth) {
		this.isErrorLocRestricAuth = isErrorLocRestricAuth;
	}

	public boolean isVehicleIdReq() {
		return isVehicleIdReq;
	}

	public void setVehicleIdReq(boolean isVehicleIdReq) {
		this.isVehicleIdReq = isVehicleIdReq;
	}

	public boolean isOrderNumberReq() {
		return isOrderNumberReq;
	}

	public void setOrderNumberReq(boolean isOrderNumberReq) {
		this.isOrderNumberReq = isOrderNumberReq;
	}

	public boolean isDriverIdReq() {
		return isDriverIdReq;
	}

	public void setDriverIdReq(boolean isDriverIdReq) {
		this.isDriverIdReq = isDriverIdReq;
	}

	public boolean isFleetIdReq() {
		return isFleetIdReq;
	}

	public void setFleetIdReq(boolean isFleetIdReq) {
		this.isFleetIdReq = isFleetIdReq;
	}

	public boolean isCustomerSelectionReq() {
		return isCustomerSelectionReq;
	}

	public void setCustomerSelectionReq(boolean isCustomerSelectionReq) {
		this.isCustomerSelectionReq = isCustomerSelectionReq;
	}

	public boolean isOdoMeterReq() {
		return isOdoMeterReq;
	}

	public void setOdoMeterReq(boolean isOdoMeterReq) {
		this.isOdoMeterReq = isOdoMeterReq;
	}

	public boolean isOdoMeterValidation() {
		return isOdoMeterValidation;
	}

	public void setOdoMeterValidation(boolean isOdoMeterValidation) {
		this.isOdoMeterValidation = isOdoMeterValidation;
	}

	public boolean isPosPinChangeAllowed() {
		return isPosPinChangeAllowed;
	}

	public void setPosPinChangeAllowed(boolean isPosPinChangeAllowed) {
		this.isPosPinChangeAllowed = isPosPinChangeAllowed;
	}

	public LocalDate getEffectiveOn() {
		return effectiveOn;
	}

	public void setEffectiveOn(LocalDate effectiveOn) {
		this.effectiveOn = effectiveOn;
	}

	public LocalDate getExpiresOn() {
		return expiresOn;
	}

	public void setExpiresOn(LocalDate expiresOn) {
		this.expiresOn = expiresOn;
	}

	public List<VelocityTypeValue> getVelocityTypeValues() {
		return velocityTypeValues;
	}

	public void setVelocityTypeValues(List<VelocityTypeValue> velocityTypeValues) {
		this.velocityTypeValues = velocityTypeValues;
	}
}
