/**
 * Ed-Fi Operational Data Store API
 * The Ed-Fi ODS / API enables applications to read and write education data stored in an Ed-Fi ODS through a secure REST interface. The Ed-Fi ODS / API supports both transactional and bulk modes of operation.  ***  > *Note: Consumers of ODS / API information should sanitize all data for display and storage. The ODS / API provides reasonable safeguards against cross-site scripting attacks and other malicious content, but the platform does not and cannot guarantee that the data it contains is free of all potentially harmful content.*  *** 
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.edfi.api.descriptor;

import org.edfi.api.ApiCallback;
import org.edfi.api.ApiClient;
import org.edfi.api.ApiException;
import org.edfi.api.ApiResponse;
import org.edfi.api.Configuration;
import org.edfi.api.Pair;
import org.edfi.api.ProgressRequestBody;
import org.edfi.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import org.edfi.model.descriptor.EdFiCourseRepeatCodeDescriptor;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseRepeatCodeDescriptorsApi {
    private ApiClient apiClient;

    public CourseRepeatCodeDescriptorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CourseRepeatCodeDescriptorsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteCourseRepeatCodeDescriptorById */
    private com.squareup.okhttp.Call deleteCourseRepeatCodeDescriptorByIdCall(String id, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteCourseRepeatCodeDescriptorById(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ed-fi/courseRepeatCodeDescriptors/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2_client_credentials" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Deletes an existing resource using the resource identifier.
     * The DELETE operation is used to delete an existing resource by identifier. If the resource doesn&#39;t exist, an error will result (the resource will not be found).
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param ifMatch The ETag header value used to prevent the DELETE from removing a resource modified by another consumer. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCourseRepeatCodeDescriptorById(String id, String ifMatch) throws ApiException {
        deleteCourseRepeatCodeDescriptorByIdWithHttpInfo(id, ifMatch);
    }

    /**
     * Deletes an existing resource using the resource identifier.
     * The DELETE operation is used to delete an existing resource by identifier. If the resource doesn&#39;t exist, an error will result (the resource will not be found).
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param ifMatch The ETag header value used to prevent the DELETE from removing a resource modified by another consumer. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCourseRepeatCodeDescriptorByIdWithHttpInfo(String id, String ifMatch) throws ApiException {
        com.squareup.okhttp.Call call = deleteCourseRepeatCodeDescriptorByIdCall(id, ifMatch, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an existing resource using the resource identifier. (asynchronously)
     * The DELETE operation is used to delete an existing resource by identifier. If the resource doesn&#39;t exist, an error will result (the resource will not be found).
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param ifMatch The ETag header value used to prevent the DELETE from removing a resource modified by another consumer. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCourseRepeatCodeDescriptorByIdAsync(String id, String ifMatch, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteCourseRepeatCodeDescriptorByIdCall(id, ifMatch, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getCourseRepeatCodeDescriptors */
    private com.squareup.okhttp.Call getCourseRepeatCodeDescriptorsCall(Integer offset, Integer limit, Boolean totalCount, Integer courseRepeatCodeDescriptorId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/ed-fi/courseRepeatCodeDescriptors".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (totalCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalCount", totalCount));
        if (courseRepeatCodeDescriptorId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseRepeatCodeDescriptorId", courseRepeatCodeDescriptorId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2_client_credentials" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Retrieves specific resources using the resource&#39;s property values (using the \&quot;Get\&quot; pattern).
     * This GET operation provides access to resources using the \&quot;Get\&quot; search pattern.  The values of any properties of the resource that are specified will be used to return all matching results (if it exists).
     * @param offset Indicates how many items should be skipped before returning results. (optional, default to 0)
     * @param limit Indicates the maximum number of items that should be returned in the results. (optional, default to 25)
     * @param totalCount Indicates if the total number of items available should be returned in the &#39;Total-Count&#39; header of the response.  If set to false, &#39;Total-Count&#39; header will not be provided. (optional, default to false)
     * @param courseRepeatCodeDescriptorId A unique identifier used as Primary Key, not derived from business logic, when acting as Foreign Key, references the parent table. (optional)
     * @return List&lt;EdFiCourseRepeatCodeDescriptor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EdFiCourseRepeatCodeDescriptor> getCourseRepeatCodeDescriptors(Integer offset, Integer limit, Boolean totalCount, Integer courseRepeatCodeDescriptorId) throws ApiException {
        ApiResponse<List<EdFiCourseRepeatCodeDescriptor>> resp = getCourseRepeatCodeDescriptorsWithHttpInfo(offset, limit, totalCount, courseRepeatCodeDescriptorId);
        return resp.getData();
    }

    /**
     * Retrieves specific resources using the resource&#39;s property values (using the \&quot;Get\&quot; pattern).
     * This GET operation provides access to resources using the \&quot;Get\&quot; search pattern.  The values of any properties of the resource that are specified will be used to return all matching results (if it exists).
     * @param offset Indicates how many items should be skipped before returning results. (optional, default to 0)
     * @param limit Indicates the maximum number of items that should be returned in the results. (optional, default to 25)
     * @param totalCount Indicates if the total number of items available should be returned in the &#39;Total-Count&#39; header of the response.  If set to false, &#39;Total-Count&#39; header will not be provided. (optional, default to false)
     * @param courseRepeatCodeDescriptorId A unique identifier used as Primary Key, not derived from business logic, when acting as Foreign Key, references the parent table. (optional)
     * @return ApiResponse&lt;List&lt;EdFiCourseRepeatCodeDescriptor&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EdFiCourseRepeatCodeDescriptor>> getCourseRepeatCodeDescriptorsWithHttpInfo(Integer offset, Integer limit, Boolean totalCount, Integer courseRepeatCodeDescriptorId) throws ApiException {
        com.squareup.okhttp.Call call = getCourseRepeatCodeDescriptorsCall(offset, limit, totalCount, courseRepeatCodeDescriptorId, null, null);
        Type localVarReturnType = new TypeToken<List<EdFiCourseRepeatCodeDescriptor>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves specific resources using the resource&#39;s property values (using the \&quot;Get\&quot; pattern). (asynchronously)
     * This GET operation provides access to resources using the \&quot;Get\&quot; search pattern.  The values of any properties of the resource that are specified will be used to return all matching results (if it exists).
     * @param offset Indicates how many items should be skipped before returning results. (optional, default to 0)
     * @param limit Indicates the maximum number of items that should be returned in the results. (optional, default to 25)
     * @param totalCount Indicates if the total number of items available should be returned in the &#39;Total-Count&#39; header of the response.  If set to false, &#39;Total-Count&#39; header will not be provided. (optional, default to false)
     * @param courseRepeatCodeDescriptorId A unique identifier used as Primary Key, not derived from business logic, when acting as Foreign Key, references the parent table. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCourseRepeatCodeDescriptorsAsync(Integer offset, Integer limit, Boolean totalCount, Integer courseRepeatCodeDescriptorId, final ApiCallback<List<EdFiCourseRepeatCodeDescriptor>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCourseRepeatCodeDescriptorsCall(offset, limit, totalCount, courseRepeatCodeDescriptorId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EdFiCourseRepeatCodeDescriptor>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCourseRepeatCodeDescriptorsById */
    private com.squareup.okhttp.Call getCourseRepeatCodeDescriptorsByIdCall(String id, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getCourseRepeatCodeDescriptorsById(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ed-fi/courseRepeatCodeDescriptors/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2_client_credentials" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Retrieves a specific resource using the resource&#39;s identifier (using the \&quot;Get By Id\&quot; pattern).
     * This GET operation retrieves a resource by the specified resource identifier.
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param ifNoneMatch The previously returned ETag header value, used here to prevent the unnecessary data transfer of an unchanged resource. (optional)
     * @return EdFiCourseRepeatCodeDescriptor
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EdFiCourseRepeatCodeDescriptor getCourseRepeatCodeDescriptorsById(String id, String ifNoneMatch) throws ApiException {
        ApiResponse<EdFiCourseRepeatCodeDescriptor> resp = getCourseRepeatCodeDescriptorsByIdWithHttpInfo(id, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Retrieves a specific resource using the resource&#39;s identifier (using the \&quot;Get By Id\&quot; pattern).
     * This GET operation retrieves a resource by the specified resource identifier.
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param ifNoneMatch The previously returned ETag header value, used here to prevent the unnecessary data transfer of an unchanged resource. (optional)
     * @return ApiResponse&lt;EdFiCourseRepeatCodeDescriptor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EdFiCourseRepeatCodeDescriptor> getCourseRepeatCodeDescriptorsByIdWithHttpInfo(String id, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getCourseRepeatCodeDescriptorsByIdCall(id, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<EdFiCourseRepeatCodeDescriptor>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves a specific resource using the resource&#39;s identifier (using the \&quot;Get By Id\&quot; pattern). (asynchronously)
     * This GET operation retrieves a resource by the specified resource identifier.
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param ifNoneMatch The previously returned ETag header value, used here to prevent the unnecessary data transfer of an unchanged resource. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCourseRepeatCodeDescriptorsByIdAsync(String id, String ifNoneMatch, final ApiCallback<EdFiCourseRepeatCodeDescriptor> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCourseRepeatCodeDescriptorsByIdCall(id, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EdFiCourseRepeatCodeDescriptor>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postCourseRepeatCodeDescriptor */
    private com.squareup.okhttp.Call postCourseRepeatCodeDescriptorCall(EdFiCourseRepeatCodeDescriptor courseRepeatCodeDescriptor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = courseRepeatCodeDescriptor;
        
        // verify the required parameter 'courseRepeatCodeDescriptor' is set
        if (courseRepeatCodeDescriptor == null) {
            throw new ApiException("Missing the required parameter 'courseRepeatCodeDescriptor' when calling postCourseRepeatCodeDescriptor(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ed-fi/courseRepeatCodeDescriptors".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2_client_credentials" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Creates or updates resources based on the natural key values of the supplied resource.
     * The POST operation can be used to create or update resources. In database terms, this is often referred to as an \&quot;upsert\&quot; operation (insert + update). Clients should NOT include the resource \&quot;id\&quot; in the JSON body because it will result in an error (you must use a PUT operation to update a resource by \&quot;id\&quot;). The web service will identify whether the resource already exists based on the natural key values provided, and update or create the resource appropriately.
     * @param courseRepeatCodeDescriptor The JSON representation of the \&quot;courseRepeatCodeDescriptor\&quot; resource to be created or updated. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postCourseRepeatCodeDescriptor(EdFiCourseRepeatCodeDescriptor courseRepeatCodeDescriptor) throws ApiException {
        postCourseRepeatCodeDescriptorWithHttpInfo(courseRepeatCodeDescriptor);
    }

    /**
     * Creates or updates resources based on the natural key values of the supplied resource.
     * The POST operation can be used to create or update resources. In database terms, this is often referred to as an \&quot;upsert\&quot; operation (insert + update). Clients should NOT include the resource \&quot;id\&quot; in the JSON body because it will result in an error (you must use a PUT operation to update a resource by \&quot;id\&quot;). The web service will identify whether the resource already exists based on the natural key values provided, and update or create the resource appropriately.
     * @param courseRepeatCodeDescriptor The JSON representation of the \&quot;courseRepeatCodeDescriptor\&quot; resource to be created or updated. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postCourseRepeatCodeDescriptorWithHttpInfo(EdFiCourseRepeatCodeDescriptor courseRepeatCodeDescriptor) throws ApiException {
        com.squareup.okhttp.Call call = postCourseRepeatCodeDescriptorCall(courseRepeatCodeDescriptor, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates or updates resources based on the natural key values of the supplied resource. (asynchronously)
     * The POST operation can be used to create or update resources. In database terms, this is often referred to as an \&quot;upsert\&quot; operation (insert + update). Clients should NOT include the resource \&quot;id\&quot; in the JSON body because it will result in an error (you must use a PUT operation to update a resource by \&quot;id\&quot;). The web service will identify whether the resource already exists based on the natural key values provided, and update or create the resource appropriately.
     * @param courseRepeatCodeDescriptor The JSON representation of the \&quot;courseRepeatCodeDescriptor\&quot; resource to be created or updated. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCourseRepeatCodeDescriptorAsync(EdFiCourseRepeatCodeDescriptor courseRepeatCodeDescriptor, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCourseRepeatCodeDescriptorCall(courseRepeatCodeDescriptor, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for putCourseRepeatCodeDescriptor */
    private com.squareup.okhttp.Call putCourseRepeatCodeDescriptorCall(String id, EdFiCourseRepeatCodeDescriptor courseRepeatCodeDescriptor, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = courseRepeatCodeDescriptor;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling putCourseRepeatCodeDescriptor(Async)");
        }
        
        // verify the required parameter 'courseRepeatCodeDescriptor' is set
        if (courseRepeatCodeDescriptor == null) {
            throw new ApiException("Missing the required parameter 'courseRepeatCodeDescriptor' when calling putCourseRepeatCodeDescriptor(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ed-fi/courseRepeatCodeDescriptors/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2_client_credentials" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Updates or creates a resource based on the resource identifier.
     * The PUT operation is used to update or create a resource by identifier. If the resource doesn&#39;t exist, the resource will be created using that identifier. Additionally, natural key values cannot be changed using this operation, and will not be modified in the database.  If the resource \&quot;id\&quot; is provided in the JSON body, it will be ignored as well.
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param courseRepeatCodeDescriptor The JSON representation of the \&quot;courseRepeatCodeDescriptor\&quot; resource to be created or updated. (required)
     * @param ifMatch The ETag header value used to prevent the PUT from updating a resource modified by another consumer. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putCourseRepeatCodeDescriptor(String id, EdFiCourseRepeatCodeDescriptor courseRepeatCodeDescriptor, String ifMatch) throws ApiException {
        putCourseRepeatCodeDescriptorWithHttpInfo(id, courseRepeatCodeDescriptor, ifMatch);
    }

    /**
     * Updates or creates a resource based on the resource identifier.
     * The PUT operation is used to update or create a resource by identifier. If the resource doesn&#39;t exist, the resource will be created using that identifier. Additionally, natural key values cannot be changed using this operation, and will not be modified in the database.  If the resource \&quot;id\&quot; is provided in the JSON body, it will be ignored as well.
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param courseRepeatCodeDescriptor The JSON representation of the \&quot;courseRepeatCodeDescriptor\&quot; resource to be created or updated. (required)
     * @param ifMatch The ETag header value used to prevent the PUT from updating a resource modified by another consumer. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putCourseRepeatCodeDescriptorWithHttpInfo(String id, EdFiCourseRepeatCodeDescriptor courseRepeatCodeDescriptor, String ifMatch) throws ApiException {
        com.squareup.okhttp.Call call = putCourseRepeatCodeDescriptorCall(id, courseRepeatCodeDescriptor, ifMatch, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates or creates a resource based on the resource identifier. (asynchronously)
     * The PUT operation is used to update or create a resource by identifier. If the resource doesn&#39;t exist, the resource will be created using that identifier. Additionally, natural key values cannot be changed using this operation, and will not be modified in the database.  If the resource \&quot;id\&quot; is provided in the JSON body, it will be ignored as well.
     * @param id A resource identifier that uniquely identifies the resource. (required)
     * @param courseRepeatCodeDescriptor The JSON representation of the \&quot;courseRepeatCodeDescriptor\&quot; resource to be created or updated. (required)
     * @param ifMatch The ETag header value used to prevent the PUT from updating a resource modified by another consumer. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCourseRepeatCodeDescriptorAsync(String id, EdFiCourseRepeatCodeDescriptor courseRepeatCodeDescriptor, String ifMatch, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putCourseRepeatCodeDescriptorCall(id, courseRepeatCodeDescriptor, ifMatch, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
