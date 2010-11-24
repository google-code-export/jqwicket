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
package net.javaforge.jqwicket.ui.sparkline;

import net.javaforge.jqwicket.ui.JQWebMarkupContainer;

import org.apache.wicket.model.IModel;

/**
 * @author mkalina
 * 
 */
public class SparklineWebMarkupContainer extends
		JQWebMarkupContainer<SparklineBehavior, SparklineOptions> implements
		ISparkline {

	private static final long serialVersionUID = 1L;

	public SparklineWebMarkupContainer(String id) {
		this(id, new SparklineOptions());
	}

	public SparklineWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new SparklineOptions());
	}

	public SparklineWebMarkupContainer(String id, IModel<?> model,
			SparklineOptions options) {
		super(id, model, options);
	}

	public SparklineWebMarkupContainer(String id, SparklineOptions options) {
		super(id, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQWebMarkupContainer#newJQComponentBehavior(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	@Override
	protected SparklineBehavior newJQComponentBehavior(SparklineOptions options) {
		return new SparklineBehavior(options);
	}

}
