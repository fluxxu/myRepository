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

import com.rondaful.cloud.seller.common.mwsProducts.MarketplaceWebServiceProductsAsync;
import com.rondaful.cloud.seller.common.mwsProducts.MarketplaceWebServiceProductsAsyncClient;
import com.rondaful.cloud.seller.common.mwsProducts.MarketplaceWebServiceProductsException;
import com.rondaful.cloud.seller.common.mwsProducts.model.GetMatchingProductForIdRequest;
import com.rondaful.cloud.seller.common.mwsProducts.model.GetMatchingProductForIdResponse;
import com.rondaful.cloud.seller.common.mwsProducts.model.IdListType;
import com.rondaful.cloud.seller.common.mwsProducts.model.ResponseHeaderMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for GetMatchingProductForId. */
public class GetMatchingProductForIdAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param requestList
     *
     * @return The response.
     */
    public static List<Object> invokeGetMatchingProductForId(
            MarketplaceWebServiceProductsAsync client,
            List<GetMatchingProductForIdRequest> requestList) {
        // Call the service async.
        List<Future<GetMatchingProductForIdResponse>> futureList =
            new ArrayList<Future<GetMatchingProductForIdResponse>>();
        for (GetMatchingProductForIdRequest request : requestList) {
            Future<GetMatchingProductForIdResponse> future = 
                client.getMatchingProductForIdAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<GetMatchingProductForIdResponse> future : futureList) {
            Object xresponse;
            try {
                GetMatchingProductForIdResponse response = future.get();
                ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof MarketplaceWebServiceProductsException) {
                    // Exception properties are important for diagnostics.
                    MarketplaceWebServiceProductsException ex = 
                        (MarketplaceWebServiceProductsException)cause;
                    ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        MarketplaceWebServiceProductsAsyncClient client = MarketplaceWebServiceProductsSampleConfig.getAsyncClient();

        // Create a request list.
        List<GetMatchingProductForIdRequest> requestList = new ArrayList<GetMatchingProductForIdRequest>();
        GetMatchingProductForIdRequest request = new GetMatchingProductForIdRequest();
        String sellerId = "A1MLXBPVBMFWB7";
        request.setSellerId(sellerId);
        String mwsAuthToken = "amzn.mws.34b44e6b-97ad-a50d-11c3-e869039789b2";
        request.setMWSAuthToken(mwsAuthToken);
        String marketplaceId = "A13V1IB3VIYZZH";
        request.setMarketplaceId(marketplaceId);
        String idType = "SellerSKU";
        request.setIdType(idType);
        IdListType idList = new IdListType();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("lx1903041051");
        idList.setId(strings);
        request.setIdList(idList);
        requestList.add(request);

        // Make the calls.
        GetMatchingProductForIdAsyncSample.invokeGetMatchingProductForId(client, requestList);

    }

}
