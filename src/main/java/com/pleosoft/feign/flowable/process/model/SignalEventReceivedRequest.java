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

public class SignalEventReceivedRequest {
	@JsonProperty("signalName")
	private String signalName = null;

	@JsonProperty("variables")
	@Valid
	private List<RestVariable> variables = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("async")
	private Boolean async = null;

	public SignalEventReceivedRequest signalName(String signalName) {
		this.signalName = signalName;
		return this;
	}

	/**
	 * Name of the signal
	 * 
	 * @return signalName
	 **/

	public String getSignalName() {
		return signalName;
	}

	public void setSignalName(String signalName) {
		this.signalName = signalName;
	}

	public SignalEventReceivedRequest variables(List<RestVariable> variables) {
		this.variables = variables;
		return this;
	}

	public SignalEventReceivedRequest addVariablesItem(RestVariable variablesItem) {
		if (this.variables == null) {
			this.variables = new ArrayList<RestVariable>();
		}
		this.variables.add(variablesItem);
		return this;
	}

	/**
	 * Array of variables (in the general variables format) to use as payload to
	 * pass along with the signal. Cannot be used in case async is set to true,
	 * this will result in an error.
	 * 
	 * @return variables
	 **/

	@Valid

	public List<RestVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<RestVariable> variables) {
		this.variables = variables;
	}

	public SignalEventReceivedRequest tenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	/**
	 * ID of the tenant that the signal event should be processed in
	 * 
	 * @return tenantId
	 **/

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public SignalEventReceivedRequest async(Boolean async) {
		this.async = async;
		return this;
	}

	/**
	 * If true, handling of the signal will happen asynchronously. Return code
	 * will be 202 - Accepted to indicate the request is accepted but not yet
	 * executed. If false, handling the signal will be done immediately and
	 * result (200 - OK) will only return after this completed successfully.
	 * Defaults to false if omitted.
	 * 
	 * @return async
	 **/

	public Boolean isAsync() {
		return async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SignalEventReceivedRequest signalEventReceivedRequest = (SignalEventReceivedRequest) o;
		return Objects.equals(this.signalName, signalEventReceivedRequest.signalName)
				&& Objects.equals(this.variables, signalEventReceivedRequest.variables)
				&& Objects.equals(this.tenantId, signalEventReceivedRequest.tenantId)
				&& Objects.equals(this.async, signalEventReceivedRequest.async);
	}

	@Override
	public int hashCode() {
		return Objects.hash(signalName, variables, tenantId, async);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SignalEventReceivedRequest {\n");

		sb.append("    signalName: ").append(toIndentedString(signalName)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    async: ").append(toIndentedString(async)).append("\n");
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
