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

package com.pleosoft.feign.flowable.content;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.pleosoft.feign.flowable.content.model.ContentItemQueryRequest;
import com.pleosoft.feign.flowable.content.model.ContentItemRequest;
import com.pleosoft.feign.flowable.content.model.ContentItemResponse;
import com.pleosoft.feign.flowable.content.model.DataResponseContentItemResponse;

public interface ContentItemApi {

	/**
	 * Create a new content item, with content item information and an optional
	 * attached file
	 *
	 * <p>
	 * This endpoint can be used in 2 ways: By passing a JSON Body
	 * (ContentItemRequest) to link an external resource or by passing a
	 * multipart/form-data Object to attach a file. NB: The multipart/form-data
	 * approach is not documented for this endpoint due to design restriction.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "Create a new content item, with content item
	 *            information" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         ContentItemResponse.class),<br/>
	 *         code = 201, message = "Indicates the content item was created and
	 *         the result is returned."),<br/>
	 *         code = 400, message = "Indicates required content item info is
	 *         missing from the request.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/content-service/content-items", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	ResponseEntity<ContentItemResponse> createContentItem(@RequestBody ContentItemRequest body);

	/**
	 * Delete a content item
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param contentItemId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the content item was
	 *         deleted."),<br/>
	 *         code = 404, message = "Indicates the content item was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/content-service/content-items/{contentItemId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteContentItem(@PathVariable("contentItemId") String contentItemId);

	/**
	 * Get a content item
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param contentItemId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the content item was found and
	 *         returned.", response = ContentItemResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested content item was
	 *         not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/content-service/content-items/{contentItemId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<ContentItemResponse> getContentItem(@PathVariable("contentItemId") String contentItemId);

	/**
	 * Get the data of a content item
	 *
	 * <p>
	 * The response body contains the binary content. By default, the
	 * content-type of the response is set to application/octet-stream unless
	 * the content item type contains a valid mime type.
	 * </p>
	 *
	 *
	 * @param contentItemId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the content item was found and
	 *         the requested content is returned.", response = byte[].class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the content item was not found
	 *         or the content item does not have a binary stream available.
	 *         Status message provides additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/content-service/content-items/{contentItemId}/data", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getContentItemData(@PathVariable("contentItemId") String contentItemId);

	/**
	 * Query for content items
	 *
	 * <p>
	 * All supported JSON parameter fields allowed are exactly the same as the
	 * parameters found for getting a collection of content items, but passed in
	 * as JSON-body arguments rather than URL-parameters to allow for more
	 * advanced querying and preventing errors with request-uri?s that are too
	 * long.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         content items are returned.", response =
	 *         DataResponseContentItemResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/query/content-items", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<DataResponseContentItemResponse> getQueryResult(@RequestBody ContentItemQueryRequest body);

	/**
	 * List content items
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return content items with the given id.")
	 * @param name
	 *            ("Only return content items with the given name.")
	 * @param nameLike
	 *            ("Only return content items with a name like the given
	 *            value.")
	 * @param mimeType
	 *            ("Only return content items with the given mime type.")
	 * @param mimeTypeLike
	 *            ("Only return content items with a mime type like the given
	 *            value.")
	 * @param taskId
	 *            ("Only return content items with the given task id.")
	 * @param taskIdLike
	 *            ("Only return content items with a task like the given
	 *            value.")
	 * @param processInstanceId
	 *            ("Only return content items with the given process instance
	 *            id.")
	 * @param processInstanceIdLike
	 *            ("Only return content items with a process instance like the
	 *            given value.")
	 * @param contentStoreId
	 *            ("Only return content items with the given content store id.")
	 * @param contentStoreIdLike
	 *            ("Only return content items with a content store id like the
	 *            given value.")
	 * @param contentStoreName
	 *            ("Only return content items with the given content store
	 *            name.")
	 * @param contentStoreNameLike
	 *            ("Only return content items with a content store name like the
	 *            given value.")
	 * @param contentAvailable
	 *            ("Only return content items with or without content
	 *            available.")
	 * @param contentSize
	 *            ("Only return content items with the given content size.")
	 * @param minimumContentSize
	 *            ("Only return content items with the a minimum content size of
	 *            the given value.")
	 * @param maximumContentSize
	 *            ("Only return content items with the a maximum content size of
	 *            the given value.")
	 * @param field
	 *            ("Only return content items with the given field.")
	 * @param fieldLike
	 *            ("Only return content items with a field like the given
	 *            value.")
	 * @param createdOn
	 *            ("Only return content items with the given create date.")
	 * @param createdBefore
	 *            ("Only return content items before given create date.")
	 * @param createdAfter
	 *            ("Only return content items after given create date.")
	 * @param createdBy
	 *            ("Only return content items with the given created by.")
	 * @param createdByLike
	 *            ("Only return content items with a created by like the given
	 *            value.")
	 * @param lastModifiedOn
	 *            ("Only return content items with the given last modified
	 *            date.")
	 * @param lastModifiedBefore
	 *            ("Only return content items before given last modified date.")
	 * @param lastModifiedAfter
	 *            ("Only return content items after given last modified date.")
	 * @param lastModifiedBy
	 *            ("Only return content items with the given last modified by.")
	 * @param lastModifiedByLike
	 *            ("Only return content items with a last modified by like the
	 *            given value.")
	 * @param tenantId
	 *            ("Only return content items with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return content items with a tenantId like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("If true, only returns content items without a tenantId set.
	 *            If false, the withoutTenantId parameter is ignored.")
	 * @return value = { <br/>
	 *         code = 200, message = "The content items are returned.", response
	 *         = DataResponseContentItemResponse.class)<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/content-service/content-items", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseContentItemResponse> listContentItems(
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "mimeType", required = false) String mimeType,
			@RequestParam(value = "mimeTypeLike", required = false) String mimeTypeLike,
			@RequestParam(value = "taskId", required = false) String taskId,
			@RequestParam(value = "taskIdLike", required = false) String taskIdLike,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processInstanceIdLike", required = false) String processInstanceIdLike,
			@RequestParam(value = "contentStoreId", required = false) String contentStoreId,
			@RequestParam(value = "contentStoreIdLike", required = false) String contentStoreIdLike,
			@RequestParam(value = "contentStoreName", required = false) String contentStoreName,
			@RequestParam(value = "contentStoreNameLike", required = false) String contentStoreNameLike,
			@RequestParam(value = "contentAvailable", required = false) Boolean contentAvailable,
			@RequestParam(value = "contentSize", required = false) BigDecimal contentSize,
			@RequestParam(value = "minimumContentSize", required = false) BigDecimal minimumContentSize,
			@RequestParam(value = "maximumContentSize", required = false) BigDecimal maximumContentSize,
			@RequestParam(value = "field", required = false) String field,
			@RequestParam(value = "fieldLike", required = false) String fieldLike,
			@RequestParam(value = "createdOn", required = false) Date createdOn,
			@RequestParam(value = "createdBefore", required = false) Date createdBefore,
			@RequestParam(value = "createdAfter", required = false) Date createdAfter,
			@RequestParam(value = "createdBy", required = false) String createdBy,
			@RequestParam(value = "createdByLike", required = false) String createdByLike,
			@RequestParam(value = "lastModifiedOn", required = false) Date lastModifiedOn,
			@RequestParam(value = "lastModifiedBefore", required = false) Date lastModifiedBefore,
			@RequestParam(value = "lastModifiedAfter", required = false) Date lastModifiedAfter,
			@RequestParam(value = "lastModifiedBy", required = false) String lastModifiedBy,
			@RequestParam(value = "lastModifiedByLike", required = false) String lastModifiedByLike,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId);

	/**
	 * Save the content item data
	 *
	 * <p>
	 * Save the content item data with an attached fileThe request should be of
	 * type multipart/form-data. There should be a single file-part included
	 * with the binary value of the content item.
	 * </p>
	 *
	 *
	 * @param contentItemId
	 *            ("",required=true)
	 * @param file
	 *            (value = "", required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         ContentItemResponse.class),<br/>
	 *         code = 201, message = "Indicates the content item data was saved
	 *         and the result is returned."),<br/>
	 *         code = 400, message = "Indicates required content item data is
	 *         missing from the request.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/content-service/content-items/{contentItemId}/data", produces = "application/json", consumes = "multipart/form-data", method = RequestMethod.POST)
	ResponseEntity<ContentItemResponse> saveContentItemData(@PathVariable("contentItemId") String contentItemId,
			@RequestPart("file") MultipartFile file);

	/**
	 * Updates a content item, with the provided content item information
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param contentItemId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the content item was updated and
	 *         the result is returned.", response =
	 *         ContentItemResponse.class),<br/>
	 *         code = 404, message = "Indicates content item could not be
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/content-service/content-items/{contentItemId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<ContentItemResponse> updateContentItem(@PathVariable("contentItemId") String contentItemId,
			@RequestBody ContentItemRequest body);

}
