/*
 * Copyright 2013 MS OpenTech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.msopentech.odatajclient.engine.communication.request;

import com.msopentech.odatajclient.engine.communication.request.ODataMediaEntityUpdateRequest.MediaEntityUpdateRequestPayload;
import com.msopentech.odatajclient.engine.communication.response.ODataMediaEntityUpdateResponse;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import java.util.concurrent.Future;

/**
 * This class implements an OData Media Entity create request.
 * Get instance by using ODataRequestFactory.
 *
 * @see ODataRequestFactory#getMediaEntityUpdateRequest(com.msopentech.odatajclient.engine.data.ODataURI,
 * java.io.InputStream)
 */
public class ODataMediaEntityUpdateRequest
        extends ODataStreamedRequestImpl<ODataMediaEntityUpdateResponse, MediaEntityUpdateRequestPayload> {

    /**
     * Constructor.
     *
     * @param editURI edit URI of the entity to be updated.
     * @param media media entity blob to be created.
     */
    ODataMediaEntityUpdateRequest(final URI editURI, final InputStream media) {
        super(Method.PUT);
        this.uri = editURI;
    }

    @Override
    public MediaEntityUpdateRequestPayload execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class MediaEntityUpdateRequestPayload extends ODataStreamingManagement<ODataMediaEntityUpdateResponse> {

        public MediaEntityUpdateRequestPayload() {
        }

        public MediaEntityUpdateRequestPayload(final PipedOutputStream os) {
            super(os);
        }

        @Override
        public ODataMediaEntityUpdateResponse getResponse() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Future<ODataMediaEntityUpdateResponse> asyncResponse() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}