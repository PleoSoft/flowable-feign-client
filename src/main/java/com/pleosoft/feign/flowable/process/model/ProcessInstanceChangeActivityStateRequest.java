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

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class ProcessInstanceChangeActivityStateRequest {
	@JsonProperty("cancelActivityId")
	private String cancelActivityId = null;

	@JsonProperty("startActivityId")
	private String startActivityId = null;

	public ProcessInstanceChangeActivityStateRequest cancelActivityId(String cancelActivityId) {
		this.cancelActivityId = cancelActivityId;
		return this;
	}

	/**
	 * activityId to be canceled
	 * 
	 * @return cancelActivityId
	 **/

	public String getCancelActivityId() {
		return cancelActivityId;
	}

	public void setCancelActivityId(String cancelActivityId) {
		this.cancelActivityId = cancelActivityId;
	}

	public ProcessInstanceChangeActivityStateRequest startActivityId(String startActivityId) {
		this.startActivityId = startActivityId;
		return this;
	}

	/**
	 * activityId to be started
	 * 
	 * @return startActivityId
	 **/

	public String getStartActivityId() {
		return startActivityId;
	}

	public void setStartActivityId(String startActivityId) {
		this.startActivityId = startActivityId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProcessInstanceChangeActivityStateRequest processInstanceChangeActivityStateRequest = (ProcessInstanceChangeActivityStateRequest) o;
		return Objects.equals(this.cancelActivityId, processInstanceChangeActivityStateRequest.cancelActivityId)
				&& Objects.equals(this.startActivityId, processInstanceChangeActivityStateRequest.startActivityId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cancelActivityId, startActivityId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProcessInstanceChangeActivityStateRequest {\n");

		sb.append("    cancelActivityId: ").append(toIndentedString(cancelActivityId)).append("\n");
		sb.append("    startActivityId: ").append(toIndentedString(startActivityId)).append("\n");
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
