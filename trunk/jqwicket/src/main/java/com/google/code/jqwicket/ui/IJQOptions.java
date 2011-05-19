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
package com.google.code.jqwicket.ui;

import java.io.Serializable;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import com.google.code.jqwicket.IJsonAware;
import com.google.code.jqwicket.JQFunction;
import com.google.code.jqwicket.JQStatement;

/**
 * @author mkalina
 * 
 * @param <T>
 *            is a type of options itself.
 */
public interface IJQOptions<T extends IJQOptions<?>> extends Serializable,
		IJsonAware {

	/**
	 * Sets css resource references necessary for component rendering. If
	 * nothing set, default resources will be used.
	 * 
	 * @param refs
	 * @return
	 */
	T setCssResourceReferences(ResourceReference... refs);

	/**
	 * Sets css resource urls necessary for component rendering. If nothing set,
	 * default resources will be used.
	 * 
	 * @param refs
	 * @return
	 */
	T setCssResourceUrls(CharSequence... urls);

	/**
	 * Adds additional css resource references necessary for component
	 * rendering.
	 * 
	 * @param refs
	 * 
	 * @return
	 */
	T addCssResourceReferences(ResourceReference... refs);

	/**
	 * Adds additional css resource urls necessary for component rendering.
	 * 
	 * @param urls
	 * @return
	 */
	T addCssResourceUrls(CharSequence... urls);

	/**
	 * Returns css resource references necessary for component rendering.
	 * 
	 * @return
	 */
	ResourceReference[] getCssResourceReferences();

	/**
	 * Returns css resource urls necessary for component rendering.
	 * 
	 * @return
	 */
	CharSequence[] getCssResourceUrls();

	/**
	 * Sets minified javascript resource references necessary for component
	 * rendering. If nothing set, default resources will be used.
	 * 
	 * @param refs
	 * @return
	 */
	T setJsResourceReferencesMin(JavascriptResourceReference... refs);

	/**
	 * Adds additional (minified) resource references necessary for component
	 * rendering.
	 * 
	 * @param refs
	 * @return
	 */
	T addJsResourceReferencesMin(JavascriptResourceReference... refs);

	/**
	 * Sets minified javascript resource urls necessary for component rendering.
	 * If nothing set, default resources will be used.
	 * 
	 * @param refs
	 * @return
	 */
	T setJsResourceUrlsMin(CharSequence... urls);

	/**
	 * Adds additional (minified) resource urls necessary for component
	 * rendering.
	 * 
	 * @param urls
	 * @return
	 */
	T addJsResourceUrlsMin(CharSequence... urls);

	/**
	 * Returns minified javascript resource references necessary for component
	 * rendering.
	 * 
	 * @return
	 */
	JavascriptResourceReference[] getJsResourceReferencesMin();

	/**
	 * Returns minified javascript resource urls necessary for component
	 * rendering.
	 * 
	 * @return
	 */
	CharSequence[] getJsResourceUrlsMin();

	/**
	 * Sets javascript resource references necessary for component rendering. If
	 * nothing set, default resources will be used.
	 * 
	 * @param refs
	 * @return
	 */
	T setJsResourceReferences(JavascriptResourceReference... refs);

	/**
	 * Adds additional javascript resource references necessary for component
	 * rendering.
	 * 
	 * @param refs
	 * @return
	 */
	T addJsResourceReferences(JavascriptResourceReference... refs);

	/**
	 * Sets javascript resource urls necessary for component rendering. If
	 * nothing set, default resources will be used.
	 * 
	 * @param refs
	 * @return
	 */
	T setJsResourceUrls(CharSequence... urls);

	/**
	 * Adds additional javascript resource references necessary for component
	 * rendering.
	 * 
	 * @param urls
	 * @return
	 */
	T addJsResourceUrls(CharSequence... urls);

	/**
	 * Returns javascript resource references necessary for component rendering.
	 * 
	 * @return
	 */
	JavascriptResourceReference[] getJsResourceReferences();

	/**
	 * Returns javascript resource urls necessary for component rendering.
	 * 
	 * @return
	 */
	CharSequence[] getJsResourceUrls();

	boolean isEmpty();

	CharSequence get(CharSequence key);

	CharSequence get(CharSequence key, CharSequence defaultValue);

	String getString(CharSequence key);

	String getString(CharSequence key, String defaultValue);

	Object getObject(CharSequence key);

	JQStatement getJQStatement(CharSequence key);

	int getInt(CharSequence key);

	int getInt(CharSequence key, int defaultValue);

	AbstractJQOptions<?> getOptions(CharSequence key);

	short getShort(CharSequence key);

	short getShort(CharSequence key, short defaultValue);

	double getDouble(CharSequence key);

	double getDouble(CharSequence key, double defaultValue);

	float getFloat(CharSequence key);

	float getFloat(CharSequence key, float defaultValue);

	boolean getBoolean(CharSequence key);

	boolean getBoolean(CharSequence key, boolean defaultValue);

	T putUnquoted(CharSequence key, CharSequence value);

	T putDblquoted(CharSequence key, CharSequence value);

	T put(CharSequence key, IJQOptions<?> options);

	T put(CharSequence key, Enum<?> enumVal);

	T putUnquoted(CharSequence key, Enum<?> enumVal);

	T put(CharSequence name, JQStatement value);

	T put(CharSequence name, JQFunction value);

	T put(CharSequence key, CharSequence value);

	T put(CharSequence key, int value);

	T put(CharSequence key, int... values);

	T put(CharSequence key, double value);

	T put(CharSequence key, double... values);

	T put(CharSequence key, float value);

	T put(CharSequence key, float... values);

	T put(CharSequence key, boolean value);

	T put(CharSequence key, boolean... values);

	T put(CharSequence key, IJsonAware... values);

	T put(CharSequence key, CharSequence... values);

	T put(CharSequence key, CharSequence[][] values);

	void removeOption(CharSequence key);

	boolean containsKey(CharSequence key);

}
