package com.bbva.mzic.dto.proyecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The LetterCredits class...
 */
public class LetterCredits implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */

	private int id;
    private String name;
    private String address;
    private List<code> list = new List<code>();

	/**
	 * Get the id attribute
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Set the id attribute
	 */
	public void setId(final String letter) {
		this.id = id;
	}

	/**
	 * Get the name attribute
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the name attribute
	 */
	public void setName(final String name) {
		this.name = name;
	}

		/**
	 * Get the address attribute
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * Set the address attribute
	 */
	public void setAddress(final String address) {
		this.address = address;
	}




	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final BanksDTO rhs = (BanksDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(id, rhs.id)
					.append(name, rhs.name)
					.append(address, rhs.address)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.append(this.name)
			.append(this.address)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("name", name)
			.append("address", address)
			.toString();
	}
}