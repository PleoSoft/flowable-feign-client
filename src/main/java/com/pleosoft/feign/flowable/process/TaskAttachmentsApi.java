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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.pleosoft.feign.flowable.process.model.AttachmentResponse;

public interface TaskAttachmentsApi {

	/**
	 * Create a new attachment on a task, containing a link to an external
	 * resource or an attached file
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body
	 * (AttachmentRequest) to link an external resource or by passing a
	 * multipart/form-data Object to attach a file. NB: The JSON approach is not
	 * documented for this endpoint due to design restriction.
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param file
	 *            (value = "Attachment file")
	 * @param name
	 *            (value = "Required name of the variable")
	 * @param description
	 *            (value = "Description of the attachment, optional")
	 * @param type
	 *            (value = "Type of attachment, optional. Supports any arbitrary
	 *            string or a valid HTTP content-type.")
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         AttachmentResponse.class),<br/>
	 *         code = 201, message = "Indicates the attachment was created and
	 *         the result is returned."),<br/>
	 *         code = 400, message = "Indicates the attachment name is missing
	 *         from the request."),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/attachments", produces = "application/json", consumes = "multipart/form-data", method = RequestMethod.POST)
	ResponseEntity<AttachmentResponse> createAttachment(@PathVariable("taskId") String taskId,
			@RequestPart("file") MultipartFile file, @RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "type", required = false) String type);

	/**
	 * Delete an attachment on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param attachmentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the task and attachment were
	 *         found and the attachment is deleted. Response body is left empty
	 *         intentionally."),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the tasks does nothave a attachment with the given ID.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/attachments/{attachmentId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteAttachment(@PathVariable("taskId") String taskId,
			@PathVariable("attachmentId") String attachmentId);

	/**
	 * Get an attachment on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param attachmentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task and attachment were
	 *         found and the attachment is returned.", response =
	 *         AttachmentResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the tasks does nothave a attachment with the given ID.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/attachments/{attachmentId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<AttachmentResponse> getAttachment(@PathVariable("taskId") String taskId,
			@PathVariable("attachmentId") String attachmentId);

	/**
	 * Get the content for an attachment
	 *
	 * <p>
	 * The response body contains the binary content. By default, the
	 * content-type of the response is set to application/octet-stream unless
	 * the attachment type contains a valid Content-type.
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param attachmentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task and attachment was
	 *         found and the requested content is returned.", response =
	 *         byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave an attachment with the given id or the
	 *         attachment does not have a binary stream available. Status
	 *         message provides additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/attachments/{attachmentId}/content", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getAttachmentContent(@PathVariable("taskId") String taskId,
			@PathVariable("attachmentId") String attachmentId);

	/**
	 * List attachments on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and the
	 *         attachments are returned.", response = AttachmentResponse.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/attachments", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<AttachmentResponse>> listTaskAttachments(@PathVariable("taskId") String taskId);

}
