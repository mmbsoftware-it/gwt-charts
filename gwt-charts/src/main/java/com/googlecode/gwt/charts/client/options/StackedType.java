/*
 * Copyright 2012 Rui Afonso
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.googlecode.gwt.charts.client.options;

/**
 * The stacked type.
 */
public enum StackedType {
	/**
	 * Stacks elements for all series at each domain value and rescales them such that they add up to 100%,
	 * with each element's value calculated as a percentage of 100%. 
	 */
	PERCENT("percent"),
	/**
	 * Stacks elements for all series at each domain value and rescales them such that they add up to 1, 
	 * with each element's value calculated as a fraction of 1. 
	 */
	RELATIVE("relative"),
	/**
	 * Functions the same as isStacked: true.
	 */
	ABSOLUTE("absolute");

	/**
	 * Get an StackedType by providing its name.
	 * 
	 * @param name the StackedType name.
	 * @return an StackedType corresponding to the provided name.
	 */
	public static StackedType findByName(String name) {
		for (StackedType stackedType : StackedType.values()) {
			if (stackedType.getName().equals(name)) {
				return stackedType;
			}
		}
		return null;
	}

	private final String name;

	private StackedType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the StackedType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
