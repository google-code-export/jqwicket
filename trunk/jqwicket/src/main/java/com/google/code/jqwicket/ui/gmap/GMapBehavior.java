/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.code.jqwicket.ui.gmap;

import com.google.code.jqwicket.JQHeaderContributionTarget;
import com.google.code.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class GMapBehavior extends JQComponentBehaivor<GMapOptions> implements
		IGMap {

	private static final long serialVersionUID = 1L;

	public GMapBehavior(CharSequence apiKey) {
		this(new GMapOptions(apiKey));
	}

	public GMapBehavior(GMapOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQUIWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.JQComponentBehaivor#contributeInternal(com.google.code.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	public void contributeInternal(JQHeaderContributionTarget target) {
		target.addJavascriptResourceUrls(new StringBuffer(this
				.getGMapsJavascriptUrl()).append(this.options.getApiKey()));
		super.contributeInternal(target);
	}

	protected CharSequence getGMapsJavascriptUrl() {
		return "http://maps.google.com/maps?file=api&amp;v=2&amp;key=";
	}

}