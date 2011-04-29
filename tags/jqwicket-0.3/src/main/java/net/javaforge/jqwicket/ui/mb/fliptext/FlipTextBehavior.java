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
package net.javaforge.jqwicket.ui.mb.fliptext;

import static net.javaforge.jqwicket.JQuery.$;

import org.apache.wicket.Page;

import net.javaforge.jqwicket.JQHeaderContributionTarget;
import net.javaforge.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class FlipTextBehavior extends JQComponentBehaivor<FlipTextOptions>
		implements IFlipText {

	private static final long serialVersionUID = 1L;

	public FlipTextBehavior() {
		this(new FlipTextOptions());
	}

	public FlipTextBehavior(FlipTextOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQComponentBehaivor#contributeInternal(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void contributeInternal(JQHeaderContributionTarget target) {
		if (!Page.class.isAssignableFrom(this.component.getClass()))
			target.addJQStatements($(this.component).chain(this.getName(),
					String.valueOf(this.options.isTopToBottom())));
	}
}