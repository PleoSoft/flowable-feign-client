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

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pleosoft.feign.flowable.process.model.DataResponseHistoricActivityInstanceResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseHistoricDetailResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseHistoricProcessInstanceResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseHistoricTaskInstanceResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseHistoricVariableInstanceResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseProcessInstanceResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseTaskResponse;
import com.pleosoft.feign.flowable.process.model.HistoricActivityInstanceQueryRequest;
import com.pleosoft.feign.flowable.process.model.HistoricDetailQueryRequest;
import com.pleosoft.feign.flowable.process.model.HistoricProcessInstanceQueryRequest;
import com.pleosoft.feign.flowable.process.model.HistoricTaskInstanceQueryRequest;
import com.pleosoft.feign.flowable.process.model.HistoricVariableInstanceQueryRequest;
import com.pleosoft.feign.flowable.process.model.ProcessInstanceQueryRequest;
import com.pleosoft.feign.flowable.process.model.TaskQueryRequest;

public interface QueryApi {

	/**
	 * Query for historic activity instances
	 *
	 * <p>
	 * All supported JSON parameter fields allowed are exactly the same as the
	 * parameters found for getting a collection of historic task instances, but
	 * passed in as JSON-body arguments rather than URL-parameters to allow for
	 * more advanced querying and preventing errors with request-uri?s that are
	 * too long.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         activities are returned", response =
	 *         DataResponseHistoricActivityInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/historic-activity-instances", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseHistoricActivityInstanceResponse> queryActivityInstances(
			@RequestBody HistoricActivityInstanceQueryRequest body);

	/**
	 * Query for historic details
	 *
	 * <p>
	 * All supported JSON parameter fields allowed are exactly the same as the
	 * parameters found for getting a collection of historic process instances,
	 * but passed in as JSON-body arguments rather than URL-parameters to allow
	 * for more advanced querying and preventing errors with request-uri?s that
	 * are too long.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         historic details are returned", response =
	 *         DataResponseHistoricDetailResponse.class),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/historic-detail", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseHistoricDetailResponse> queryHistoricDetail(
			@RequestBody HistoricDetailQueryRequest body);

	/**
	 * Query for historic process instances
	 *
	 * <p>
	 * All supported JSON parameter fields allowed are exactly the same as the
	 * parameters found for getting a collection of historic process instances,
	 * but passed in as JSON-body arguments rather than URL-parameters to allow
	 * for more advanced querying and preventing errors with request-uri?s that
	 * are too long. On top of that, the query allows for filtering based on
	 * process variables. The variables property is a JSON-array containing
	 * objects with the format as described here.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         process instances are returned", response =
	 *         DataResponseHistoricProcessInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/historic-process-instances", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseHistoricProcessInstanceResponse> queryHistoricProcessInstance(
			@RequestBody HistoricProcessInstanceQueryRequest body);

	/**
	 * Query for historic task instances
	 *
	 * <p>
	 * All supported JSON parameter fields allowed are exactly the same as the
	 * parameters found for getting a collection of historic task instances, but
	 * passed in as JSON-body arguments rather than URL-parameters to allow for
	 * more advanced querying and preventing errors with request-uri?s that are
	 * too long. On top of that, the query allows for filtering based on process
	 * variables. The taskVariables and processVariables properties are
	 * JSON-arrays containing objects with the format as described here.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         tasks are returned", response =
	 *         DataResponseHistoricTaskInstanceResponse.class),<br/>
	 *         code = 404, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/historic-task-instances", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseHistoricTaskInstanceResponse> queryHistoricTaskInstance(
			@RequestBody HistoricTaskInstanceQueryRequest body);

	/**
	 * Query process instances
	 *
	 * <p>
	 * The request body can contain all possible filters that can be used in the
	 * List process instances URL query. On top of these, it?s possible to
	 * provide an array of variables to include in the query, with their format
	 * described here. The general paging and sorting query-parameters can be
	 * used for this URL.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
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
	@RequestMapping(value = "/query/process-instances", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseProcessInstanceResponse> queryProcessInstances(
			@RequestBody ProcessInstanceQueryRequest body);

	/**
	 * Query for tasks
	 *
	 * <p>
	 * All supported JSON parameter fields allowed are exactly the same as the
	 * parameters found for getting a collection of tasks (except for
	 * candidateGroupIn which is only available in this POST task query REST
	 * service), but passed in as JSON-body arguments rather than URL-parameters
	 * to allow for more advanced querying and preventing errors with
	 * request-uri?s that are too long. On top of that, the query allows for
	 * filtering based on task and process variables. The taskVariables and
	 * processInstanceVariables are both JSON-arrays containing objects with the
	 * format as described here.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         tasks are returned.", response =
	 *         DataResponseTaskResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format or that delegationState has an invalid value (other
	 *         than pending and resolved). The status-message contains
	 *         additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/tasks", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseTaskResponse> queryTasks(@RequestBody TaskQueryRequest body);

	/**
	 * Query for historic variable instances
	 *
	 * <p>
	 * All supported JSON parameter fields allowed are exactly the same as the
	 * parameters found for getting a collection of historic process instances,
	 * but passed in as JSON-body arguments rather than URL-parameters to allow
	 * for more advanced querying and preventing errors with request-uri?s that
	 * are too long. On top of that, the query allows for filtering based on
	 * process variables. The variables property is a JSON-array containing
	 * objects with the format as described here.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         tasks are returned", response =
	 *         DataResponseHistoricVariableInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/historic-variable-instances", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseHistoricVariableInstanceResponse> queryVariableInstances(
			@RequestBody HistoricVariableInstanceQueryRequest body);

}
