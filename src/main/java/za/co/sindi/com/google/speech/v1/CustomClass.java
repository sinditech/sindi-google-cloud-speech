package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class CustomClass implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String customClassId;
	
	@JsonbProperty
	private ClassItem[] items;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the customClassId
	 */
	public String getCustomClassId() {
		return customClassId;
	}

	/**
	 * @param customClassId the customClassId to set
	 */
	public void setCustomClassId(String customClassId) {
		this.customClassId = customClassId;
	}

	/**
	 * @return the items
	 */
	public ClassItem[] getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ClassItem[] items) {
		this.items = items;
	}
}
