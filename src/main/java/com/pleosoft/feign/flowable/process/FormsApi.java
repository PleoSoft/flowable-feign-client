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
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.FormDataResponse;
import com.pleosoft.feign.flowable.process.model.ProcessInstanceResponse;
import com.pleosoft.feign.flowable.process.model.SubmitFormRequest;

public interface FormsApi {

	/**
	 * Get form data
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("")
	 * @param processDefinitionId
	 *            ("")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates that form data could be
	 *         queried.", response = FormDataResponse.class),<br/>
	 *         code = 404, message = "Indicates that form data could not be
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form/form-data", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<FormDataResponse> getFormData(@RequestParam(value = "taskId", required = false) String taskId,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId);

	/**
	 * Submit task form data
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         form data was submitted", response =
	 *         ProcessInstanceResponse.class),<br/>
	 *         code = 204, message = "If TaskId has been provided, Indicates
	 *         request was successful and the form data was submitted. Returns
	 *         empty"),<br/>
	 *         code = 400, message = "Indicates an parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form/form-data", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<ProcessInstanceResponse> submitForm(@RequestBody SubmitFormRequest body);

}
