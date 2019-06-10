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
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class HistoricProcessInstanceResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("businessKey")
	private String businessKey = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("processDefinitionUrl")
	private String processDefinitionUrl = null;

	@JsonProperty("startTime")
	private Date startTime = null;

	@JsonProperty("endTime")
	private Date endTime = null;

	@JsonProperty("durationInMillis")
	private Long durationInMillis = null;

	@JsonProperty("startUserId")
	private String startUserId = null;

	@JsonProperty("startActivityId")
	private String startActivityId = null;

	@JsonProperty("endActivityId")
	private String endActivityId = null;

	@JsonProperty("deleteReason")
	private String deleteReason = null;

	@JsonProperty("superProcessInstanceId")
	private String superProcessInstanceId = null;

	@JsonProperty("variables")
	@Valid
	private List<RestVariable> variables = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	public HistoricProcessInstanceResponse id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HistoricProcessInstanceResponse url(String url) {
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

	public HistoricProcessInstanceResponse businessKey(String businessKey) {
		this.businessKey = businessKey;
		return this;
	}

	/**
	 * Get businessKey
	 * 
	 * @return businessKey
	 **/

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public HistoricProcessInstanceResponse processDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
		return this;
	}

	/**
	 * Get processDefinitionId
	 * 
	 * @return processDefinitionId
	 **/

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public HistoricProcessInstanceResponse processDefinitionUrl(String processDefinitionUrl) {
		this.processDefinitionUrl = processDefinitionUrl;
		return this;
	}

	/**
	 * Get processDefinitionUrl
	 * 
	 * @return processDefinitionUrl
	 **/

	public String getProcessDefinitionUrl() {
		return processDefinitionUrl;
	}

	public void setProcessDefinitionUrl(String processDefinitionUrl) {
		this.processDefinitionUrl = processDefinitionUrl;
	}

	public HistoricProcessInstanceResponse startTime(Date startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Get startTime
	 * 
	 * @return startTime
	 **/

	@Valid

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public HistoricProcessInstanceResponse endTime(Date endTime) {
		this.endTime = endTime;
		return this;
	}

	/**
	 * Get endTime
	 * 
	 * @return endTime
	 **/

	@Valid

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public HistoricProcessInstanceResponse durationInMillis(Long durationInMillis) {
		this.durationInMillis = durationInMillis;
		return this;
	}

	/**
	 * Get durationInMillis
	 * 
	 * @return durationInMillis
	 **/

	public Long getDurationInMillis() {
		return durationInMillis;
	}

	public void setDurationInMillis(Long durationInMillis) {
		this.durationInMillis = durationInMillis;
	}

	public HistoricProcessInstanceResponse startUserId(String startUserId) {
		this.startUserId = startUserId;
		return this;
	}

	/**
	 * Get startUserId
	 * 
	 * @return startUserId
	 **/

	public String getStartUserId() {
		return startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}

	public HistoricProcessInstanceResponse startActivityId(String startActivityId) {
		this.startActivityId = startActivityId;
		return this;
	}

	/**
	 * Get startActivityId
	 * 
	 * @return startActivityId
	 **/

	public String getStartActivityId() {
		return startActivityId;
	}

	public void setStartActivityId(String startActivityId) {
		this.startActivityId = startActivityId;
	}

	public HistoricProcessInstanceResponse endActivityId(String endActivityId) {
		this.endActivityId = endActivityId;
		return this;
	}

	/**
	 * Get endActivityId
	 * 
	 * @return endActivityId
	 **/

	public String getEndActivityId() {
		return endActivityId;
	}

	public void setEndActivityId(String endActivityId) {
		this.endActivityId = endActivityId;
	}

	public HistoricProcessInstanceResponse deleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
		return this;
	}

	/**
	 * Get deleteReason
	 * 
	 * @return deleteReason
	 **/

	public String getDeleteReason() {
		return deleteReason;
	}

	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}

	public HistoricProcessInstanceResponse superProcessInstanceId(String superProcessInstanceId) {
		this.superProcessInstanceId = superProcessInstanceId;
		return this;
	}

	/**
	 * Get superProcessInstanceId
	 * 
	 * @return superProcessInstanceId
	 **/

	public String getSuperProcessInstanceId() {
		return superProcessInstanceId;
	}

	public void setSuperProcessInstanceId(String superProcessInstanceId) {
		this.superProcessInstanceId = superProcessInstanceId;
	}

	public HistoricProcessInstanceResponse variables(List<RestVariable> variables) {
		this.variables = variables;
		return this;
	}

	public HistoricProcessInstanceResponse addVariablesItem(RestVariable variablesItem) {
		if (this.variables == null) {
			this.variables = new ArrayList<RestVariable>();
		}
		this.variables.add(variablesItem);
		return this;
	}

	/**
	 * Get variables
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

	public HistoricProcessInstanceResponse tenantId(String tenantId) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HistoricProcessInstanceResponse historicProcessInstanceResponse = (HistoricProcessInstanceResponse) o;
		return Objects.equals(this.id, historicProcessInstanceResponse.id)
				&& Objects.equals(this.url, historicProcessInstanceResponse.url)
				&& Objects.equals(this.businessKey, historicProcessInstanceResponse.businessKey)
				&& Objects.equals(this.processDefinitionId, historicProcessInstanceResponse.processDefinitionId)
				&& Objects.equals(this.processDefinitionUrl, historicProcessInstanceResponse.processDefinitionUrl)
				&& Objects.equals(this.startTime, historicProcessInstanceResponse.startTime)
				&& Objects.equals(this.endTime, historicProcessInstanceResponse.endTime)
				&& Objects.equals(this.durationInMillis, historicProcessInstanceResponse.durationInMillis)
				&& Objects.equals(this.startUserId, historicProcessInstanceResponse.startUserId)
				&& Objects.equals(this.startActivityId, historicProcessInstanceResponse.startActivityId)
				&& Objects.equals(this.endActivityId, historicProcessInstanceResponse.endActivityId)
				&& Objects.equals(this.deleteReason, historicProcessInstanceResponse.deleteReason)
				&& Objects.equals(this.superProcessInstanceId, historicProcessInstanceResponse.superProcessInstanceId)
				&& Objects.equals(this.variables, historicProcessInstanceResponse.variables)
				&& Objects.equals(this.tenantId, historicProcessInstanceResponse.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, businessKey, processDefinitionId, processDefinitionUrl, startTime, endTime,
				durationInMillis, startUserId, startActivityId, endActivityId, deleteReason, superProcessInstanceId,
				variables, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HistoricProcessInstanceResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
		sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
		sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
		sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
		sb.append("    startUserId: ").append(toIndentedString(startUserId)).append("\n");
		sb.append("    startActivityId: ").append(toIndentedString(startActivityId)).append("\n");
		sb.append("    endActivityId: ").append(toIndentedString(endActivityId)).append("\n");
		sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
		sb.append("    superProcessInstanceId: ").append(toIndentedString(superProcessInstanceId)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
