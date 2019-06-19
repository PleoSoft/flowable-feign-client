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

package com.pleosoft.feign.flowable.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class DataResponseAppDefinitionResponse {
	@JsonProperty("data")
	@Valid
	private List<AppDefinitionResponse> data = null;

	@JsonProperty("total")
	private Long total = null;

	@JsonProperty("start")
	private Integer start = null;

	@JsonProperty("sort")
	private String sort = null;

	@JsonProperty("order")
	private String order = null;

	@JsonProperty("size")
	private Integer size = null;

	public DataResponseAppDefinitionResponse data(List<AppDefinitionResponse> data) {
		this.data = data;
		return this;
	}

	public DataResponseAppDefinitionResponse addDataItem(AppDefinitionResponse dataItem) {
		if (this.data == null) {
			this.data = new ArrayList<AppDefinitionResponse>();
		}
		this.data.add(dataItem);
		return this;
	}

	/**
	 * Get data
	 * 
	 * @return data
	 **/

	@Valid

	public List<AppDefinitionResponse> getData() {
		return data;
	}

	public void setData(List<AppDefinitionResponse> data) {
		this.data = data;
	}

	public DataResponseAppDefinitionResponse total(Long total) {
		this.total = total;
		return this;
	}

	/**
	 * Get total
	 * 
	 * @return total
	 **/

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public DataResponseAppDefinitionResponse start(Integer start) {
		this.start = start;
		return this;
	}

	/**
	 * Get start
	 * 
	 * @return start
	 **/

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public DataResponseAppDefinitionResponse sort(String sort) {
		this.sort = sort;
		return this;
	}

	/**
	 * Get sort
	 * 
	 * @return sort
	 **/

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public DataResponseAppDefinitionResponse order(String order) {
		this.order = order;
		return this;
	}

	/**
	 * Get order
	 * 
	 * @return order
	 **/

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public DataResponseAppDefinitionResponse size(Integer size) {
		this.size = size;
		return this;
	}

	/**
	 * Get size
	 * 
	 * @return size
	 **/

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DataResponseAppDefinitionResponse dataResponseAppDefinitionResponse = (DataResponseAppDefinitionResponse) o;
		return Objects.equals(this.data, dataResponseAppDefinitionResponse.data)
				&& Objects.equals(this.total, dataResponseAppDefinitionResponse.total)
				&& Objects.equals(this.start, dataResponseAppDefinitionResponse.start)
				&& Objects.equals(this.sort, dataResponseAppDefinitionResponse.sort)
				&& Objects.equals(this.order, dataResponseAppDefinitionResponse.order)
				&& Objects.equals(this.size, dataResponseAppDefinitionResponse.size);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, total, start, sort, order, size);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DataResponseAppDefinitionResponse {\n");

		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
		sb.append("    start: ").append(toIndentedString(start)).append("\n");
		sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
