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

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pleosoft.feign.flowable.process.model.CommentRequest;
import com.pleosoft.feign.flowable.process.model.CommentResponse;

public interface TaskCommentsApi {

	/**
	 * Create a new comment on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         CommentResponse.class),<br/>
	 *         code = 201, message = "Indicates the comment was created and the
	 *         result is returned."),<br/>
	 *         code = 400, message = "Indicates the comment is missing from the
	 *         request."),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/comments", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<CommentResponse> createTaskComments(@PathVariable("taskId") String taskId,
			@RequestBody CommentRequest body);

	/**
	 * Delete a comment on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param commentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the task and comment were found
	 *         and the comment is deleted. Response body is left empty
	 *         intentionally."),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the tasks does nothave a comment with the given ID.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/comments/{commentId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteTaskComment(@PathVariable("taskId") String taskId,
			@PathVariable("commentId") String commentId);

	/**
	 * Get a comment on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param commentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task and comment were found
	 *         and the comment is returned.", response =
	 *         CommentResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the tasks does nothave a comment with the given ID.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/comments/{commentId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<CommentResponse> getTaskComment(@PathVariable("taskId") String taskId,
			@PathVariable("commentId") String commentId);

	/**
	 * List comments on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and the
	 *         comments are returned.", response = CommentResponse.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/comments", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<CommentResponse>> listTaskComments(@PathVariable("taskId") String taskId);

}
