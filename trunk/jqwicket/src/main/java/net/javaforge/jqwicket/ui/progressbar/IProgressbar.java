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
package net.javaforge.jqwicket.ui.progressbar;

import net.javaforge.jqwicket.IJQUIWidget;
import net.javaforge.jqwicket.JQFunction;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 * 
 */
public interface IProgressbar extends IJQUIWidget<ProgressbarOptions> {

	static final String JQ_COMPONENT_NAME = "progressbar";

	/**
	 * Method to value the progressbar
	 * 
	 * @return the associated JsStatement
	 */
	JQFunction value(int value);

	/**
	 * Method to value the progressbar within the ajax request
	 * 
	 * @param ajaxRequestTarget
	 */
	void value(AjaxRequestTarget ajaxRequestTarget, int value);

}
