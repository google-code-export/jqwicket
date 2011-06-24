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
package com.google.code.jqwicket.ui.guider;

import java.io.Serializable;

import com.google.code.jqwicket.api.IJQStatement;
import com.google.code.jqwicket.api.JQuery;

/**
 * @author mkalina
 * 
 */
public class GuiderItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean showOnStartup = false;

	private GuiderOptions options;

	public GuiderItem(GuiderOptions options) {
		this(options, false);
	}

	public GuiderItem(GuiderOptions options, boolean showOnStartup) {
		this.options = options;
		this.showOnStartup = showOnStartup;
	}

	public boolean isShowOnStartup() {
		return showOnStartup;
	}

	public GuiderOptions getOptions() {
		return options;
	}

	public IJQStatement toJQStatement() {
		IJQStatement stmt = JQuery.js("guider").chain("createGuider",
				this.options);
		if (showOnStartup)
			stmt.show();
		return stmt;
	}

}
