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
package net.javaforge.jqwicket.ui.uploadify;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.IJQOptions;
import net.javaforge.jqwicket.ui.JQComponentBehaivor;

import org.apache.wicket.RequestCycle;
import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 * 
 */
public class UploadifyBehavior extends JQComponentBehaivor<UploadifyOptions>
		implements IUploadify {

	private static final long serialVersionUID = 1L;

	public UploadifyBehavior() {
		this(new UploadifyOptions());
	}

	public UploadifyBehavior(UploadifyOptions options) {
		super(options);
		if (!options.containsKey("uploader"))
			options.put(
					"uploader",
					RequestCycle.get().urlFor(
							UploadifyOptions.SWF_UPLOADIFY_RESOURCE));

		if (!options.containsKey("expressInstall"))
			options.put(
					"expressInstall",
					RequestCycle.get().urlFor(
							UploadifyOptions.SWF_EXPRESS_INSTALL_RESOURCE));

		if (!options.containsKey("cancelImg"))
			options.put(
					"cancelImg",
					RequestCycle.get().urlFor(
							UploadifyOptions.PNG_CANCEL_RESOURCE));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQWidget#getName()
	 */
	public String getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadify()
	 */
	public JQFunction uploadify() {
		return chain("'uploadify'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadify(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void uploadify(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.uploadify());

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadify(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction uploadify(IJQOptions<?> options) {
		return chain("'uploadify'", options.toJson());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadify(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void uploadify(AjaxRequestTarget ajaxRequestTarget,
			IJQOptions<?> options) {
		chain(ajaxRequestTarget, this.uploadify(options));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyCancel(java.lang.String)
	 */
	public JQFunction uploadifyCancel(String id) {
		return chain("'uploadifyCancel'", id);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyCancel(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String)
	 */
	public void uploadifyCancel(AjaxRequestTarget ajaxRequestTarget, String id) {
		chain(ajaxRequestTarget, this.uploadifyCancel(id));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyClearQueue()
	 */
	public JQFunction uploadifyClearQueue() {
		return chain("'uploadifyClearQueue'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyClearQueue(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void uploadifyClearQueue(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.uploadifyClearQueue());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifySettings(java.lang.String,
	 *      java.lang.String)
	 */
	public JQFunction uploadifySettings(String name, String value) {
		return chain("'uploadifySettings'", name, value);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifySettings(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, java.lang.String)
	 */
	public void uploadifySettings(AjaxRequestTarget ajaxRequestTarget,
			String name, String value) {
		chain(ajaxRequestTarget, this.uploadifySettings(name, value));

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifySettings(java.lang.String,
	 *      java.lang.String, boolean)
	 */
	public JQFunction uploadifySettings(String name, String value,
			boolean resetObject) {
		return chain("'uploadifySettings'", name, value,
				String.valueOf(resetObject));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifySettings(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, java.lang.String, boolean)
	 */
	public void uploadifySettings(AjaxRequestTarget ajaxRequestTarget,
			String name, String value, boolean resetObject) {
		chain(ajaxRequestTarget,
				this.uploadifySettings(name, value, resetObject));

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyUpload()
	 */
	public JQFunction uploadifyUpload() {
		return chain("'uploadifyUpload'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyUpload(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void uploadifyUpload(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.uploadifyUpload());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyUpload(java.lang.String)
	 */
	public JQFunction uploadifyUpload(String id) {
		return chain("'uploadifyUpload'", id);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyUpload(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String)
	 */
	public void uploadifyUpload(AjaxRequestTarget ajaxRequestTarget, String id) {
		chain(ajaxRequestTarget, this.uploadifyUpload(id));
	}

}