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
package net.javaforge.jqwicket.ui;

import net.javaforge.jqwicket.JQHeaderContributionTarget;
import net.javaforge.jqwicket.IJQWidget;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;

/**
 * Abstract wicket web markup container for pure jquery components.
 * 
 * @author mkalina
 * 
 * @param <B>
 *            is the type of the component's concrete
 *            {@link JQComponentBehaivor}.
 * @param <O>
 *            is the type of the component's concrete {@link IJQOptions}
 *            implementation.
 */
public abstract class JQWebMarkupContainer<B extends JQComponentBehaivor<O>, O extends IJQOptions<O>>
		extends WebMarkupContainer implements IJQWidget<O> {

	private static final long serialVersionUID = 1L;

	protected B behavior;

	public JQWebMarkupContainer(String id, O options) {
		super(id);
		add(this.behavior = this.newJQComponentBehavior(options));
	}

	public JQWebMarkupContainer(String id, IModel<?> model, O options) {
		super(id, model);
		add(this.behavior = this.newJQComponentBehavior(options));
	}

	/**
	 * Factory method responsible for creating new jquery component behavior.
	 * 
	 * @param options
	 * @return
	 */
	protected abstract B newJQComponentBehavior(O options);

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public String getName() {
		return this.behavior.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getOptions()
	 */
	public O getOptions() {
		return this.behavior.getOptions();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQHeaderContributor#contribute(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	public void contribute(JQHeaderContributionTarget target) {
		// do nothing here because the underlying behavior already contributes
		// necessary scripts to the jquery target.
	}

}
