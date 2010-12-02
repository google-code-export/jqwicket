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
package net.javaforge.jqwicket.event;

/**
 * Enumeration describing all possible jquery keyboard events.
 * 
 * @author mkalina
 * 
 */
public enum KeyboardEvent implements IJQEvent {

	DOWN("keydown"), //
	PRESS("keypress"), //
	UP("keyup"), //
	FOCUSIN("focusin"), //
	FOCUSOUT("focusout");

	private String event;

	private KeyboardEvent(String event) {
		this.event = event;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.event.IJQEvent#getName()
	 */
	public String getName() {
		return this.event;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJsonAware#toJson()
	 */
	public CharSequence toJson() {
		return this.getName();
	}

}