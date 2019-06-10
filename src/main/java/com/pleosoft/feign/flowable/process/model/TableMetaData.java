/**
 * Copyright 2019 Pleo Soft d.o.o. (pleosoft.com)

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pleosoft.feign.flowable.process.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class TableMetaData {
	@JsonProperty("tableName")
	private String tableName = null;

	@JsonProperty("columnNames")
	@Valid
	private List<String> columnNames = null;

	@JsonProperty("columnTypes")
	@Valid
	private List<String> columnTypes = null;

	public TableMetaData tableName(String tableName) {
		this.tableName = tableName;
		return this;
	}

	/**
	 * Get tableName
	 * 
	 * @return tableName
	 **/

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public TableMetaData columnNames(List<String> columnNames) {
		this.columnNames = columnNames;
		return this;
	}

	public TableMetaData addColumnNamesItem(String columnNamesItem) {
		if (this.columnNames == null) {
			this.columnNames = new ArrayList<String>();
		}
		this.columnNames.add(columnNamesItem);
		return this;
	}

	/**
	 * Get columnNames
	 * 
	 * @return columnNames
	 **/

	public List<String> getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(List<String> columnNames) {
		this.columnNames = columnNames;
	}

	public TableMetaData columnTypes(List<String> columnTypes) {
		this.columnTypes = columnTypes;
		return this;
	}

	public TableMetaData addColumnTypesItem(String columnTypesItem) {
		if (this.columnTypes == null) {
			this.columnTypes = new ArrayList<String>();
		}
		this.columnTypes.add(columnTypesItem);
		return this;
	}

	/**
	 * Get columnTypes
	 * 
	 * @return columnTypes
	 **/

	public List<String> getColumnTypes() {
		return columnTypes;
	}

	public void setColumnTypes(List<String> columnTypes) {
		this.columnTypes = columnTypes;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TableMetaData tableMetaData = (TableMetaData) o;
		return Objects.equals(this.tableName, tableMetaData.tableName)
				&& Objects.equals(this.columnNames, tableMetaData.columnNames)
				&& Objects.equals(this.columnTypes, tableMetaData.columnTypes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tableName, columnNames, columnTypes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TableMetaData {\n");

		sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
		sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
		sb.append("    columnTypes: ").append(toIndentedString(columnTypes)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
