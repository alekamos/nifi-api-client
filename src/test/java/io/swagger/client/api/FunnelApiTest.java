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
import io.swagger.client.model.FunnelEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FunnelApi
 */
@Ignore
public class FunnelApiTest {

    private final FunnelApi api = new FunnelApi();

    
    /**
     * Gets a funnel
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFunnelTest() throws ApiException {
        String id = null;
        FunnelEntity response = api.getFunnel(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a funnel
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFunnelTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        FunnelEntity response = api.removeFunnel(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Updates a funnel
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFunnelTest() throws ApiException {
        String id = null;
        FunnelEntity body = null;
        FunnelEntity response = api.updateFunnel(id, body);

        // TODO: test validations
    }
    
}
