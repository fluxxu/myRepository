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
 * Get Matching Product For Id Response
 * API Version: 2011-10-01
 * Library Version: 2017-03-22
 * Generated: Wed Mar 22 23:24:32 UTC 2017
 */
package com.rondaful.cloud.seller.common.mwsProducts.model;

import com.rondaful.cloud.seller.common.mwsProducts.client.AbstractMwsObject;
import com.rondaful.cloud.seller.common.mwsProducts.client.MwsReader;
import com.rondaful.cloud.seller.common.mwsProducts.client.MwsWriter;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * GetMatchingProductForIdResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetMatchingProductForIdResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetMatchingProductForIdResult" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}GetMatchingProductForIdResult" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetMatchingProductForIdResponse", propOrder={
    "getMatchingProductForIdResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetMatchingProductForIdResponse")
public class GetMatchingProductForIdResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="GetMatchingProductForIdResult")
    private List<GetMatchingProductForIdResult> getMatchingProductForIdResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetMatchingProductForIdResult.
     *
     * @return The value of GetMatchingProductForIdResult.
     */
    public List<GetMatchingProductForIdResult> getGetMatchingProductForIdResult() {
        if (getMatchingProductForIdResult==null) {
            getMatchingProductForIdResult = new ArrayList<GetMatchingProductForIdResult>();
        }
        return getMatchingProductForIdResult;
    }

    /**
     * Set the value of GetMatchingProductForIdResult.
     *
     * @param getMatchingProductForIdResult
     *            The new value to set.
     */
    public void setGetMatchingProductForIdResult(List<GetMatchingProductForIdResult> getMatchingProductForIdResult) {
        this.getMatchingProductForIdResult = getMatchingProductForIdResult;
    }

    /**
     * Clear GetMatchingProductForIdResult.
     */
    public void unsetGetMatchingProductForIdResult() {
        this.getMatchingProductForIdResult = null;
    }

    /**
     * Check to see if GetMatchingProductForIdResult is set.
     *
     * @return true if GetMatchingProductForIdResult is set.
     */
    public boolean isSetGetMatchingProductForIdResult() {
        return getMatchingProductForIdResult != null && !getMatchingProductForIdResult.isEmpty();
    }

    /**
     * Add values for GetMatchingProductForIdResult, return this.
     *
     * @param values
     *             New values to add.
     *
     * @return This instance.
     */
    public GetMatchingProductForIdResponse withGetMatchingProductForIdResult(GetMatchingProductForIdResult... values) {
        List<GetMatchingProductForIdResult> list = getGetMatchingProductForIdResult();
        for (GetMatchingProductForIdResult value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMatchingProductForIdResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * Set the value of ResponseHeaderMetadata.
     *
     * @param responseHeaderMetadata
     *            The new value to set.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetMatchingProductForIdResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        getMatchingProductForIdResult = r.readList("GetMatchingProductForIdResult", GetMatchingProductForIdResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("GetMatchingProductForIdResult", getMatchingProductForIdResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "GetMatchingProductForIdResponse",this);
    }


    /** Default constructor. */
    public GetMatchingProductForIdResponse() {
        super();
    }

}
