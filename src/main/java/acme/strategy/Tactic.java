
package acme.strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.ValidScore;

import acme.client.components.basis.AbstractEntity;

@Entity
@Getter
@Setter
public class Tactic extends AbstractEntity {

	@Mandatory
	// @ValidHeader
	@Column
	private String		name;

	@Mandatory
	// @ValidText
	@Column
	private String		notes;

	@Mandatory
	@ValidScore
	@Column
	private Double		expectedPercentage;

	@Mandatory
	@Valid
	@Column
	private TacticKind	tacticKind;

	@ManyToOne(optional = false)
	private Strategy	strategy;

}
