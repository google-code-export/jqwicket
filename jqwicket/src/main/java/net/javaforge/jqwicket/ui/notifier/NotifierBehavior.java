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
package net.javaforge.jqwicket.ui.notifier;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.DefaultJQOptions;
import net.javaforge.jqwicket.ui.IJQOptions;
import net.javaforge.jqwicket.ui.JQUIComponentBehaivor;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 * 
 */
public class NotifierBehavior extends JQUIComponentBehaivor<NotifierOptions>
		implements INotifier {

	private static final long serialVersionUID = 1L;

	private static final String JQ_COMPONENT_NAME = "notify";

	public NotifierBehavior() {
		this(new NotifierOptions());
	}

	public NotifierBehavior(NotifierOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public String getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#create(java.lang.String,
	 *      java.lang.String)
	 */
	public JQFunction create(String title, String text) {
		return create(new DefaultJQOptions().put("title", title).put("text",
				text));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#create(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, java.lang.String)
	 */
	public void create(AjaxRequestTarget ajaxRequestTarget, String title,
			String text) {
		chain(ajaxRequestTarget, this.create(title, text));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#create(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction create(IJQOptions<?> msg) {
		return chain("'create'", msg.toJson());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#create(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void create(AjaxRequestTarget ajaxRequestTarget, IJQOptions<?> msg) {
		chain(ajaxRequestTarget, this.create(msg));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#create(java.lang.String,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction create(String template, IJQOptions<?> msg) {
		return chain("'create'", template, msg.toJson());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#create(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void create(AjaxRequestTarget ajaxRequestTarget, String template,
			IJQOptions<?> msg) {
		chain(ajaxRequestTarget, create(template, msg));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#create(java.lang.String,
	 *      net.javaforge.jqwicket.ui.IJQOptions,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction create(String template, IJQOptions<?> msg,
			IJQOptions<?> options) {
		return chain("'create'", template, msg.toJson(), options.toJson());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#create(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, net.javaforge.jqwicket.ui.IJQOptions,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void create(AjaxRequestTarget ajaxRequestTarget, String template,
			IJQOptions<?> msg, IJQOptions<?> options) {
		chain(ajaxRequestTarget, create(template, msg, options));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#open()
	 */
	public JQFunction open() {
		return chain("'open'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#open(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void open(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, open());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#close()
	 */
	public JQFunction close() {
		return chain("'close'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.notifier.INotifier#close(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void close(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, close());
	}

}
