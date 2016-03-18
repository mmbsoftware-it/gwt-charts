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
 * The orientation for material design bars.
 */
public enum MaterialBarsOrientation {
	/**
	 * Vertical bars. 
	 */
	VERTICAL("vertical"),
	/**
	 * Horizontal bars.
	 */
	HORIZONTAL("horizontal");

	/**
	 * Get a MaterialBarsOrientation by providing its name.
	 * 
	 * @param name the MaterialBarsOrientation name.
	 * @return a MaterialBarsOrientation corresponding to the provided name.
	 */
	public static MaterialBarsOrientation findByName(String name) {
		for (MaterialBarsOrientation materialBarsOrientation : MaterialBarsOrientation.values()) {
			if (materialBarsOrientation.getName().equals(name)) {
				return materialBarsOrientation;
			}
		}
		return null;
	}

	private final String name;

	private MaterialBarsOrientation(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the MaterialBarsOrientation.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
