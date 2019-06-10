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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pleosoft.feign.flowable.form.model.FormModelResponse;
import com.pleosoft.feign.flowable.form.model.FormRequest;

public interface FormModelsApi {

	/**
	 * Get a populated form model
	 *
	 * <p>
	 * Provide variables needed to pre populated form fields and to render
	 * expression based form fields
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the form model was found and
	 *         returned.", response = FormModelResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested form model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form/model", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<FormModelResponse> getFormModel(@RequestBody FormRequest body);

}
