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

package com.pleosoft.feign.flowable.form;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.form.model.DataResponseFormInstanceResponse;
import com.pleosoft.feign.flowable.form.model.FormInstanceQueryRequest;
import com.pleosoft.feign.flowable.form.model.FormInstanceResponse;
import com.pleosoft.feign.flowable.form.model.FormRequest;

public interface FormInstancesApi {

	/**
	 * Get a form instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param formInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the form instance was found and
	 *         returned.", response = FormInstanceResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested form instance was
	 *         not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form/form-instance/{formInstanceId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<FormInstanceResponse> getFormInstance(@PathVariable("formInstanceId") String formInstanceId);

	/**
	 * List of form instances
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return form instances with the given id.")
	 * @param formDefinitionId
	 *            ("Only return form instances with the given form definition
	 *            id.")
	 * @param formDefinitionIdLike
	 *            ("Only return form instances with a form definition id like
	 *            the given value.")
	 * @param taskId
	 *            ("Only return form instances with the given task id.")
	 * @param taskIdLike
	 *            ("Only return form instances with a task id like the given
	 *            value.")
	 * @param processInstanceId
	 *            ("Only return form instances with the given process instance
	 *            id.")
	 * @param processInstanceIdLike
	 *            ("Only return form instances with a process instance id like
	 *            the given value.")
	 * @param processDefinitionId
	 *            ("Only return form instances with the given process definition
	 *            id.")
	 * @param processDefinitionIdLike
	 *            ("Only return form instances with a process definition id like
	 *            the given value.")
	 * @param submittedBy
	 *            ("Only return form instances submitted by the given value.")
	 * @param submittedByLike
	 *            ("Only return form instances submitted by like the given
	 *            value.")
	 * @param tenantId
	 *            ("Only return form instances with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return form instances with a tenantId like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("If true, only returns form instances without a tenantId set.
	 *            If false, the withoutTenantId parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "submittedDate, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         form instances are returned", response =
	 *         DataResponseFormInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format . The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form/form-instances", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseFormInstanceResponse> listFormInstances(
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "formDefinitionId", required = false) String formDefinitionId,
			@RequestParam(value = "formDefinitionIdLike", required = false) String formDefinitionIdLike,
			@RequestParam(value = "taskId", required = false) String taskId,
			@RequestParam(value = "taskIdLike", required = false) String taskIdLike,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processInstanceIdLike", required = false) String processInstanceIdLike,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "processDefinitionIdLike", required = false) String processDefinitionIdLike,
			@RequestParam(value = "submittedBy", required = false) String submittedBy,
			@RequestParam(value = "submittedByLike", required = false) String submittedByLike,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * Query form instances
	 *
	 * <p>
	 * The request body can contain all possible filters that can be used in the
	 * List form instances URL query. On top of these, it?s possible to provide
	 * an array of variables to include in the query, with their format
	 * described here. The general paging and sorting query-parameters can be
	 * used for this URL.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         form instances are returned", response =
	 *         DataResponseFormInstanceResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format . The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/form-instances", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseFormInstanceResponse> queryFormInstances(@RequestBody FormInstanceQueryRequest body);

	/**
	 * Store a form instance
	 *
	 * <p>
	 * Provide either a FormDefinitionKey or a FormDefinitionId together with
	 * the other properties.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 201, message = "Indicates the form instance was
	 *         stored."),<br/>
	 *         code = 404, message = "Indicates the related form model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form/form-instances", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<Void> storeFormInstance(@RequestBody FormRequest body);

}
