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
 * The scale type for the axis.
 */
public enum AxisScaleType {
	/**
	 * Default scale type. 
	 */
	NULL(null),
	/**
	 * Logarithmic scaling. Negative and zero values are not plotted. 
	 */
	LOG("log"),
	/**
	 * Logarithmic scaling in which negative and zero values are plotted.
	 */
	MIRROR_LOG("mirrorLog");

	/**
	 * Get an AxisScaleType by providing its name.
	 * 
	 * @param name the AxisScaleType name.
	 * @return an AxisScaleType corresponding to the provided name.
	 */
	public static AxisScaleType findByName(String name) {
		for (AxisScaleType axisScaleType : AxisScaleType.values()) {
			if (axisScaleType.getName().equals(name)) {
				return axisScaleType;
			}
		}
		return null;
	}

	private final String name;

	private AxisScaleType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the AxisScaleType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
