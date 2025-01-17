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
 * Lowest Offer Listing List
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
 * LowestOfferListingList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="LowestOfferListingList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="LowestOfferListing" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}LowestOfferListingType" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="LowestOfferListingList", propOrder={
    "lowestOfferListing"
})
@XmlRootElement(name = "LowestOfferListingList")
public class LowestOfferListingList extends AbstractMwsObject {

    @XmlElement(name="LowestOfferListing")
    private List<LowestOfferListingType> lowestOfferListing;

    /**
     * Get the value of LowestOfferListing.
     *
     * @return The value of LowestOfferListing.
     */
    public List<LowestOfferListingType> getLowestOfferListing() {
        if (lowestOfferListing==null) {
            lowestOfferListing = new ArrayList<LowestOfferListingType>();
        }
        return lowestOfferListing;
    }

    /**
     * Set the value of LowestOfferListing.
     *
     * @param lowestOfferListing
     *            The new value to set.
     */
    public void setLowestOfferListing(List<LowestOfferListingType> lowestOfferListing) {
        this.lowestOfferListing = lowestOfferListing;
    }

    /**
     * Clear LowestOfferListing.
     */
    public void unsetLowestOfferListing() {
        this.lowestOfferListing = null;
    }

    /**
     * Check to see if LowestOfferListing is set.
     *
     * @return true if LowestOfferListing is set.
     */
    public boolean isSetLowestOfferListing() {
        return lowestOfferListing != null && !lowestOfferListing.isEmpty();
    }

    /**
     * Add values for LowestOfferListing, return this.
     *
     * @param lowestOfferListing
     *             New values to add.
     *
     * @return This instance.
     */
    public LowestOfferListingList withLowestOfferListing(LowestOfferListingType... values) {
        List<LowestOfferListingType> list = getLowestOfferListing();
        for (LowestOfferListingType value : values) {
            list.add(value);
        }
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
        lowestOfferListing = r.readList("LowestOfferListing", LowestOfferListingType.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("LowestOfferListing", lowestOfferListing);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/schema/Products/2011-10-01", "LowestOfferListingList",this);
    }


    /** Default constructor. */
    public LowestOfferListingList() {
        super();
    }

}
