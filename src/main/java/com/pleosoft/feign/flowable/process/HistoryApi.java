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

package com.pleosoft.feign.flowable.process;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.DataResponseHistoricActivityInstanceResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseHistoricDetailResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseHistoricVariableInstanceResponse;

public interface HistoryApi {

	/**
	 * Get the binary data for a historic detail variable
	 *
	 * <p>
	 * The response body contains the binary value of the variable. When the
	 * variable is of type binary, the content-type of the response is set to
	 * application/octet-stream, regardless of the content of the variable or
	 * the request accept-type header. In case of serializable,
	 * application/x-java-serialized-object is used as content-type.
	 * </p>
	 *
	 *
	 * @param detailId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the historic detail instance was
	 *         found and the requested variable data is returned.", response =
	 *         byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested historic detail
	 *         instance was not found or the historic detail instance does not
	 *         have a variable with the given name or the variable does not have
	 *         a binary stream available. Status message provides additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-detail/{detailId}/data", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getHistoricDetailVariableData(@PathVariable("detailId") String detailId);

	/**
	 * Get the binary data for a historic task instance variable
	 *
	 * <p>
	 * The response body contains the binary value of the variable. When the
	 * variable is of type binary, the content-type of the response is set to
	 * application/octet-stream, regardless of the content of the variable or
	 * the request accept-type header. In case of serializable,
	 * application/x-java-serialized-object is used as content-type.
	 * </p>
	 *
	 *
	 * @param varInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the variable instance was found
	 *         and the requested variable data is returned.", response =
	 *         byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested variable instance
	 *         was not found or the variable instance does not have a variable
	 *         with the given name or the variable does not have a binary stream
	 *         available. Status message provides additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-variable-instances/{varInstanceId}/data", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getHistoricInstanceVariableData(@PathVariable("varInstanceId") String varInstanceId);

	/**
	 * Get the binary data for a historic task instance variable
	 *
	 * <p>
	 * The response body contains the binary value of the variable. When the
	 * variable is of type binary, the content-type of the response is set to
	 * application/octet-stream, regardless of the content of the variable or
	 * the request accept-type header. In case of serializable,
	 * application/x-java-serialized-object is used as content-type.
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task instance was found and
	 *         the requested variable data is returned.", response =
	 *         byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task instance was
	 *         not found or the process instance does not have a variable with
	 *         the given name or the variable does not have a binary stream
	 *         available. Status message provides additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-task-instances/{taskId}/variables/{variableName}/data", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getHistoricTaskInstanceVariableData(@PathVariable("taskId") String taskId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * List historic activity instances
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param activityId
	 *            ("An id of the activity instance.")
	 * @param activityInstanceId
	 *            ("An id of the historic activity instance.")
	 * @param activityName
	 *            ("The name of the historic activity instance.")
	 * @param activityType
	 *            ("The element type of the historic activity instance.")
	 * @param executionId
	 *            ("The execution id of the historic activity instance.")
	 * @param finished
	 *            ("Indication if the historic activity instance is finished.")
	 * @param taskAssignee
	 *            ("The assignee of the historic activity instance.")
	 * @param processInstanceId
	 *            ("The process instance id of the historic activity instance.")
	 * @param processDefinitionId
	 *            ("The process definition id of the historic activity
	 *            instance.")
	 * @param tenantId
	 *            ("Only return instances with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return instances with a tenantId like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("If true, only returns instances without a tenantId set. If
	 *            false, the withoutTenantId parameter is ignored.")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates that historic activity instances
	 *         could be queried.", response =
	 *         DataResponseHistoricActivityInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-activity-instances", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseHistoricActivityInstanceResponse> listHistoricActivityInstances(
			@RequestParam(value = "activityId", required = false) String activityId,
			@RequestParam(value = "activityInstanceId", required = false) String activityInstanceId,
			@RequestParam(value = "activityName", required = false) String activityName,
			@RequestParam(value = "activityType", required = false) String activityType,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "finished", required = false) Boolean finished,
			@RequestParam(value = "taskAssignee", required = false) String taskAssignee,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId);

	/**
	 * Get historic detail
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("The id of the historic detail.")
	 * @param processInstanceId
	 *            ("The process instance id of the historic detail.")
	 * @param executionId
	 *            ("The execution id of the historic detail.")
	 * @param activityInstanceId
	 *            ("The activity instance id of the historic detail.")
	 * @param taskId
	 *            ("The task id of the historic detail.")
	 * @param selectOnlyFormProperties
	 *            ("Indication to only return form properties in the result.")
	 * @param selectOnlyVariableUpdates
	 *            ("Indication to only return variable updates in the result.")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates that historic detail could be
	 *         queried.", response =
	 *         DataResponseHistoricDetailResponse.class),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-detail", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseHistoricDetailResponse> listHistoricDetails(
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "activityInstanceId", required = false) String activityInstanceId,
			@RequestParam(value = "taskId", required = false) String taskId,
			@RequestParam(value = "selectOnlyFormProperties", required = false) Boolean selectOnlyFormProperties,
			@RequestParam(value = "selectOnlyVariableUpdates", required = false) Boolean selectOnlyVariableUpdates);

	/**
	 * List of historic variable instances
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("The process instance id of the historic variable instance.")
	 * @param taskId
	 *            ("The task id of the historic variable instance.")
	 * @param excludeTaskVariables
	 *            ("Indication to exclude the task variables from the result.")
	 * @param variableName
	 *            ("The variable name of the historic variable instance.")
	 * @param variableNameLike
	 *            ("The variable name using the like operator for the historic
	 *            variable instance.")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates that historic variable instances
	 *         could be queried.", response =
	 *         DataResponseHistoricVariableInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-variable-instances", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseHistoricVariableInstanceResponse> listHistoricVariableInstances(
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "taskId", required = false) String taskId,
			@RequestParam(value = "excludeTaskVariables", required = false) Boolean excludeTaskVariables,
			@RequestParam(value = "variableName", required = false) String variableName,
			@RequestParam(value = "variableNameLike", required = false) String variableNameLike);

}
