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

import com.pleosoft.feign.flowable.process.model.DataResponseProcessInstanceResponse;
import com.pleosoft.feign.flowable.process.model.ProcessInstanceActionRequest;
import com.pleosoft.feign.flowable.process.model.ProcessInstanceChangeActivityStateRequest;
import com.pleosoft.feign.flowable.process.model.ProcessInstanceCreateRequest;
import com.pleosoft.feign.flowable.process.model.ProcessInstanceResponse;

public interface ProcessInstancesApi {

	/**
	 * Change the state a process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and change state activity was executed."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found."),<br/>
	 *         code = 409, message = "Indicates the requested process instance
	 *         action cannot be executed since the process-instance is already
	 *         activated/suspended.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/change-state", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<Void> changeActivityState(@PathVariable("processInstanceId") String processInstanceId,
			@RequestBody ProcessInstanceChangeActivityStateRequest body);

	/**
	 * Start a process instance
	 *
	 * <p>
	 * Note that also a *transientVariables* property is accepted as part of
	 * this json, that follows the same structure as the *variables* property.
	 * Only one of *processDefinitionId*, *processDefinitionKey* or *message*
	 * can be used in the request body. Parameters *businessKey*, *variables*
	 * and *tenantId* are optional. If tenantId is omitted, the default tenant
	 * will be used. More information about the variable format can be found in
	 * the REST variables section. Note that the variable-scope that is supplied
	 * is ignored, process-variables are always local.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         ProcessInstanceResponse.class),<br/>
	 *         code = 201, message = "Indicates the process instance was
	 *         created."),<br/>
	 *         code = 400, message = "Indicates either the process-definition
	 *         was not found (based on id or key), no process is started by
	 *         sending the given message or an invalid variable has been passed.
	 *         Status description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<ProcessInstanceResponse> createProcessInstance(@RequestBody ProcessInstanceCreateRequest body);

	/**
	 * Delete a process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param deleteReason
	 *            ("")
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the process instance was found
	 *         and deleted. Response body is left empty intentionally."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteProcessInstance(@PathVariable("processInstanceId") String processInstanceId,
			@RequestParam(value = "deleteReason", required = false) String deleteReason);

	/**
	 * Get a process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and returned.", response = ProcessInstanceResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<ProcessInstanceResponse> getProcessInstance(
			@PathVariable("processInstanceId") String processInstanceId);

	/**
	 * Get diagram for a process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and the diagram was returned.", response = byte[].class,
	 *         responseContainer = "List"),<br/>
	 *         code = 400, message = "Indicates the requested process instance
	 *         was not found but the process does not contain any graphical
	 *         information (BPMN:DI) and no diagram can be created."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/diagram", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getProcessInstanceDiagram(@PathVariable("processInstanceId") String processInstanceId);

	/**
	 * List process instances
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return models with the given version.")
	 * @param processDefinitionKey
	 *            ("Only return process instances with the given process
	 *            definition key.")
	 * @param processDefinitionId
	 *            ("Only return process instances with the given process
	 *            definition id.")
	 * @param businessKey
	 *            ("Only return process instances with the given businessKey.")
	 * @param involvedUser
	 *            ("Only return process instances in which the given user is
	 *            involved.")
	 * @param suspended
	 *            ("If true, only return process instance which are suspended.
	 *            If false, only return process instances which are not
	 *            suspended (active).")
	 * @param superProcessInstanceId
	 *            ("Only return process instances which have the given super
	 *            process-instance id (for processes that have a
	 *            call-activities).")
	 * @param subProcessInstanceId
	 *            ("Only return process instances which have the given sub
	 *            process-instance id (for processes started as a
	 *            call-activity).")
	 * @param excludeSubprocesses
	 *            ("Return only process instances which are not sub processes.")
	 * @param includeProcessVariables
	 *            ("Indication to include process variables in the result.")
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
	 *            allowableValues = "id, processDefinitionId, tenantId,
	 *            processDefinitionKey")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         process-instances are returned", response =
	 *         DataResponseProcessInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format . The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseProcessInstanceResponse> listProcessInstances(
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "businessKey", required = false) String businessKey,
			@RequestParam(value = "involvedUser", required = false) String involvedUser,
			@RequestParam(value = "suspended", required = false) Boolean suspended,
			@RequestParam(value = "superProcessInstanceId", required = false) String superProcessInstanceId,
			@RequestParam(value = "subProcessInstanceId", required = false) String subProcessInstanceId,
			@RequestParam(value = "excludeSubprocesses", required = false) Boolean excludeSubprocesses,
			@RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * Activate or suspend a process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and action was executed.", response =
	 *         ProcessInstanceResponse.class),<br/>
	 *         code = 400, message = " Indicates an invalid action was
	 *         supplied."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found."),<br/>
	 *         code = 409, message = "Indicates the requested process instance
	 *         action cannot be executed since the process-instance is already
	 *         activated/suspended.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<ProcessInstanceResponse> performProcessInstanceAction(
			@PathVariable("processInstanceId") String processInstanceId,
			@RequestBody ProcessInstanceActionRequest body);

}
