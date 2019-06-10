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

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pleosoft.feign.flowable.process.model.ProcessEngineInfoResponse;

public interface ProcessEngineApi {

	/**
	 * Get engine info
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the engine info is returned.",
	 *         response = ProcessEngineInfoResponse.class)<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/engine", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<ProcessEngineInfoResponse> getEngineInfo();

	/**
	 * List engine properties
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the properties are returned.",
	 *         response = Map.class, responseContainer = "Map")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/properties", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<Map<String, String>> getProperties();

}
