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
package com.google.code.jqwicket.ui.tabs;


import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.model.IModel;

import com.google.code.jqwicket.api.IJQFunction;
import com.google.code.jqwicket.ui.JQUIWebMarkupContainer;

/**
 * @author mkalina
 * 
 */
public class TabsWebMarkupContainer extends
		JQUIWebMarkupContainer<TabsBehavior, TabsOptions> implements ITabs {

	private static final long serialVersionUID = 1L;

	public TabsWebMarkupContainer(String id) {
		this(id, new TabsOptions());
	}

	public TabsWebMarkupContainer(String id, TabsOptions options) {
		super(id, options);
	}

	public TabsWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new TabsOptions());
	}

	public TabsWebMarkupContainer(String id, IModel<?> model,
			TabsOptions options) {
		super(id, model, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.JQUIWebMarkupContainer#newJQComponentBehavior(com.google.code.jqwicket.ui.JQOptions)
	 */
	@Override
	protected TabsBehavior newJQComponentBehavior(TabsOptions options) {
		return new TabsBehavior(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#add(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public IJQFunction add(CharSequence url, CharSequence label) {
		return this.behavior.add(url, label);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#add(java.lang.CharSequence,
	 *      java.lang.CharSequence, java.lang.Integer)
	 */
	public IJQFunction add(CharSequence url, CharSequence label, Integer index) {
		return this.behavior.add(url, label, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#add(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence, java.lang.CharSequence)
	 */
	public void add(AjaxRequestTarget ajaxRequestTarget, CharSequence url,
			CharSequence label) {
		this.behavior.add(ajaxRequestTarget, url, label);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#add(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence, java.lang.CharSequence, java.lang.Integer)
	 */
	public void add(AjaxRequestTarget ajaxRequestTarget, CharSequence url,
			CharSequence label, Integer index) {
		this.behavior.add(ajaxRequestTarget, url, label, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#remove(int)
	 */
	public IJQFunction remove(int index) {
		return this.behavior.remove(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#remove(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void remove(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.remove(ajaxRequestTarget, index);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#enable(int)
	 */
	public IJQFunction enable(int index) {
		return this.behavior.enable(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#enable(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void enable(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.enable(ajaxRequestTarget, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#disable(int)
	 */
	public IJQFunction disable(int index) {
		return this.behavior.disable(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#disable(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void disable(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.disable(ajaxRequestTarget, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#select(int)
	 */
	public IJQFunction select(int index) {
		return this.behavior.select(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#select(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void select(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.select(ajaxRequestTarget, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#load(int)
	 */
	public IJQFunction load(int index) {
		return this.behavior.load(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#load(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void load(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.load(ajaxRequestTarget, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#url(int,
	 *      java.lang.CharSequence)
	 */
	public IJQFunction url(int index, CharSequence url) {
		return this.behavior.url(index, url);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#url(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int, java.lang.CharSequence)
	 */
	public void url(AjaxRequestTarget ajaxRequestTarget, int index,
			CharSequence url) {
		this.behavior.url(ajaxRequestTarget, index, url);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#length()
	 */
	public IJQFunction length() {
		return this.behavior.length();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#length(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void length(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.length(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#abort()
	 */
	public IJQFunction abort() {
		return this.behavior.abort();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#abort(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void abort(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.abort(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#rotate(int, boolean)
	 */
	public IJQFunction rotate(int ms, boolean continuing) {
		return this.behavior.rotate(ms, continuing);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.tabs.ITabs#rotate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int, boolean)
	 */
	public void rotate(AjaxRequestTarget ajaxRequestTarget, int ms,
			boolean continuing) {
		this.behavior.rotate(ajaxRequestTarget, ms, continuing);
	}

}