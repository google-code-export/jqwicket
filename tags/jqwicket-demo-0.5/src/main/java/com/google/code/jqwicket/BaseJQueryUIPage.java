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
package com.google.code.jqwicket;

import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.IJQHeaderContributor;
import com.google.code.jqwicket.JQHeaderContributionTarget;

/**
 * @author mkalina
 * 
 */
public abstract class BaseJQueryUIPage extends WebPage implements
		IJQHeaderContributor {

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQHeaderContributor#contribute(com.google.code.jqwicket.JQHeaderContributionTarget)
	 */
	public void contribute(JQHeaderContributionTarget target) {
		target.addJavascriptResourceUrls("http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js");
		target.addCssResourceUrls("http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/themes/base/jquery-ui.css");

	}

}