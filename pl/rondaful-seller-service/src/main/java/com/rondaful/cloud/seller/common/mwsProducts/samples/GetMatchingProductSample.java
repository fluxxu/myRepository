/*******************************************************************************
 * Copyright 2009-2017 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Marketplace Web Service Products
 * API Version: 2011-10-01
 * Library Version: 2017-03-22
 * Generated: Wed Mar 22 23:24:32 UTC 2017
 */
package com.rondaful.cloud.seller.common.mwsProducts.samples;

import com.rondaful.cloud.seller.common.mwsProducts.MarketplaceWebServiceProducts;
import com.rondaful.cloud.seller.common.mwsProducts.MarketplaceWebServiceProductsClient;
import com.rondaful.cloud.seller.common.mwsProducts.MarketplaceWebServiceProductsException;
import com.rondaful.cloud.seller.common.mwsProducts.model.ASINListType;
import com.rondaful.cloud.seller.common.mwsProducts.model.GetMatchingProductRequest;
import com.rondaful.cloud.seller.common.mwsProducts.model.GetMatchingProductResponse;
import com.rondaful.cloud.seller.common.mwsProducts.model.ResponseHeaderMetadata;


/** Sample call for GetMatchingProduct. */
public class GetMatchingProductSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static GetMatchingProductResponse invokeGetMatchingProduct(
            MarketplaceWebServiceProducts client,
            GetMatchingProductRequest request) {
        try {
            // Call the service.
            GetMatchingProductResponse response = client.getMatchingProduct(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MarketplaceWebServiceProductsException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
            if(rhmd != null) {
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
            }
            System.out.println("Message: "+ex.getMessage());
            System.out.println("StatusCode: "+ex.getStatusCode());
            System.out.println("ErrorCode: "+ex.getErrorCode());
            System.out.println("ErrorType: "+ex.getErrorType());
            throw ex;
        }
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        // Make sure you've set the variables in MarketplaceWebServiceProductsSampleConfig.
        MarketplaceWebServiceProductsClient client = MarketplaceWebServiceProductsSampleConfig.getClient();

        // Create a request.
        GetMatchingProductRequest request = new GetMatchingProductRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);
        ASINListType asinList = new ASINListType();
        request.setASINList(asinList);

        // Make the call.
        GetMatchingProductSample.invokeGetMatchingProduct(client, request);

    }

}
