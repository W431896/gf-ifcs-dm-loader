package nz.co.dm.model.customer;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "EntitySpecification")
@Table(name = "dm_entity_specifications")
public class EntitySpecification {
	
	@Id
	@Column(name = "entity_specification_oid")
	private Long entitySpecificationOid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "entity_type")
	private String entityType;
	
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
    @JoinColumn(name="entity_specification_oid")
    private List<EntitySpecCharacteristic> entitySpecCharacteristics;

	public Long getEntitySpecificationOid() {
		return entitySpecificationOid;
	}

	public void setEntitySpecificationOid(Long entitySpecificationOid) {
		this.entitySpecificationOid = entitySpecificationOid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public List<EntitySpecCharacteristic> getEntitySpecCharacteristics() {
		return entitySpecCharacteristics;
	}

	public void setEntitySpecCharacteristics(List<EntitySpecCharacteristic> entitySpecCharacteristics) {
		this.entitySpecCharacteristics = entitySpecCharacteristics;
	}
}
