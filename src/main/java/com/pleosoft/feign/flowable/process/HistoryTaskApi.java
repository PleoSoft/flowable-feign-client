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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.DataResponseHistoricTaskInstanceResponse;
import com.pleosoft.feign.flowable.process.model.HistoricIdentityLinkResponse;
import com.pleosoft.feign.flowable.process.model.HistoricTaskInstanceResponse;

public interface HistoryTaskApi {

	/**
	 * Delete a historic task instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates that the historic task instance
	 *         was deleted."),<br/>
	 *         code = 404, message = "Indicates that the historic task instance
	 *         could not be found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-task-instances/{taskId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteTaskInstance(@PathVariable("taskId") String taskId);

	/**
	 * Get a single historic task instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates that the historic task instances
	 *         could be found.", response =
	 *         HistoricTaskInstanceResponse.class),<br/>
	 *         code = 404, message = "Indicates that the historic task instances
	 *         could not be found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-task-instances/{taskId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<HistoricTaskInstanceResponse> getTaskInstance(@PathVariable("taskId") String taskId);

	/**
	 * List identity links of a historic task instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         identity links are returned", response =
	 *         HistoricIdentityLinkResponse.class, responseContainer =
	 *         "List"),<br/>
	 *         code = 404, message = "Indicates the task instance could not be
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-task-instances/{taskId}/identitylinks", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<HistoricIdentityLinkResponse>> listHistoricTaskInstanceIdentityLinks(
			@PathVariable("taskId") String taskId);

	/**
	 * List historic task instances
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("An id of the historic task instance.")
	 * @param processInstanceId
	 *            ("The process instance id of the historic task instance.")
	 * @param processDefinitionKey
	 *            ("The process definition key of the historic task instance.")
	 * @param processDefinitionKeyLike
	 *            ("The process definition key of the historic task instance,
	 *            which matches the given value.")
	 * @param processDefinitionId
	 *            ("The process definition id of the historic task instance.")
	 * @param processDefinitionName
	 *            ("The process definition name of the historic task instance.")
	 * @param processDefinitionNameLike
	 *            ("The process definition name of the historic task instance,
	 *            which matches the given value.")
	 * @param processBusinessKey
	 *            ("The process instance business key of the historic task
	 *            instance.")
	 * @param processBusinessKeyLike
	 *            ("The process instance business key of the historic task
	 *            instance that matches the given value.")
	 * @param executionId
	 *            ("The execution id of the historic task instance.")
	 * @param taskDefinitionKey
	 *            ("The task definition key for tasks part of a process")
	 * @param taskName
	 *            ("The task name of the historic task instance.")
	 * @param taskNameLike
	 *            ("The task name with like operator for the historic task
	 *            instance.")
	 * @param taskDescription
	 *            ("The task description of the historic task instance.")
	 * @param taskDescriptionLike
	 *            ("The task description with like operator for the historic
	 *            task instance.")
	 * @param taskCategory
	 *            ("Select tasks with the given category. Note that this is the
	 *            task category, not the category of the process definition
	 *            (namespace within the BPMN Xml).")
	 * @param taskDeleteReason
	 *            ("The task delete reason of the historic task instance.")
	 * @param taskDeleteReasonLike
	 *            ("The task delete reason with like operator for the historic
	 *            task instance.")
	 * @param taskAssignee
	 *            ("The assignee of the historic task instance.")
	 * @param taskAssigneeLike
	 *            ("The assignee with like operator for the historic task
	 *            instance.")
	 * @param taskOwner
	 *            ("The owner of the historic task instance.")
	 * @param taskOwnerLike
	 *            ("The owner with like operator for the historic task
	 *            instance.")
	 * @param taskInvolvedUser
	 *            ("An involved user of the historic task instance")
	 * @param taskPriority
	 *            ("The priority of the historic task instance.")
	 * @param finished
	 *            ("Indication if the historic task instance is finished.")
	 * @param processFinished
	 *            ("Indication if the process instance of the historic task
	 *            instance is finished.")
	 * @param parentTaskId
	 *            ("An optional parent task id of the historic task instance.")
	 * @param dueDate
	 *            ("Return only historic task instances that have a due date
	 *            equal this date.")
	 * @param dueDateAfter
	 *            ("Return only historic task instances that have a due date
	 *            after this date.")
	 * @param dueDateBefore
	 *            ("Return only historic task instances that have a due date
	 *            before this date.")
	 * @param withoutDueDate
	 *            ("Return only historic task instances that have no due-date.
	 *            When false is provided as value, this parameter is ignored.")
	 * @param taskCompletedOn
	 *            ("Return only historic task instances that have been completed
	 *            on this date.")
	 * @param taskCompletedAfter
	 *            ("Return only historic task instances that have been completed
	 *            after this date.")
	 * @param taskCompletedBefore
	 *            ("Return only historic task instances that have been completed
	 *            before this date.")
	 * @param taskCreatedOn
	 *            ("Return only historic task instances that were created on
	 *            this date.")
	 * @param taskCreatedBefore
	 *            ("Return only historic task instances that were created before
	 *            this date.")
	 * @param taskCreatedAfter
	 *            ("Return only historic task instances that were created after
	 *            this date.")
	 * @param includeTaskLocalVariables
	 *            ("An indication if the historic task instance local variables
	 *            should be returned as well.")
	 * @param includeProcessVariables
	 *            ("An indication if the historic task instance global variables
	 *            should be returned as well.")
	 * @param tenantId
	 *            ("Only return historic task instances with the given
	 *            tenantId.")
	 * @param tenantIdLike
	 *            ("Only return historic task instances with a tenantId like the
	 *            given value.")
	 * @param withoutTenantId
	 *            ("If true, only returns historic task instances without a
	 *            tenantId set. If false, the withoutTenantId parameter is
	 *            ignored.")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates that historic task instances
	 *         could be queried.", response =
	 *         DataResponseHistoricTaskInstanceResponse.class),<br/>
	 *         code = 404, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/history/historic-task-instances", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseHistoricTaskInstanceResponse> listHistoricTaskInstances(
			@RequestParam(value = "taskId", required = false) String taskId,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@RequestParam(value = "processDefinitionKeyLike", required = false) String processDefinitionKeyLike,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "processDefinitionName", required = false) String processDefinitionName,
			@RequestParam(value = "processDefinitionNameLike", required = false) String processDefinitionNameLike,
			@RequestParam(value = "processBusinessKey", required = false) String processBusinessKey,
			@RequestParam(value = "processBusinessKeyLike", required = false) String processBusinessKeyLike,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "taskDefinitionKey", required = false) String taskDefinitionKey,
			@RequestParam(value = "taskName", required = false) String taskName,
			@RequestParam(value = "taskNameLike", required = false) String taskNameLike,
			@RequestParam(value = "taskDescription", required = false) String taskDescription,
			@RequestParam(value = "taskDescriptionLike", required = false) String taskDescriptionLike,
			@RequestParam(value = "taskCategory", required = false) String taskCategory,
			@RequestParam(value = "taskDeleteReason", required = false) String taskDeleteReason,
			@RequestParam(value = "taskDeleteReasonLike", required = false) String taskDeleteReasonLike,
			@RequestParam(value = "taskAssignee", required = false) String taskAssignee,
			@RequestParam(value = "taskAssigneeLike", required = false) String taskAssigneeLike,
			@RequestParam(value = "taskOwner", required = false) String taskOwner,
			@RequestParam(value = "taskOwnerLike", required = false) String taskOwnerLike,
			@RequestParam(value = "taskInvolvedUser", required = false) String taskInvolvedUser,
			@RequestParam(value = "taskPriority", required = false) String taskPriority,
			@RequestParam(value = "finished", required = false) Boolean finished,
			@RequestParam(value = "processFinished", required = false) Boolean processFinished,
			@RequestParam(value = "parentTaskId", required = false) String parentTaskId,
			@RequestParam(value = "dueDate", required = false) Date dueDate,
			@RequestParam(value = "dueDateAfter", required = false) Date dueDateAfter,
			@RequestParam(value = "dueDateBefore", required = false) Date dueDateBefore,
			@RequestParam(value = "withoutDueDate", required = false) Boolean withoutDueDate,
			@RequestParam(value = "taskCompletedOn", required = false) Date taskCompletedOn,
			@RequestParam(value = "taskCompletedAfter", required = false) Date taskCompletedAfter,
			@RequestParam(value = "taskCompletedBefore", required = false) Date taskCompletedBefore,
			@RequestParam(value = "taskCreatedOn", required = false) Date taskCreatedOn,
			@RequestParam(value = "taskCreatedBefore", required = false) Date taskCreatedBefore,
			@RequestParam(value = "taskCreatedAfter", required = false) Date taskCreatedAfter,
			@RequestParam(value = "includeTaskLocalVariables", required = false) Boolean includeTaskLocalVariables,
			@RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId);

}
