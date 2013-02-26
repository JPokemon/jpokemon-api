package org.jpokemon.pmapi.item;

public class ItemAttributeType {
	private String attributeName = null;
	private Class<T> attributeClass = null;

	public ItemAttributeType() {		
	}

	public <T extends ItemAttribute> ItemAttributeType(String attributeName, Class<T> attributeClass) {
		this.attributeName = attributeName;
		this.attributeClass = attributeClass;
	}

	public <T extends ItemAttribute> Class<T> getAttributeClass() {
		return attributeClass;
	}

	public <T extends ItemAttribute> void setAttributeClass(Class<T> attributeClass) {
		this.attributeClass = attributeClass;
	}
}