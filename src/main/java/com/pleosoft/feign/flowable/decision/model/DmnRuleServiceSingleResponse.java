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

package com.pleosoft.feign.flowable.decision.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class DmnRuleServiceSingleResponse {
	@JsonProperty("resultVariables")
	@Valid
	private List<EngineRestVariable> resultVariables = null;

	@JsonProperty("url")
	private String url = null;

	public DmnRuleServiceSingleResponse resultVariables(List<EngineRestVariable> resultVariables) {
		this.resultVariables = resultVariables;
		return this;
	}

	public DmnRuleServiceSingleResponse addResultVariablesItem(EngineRestVariable resultVariablesItem) {
		if (this.resultVariables == null) {
			this.resultVariables = new ArrayList<EngineRestVariable>();
		}
		this.resultVariables.add(resultVariablesItem);
		return this;
	}

	/**
	 * Get resultVariables
	 * 
	 * @return resultVariables
	 **/

	@Valid

	public List<EngineRestVariable> getResultVariables() {
		return resultVariables;
	}

	public void setResultVariables(List<EngineRestVariable> resultVariables) {
		this.resultVariables = resultVariables;
	}

	public DmnRuleServiceSingleResponse url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 * 
	 * @return url
	 **/

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DmnRuleServiceSingleResponse dmnRuleServiceSingleResponse = (DmnRuleServiceSingleResponse) o;
		return Objects.equals(this.resultVariables, dmnRuleServiceSingleResponse.resultVariables)
				&& Objects.equals(this.url, dmnRuleServiceSingleResponse.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resultVariables, url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DmnRuleServiceSingleResponse {\n");

		sb.append("    resultVariables: ").append(toIndentedString(resultVariables)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
