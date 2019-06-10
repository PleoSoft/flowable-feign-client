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

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.CommentResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseHistoricProcessInstanceResponse;
import com.pleosoft.feign.flowable.process.model.HistoricIdentityLinkResponse;
import com.pleosoft.feign.flowable.process.model.HistoricProcessInstanceResponse;

public interface HistoryProcessApi {

	/**
	 * Create a new comment on a historic process instance
	 *
	 * <p>
	 * Parameter saveProcessInstanceId is optional, if true save process
	 * instance id of task with comment.
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         CommentResponse.class),<br/>
	 *         code = 201, message = "Indicates the comment was created and the
	 *         result is returned."),<br/>
	 *         code = 400, message = "Indicates the comment is missing from the
	 *         request."),<br/>
	 *         code = 404, message = "Indicates that the historic process
	 *         instance could not be found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances/{processInstanceId}/comments", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<CommentResponse> createComment(@PathVariable("processInstanceId") String processInstanceId,
			@RequestBody CommentResponse body);

	/**
	 * Delete a comment on a historic process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param commentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the historic process instance
	 *         and comment were found and the comment is deleted. Response body
	 *         is left empty intentionally."),<br/>
	 *         code = 404, message = "Indicates the requested historic process
	 *         instance was not found or the historic process instance does not
	 *         have a comment with the given ID.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances/{processInstanceId}/comments/{commentId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteComment(@PathVariable("processInstanceId") String processInstanceId,
			@PathVariable("commentId") String commentId);

	/**
	 * Delete a historic process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates that the historic process
	 *         instance was deleted."),<br/>
	 *         code = 404, message = "Indicates that the historic process
	 *         instance could not be found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances/{processInstanceId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteHistoricProcessInstance(@PathVariable("processInstanceId") String processInstanceId);

	/**
	 * Get a comment on a historic process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param commentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the historic process instance
	 *         and comment were found and the comment is returned.", response =
	 *         CommentResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested historic process
	 *         instance was not found or the historic process instance does not
	 *         have a comment with the given ID.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances/{processInstanceId}/comments/{commentId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<CommentResponse> getComment(@PathVariable("processInstanceId") String processInstanceId,
			@PathVariable("commentId") String commentId);

	/**
	 * Get a historic process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates that the historic process
	 *         instances could be found.", response =
	 *         HistoricProcessInstanceResponse.class),<br/>
	 *         code = 404, message = "Indicates that the historic process
	 *         instances could not be found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances/{processInstanceId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<HistoricProcessInstanceResponse> getHistoricProcessInstance(
			@PathVariable("processInstanceId") String processInstanceId);

	/**
	 * Get the binary data for a historic process instance variable
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
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param variableName
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and the requested variable data is returned.", response =
	 *         byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found or the process instance does not have a variable
	 *         with the given name or the variable does not have a binary stream
	 *         available. Status message provides additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances/{processInstanceId}/variables/{variableName}/data", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getHistoricProcessInstanceVariableData(
			@PathVariable("processInstanceId") String processInstanceId,
			@PathVariable("variableName") String variableName);

	/**
	 * List comments on a historic process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and the comments are returned.", response =
	 *         CommentResponse.class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates that the historic process
	 *         instance could not be found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances/{processInstanceId}/comments", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<CommentResponse>> listHistoricProcessInstanceComments(
			@PathVariable("processInstanceId") String processInstanceId);

	/**
	 * List identity links of a historic process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         identity links are returned", response =
	 *         HistoricIdentityLinkResponse.class, responseContainer =
	 *         "List"),<br/>
	 *         code = 404, message = "Indicates the process instance could not
	 *         be found..")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances/{processInstanceId}/identitylinks", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<HistoricIdentityLinkResponse>> listHistoricProcessInstanceIdentityLinks(
			@PathVariable("processInstanceId") String processInstanceId);

	/**
	 * List of historic process instances
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("An id of the historic process instance.")
	 * @param processDefinitionKey
	 *            ("The process definition key of the historic process
	 *            instance.")
	 * @param processDefinitionId
	 *            ("The process definition id of the historic process
	 *            instance.")
	 * @param businessKey
	 *            ("The business key of the historic process instance.")
	 * @param involvedUser
	 *            ("An involved user of the historic process instance.")
	 * @param finished
	 *            ("Indication if the historic process instance is finished.")
	 * @param superProcessInstanceId
	 *            ("An optional parent process id of the historic process
	 *            instance.")
	 * @param excludeSubprocesses
	 *            ("Return only historic process instances which are not sub
	 *            processes.")
	 * @param finishedAfter
	 *            ("Return only historic process instances that were finished
	 *            after this date.")
	 * @param finishedBefore
	 *            ("Return only historic process instances that were finished
	 *            before this date.")
	 * @param startedAfter
	 *            ("Return only historic process instances that were started
	 *            after this date.")
	 * @param startedBefore
	 *            ("Return only historic process instances that were started
	 *            before this date.")
	 * @param startedBy
	 *            ("Return only historic process instances that were started by
	 *            this user.")
	 * @param includeProcessVariables
	 *            ("An indication if the historic process instance variables
	 *            should be returned as well.")
	 * @param tenantId
	 *            ("Only return instances with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return instances with a tenantId like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("If true, only returns instances without a tenantId set. If
	 *            false, the withoutTenantId parameter is ignored. ")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates that historic process instances
	 *         could be queried.", response =
	 *         DataResponseHistoricProcessInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-process-instances", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseHistoricProcessInstanceResponse> listHistoricProcessInstances(
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "businessKey", required = false) String businessKey,
			@RequestParam(value = "involvedUser", required = false) String involvedUser,
			@RequestParam(value = "finished", required = false) Boolean finished,
			@RequestParam(value = "superProcessInstanceId", required = false) String superProcessInstanceId,
			@RequestParam(value = "excludeSubprocesses", required = false) Boolean excludeSubprocesses,
			@RequestParam(value = "finishedAfter", required = false) Date finishedAfter,
			@RequestParam(value = "finishedBefore", required = false) Date finishedBefore,
			@RequestParam(value = "startedAfter", required = false) Date startedAfter,
			@RequestParam(value = "startedBefore", required = false) Date startedBefore,
			@RequestParam(value = "startedBy", required = false) String startedBy,
			@RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId);

}
