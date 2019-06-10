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

public class DmnRuleServiceRequest {
	@JsonProperty("decisionKey")
	private String decisionKey = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("parentDeploymentId")
	private String parentDeploymentId = null;

	@JsonProperty("inputVariables")
	@Valid
	private List<EngineRestVariable> inputVariables = null;

	public DmnRuleServiceRequest decisionKey(String decisionKey) {
		this.decisionKey = decisionKey;
		return this;
	}

	/**
	 * Get decisionKey
	 * 
	 * @return decisionKey
	 **/

	public String getDecisionKey() {
		return decisionKey;
	}

	public void setDecisionKey(String decisionKey) {
		this.decisionKey = decisionKey;
	}

	public DmnRuleServiceRequest tenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	/**
	 * Get tenantId
	 * 
	 * @return tenantId
	 **/

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public DmnRuleServiceRequest parentDeploymentId(String parentDeploymentId) {
		this.parentDeploymentId = parentDeploymentId;
		return this;
	}

	/**
	 * Get parentDeploymentId
	 * 
	 * @return parentDeploymentId
	 **/

	public String getParentDeploymentId() {
		return parentDeploymentId;
	}

	public void setParentDeploymentId(String parentDeploymentId) {
		this.parentDeploymentId = parentDeploymentId;
	}

	public DmnRuleServiceRequest inputVariables(List<EngineRestVariable> inputVariables) {
		this.inputVariables = inputVariables;
		return this;
	}

	public DmnRuleServiceRequest addInputVariablesItem(EngineRestVariable inputVariablesItem) {
		if (this.inputVariables == null) {
			this.inputVariables = new ArrayList<EngineRestVariable>();
		}
		this.inputVariables.add(inputVariablesItem);
		return this;
	}

	/**
	 * Get inputVariables
	 * 
	 * @return inputVariables
	 **/

	@Valid

	public List<EngineRestVariable> getInputVariables() {
		return inputVariables;
	}

	public void setInputVariables(List<EngineRestVariable> inputVariables) {
		this.inputVariables = inputVariables;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DmnRuleServiceRequest dmnRuleServiceRequest = (DmnRuleServiceRequest) o;
		return Objects.equals(this.decisionKey, dmnRuleServiceRequest.decisionKey)
				&& Objects.equals(this.tenantId, dmnRuleServiceRequest.tenantId)
				&& Objects.equals(this.parentDeploymentId, dmnRuleServiceRequest.parentDeploymentId)
				&& Objects.equals(this.inputVariables, dmnRuleServiceRequest.inputVariables);
	}

	@Override
	public int hashCode() {
		return Objects.hash(decisionKey, tenantId, parentDeploymentId, inputVariables);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DmnRuleServiceRequest {\n");

		sb.append("    decisionKey: ").append(toIndentedString(decisionKey)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    parentDeploymentId: ").append(toIndentedString(parentDeploymentId)).append("\n");
		sb.append("    inputVariables: ").append(toIndentedString(inputVariables)).append("\n");
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
