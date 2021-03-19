/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.13.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ProvenanceEventEntity;
import io.swagger.client.model.StreamingOutput;
import io.swagger.client.model.SubmitReplayRequestEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvenanceEventsApi
 */
@Ignore
public class ProvenanceEventsApiTest {

    private final ProvenanceEventsApi api = new ProvenanceEventsApi();

    
    /**
     * Gets the input content for a provenance event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInputContentTest() throws ApiException {
        String id = null;
        String clusterNodeId = null;
        StreamingOutput response = api.getInputContent(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets the output content for a provenance event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOutputContentTest() throws ApiException {
        String id = null;
        String clusterNodeId = null;
        StreamingOutput response = api.getOutputContent(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets a provenance event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProvenanceEventTest() throws ApiException {
        String id = null;
        String clusterNodeId = null;
        ProvenanceEventEntity response = api.getProvenanceEvent(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Replays content from a provenance event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitReplayTest() throws ApiException {
        SubmitReplayRequestEntity body = null;
        ProvenanceEventEntity response = api.submitReplay(body);

        // TODO: test validations
    }
    
}
