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

package com.pleosoft.feign.flowable.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pleosoft.feign.flowable.app.model.AppDefinitionActionRequest;
import com.pleosoft.feign.flowable.app.model.AppDefinitionResponse;

public interface CaseDefinitionsApi {

	/**
	 * Execute actions for an app definition
	 *
	 * <p>
	 * Execute actions for an app definition (Update category)
	 * </p>
	 *
	 *
	 * @param appDefinitionId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" ,required=true )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates action has been executed for the
	 *         specified app definition. (category altered)", response =
	 *         AppDefinitionResponse.class),<br/>
	 *         code = 400, message = "Indicates no category was defined in the
	 *         request body."),<br/>
	 *         code = 404, message = "Indicates the requested app definition was
	 *         not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/app-definitions/{appDefinitionId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<AppDefinitionResponse> executeAppDefinitionAction(
			@PathVariable("appDefinitionId") String appDefinitionId, @RequestBody AppDefinitionActionRequest body);

}
