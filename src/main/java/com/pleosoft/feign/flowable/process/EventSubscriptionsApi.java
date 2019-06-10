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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.DataResponseEventSubscriptionResponse;
import com.pleosoft.feign.flowable.process.model.EventSubscriptionResponse;

public interface EventSubscriptionsApi {

	/**
	 * Get a single event subscription
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param eventSubscriptionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the event subscription exists
	 *         and is returned.", response =
	 *         EventSubscriptionResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested event subscription
	 *         does not exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/event-subscriptions/{eventSubscriptionId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<EventSubscriptionResponse> getEventSubscription(
			@PathVariable("eventSubscriptionId") String eventSubscriptionId);

	/**
	 * List of event subscriptions
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return event subscriptions with the given id")
	 * @param eventType
	 *            ("Only return event subscriptions with the given event type")
	 * @param eventName
	 *            ("Only return event subscriptions with the given event name")
	 * @param activityId
	 *            ("Only return event subscriptions with the given activity id")
	 * @param executionId
	 *            ("Only return event subscriptions with the given execution
	 *            id")
	 * @param processInstanceId
	 *            ("Only return event subscriptions part of a process with the
	 *            given id")
	 * @param processDefinitionId
	 *            ("Only return event subscriptions with the given process
	 *            definition id")
	 * @param createdBefore
	 *            ("Only return event subscriptions which are created before the
	 *            given date.")
	 * @param createdAfter
	 *            ("Only return event subscriptions which are created after the
	 *            given date.")
	 * @param tenantId
	 *            ("Only return event subscriptions with the given tenant id.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, created, executionId,
	 *            processInstanceId, processDefinitionId, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested event
	 *         subscriptions were returned.", response =
	 *         DataResponseEventSubscriptionResponse.class),<br/>
	 *         code = 400, message = "Indicates an illegal value has been used
	 *         in a url query parameter. Status description contains additional
	 *         details about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/event-subscriptions", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseEventSubscriptionResponse> listEventSubscriptions(
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "eventType", required = false) String eventType,
			@RequestParam(value = "eventName", required = false) String eventName,
			@RequestParam(value = "activityId", required = false) String activityId,
			@RequestParam(value = "executionId", required = false) String executionId,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@RequestParam(value = "createdBefore", required = false) Date createdBefore,
			@RequestParam(value = "createdAfter", required = false) Date createdAfter,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "sort", required = false) String sort);

}
