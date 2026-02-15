
package acme.strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;

import acme.client.components.basis.AbstractEntity;

@Entity
@Getter
@Setter
public class Fundraiser extends AbstractEntity {

	@Mandatory
	// @ValidHeader	
	@Column
	private String	bank;

	@Mandatory
	// @ValidText
	@Column
	private String	statement;

	@Mandatory
	@Valid
	@Column
	private Boolean	agent;

}
