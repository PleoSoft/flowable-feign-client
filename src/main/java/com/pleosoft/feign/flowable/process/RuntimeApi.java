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

import com.pleosoft.feign.flowable.process.model.SignalEventReceivedRequest;

public interface RuntimeApi {

	/**
	 * Signal event received
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 202, message = "Indicated signal processing is queued as a
	 *         job, ready to be executed."),<br/>
	 *         code = 204, message = "Indicated signal has been processed and no
	 *         errors occurred."),<br/>
	 *         code = 400, message = "Signal not processed. The signal name is
	 *         missing or variables are used together with async, which is not
	 *         allowed. Response body contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/signals", method = RequestMethod.POST)
	ResponseEntity<Void> signalEventReceived(@RequestBody SignalEventReceivedRequest body);

}
