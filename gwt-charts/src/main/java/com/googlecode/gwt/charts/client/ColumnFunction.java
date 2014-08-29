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
package com.googlecode.gwt.charts.client;

/**
 * An interface for providing a calculated function to a DataViewColumn.
 */
public interface ColumnFunction {
	/**
	 * A function that will be called for each row in the column to calculate a value for that cell. The function
	 * signature is func(dataTable, row), where dataTable is the source DataTable, and row is the index of the
	 * source data row. The function should return a single value of the type specified by type.
	 * 
	 * @param dataTable is the source DataTable
	 * @param row is the index of the source data row
	 * @return should return a single value of the type specified by the column type
	 */
	public Object calc(DataTable dataTable, int row);
}