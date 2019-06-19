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

package com.pleosoft.feign.flowable.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.form.model.FormModel;
import com.pleosoft.feign.flowable.form.model.FormModelResponse;
import com.pleosoft.feign.flowable.process.model.DataResponseProcessDefinitionResponse;

public interface CustomProcessDefinitionsApi {

	/**
	 * Get a process definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         process-definitions are returned", response =
	 *         ProcessDefinitionResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/start-form", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<FormModel> getProcessDefinitionStartForm(
			@PathVariable("processDefinitionId") String processDefinitionId);
	
	@RequestMapping(value = "/task-forms/{taskId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<FormModel> getTaskForm(
			@PathVariable("taskId") String taskId);
}
