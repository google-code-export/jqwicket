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
import net.javaforge.jqwicket.JQUIWidget;
import net.javaforge.jqwicket.ui.IJQOptions;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 *
 */
public interface INotifier extends JQUIWidget<NotifierOptions> {

	static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			INotifier.class, "jquery.notify.js");

	static final JavascriptResourceReference JS_RESOURCE_MIN = new JavascriptResourceReference(
			INotifier.class, "jquery.notify.min.js");

	static final ResourceReference CSS_RESOURCE = new ResourceReference(
			INotifier.class, "ui.notify.css");

	JQFunction create(String title, String text);

	void create(AjaxRequestTarget ajaxRequestTarget, String title, String text);

	JQFunction create(IJQOptions<?> msg);

	void create(AjaxRequestTarget ajaxRequestTarget, IJQOptions<?> msg);

	JQFunction create(String template, IJQOptions<?> msg);

	void create(AjaxRequestTarget ajaxRequestTarget, String template,
			IJQOptions<?> msg);

	JQFunction create(String template, IJQOptions<?> msg, IJQOptions<?> options);

	void create(AjaxRequestTarget ajaxRequestTarget, String template,
			IJQOptions<?> msg, IJQOptions<?> options);

	JQFunction open();

	void open(AjaxRequestTarget ajaxRequestTarget);

	JQFunction close();

	void close(AjaxRequestTarget ajaxRequestTarget);

}
