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
package com.google.code.jqwicket.ui.markitup;


import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import com.google.code.jqwicket.api.AbstractJQOptions;

/**
 * @author mkalina
 * 
 */
public class MarkItUpOptions extends AbstractJQOptions<MarkItUpOptions> {

	private static final long serialVersionUID = 1L;

	private static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			MarkItUpOptions.class, "jquery.markitup.js");

	private MarkItUpSet set;

	private MarkItUpSkin skin;

	public MarkItUpOptions() {
		this(MarkItUpSet.DEFAULT, MarkItUpSkin.MARKITUP);
	}

	public MarkItUpOptions(MarkItUpSet set) {
		this(set, MarkItUpSkin.MARKITUP);
	}

	public MarkItUpOptions(MarkItUpSkin skin) {
		this(MarkItUpSet.DEFAULT, skin);
	}

	public MarkItUpOptions(MarkItUpSet set, MarkItUpSkin skin) {
		this.set = set;
		this.skin = skin;
		setJsResourceReferences(JS_RESOURCE, set.getJsResource());
		setCssResourceReferences(set.getCssResource(), skin.getCssResource());
	}

	public MarkItUpSet getSet() {
		return set;
	}

	public MarkItUpSkin getSkin() {
		return skin;
	}

	public boolean hasSet() {
		return this.set != null;
	}

	public boolean hasSkin() {
		return this.skin != null;
	}

}