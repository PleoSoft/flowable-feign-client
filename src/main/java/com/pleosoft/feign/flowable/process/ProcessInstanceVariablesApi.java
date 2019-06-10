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

import com.pleosoft.feign.flowable.process.model.RestVariable;

public interface ProcessInstanceVariablesApi {

	/**
	 * Update a multiple/single (non)binary variable on a process instance
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body (RestVariable
	 * or an array of RestVariable) or by passing a multipart/form-data Object.
	 * Nonexistent variables are created on the process-instance and existing
	 * ones are overridden without any error. Any number of variables can be
	 * passed into the request body array. Note that scope is ignored, only
	 * local variables can be set in a process instance. NB: The
	 * multipart/form-data approach is not documented for this endpoint due to
	 * design restriction.
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param body
	 *            (value = "Create a variable on a process instance" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         Object.class),<br/>
	 *         code = 201, message = "Indicates the process instance was found
	 *         and variable is created."),<br/>
	 *         code = 400, message = "Indicates the request body is incomplete
	 *         or contains illegal values. The status description contains
	 *         additional information about the error."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found."),<br/>
	 *         code = 415, message = "Indicates the serializable data contains
	 *         an object for which no class is present in the JVM running the
	 *         Flowable engine and therefore cannot be deserialized.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/variables", produces = "application/json", consumes = "application/json", method = RequestMethod.PUT)
	ResponseEntity<Object> createOrUpdateProcessVariable(@PathVariable("processInstanceId") String processInstanceId,
			@RequestBody RestVariable body);

	/**
	 * Create variables or new binary variable on a process instance
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body (RestVariable
	 * or an array of RestVariable) or by passing a multipart/form-data Object.
	 * Nonexistent variables are created on the process-instance and existing
	 * ones are overridden without any error. Any number of variables can be
	 * passed into the request body array. Note that scope is ignored, only
	 * local variables can be set in a process instance. NB: The
	 * multipart/form-data approach is not documented for this endpoint due to
	 * design restriction.
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param body
	 *            (value = "Create a variable on a process instance" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         Object.class),<br/>
	 *         code = 201, message = "Indicates the process instance was found
	 *         and variable is created."),<br/>
	 *         code = 400, message = "Indicates the request body is incomplete
	 *         or contains illegal values. The status description contains
	 *         additional information about the error."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found."),<br/>
	 *         code = 409, message = "Indicates the process instance was found
	 *         but already contains a variable with the given name (only thrown
	 *         when POST method is used). Use the update-method instead.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/variables", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	ResponseEntity<Object> createProcessInstanceVariable(@PathVariable("processInstanceId") String processInstanceId,
			@RequestBody RestVariable body);

	/**
	 * Delete all variables
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates variables were found and have
	 *         been deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/variables", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteLocalProcessVariable(@PathVariable("processInstanceId") String processInstanceId);

	/**
	 * Delete a variable
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the variable was found and has
	 *         been deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested variable was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/variables/{variableName}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteProcessInstanceVariable(@PathVariable("processInstanceId") String processInstanceId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * Get a variable for a process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both the process instance and
	 *         variable were found and variable is returned.", response =
	 *         RestVariable.class),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found or the process instance does not have a variable
	 *         with the given name. Status description contains additional
	 *         information about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/variables/{variableName}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<RestVariable> getProcessInstanceVariable(@PathVariable("processInstanceId") String processInstanceId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * Get the binary data for a variable
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and the requested variables are returned.", response =
	 *         byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave a variable with the given name (in the
	 *         given scope). Status message provides additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/variables/{variableName}/data", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getProcessInstanceVariableData(
			@PathVariable("processInstanceId") String processInstanceId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * List variables for a process instance
	 *
	 * <p>
	 * In case the variable is a binary variable or serializable, the valueUrl
	 * points to an URL to fetch the raw value. If it?s a plain variable, the
	 * value is present in the response. Note that only local scoped variables
	 * are returned, as there is no global scope for process-instance variables.
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param scope
	 *            ("")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and variables are returned.", response = RestVariable.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 400, message = "Indicates the requested process instance
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/variables", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<RestVariable>> listProcessInstanceVariables(
			@PathVariable("processInstanceId") String processInstanceId,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * Update a single variable on a process instance
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body
	 * (RestVariable) or by passing a multipart/form-data Object. Nonexistent
	 * variables are created on the process-instance and existing ones are
	 * overridden without any error. Note that scope is ignored, only local
	 * variables can be set in a process instance. NB: The multipart/form-data
	 * approach is not documented for this endpoint due to design restriction.
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param body
	 *            (value = "Create a variable on a process instance" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         RestVariable.class),<br/>
	 *         code = 201, message = "Indicates both the process instance and
	 *         variable were found and variable is updated."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found or the process instance does not have a variable
	 *         with the given name. Status description contains additional
	 *         information about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/variables/{variableName}", produces = "application/json", consumes = "application/json", method = RequestMethod.PUT)
	ResponseEntity<RestVariable> updateProcessInstanceVariable(
			@PathVariable("processInstanceId") String processInstanceId,
			@PathVariable("variableName") String variableName, @RequestBody RestVariable body);

}
