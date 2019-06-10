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

import com.pleosoft.feign.flowable.process.model.DataResponseTaskResponse;
import com.pleosoft.feign.flowable.process.model.EventResponse;
import com.pleosoft.feign.flowable.process.model.RestVariable;
import com.pleosoft.feign.flowable.process.model.TaskActionRequest;
import com.pleosoft.feign.flowable.process.model.TaskRequest;
import com.pleosoft.feign.flowable.process.model.TaskResponse;

public interface TasksApi {

	/**
	 * Create Task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         TaskResponse.class),<br/>
	 *         code = 201, message = "Indicates request was successful and the
	 *         tasks are returned"),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format or that delegationState has an invalid value (other
	 *         than pending and resolved). The status-message contains
	 *         additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<TaskResponse> createTask(@RequestBody TaskRequest body);

	/**
	 * Create new variables on a task
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body (RestVariable
	 * or an Array of RestVariable) or by passing a multipart/form-data Object.
	 * It's possible to create simple (non-binary) variable or list of variables
	 * or new binary variable Any number of variables can be passed into the
	 * request body array. NB: The multipart/form-data approach is not
	 * documented for this endpoint due to design restriction.
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param body
	 *            (value = "Create a variable on a task" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         Object.class),<br/>
	 *         code = 201, message = "Indicates the variables were created and
	 *         the result is returned."),<br/>
	 *         code = 400, message = "Indicates the name of a variable to create
	 *         was missing or that an attempt is done to create a variable on a
	 *         standalone task (without a process associated) with scope global
	 *         or an empty array of variables was included in the request or
	 *         request did not contain an array of variables. Status message
	 *         provides additional information."),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found."),<br/>
	 *         code = 409, message = "Indicates the task already has a variable
	 *         with the given name. Use the PUT method to update the task
	 *         variable instead."),<br/>
	 *         code = 415, message = "Indicates the serializable data contains
	 *         an object for which no class is present in the JVM running the
	 *         Flowable engine and therefore cannot be deserialized.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/variables", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	ResponseEntity<Object> createTaskVariable(@PathVariable("taskId") String taskId, @RequestBody RestVariable body);

	/**
	 * Delete an event on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param eventId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the task was found and the
	 *         events are returned."),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave the requested event.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/events/{eventId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteEvent(@PathVariable("taskId") String taskId, @PathVariable("eventId") String eventId);

	/**
	 * Delete a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param cascadeHistory
	 *            ("Whether or not to delete the HistoricTask instance when
	 *            deleting the task (if applicable). If not provided, this value
	 *            defaults to false.")
	 * @param deleteReason
	 *            ("Reason why the task is deleted. This value is ignored when
	 *            cascadeHistory is true.")
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the task was found and has been
	 *         deleted. Response-body is intentionally empty."),<br/>
	 *         code = 403, message = "Indicates the requested task cannot be
	 *         deleted because it?s part of a workflow."),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteTask(@PathVariable("taskId") String taskId,
			@RequestParam(value = "cascadeHistory", required = false) String cascadeHistory,
			@RequestParam(value = "deleteReason", required = false) String deleteReason);

	/**
	 * Tasks actions
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the action was executed."),<br/>
	 *         code = 400, message = "When the body contains an invalid value or
	 *         when the assignee is missing when the action requires it."),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found."),<br/>
	 *         code = 409, message = "Indicates the action cannot be performed
	 *         due to a conflict. Either the task was updates simultaneously or
	 *         the task was claimed by another user, in case of the claim
	 *         action.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}", method = RequestMethod.POST)
	ResponseEntity<Void> executeTaskAction(@PathVariable("taskId") String taskId, @RequestBody TaskActionRequest body);

	/**
	 * Get an event on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param eventId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task and event were found
	 *         and the event is returned.", response =
	 *         EventResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the tasks does nothave an event with the given ID.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/events/{eventId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<EventResponse> getEvent(@PathVariable("taskId") String taskId,
			@PathVariable("eventId") String eventId);

	/**
	 * Get a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and
	 *         returned.", response = TaskResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<TaskResponse> getTask(@PathVariable("taskId") String taskId);

	/**
	 * List events for a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and the
	 *         events are returned.", response = EventResponse.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/events", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<EventResponse>> listTaskEvents(@PathVariable("taskId") String taskId);

	/**
	 * List of sub tasks for a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         sub tasks are returned", response = TaskResponse.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/subtasks", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<TaskResponse>> listTaskSubtasks(@PathVariable("taskId") String taskId);

	/**
	 * List of tasks
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param name
	 *            ("Only return models with the given version.")
	 * @param nameLike
	 *            ("Only return tasks with a name like the given name.")
	 * @param description
	 *            ("Only return tasks with the given description.")
	 * @param priority
	 *            ("Only return tasks with the given priority.")
	 * @param minimumPriority
	 *            ("Only return tasks with a priority greater than the given
	 *            value.")
	 * @param maximumPriority
	 *            ("Only return tasks with a priority lower than the given
	 *            value.")
	 * @param assignee
	 *            ("Only return tasks assigned to the given user.")
	 * @param assigneeLike
	 *            ("Only return tasks assigned with an assignee like the given
	 *            value.")
	 * @param owner
	 *            ("Only return tasks owned by the given user.")
	 * @param ownerLike
	 *            ("Only return tasks assigned with an owner like the given
	 *            value.")
	 * @param unassigned
	 *            ("Only return tasks that are not assigned to anyone. If false
	 *            is passed, the value is ignored.")
	 * @param delegationState
	 *            ("Only return tasks that have the given delegation state.
	 *            Possible values are pending and resolved.")
	 * @param candidateUser
	 *            ("Only return tasks that can be claimed by the given user.
	 *            This includes both tasks where the user is an explicit
	 *            candidate for and task that are claimable by a group that the
	 *            user is a member of.")
	 * @param candidateGroup
	 *            ("Only return tasks that can be claimed by a user in the given
	 *            group.")
	 * @param candidateGroups
	 *            ("Only return tasks that can be claimed by a user in the given
	 *            groups. Values split by comma.")
	 * @param involvedUser
	 *            ("Only return tasks in which the given user is involved.")
	 * @param taskDefinitionKey
	 *            ("Only return tasks with the given task definition id.")
	 * @param taskDefinitionKeyLike
	 *            ("Only return tasks with a given task definition id like the
	 *            given value.")
	 * @param processInstanceId
	 *            ("Only return tasks which are part of the process instance
	 *            with the given id.")
	 * @param processInstanceBusinessKey
	 *            ("Only return tasks which are part of the process instance
	 *            with the given business key.")
	 * @param processInstanceBusinessKeyLike
	 *            ("Only return tasks which are part of the process instance
	 *            which has a business key like the given value.")
	 * @param processDefinitionId
	 *            ("Only return tasks which are part of a process instance which
	 *            has a process definition with the given id.")
	 * @param processDefinitionKey
	 *            ("Only return tasks which are part of a process instance which
	 *            has a process definition with the given key.")
	 * @param processDefinitionKeyLike
	 *            ("Only return tasks which are part of a process instance which
	 *            has a process definition with a key like the given value.")
	 * @param processDefinitionName
	 *            ("Only return tasks which are part of a process instance which
	 *            has a process definition with the given name.")
	 * @param processDefinitionNameLike
	 *            ("Only return tasks which are part of a process instance which
	 *            has a process definition with a name like the given value.")
	 * @param executionId
	 *            ("Only return tasks which are part of the execution with the
	 *            given id.")
	 * @param createdOn
	 *            ("Only return tasks which are created on the given date.")
	 * @param createdBefore
	 *            ("Only return tasks which are created before the given date.")
	 * @param createdAfter
	 *            ("Only return tasks which are created after the given date.")
	 * @param dueOn
	 *            ("Only return tasks which are due on the given date.")
	 * @param dueBefore
	 *            ("Only return tasks which are due before the given date.")
	 * @param dueAfter
	 *            ("Only return tasks which are due after the given date.")
	 * @param withoutDueDate
	 *            ("Only return tasks which don?t have a due date. The property
	 *            is ignored if the value is false.")
	 * @param excludeSubTasks
	 *            ("Only return tasks that are not a subtask of another task.")
	 * @param active
	 *            ("If true, only return tasks that are not suspended (either
	 *            part of a process that is not suspended or not part of a
	 *            process at all). If false, only tasks that are part of
	 *            suspended process instances are returned.")
	 * @param includeTaskLocalVariables
	 *            ("Indication to include task local variables in the result.")
	 * @param includeProcessVariables
	 *            ("Indication to include process variables in the result.")
	 * @param tenantId
	 *            ("Only return tasks with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return tasks with a tenantId like the given value.")
	 * @param withoutTenantId
	 *            ("If true, only returns tasks without a tenantId set. If
	 *            false, the withoutTenantId parameter is ignored.")
	 * @param candidateOrAssigned
	 *            ("Select tasks that has been claimed or assigned to user or
	 *            waiting to claim by user (candidate user or groups).")
	 * @param category
	 *            ("Select tasks with the given category. Note that this is the
	 *            task category, not the category of the process definition
	 *            (namespace within the BPMN Xml). ")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         tasks are returned", response =
	 *         DataResponseTaskResponse.class),<br/>
	 *         code = 404, message = "Indicates a parameter was passed in the
	 *         wrong format or that delegationState has an invalid value (other
	 *         than pending and resolved). The status-message contains
	 *         additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseTaskResponse> listTasks(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "priority", required = false) String priority,
			@RequestParam(value = "minimumPriority", required = false) String minimumPriority,
			@RequestParam(value = "maximumPriority", required = false) String maximumPriority,
			@RequestParam(value = "assignee", required = false) String assignee,
			@RequestParam(value = "assigneeLike", required = false) String assigneeLike,
			@RequestParam(value = "owner", required = false) String owner,
			@RequestParam(value = "ownerLike", required = false) String ownerLike,
			@RequestParam(value = "unassigned", required = false) String unassigned,
			@RequestParam(value = "delegationState", required = false) String delegationState,
			@RequestParam(value = "candidateUser", required = false) String candidateUser,
			@RequestParam(value = "candidateGroup", required = false) String candidateGroup,
			@RequestParam(value = "candidateGroups", required = false) String candidateGroups,
			@RequestParam(value = "involvedUser", required = false) String involvedUser,
			@RequestParam(value = "taskDefinitionKey", required = false) String taskDefinitionKey,
			@RequestParam(value = "taskDefinitionKeyLike", required = false) String taskDefinitionKeyLike,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processInstanceBusinessKey", required = false) String processInstanceBusinessKey,
			@RequestParam(value = "processInstanceBusinessKeyLike", required = false) String processInstanceBusinessKeyLike,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@RequestParam(value = "processDefinitionKeyLike", required = false) String processDefinitionKeyLike,
			@RequestParam(value = "processDefinitionName", required = false) String processDefinitionName,
			@RequestParam(value = "processDefinitionNameLike", required = false) String processDefinitionNameLike,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "createdOn", required = false) Date createdOn,
			@RequestParam(value = "createdBefore", required = false) Date createdBefore,
			@RequestParam(value = "createdAfter", required = false) Date createdAfter,
			@RequestParam(value = "dueOn", required = false) Date dueOn,
			@RequestParam(value = "dueBefore", required = false) Date dueBefore,
			@RequestParam(value = "dueAfter", required = false) Date dueAfter,
			@RequestParam(value = "withoutDueDate", required = false) Boolean withoutDueDate,
			@RequestParam(value = "excludeSubTasks", required = false) Boolean excludeSubTasks,
			@RequestParam(value = "active", required = false) Boolean active,
			@RequestParam(value = "includeTaskLocalVariables", required = false) Boolean includeTaskLocalVariables,
			@RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "candidateOrAssigned", required = false) String candidateOrAssigned,
			@RequestParam(value = "category", required = false) String category);

	/**
	 * Update a task
	 *
	 * <p>
	 * All request values are optional. For example, you can only include the
	 * assignee attribute in the request body JSON-object, only updating the
	 * assignee of the task, leaving all other fields unaffected. When an
	 * attribute is explicitly included and is set to null, the task-value will
	 * be updated to null. Example: {\"dueDate\" : null} will clear the duedate
	 * of the task).
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was updated.", response
	 *         = TaskResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found."),<br/>
	 *         code = 409, message = "Indicates the requested task was updated
	 *         simultaneously.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<TaskResponse> updateTask(@PathVariable("taskId") String taskId, @RequestBody TaskRequest body);

}
