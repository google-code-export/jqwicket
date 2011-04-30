package com.google.code.jqwicket.ui.mobilymap;

import com.google.code.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class MobilyMapBehavior extends JQComponentBehaivor<MobilyMapOptions>
		implements IMobilyMap {

	private static final long serialVersionUID = 1L;

	public MobilyMapBehavior() {
		this(new MobilyMapOptions());
	}

	public MobilyMapBehavior(MobilyMapOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

}
