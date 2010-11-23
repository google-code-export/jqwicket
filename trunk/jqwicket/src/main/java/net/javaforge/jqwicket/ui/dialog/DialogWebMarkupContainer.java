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
package net.javaforge.jqwicket.ui.dialog;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.JQUIWebMarkupContainer;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.model.IModel;

/**
 * @author mkalina
 *
 */
public class DialogWebMarkupContainer extends
		JQUIWebMarkupContainer<DialogBehavior, DialogOptions> implements IDialog {

	private static final long serialVersionUID = 1L;

	public DialogWebMarkupContainer(String id) {
		this(id, new DialogOptions());
	}

	public DialogWebMarkupContainer(String id, DialogOptions options) {
		super(id, options);
	}

	public DialogWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new DialogOptions());
	}

	public DialogWebMarkupContainer(String id, IModel<?> model,
			DialogOptions options) {
		super(id, model, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQUIWebMarkupContainer#newJQComponentBehavior(net.javaforge.jqwicket.ui.JQOptions)
	 */
	@Override
	protected DialogBehavior newJQComponentBehavior(DialogOptions options) {
		return new DialogBehavior(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#open()
	 */
	public JQFunction open() {
		return this.behavior.open();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#open(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void open(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.open(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#close()
	 */
	public JQFunction close() {
		return this.behavior.close();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#close(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void close(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.close(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#isOpen()
	 */
	public JQFunction isOpen() {
		return this.behavior.isOpen();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#isOpen(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void isOpen(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.isOpen(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#moveToTop()
	 */
	public JQFunction moveToTop() {
		return this.behavior.moveToTop();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#moveToTop(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void moveToTop(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.moveToTop(ajaxRequestTarget);
	}

}
