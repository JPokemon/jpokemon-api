package org.jpokemon.manager;

import org.jpokemon.api.Builder;

/**
 * Provides a default implementation, based on {@link SimpleManager} for the
 * Manager<Builder<T>> pattern, because SimpleManager cannot reflect on the
 * {@link Builder} interface.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleBuildersManager<T> extends SimpleManager<Builder<T>> {
	@Override
	protected String getId(Builder<T> builder) {
		return builder.getId();
	}
}
