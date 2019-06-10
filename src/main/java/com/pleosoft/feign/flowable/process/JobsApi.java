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

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.DataResponseJobResponse;
import com.pleosoft.feign.flowable.process.model.JobResponse;
import com.pleosoft.feign.flowable.process.model.RestActionRequest;

public interface JobsApi {

	/**
	 * Delete a deadletter job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the job was found and has been
	 *         deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested job was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/deadletter-jobs/{jobId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteDeadLetterJob(@PathVariable("jobId") String jobId);

	/**
	 * Delete a job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the job was found and has been
	 *         deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested job was not
	 *         found..")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/jobs/{jobId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteJob(@PathVariable("jobId") String jobId);

	/**
	 * Delete a suspended job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the job was found and has been
	 *         deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested job was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/suspended-jobs/{jobId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteSuspendedJob(@PathVariable("jobId") String jobId);

	/**
	 * Delete a timer job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the job was found and has been
	 *         deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested job was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/timer-jobs/{jobId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteTimerJob(@PathVariable("jobId") String jobId);

	/**
	 * Move a single deadletter job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the dead letter job was moved.
	 *         Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested job was not
	 *         found."),<br/>
	 *         code = 500, message = "Indicates the an exception occurred while
	 *         executing the job. The status-description contains additional
	 *         detail about the error. The full error-stacktrace can be fetched
	 *         later on if needed.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/deadletter-jobs/{jobId}", method = RequestMethod.POST)
	ResponseEntity<Void> executeDeadLetterJobAction(@PathVariable("jobId") String jobId,
			@RequestBody RestActionRequest body);

	/**
	 * Execute a single job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the job was executed.
	 *         Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested job was not
	 *         found."),<br/>
	 *         code = 500, message = "Indicates the an exception occurred while
	 *         executing the job. The status-description contains additional
	 *         detail about the error. The full error-stacktrace can be fetched
	 *         later on if needed.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/jobs/{jobId}", method = RequestMethod.POST)
	ResponseEntity<Void> executeJobAction(@PathVariable("jobId") String jobId, @RequestBody RestActionRequest body);

	/**
	 * Move a single timer job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the timer job was moved.
	 *         Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested job was not
	 *         found."),<br/>
	 *         code = 500, message = "Indicates the an exception occurred while
	 *         executing the job. The status-description contains additional
	 *         detail about the error. The full error-stacktrace can be fetched
	 *         later on if needed.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/timer-jobs/{jobId}", method = RequestMethod.POST)
	ResponseEntity<Void> executeTimerJobAction(@PathVariable("jobId") String jobId,
			@RequestBody RestActionRequest body);

	/**
	 * Get the exception stacktrace for a deadletter job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested job was not found
	 *         and the stacktrace has been returned. The response contains the
	 *         raw stacktrace and always has a Content-type of text/plain.",
	 *         response = String.class),<br/>
	 *         code = 404, message = "Indicates the requested job was not found
	 *         or the job does nothave an exception stacktrace.
	 *         Status-description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/deadletter-jobs/{jobId}/exception-stacktrace", method = RequestMethod.GET)
	ResponseEntity<String> getDeadLetterJobStacktrace(@PathVariable("jobId") String jobId);

	/**
	 * Get a single deadletter job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the suspended job exists and is
	 *         returned.", response = JobResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested job does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/deadletter-jobs/{jobId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<JobResponse> getDeadletterJob(@PathVariable("jobId") String jobId);

	/**
	 * Get a single job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the job exists and is
	 *         returned.", response = JobResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested job does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/jobs/{jobId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<JobResponse> getJob(@PathVariable("jobId") String jobId);

	/**
	 * Get the exception stacktrace for a job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested job was not found
	 *         and the stacktrace has been returned. The response contains the
	 *         raw stacktrace and always has a Content-type of text/plain.",
	 *         response = String.class),<br/>
	 *         code = 404, message = "Indicates the requested job was not found
	 *         or the job does nothave an exception stacktrace.
	 *         Status-description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/jobs/{jobId}/exception-stacktrace", method = RequestMethod.GET)
	ResponseEntity<String> getJobStacktrace(@PathVariable("jobId") String jobId);

	/**
	 * Get a single suspended job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the suspended job exists and is
	 *         returned.", response = JobResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested job does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/suspended-jobs/{jobId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<JobResponse> getSuspendedJob(@PathVariable("jobId") String jobId);

	/**
	 * Get the exception stacktrace for a suspended job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested job was not found
	 *         and the stacktrace has been returned. The response contains the
	 *         raw stacktrace and always has a Content-type of text/plain.",
	 *         response = String.class),<br/>
	 *         code = 404, message = "Indicates the requested job was not found
	 *         or the job does nothave an exception stacktrace.
	 *         Status-description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/suspended-jobs/{jobId}/exception-stacktrace", method = RequestMethod.GET)
	ResponseEntity<String> getSuspendedJobStacktrace(@PathVariable("jobId") String jobId);

	/**
	 * Get a single timer job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the timer job exists and is
	 *         returned.", response = JobResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested job does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/timer-jobs/{jobId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<JobResponse> getTimerJob(@PathVariable("jobId") String jobId);

	/**
	 * Get the exception stacktrace for a timer job
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param jobId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested job was not found
	 *         and the stacktrace has been returned. The response contains the
	 *         raw stacktrace and always has a Content-type of text/plain.",
	 *         response = String.class),<br/>
	 *         code = 404, message = "Indicates the requested job was not found
	 *         or the job does nothave an exception stacktrace.
	 *         Status-description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/timer-jobs/{jobId}/exception-stacktrace", method = RequestMethod.GET)
	ResponseEntity<String> getTimerJobStacktrace(@PathVariable("jobId") String jobId);

	/**
	 * List deadletter jobs
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return job with the given id")
	 * @param processInstanceId
	 *            ("Only return jobs part of a process with the given id")
	 * @param executionId
	 *            ("Only return jobs part of an execution with the given id")
	 * @param processDefinitionId
	 *            ("Only return jobs with the given process definition id")
	 * @param timersOnly
	 *            ("If true, only return jobs which are timers. If false, this
	 *            parameter is ignored. Cannot be used together with
	 *            'messagesOnly'.")
	 * @param messagesOnly
	 *            ("If true, only return jobs which are messages. If false, this
	 *            parameter is ignored. Cannot be used together with
	 *            'timersOnly'")
	 * @param withException
	 *            ("If true, only return jobs for which an exception occurred
	 *            while executing it. If false, this parameter is ignored.")
	 * @param dueBefore
	 *            ("Only return jobs which are due to be executed before the
	 *            given date. Jobs without duedate are never returned using this
	 *            parameter.")
	 * @param dueAfter
	 *            ("Only return jobs which are due to be executed after the
	 *            given date. Jobs without duedate are never returned using this
	 *            parameter.")
	 * @param exceptionMessage
	 *            ("Only return jobs with the given exception message")
	 * @param tenantId
	 *            ("Only return jobs with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return jobs with a tenantId like the given value.")
	 * @param withoutTenantId
	 *            ("If true, only returns jobs without a tenantId set. If false,
	 *            the withoutTenantId parameter is ignored.")
	 * @param locked
	 *            ("If true, only return jobs which are locked. If false, this
	 *            parameter is ignored.")
	 * @param unlocked
	 *            ("If true, only return jobs which are unlocked. If false, this
	 *            parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, dueDate, executionId,
	 *            processInstanceId, retries, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested jobs were
	 *         returned.", response = DataResponseJobResponse.class),<br/>
	 *         code = 400, message = "Indicates an illegal value has been used
	 *         in a url query parameter or the both 'messagesOnly' and
	 *         'timersOnly' are used as parameters. Status description contains
	 *         additional details about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/deadletter-jobs", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseJobResponse> listDeadLetterJobs(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "timersOnly", required = false) Boolean timersOnly,
			@RequestParam(value = "messagesOnly", required = false) Boolean messagesOnly,
			@RequestParam(value = "withException", required = false) Boolean withException,
			@RequestParam(value = "dueBefore", required = false) Date dueBefore,
			@RequestParam(value = "dueAfter", required = false) Date dueAfter,
			@RequestParam(value = "exceptionMessage", required = false) String exceptionMessage,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "locked", required = false) Boolean locked,
			@RequestParam(value = "unlocked", required = false) Boolean unlocked,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * List jobs
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return job with the given id")
	 * @param processInstanceId
	 *            ("Only return jobs part of a process with the given id")
	 * @param executionId
	 *            ("Only return jobs part of an execution with the given id")
	 * @param processDefinitionId
	 *            ("Only return jobs with the given process definition id")
	 * @param timersOnly
	 *            ("If true, only return jobs which are timers. If false, this
	 *            parameter is ignored. Cannot be used together with
	 *            'messagesOnly'.")
	 * @param messagesOnly
	 *            ("If true, only return jobs which are messages. If false, this
	 *            parameter is ignored. Cannot be used together with
	 *            'timersOnly'")
	 * @param withException
	 *            ("If true, only return jobs for which an exception occurred
	 *            while executing it. If false, this parameter is ignored.")
	 * @param dueBefore
	 *            ("Only return jobs which are due to be executed before the
	 *            given date. Jobs without duedate are never returned using this
	 *            parameter.")
	 * @param dueAfter
	 *            ("Only return jobs which are due to be executed after the
	 *            given date. Jobs without duedate are never returned using this
	 *            parameter.")
	 * @param exceptionMessage
	 *            ("Only return jobs with the given exception message")
	 * @param tenantId
	 *            ("Only return jobs with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return jobs with a tenantId like the given value.")
	 * @param withoutTenantId
	 *            ("If true, only returns jobs without a tenantId set. If false,
	 *            the withoutTenantId parameter is ignored.")
	 * @param locked
	 *            ("If true, only return jobs which are locked. If false, this
	 *            parameter is ignored.")
	 * @param unlocked
	 *            ("If true, only return jobs which are unlocked. If false, this
	 *            parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, dueDate, executionId,
	 *            processInstanceId, retries, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested jobs were
	 *         returned.", response = DataResponseJobResponse.class),<br/>
	 *         code = 400, message = "Indicates an illegal value has been used
	 *         in a url query parameter or the both 'messagesOnly' and
	 *         'timersOnly' are used as parameters. Status description contains
	 *         additional details about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/jobs", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseJobResponse> listJobs(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "timersOnly", required = false) Boolean timersOnly,
			@RequestParam(value = "messagesOnly", required = false) Boolean messagesOnly,
			@RequestParam(value = "withException", required = false) Boolean withException,
			@RequestParam(value = "dueBefore", required = false) Date dueBefore,
			@RequestParam(value = "dueAfter", required = false) Date dueAfter,
			@RequestParam(value = "exceptionMessage", required = false) String exceptionMessage,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "locked", required = false) Boolean locked,
			@RequestParam(value = "unlocked", required = false) Boolean unlocked,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * List suspended jobs
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return job with the given id")
	 * @param processInstanceId
	 *            ("Only return jobs part of a process with the given id")
	 * @param executionId
	 *            ("Only return jobs part of an execution with the given id")
	 * @param processDefinitionId
	 *            ("Only return jobs with the given process definition id")
	 * @param timersOnly
	 *            ("If true, only return jobs which are timers. If false, this
	 *            parameter is ignored. Cannot be used together with
	 *            'messagesOnly'.")
	 * @param messagesOnly
	 *            ("If true, only return jobs which are messages. If false, this
	 *            parameter is ignored. Cannot be used together with
	 *            'timersOnly'")
	 * @param withException
	 *            ("If true, only return jobs for which an exception occurred
	 *            while executing it. If false, this parameter is ignored.")
	 * @param dueBefore
	 *            ("Only return jobs which are due to be executed before the
	 *            given date. Jobs without duedate are never returned using this
	 *            parameter.")
	 * @param dueAfter
	 *            ("Only return jobs which are due to be executed after the
	 *            given date. Jobs without duedate are never returned using this
	 *            parameter.")
	 * @param exceptionMessage
	 *            ("Only return jobs with the given exception message")
	 * @param tenantId
	 *            ("Only return jobs with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return jobs with a tenantId like the given value.")
	 * @param withoutTenantId
	 *            ("If true, only returns jobs without a tenantId set. If false,
	 *            the withoutTenantId parameter is ignored.")
	 * @param locked
	 *            ("If true, only return jobs which are locked. If false, this
	 *            parameter is ignored.")
	 * @param unlocked
	 *            ("If true, only return jobs which are unlocked. If false, this
	 *            parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, dueDate, executionId,
	 *            processInstanceId, retries, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested jobs were
	 *         returned.", response = DataResponseJobResponse.class),<br/>
	 *         code = 400, message = "Indicates an illegal value has been used
	 *         in a url query parameter or the both 'messagesOnly' and
	 *         'timersOnly' are used as parameters. Status description contains
	 *         additional details about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/suspended-jobs", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseJobResponse> listSuspendedJobs(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "timersOnly", required = false) Boolean timersOnly,
			@RequestParam(value = "messagesOnly", required = false) Boolean messagesOnly,
			@RequestParam(value = "withException", required = false) Boolean withException,
			@RequestParam(value = "dueBefore", required = false) Date dueBefore,
			@RequestParam(value = "dueAfter", required = false) Date dueAfter,
			@RequestParam(value = "exceptionMessage", required = false) String exceptionMessage,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "locked", required = false) Boolean locked,
			@RequestParam(value = "unlocked", required = false) Boolean unlocked,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * List timer jobs
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return job with the given id")
	 * @param processInstanceId
	 *            ("Only return jobs part of a process with the given id")
	 * @param executionId
	 *            ("Only return jobs part of an execution with the given id")
	 * @param processDefinitionId
	 *            ("Only return jobs with the given process definition id")
	 * @param timersOnly
	 *            ("If true, only return jobs which are timers. If false, this
	 *            parameter is ignored. Cannot be used together with
	 *            'messagesOnly'.")
	 * @param messagesOnly
	 *            ("If true, only return jobs which are messages. If false, this
	 *            parameter is ignored. Cannot be used together with
	 *            'timersOnly'")
	 * @param withException
	 *            ("If true, only return jobs for which an exception occurred
	 *            while executing it. If false, this parameter is ignored.")
	 * @param dueBefore
	 *            ("Only return jobs which are due to be executed before the
	 *            given date. Jobs without duedate are never returned using this
	 *            parameter.")
	 * @param dueAfter
	 *            ("Only return jobs which are due to be executed after the
	 *            given date. Jobs without duedate are never returned using this
	 *            parameter.")
	 * @param exceptionMessage
	 *            ("Only return jobs with the given exception message")
	 * @param tenantId
	 *            ("Only return jobs with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return jobs with a tenantId like the given value.")
	 * @param withoutTenantId
	 *            ("If true, only returns jobs without a tenantId set. If false,
	 *            the withoutTenantId parameter is ignored.")
	 * @param locked
	 *            ("If true, only return jobs which are locked. If false, this
	 *            parameter is ignored.")
	 * @param unlocked
	 *            ("If true, only return jobs which are unlocked. If false, this
	 *            parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, dueDate, executionId,
	 *            processInstanceId, retries, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested jobs were
	 *         returned.", response = DataResponseJobResponse.class),<br/>
	 *         code = 400, message = "Indicates an illegal value has been used
	 *         in a url query parameter or the both 'messagesOnly' and
	 *         'timersOnly' are used as parameters. Status description contains
	 *         additional details about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/timer-jobs", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseJobResponse> listTimerJobs(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "timersOnly", required = false) Boolean timersOnly,
			@RequestParam(value = "messagesOnly", required = false) Boolean messagesOnly,
			@RequestParam(value = "withException", required = false) Boolean withException,
			@RequestParam(value = "dueBefore", required = false) Date dueBefore,
			@RequestParam(value = "dueAfter", required = false) Date dueAfter,
			@RequestParam(value = "exceptionMessage", required = false) String exceptionMessage,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "locked", required = false) Boolean locked,
			@RequestParam(value = "unlocked", required = false) Boolean unlocked,
			@RequestParam(value = "sort", required = false) String sort);

}
