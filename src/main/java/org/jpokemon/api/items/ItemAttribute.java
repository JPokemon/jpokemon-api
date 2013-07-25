package org.jpokemon.api.items;

/**
 * Provides an interface for `attributes` that can be added to items. Attributes
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public interface ItemAttribute {
	/**
	 * Adds all necessary attributes of this ItemAttribute to the specified item
	 * 
	 * @param item Item to store this ItemAttribute's attributes in
	 */
	public void applyAttribute(Item item);
}