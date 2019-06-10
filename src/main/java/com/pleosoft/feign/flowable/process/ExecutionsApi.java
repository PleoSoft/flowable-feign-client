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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.DataResponseExecutionResponse;
import com.pleosoft.feign.flowable.process.model.ExecutionActionRequest;
import com.pleosoft.feign.flowable.process.model.ExecutionQueryRequest;
import com.pleosoft.feign.flowable.process.model.ExecutionResponse;
import com.pleosoft.feign.flowable.process.model.RestVariable;

public interface ExecutionsApi {

	/**
	 * Create variables on an execution
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body (array of
	 * RestVariable) or by passing a multipart/form-data Object. Any number of
	 * variables can be passed into the request body array. NB: The
	 * multipart/form-data approach is not documented for this endpoint due to
	 * design restriction.
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @param body
	 *            (value = "Update a task variable" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         Object.class),<br/>
	 *         code = 201, message = "Indicates the execution was found and
	 *         variable is created/updated."),<br/>
	 *         code = 400, message = "Indicates the request body is incomplete
	 *         or contains illegal values. The status description contains
	 *         additional information about the error."),<br/>
	 *         code = 404, message = "Indicates the requested execution was not
	 *         found."),<br/>
	 *         code = 409, message = "Indicates the execution was found but
	 *         already contains a variable with the given name. Use the
	 *         update-method instead.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/variables", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	ResponseEntity<Object> createExecutionVariable(@PathVariable("executionId") String executionId,
			@RequestBody RestVariable body);

	/**
	 * Update variables on an execution
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body of
	 * RestVariable) or by passing a multipart/form-data Object. Any number of
	 * variables can be passed into the request body array. NB: The
	 * multipart/form-data approach is not documented for this endpoint due to
	 * design restriction.
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @param body
	 *            (value = "Update a task variable" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         Object.class),<br/>
	 *         code = 201, message = "Indicates the execution was found and
	 *         variable is created/updated."),<br/>
	 *         code = 400, message = "Indicates the request body is incomplete
	 *         or contains illegal values. The status description contains
	 *         additional information about the error."),<br/>
	 *         code = 404, message = "Indicates the requested execution was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/variables", produces = "application/json", consumes = "application/json", method = RequestMethod.PUT)
	ResponseEntity<Object> createOrUpdateExecutionVariable(@PathVariable("executionId") String executionId,
			@RequestBody RestVariable body);

	/**
	 * Delete all variables for an execution
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the execution was found and
	 *         variables have been deleted."),<br/>
	 *         code = 404, message = "Indicates the requested execution was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/variables", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteLocalVariables(@PathVariable("executionId") String executionId);

	/**
	 * Delete a variable for an execution
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates both the execution and variable
	 *         were found and variable has been deleted."),<br/>
	 *         code = 404, message = "Indicates the requested execution was not
	 *         found or the execution does not have a variable with the given
	 *         name in the requested scope. Status description contains
	 *         additional information about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/variables/{variableName}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deletedExecutionVariable(@PathVariable("executionId") String executionId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * Signal event received
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates request was successful and the
	 *         executions are returned"),<br/>
	 *         code = 404, message = "Indicates a parameter was passed in the
	 *         wrong format . The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions", method = RequestMethod.PUT)
	ResponseEntity<Void> executeExecutionAction(@RequestBody ExecutionActionRequest body);

	/**
	 * Get an execution
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the execution was found and
	 *         returned.", response = ExecutionResponse.class),<br/>
	 *         code = 404, message = "Indicates the execution was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<ExecutionResponse> getExecution(@PathVariable("executionId") String executionId);

	/**
	 * Get a variable for an execution
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both the execution and variable
	 *         were found and variable is returned.", response =
	 *         RestVariable.class),<br/>
	 *         code = 400, message = "Indicates the request body is incomplete
	 *         or contains illegal values. The status description contains
	 *         additional information about the error."),<br/>
	 *         code = 404, message = "Indicates the requested execution was not
	 *         found or the execution does not have a variable with the given
	 *         name in the requested scope (in case scope-query parameter was
	 *         omitted, variable does not exist in local and global scope).
	 *         Status description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/variables/{variableName}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<RestVariable> getExecutionVariable(@PathVariable("executionId") String executionId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * Get the binary data for an execution
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the execution was found and the
	 *         requested variables are returned.", response = byte[].class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested execution was not
	 *         found or the task does not have a variable with the given name
	 *         (in the given scope). Status message provides additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/variables/{variableName}/data", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getExecutionVariableData(@PathVariable("executionId") String executionId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * List active activities in an execution
	 *
	 * <p>
	 * Returns all activities which are active in the execution and in all
	 * child-executions (and their children, recursively), if any.
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the execution was found and
	 *         activities are returned.", response = String.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the execution was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/activities", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<String>> listExecutionActiveActivities(@PathVariable("executionId") String executionId);

	/**
	 * List variables for an execution
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the execution was found and
	 *         variables are returned.", response = RestVariable.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested execution was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/variables", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<RestVariable>> listExecutionVariables(@PathVariable("executionId") String executionId,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * List of executions
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return models with the given version.")
	 * @param activityId
	 *            ("Only return executions with the given activity id.")
	 * @param processDefinitionKey
	 *            ("Only return process instances with the given process
	 *            definition key.")
	 * @param processDefinitionId
	 *            ("Only return process instances with the given process
	 *            definition id.")
	 * @param processInstanceId
	 *            ("Only return executions which are part of the process
	 *            instance with the given id.")
	 * @param messageEventSubscriptionName
	 *            ("Only return executions which are subscribed to a message
	 *            with the given name.")
	 * @param signalEventSubscriptionName
	 *            ("Only return executions which are subscribed to a signal with
	 *            the given name.")
	 * @param parentId
	 *            ("Only return executions which are a direct child of the given
	 *            execution.")
	 * @param tenantId
	 *            ("Only return process instances with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return process instances with a tenantId like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("If true, only returns process instances without a tenantId
	 *            set. If false, the withoutTenantId parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "processInstanceId, processDefinitionId,
	 *            processDefinitionKey, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         executions are returned", response =
	 *         DataResponseExecutionResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format . The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseExecutionResponse> listExecutions(
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "activityId", required = false) String activityId,
			@RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "messageEventSubscriptionName", required = false) String messageEventSubscriptionName,
			@RequestParam(value = "signalEventSubscriptionName", required = false) String signalEventSubscriptionName,
			@RequestParam(value = "parentId", required = false) String parentId,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * Execute an action on an execution
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the execution was found and the
	 *         action is performed.", response = ExecutionResponse.class),<br/>
	 *         code = 204, message = "Indicates the execution was found, the
	 *         action was performed and the action caused the execution to
	 *         end."),<br/>
	 *         code = 400, message = "Indicates an illegal action was requested,
	 *         required parameters are missing in the request body or illegal
	 *         variables are passed in. Status description contains additional
	 *         information about the error."),<br/>
	 *         code = 404, message = "Indicates the execution was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<ExecutionResponse> performExecutionAction(@PathVariable("executionId") String executionId,
			@RequestBody ExecutionActionRequest body);

	/**
	 * Query executions
	 *
	 * <p>
	 * The request body can contain all possible filters that can be used in the
	 * List executions URL query. On top of these, it?s possible to provide an
	 * array of variables and processInstanceVariables to include in the query,
	 * with their format described here. The general paging and sorting
	 * query-parameters can be used for this URL.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         executions are returned.", response =
	 *         DataResponseExecutionResponse.class),<br/>
	 *         code = 404, message = "Indicates a parameter was passed in the
	 *         wrong format . The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/executions", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseExecutionResponse> queryExecutions(@RequestBody ExecutionQueryRequest body);

	/**
	 * Update a variable on an execution
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body
	 * (RestVariable) or by passing a multipart/form-data Object. NB: The
	 * multipart/form-data approach is not documented for this endpoint due to
	 * design restriction.
	 * </p>
	 *
	 *
	 * @param executionId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param body
	 *            (value = "Update a variable on an execution" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both the process instance and
	 *         variable were found and variable is updated.", response =
	 *         RestVariable.class),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found or the process instance does not have a variable
	 *         with the given name. Status description contains additional
	 *         information about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/executions/{executionId}/variables/{variableName}", produces = "application/json", consumes = "application/json", method = RequestMethod.PUT)
	ResponseEntity<RestVariable> updateExecutionVariable(@PathVariable("executionId") String executionId,
			@PathVariable("variableName") String variableName, @RequestBody RestVariable body);

}
