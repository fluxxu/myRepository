/******************************************************************************* 
 *  Copyright 2009 Amazon Services.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 *
 *  Marketplace Web Service Java Library
 *  API Version: 2009-01-01
 *  Generated: Wed Feb 18 13:28:48 PST 2009 
 * 
 */



package com.rondaful.cloud.seller.common.mws.samples;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.rondaful.cloud.seller.common.mws.*;
import com.rondaful.cloud.seller.common.mws.model.*;
import com.rondaful.cloud.seller.common.mws.mock.MarketplaceWebServiceMock;

/**
 *
 * Get Report List  Samples
 *
 *
 */
public class GetReportListSample {

    /**
     * Just add a few required parameters, and try the service
     * Get Report List functionality
     *
     * @param args unused
     */
    public static void main(String... args) {

        /************************************************************************
         * Access Key ID and Secret Access Key ID, obtained from:
         * http://aws.amazon.com
         ***********************************************************************/
        final String accessKeyId = KeyValueConts.accessKeyId;
        final String secretAccessKey = KeyValueConts.secretAccessKey;

        final String appName = KeyValueConts.appName;//"<Your Application or Company Name>";
        final String appVersion = KeyValueConts.appVersion; //"<Your Application Version or Build Number or Release Date>";

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

        /************************************************************************
         * Uncomment to set the appropriate MWS endpoint.
         ************************************************************************/
        // US
        // config.setServiceURL("https://mws.amazonservices.com/");
        // UK
        // config.setServiceURL("https://mws.amazonservices.co.uk/");
        // Germany
        // config.setServiceURL("https://mws.amazonservices.de/");
        // France
        // config.setServiceURL("https://mws.amazonservices.fr/");
        // Italy
        // config.setServiceURL("https://mws.amazonservices.it/");
        // Japan
        // config.setServiceURL("https://mws.amazonservices.jp/");
        // China
        // config.setServiceURL("https://mws.amazonservices.com.cn/");
        // Canada
        // config.setServiceURL("https://mws.amazonservices.ca/");
        // India
        // config.setServiceURL("https://mws.amazonservices.in/");
         config.setServiceURL("https://mws-eu.amazonservices.com");
        /************************************************************************
         * You can also try advanced configuration options. Available options are:
         *
         *  - Signature Version
         *  - Proxy Host and Proxy Port
         *  - User Agent String to be sent to Marketplace Web Service
         *
         ***********************************************************************/

        /************************************************************************
         * Instantiate Http Client Implementation of Marketplace Web Service        
         ***********************************************************************/

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                accessKeyId, secretAccessKey, appName, appVersion, config);

        /************************************************************************
         * Uncomment to try out Mock Service that simulates Marketplace Web Service 
         * responses without calling Marketplace Web Service  service.
         *
         * Responses are loaded from local XML files. You can tweak XML files to
         * experiment with various outputs during development
         *
         * XML files available under com/amazonaws/mws/mock tree
         *
         ***********************************************************************/
        // MarketplaceWebService service = new MarketplaceWebServiceMock();



        GetReportListRequest request = new GetReportListRequest();
        request.setMerchant( "A1MLXBPVBMFWB7" );
        request.setMWSAuthToken("amzn.mws.34b44e6b-97ad-a50d-11c3-e869039789b2");

        // @TODO: set request parameters here
        final IdList ReportRequestIdList = new IdList(Arrays.asList(
        		"55024018001","55095018002"));
        request.setReportRequestIdList(ReportRequestIdList);
        
        invokeGetReportList(service, request);

    }



    /**
     * Get Report List  request sample
     * returns a list of reports; by default the most recent ten reports,
     * regardless of their acknowledgement status
     *   
     * @param service instance of MarketplaceWebService service
     * @param request Action to invoke
     */
    public static void invokeGetReportList(MarketplaceWebService service, GetReportListRequest request) {
        try {

            GetReportListResponse response = service.getReportList(request);


            System.out.println ("GetReportList Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    GetReportListResponse");
            System.out.println();
            if (response.isSetGetReportListResult()) {
                System.out.print("        GetReportListResult");
                System.out.println();
                GetReportListResult  getReportListResult = response.getGetReportListResult();
                if (getReportListResult.isSetNextToken()) {
                    System.out.print("            NextToken");
                    System.out.println();
                    System.out.print("                " + getReportListResult.getNextToken());
                    System.out.println();
                }
                if (getReportListResult.isSetHasNext()) {
                    System.out.print("            HasNext");
                    System.out.println();
                    System.out.print("                " + getReportListResult.isHasNext());
                    System.out.println();
                }
                java.util.List<ReportInfo> reportInfoListList = getReportListResult.getReportInfoList();
                for (ReportInfo reportInfoList : reportInfoListList) {
                    System.out.print("            ReportInfoList");
                    System.out.println();
                    if (reportInfoList.isSetReportId()) {
                        System.out.print("                ReportId");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getReportId());
                        System.out.println();
                    }
                    if (reportInfoList.isSetReportType()) {
                        System.out.print("                ReportType");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getReportType());
                        System.out.println();
                    }
                    if (reportInfoList.isSetReportRequestId()) {
                        System.out.print("                ReportRequestId");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getReportRequestId());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAvailableDate()) {
                        System.out.print("                AvailableDate");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getAvailableDate());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAcknowledged()) {
                        System.out.print("                Acknowledged");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.isAcknowledged());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAcknowledgedDate()) {
                        System.out.print("                AcknowledgedDate");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getAcknowledgedDate());
                        System.out.println();
                    }
                }
            } 
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();


        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
    }

}
