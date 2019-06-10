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

public class DataResponseTaskResponse {
	@JsonProperty("data")
	@Valid
	private List<TaskResponse> data = null;

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

	public DataResponseTaskResponse data(List<TaskResponse> data) {
		this.data = data;
		return this;
	}

	public DataResponseTaskResponse addDataItem(TaskResponse dataItem) {
		if (this.data == null) {
			this.data = new ArrayList<TaskResponse>();
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

	public List<TaskResponse> getData() {
		return data;
	}

	public void setData(List<TaskResponse> data) {
		this.data = data;
	}

	public DataResponseTaskResponse total(Long total) {
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

	public DataResponseTaskResponse start(Integer start) {
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

	public DataResponseTaskResponse sort(String sort) {
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

	public DataResponseTaskResponse order(String order) {
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

	public DataResponseTaskResponse size(Integer size) {
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
		DataResponseTaskResponse dataResponseTaskResponse = (DataResponseTaskResponse) o;
		return Objects.equals(this.data, dataResponseTaskResponse.data)
				&& Objects.equals(this.total, dataResponseTaskResponse.total)
				&& Objects.equals(this.start, dataResponseTaskResponse.start)
				&& Objects.equals(this.sort, dataResponseTaskResponse.sort)
				&& Objects.equals(this.order, dataResponseTaskResponse.order)
				&& Objects.equals(this.size, dataResponseTaskResponse.size);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, total, start, sort, order, size);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DataResponseTaskResponse {\n");

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
