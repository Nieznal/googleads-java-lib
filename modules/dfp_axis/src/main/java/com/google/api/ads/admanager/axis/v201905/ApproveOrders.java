// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * ApproveOrders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201905;


/**
 * The action used for approving {@link Order} objects. All {@link
 * LineItem}
 *             objects within the order will be approved as well. For
 * more information on what happens to an
 *             order and its line items when it is approved, see the
 *             <a href="https://support.google.com/dfp_premium/answer/177334">Ad
 * Manager Help Center</a>.
 *             </p>
 */
public class ApproveOrders  extends com.google.api.ads.admanager.axis.v201905.OrderAction  implements java.io.Serializable {
    /* Indicates whether the inventory check should be skipped when
     * performing this action.
     *                     The default value is false. */
    private java.lang.Boolean skipInventoryCheck;

    public ApproveOrders() {
    }

    public ApproveOrders(
           java.lang.Boolean skipInventoryCheck) {
        this.skipInventoryCheck = skipInventoryCheck;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("skipInventoryCheck", getSkipInventoryCheck())
            .toString();
    }

    /**
     * Gets the skipInventoryCheck value for this ApproveOrders.
     * 
     * @return skipInventoryCheck   * Indicates whether the inventory check should be skipped when
     * performing this action.
     *                     The default value is false.
     */
    public java.lang.Boolean getSkipInventoryCheck() {
        return skipInventoryCheck;
    }


    /**
     * Sets the skipInventoryCheck value for this ApproveOrders.
     * 
     * @param skipInventoryCheck   * Indicates whether the inventory check should be skipped when
     * performing this action.
     *                     The default value is false.
     */
    public void setSkipInventoryCheck(java.lang.Boolean skipInventoryCheck) {
        this.skipInventoryCheck = skipInventoryCheck;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApproveOrders)) return false;
        ApproveOrders other = (ApproveOrders) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.skipInventoryCheck==null && other.getSkipInventoryCheck()==null) || 
             (this.skipInventoryCheck!=null &&
              this.skipInventoryCheck.equals(other.getSkipInventoryCheck())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSkipInventoryCheck() != null) {
            _hashCode += getSkipInventoryCheck().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApproveOrders.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "ApproveOrders"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipInventoryCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "skipInventoryCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
