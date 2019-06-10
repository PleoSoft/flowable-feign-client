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

public interface TaskVariablesApi {

	/**
	 * Delete all local variables on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates all local task variables have
	 *         been deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/variables", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteAllLocalTaskVariables(@PathVariable("taskId") String taskId);

	/**
	 * Delete a variable on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("Scope of variable to be returned. When local, only
	 *            task-local variable value is returned. When global, only
	 *            variable value from the task?s parent execution-hierarchy are
	 *            returned. When the parameter is omitted, a local variable will
	 *            be returned if it exists, otherwise a global variable.")
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the task variable was found and
	 *         has been deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave a variable with the given name. Status
	 *         message contains additional information about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/variables/{variableName}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteTaskInstanceVariable(@PathVariable("taskId") String taskId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * Get the binary data for a variable
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
	 *            ("Scope of variable to be returned. When local, only
	 *            task-local variable value is returned. When global, only
	 *            variable value from the task?s parent execution-hierarchy are
	 *            returned. When the parameter is omitted, a local variable will
	 *            be returned if it exists, otherwise a global variable.")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and the
	 *         requested variables are returned.", response = byte[].class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave a variable with the given name (in the
	 *         given scope). Status message provides additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/variables/{variableName}/data", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> geTaskVariableData(@PathVariable("taskId") String taskId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * Get a variable from a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param scope
	 *            ("Scope of variable to be returned. When local, only
	 *            task-local variable value is returned. When global, only
	 *            variable value from the task?s parent execution-hierarchy are
	 *            returned. When the parameter is omitted, a local variable will
	 *            be returned if it exists, otherwise a global variable.")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and the
	 *         requested variables are returned.", response =
	 *         RestVariable.class),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave a variable with the given name (in the
	 *         given scope). Status message provides additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/variables/{variableName}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<RestVariable> getTaskInstanceVariable(@PathVariable("taskId") String taskId,
			@PathVariable("variableName") String variableName,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * List variables for a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param scope
	 *            ("Scope of variable to be returned. When local, only
	 *            task-local variable value is returned. When global, only
	 *            variable value from the task?s parent execution-hierarchy are
	 *            returned. When the parameter is omitted, a local variable will
	 *            be returned if it exists, otherwise a global variable.")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and the
	 *         requested variables are returned", response = RestVariable.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found..")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/variables", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<RestVariable>> listTaskVariables(@PathVariable("taskId") String taskId,
			@RequestParam(value = "scope", required = false) String scope);

	/**
	 * Update an existing variable on a task
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body
	 * (RestVariable) or by passing a multipart/form-data Object. It's possible
	 * to update simple (non-binary) variable or binary variable Any number of
	 * variables can be passed into the request body array. NB: The
	 * multipart/form-data approach is not documented for this endpoint due to
	 * design restriction.
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @param body
	 *            (value = "Update a task variable" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the variables was updated and
	 *         the result is returned.", response = RestVariable.class),<br/>
	 *         code = 400, message = "Indicates the name of a variable to update
	 *         was missing or that an attempt is done to update a variable on a
	 *         standalone task (without a process associated) with scope global.
	 *         Status message provides additional information."),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave a variable with the given name in the
	 *         given scope. Status message contains additional information about
	 *         the error."),<br/>
	 *         code = 415, message = "Indicates the serializable data contains
	 *         an object for which no class is present in the JVM running the
	 *         Flowable engine and therefore cannot be deserialized.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/variables/{variableName}", produces = "application/json", consumes = "application/json", method = RequestMethod.PUT)
	ResponseEntity<RestVariable> updateTaskInstanceVariable(@PathVariable("taskId") String taskId,
			@PathVariable("variableName") String variableName, @RequestBody RestVariable body);

}
