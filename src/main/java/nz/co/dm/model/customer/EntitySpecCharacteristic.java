package nz.co.dm.model.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "EntitySpecCharacteristic")
@Table(name = "dm_entity_spec_characteristics")
public class EntitySpecCharacteristic {
	
	@Id
	@Column(name = "entity_spe_characteristic_oid")
	private Long entitySpecCharacteristicOid;
	
	@Column(name = "characteristic")
	private String characteristic;
	
	@Column(name = "characteristic_value")
	private String characteristicValue;

	public Long getEntitySpecCharacteristicOid() {
		return entitySpecCharacteristicOid;
	}

	public void setEntitySpecCharacteristicOid(Long entitySpecCharacteristicOid) {
		this.entitySpecCharacteristicOid = entitySpecCharacteristicOid;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public String getCharacteristicValue() {
		return characteristicValue;
	}

	public void setCharacteristicValue(String characteristicValue) {
		this.characteristicValue = characteristicValue;
	}
}
