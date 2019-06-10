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

package com.pleosoft.feign.flowable.decision;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pleosoft.feign.flowable.decision.model.DmnRuleServiceRequest;
import com.pleosoft.feign.flowable.decision.model.DmnRuleServiceResponse;
import com.pleosoft.feign.flowable.decision.model.DmnRuleServiceSingleResponse;

public interface DmnRuleServiceApi {

	/**
	 * Execute a Decision
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "request" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         DmnRuleServiceResponse.class),<br/>
	 *         code = 201, message = "Indicates the Decision has been
	 *         executed")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-rule/execute", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DmnRuleServiceResponse> executeDecision(@RequestBody DmnRuleServiceRequest body);

	/**
	 * Execute a Decision expecting a single result
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "request" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         DmnRuleServiceSingleResponse.class),<br/>
	 *         code = 201, message = "Indicates the Decision has been
	 *         executed"),<br/>
	 *         code = 500, message = "Indicates the Decision returned multiple
	 *         results")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-rule/execute/single-result", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DmnRuleServiceSingleResponse> executeDecisionByKeySingleResult(
			@RequestBody DmnRuleServiceRequest body);

}
