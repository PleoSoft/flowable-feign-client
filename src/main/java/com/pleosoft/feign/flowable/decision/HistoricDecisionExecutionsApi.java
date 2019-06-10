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

package com.pleosoft.feign.flowable.decision;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.decision.model.DataResponseHistoricDecisionExecutionResponse;
import com.pleosoft.feign.flowable.decision.model.HistoricDecisionExecutionResponse;

public interface HistoricDecisionExecutionsApi {

	/**
	 * Get a historic decision execution
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param historicDecisionExecutionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         historic decision execution is returned", response =
	 *         HistoricDecisionExecutionResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested historic decision
	 *         execution was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-history/historic-decision-executions/{historicDecisionExecutionId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<HistoricDecisionExecutionResponse> getHistoricDecisionExecution(
			@PathVariable("historicDecisionExecutionId") String historicDecisionExecutionId);

	/**
	 * Get a historic decision execution audit content
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param historicDecisionExecutionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the historic decision execution
	 *         has been found and the audit data has been returned.", response =
	 *         String.class),<br/>
	 *         code = 404, message = "Indicates the requested historic decision
	 *         execution was not found. The status-description contains
	 *         additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-history/historic-decision-executions/{historicDecisionExecutionId}/auditdata", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<String> getHistoricDecisionExecutionAuditData(
			@PathVariable("historicDecisionExecutionId") String historicDecisionExecutionId);

	/**
	 * List of historic decision executions
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return historic decision executions with the given
	 *            id.")
	 * @param decisionDefinitionId
	 *            ("Only return historic decision executions with the given
	 *            definition id.")
	 * @param deploymentId
	 *            ("Only return historic decision executions with the given
	 *            deployment id.")
	 * @param decisionKey
	 *            ("Only return historic decision executions with the given
	 *            decision key.")
	 * @param activityId
	 *            ("Only return historic decision executions with the given
	 *            activity id.")
	 * @param executionId
	 *            ("Only return historic decision executions with the given
	 *            execution id.")
	 * @param instanceId
	 *            ("Only return historic decision executions with the given
	 *            instance id.")
	 * @param failed
	 *            ("Only return historic decision executions with the failed
	 *            state.")
	 * @param tenantId
	 *            ("Only return historic decision executions with the given
	 *            tenant id.")
	 * @param tenantIdLike
	 *            ("Only return historic decision executions like the given
	 *            tenant id.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "startTime, endTime, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         historic decision executions are returned", response =
	 *         DataResponseHistoricDecisionExecutionResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-history/historic-decision-executions", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseHistoricDecisionExecutionResponse> listHistoricDecisionExecutions(
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "decisionDefinitionId", required = false) String decisionDefinitionId,
			@RequestParam(value = "deploymentId", required = false) String deploymentId,
			@RequestParam(value = "decisionKey", required = false) String decisionKey,
			@RequestParam(value = "activityId", required = false) String activityId,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "instanceId", required = false) String instanceId,
			@RequestParam(value = "failed", required = false) String failed,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "sort", required = false) String sort);

}
