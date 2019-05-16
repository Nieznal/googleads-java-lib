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


package com.google.api.ads.admanager.jaxws.v201905;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for the creation and management of creative wrappers.
 *       {@link CreativeWrapper CreativeWrappers} allow HTML snippets to be
 *       served along with creatives.
 *       <p>
 *       Creative wrappers must be associated with a
 *       {@link LabelType#CREATIVE_WRAPPER} label and applied to ad units by
 *       {@link AdUnit#appliedLabels}.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CreativeWrapperServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreativeWrapperServiceInterface {


    /**
     * 
     *         Creates a new {@code CreativeWrapper} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CreativeWrapper#labelId}</li>
     *         <li>{@link CreativeWrapper#ordering}</li>
     *         <li>{@link CreativeWrapper#header} or {@link CreativeWrapper#footer}</li>
     *         </ul>
     *         
     *         @param creativeWrappers the creative wrappers to create
     *         @return the creative wrappers with their IDs filled in
     *         @throws ApiException
     *       
     * 
     * @param creativeWrappers
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201905.CreativeWrapper>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
    @RequestWrapper(localName = "createCreativeWrappers", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905", className = "com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperServiceInterfacecreateCreativeWrappers")
    @ResponseWrapper(localName = "createCreativeWrappersResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905", className = "com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperServiceInterfacecreateCreativeWrappersResponse")
    public List<CreativeWrapper> createCreativeWrappers(
        @WebParam(name = "creativeWrappers", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
        List<CreativeWrapper> creativeWrappers)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CreativeWrapperPage} of {@link CreativeWrapper}
     *         objects that satisfy the given {@link Statement#query}. The following
     *         fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CreativeWrapper#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code labelId}</td>
     *         <td>{@link CreativeWrapper#labelId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link CreativeWrapper#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code ordering}</td>
     *         <td>{@link CreativeWrapper#ordering}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of creative wrappers.
     *         @return the creative wrappers that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
    @RequestWrapper(localName = "getCreativeWrappersByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905", className = "com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperServiceInterfacegetCreativeWrappersByStatement")
    @ResponseWrapper(localName = "getCreativeWrappersByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905", className = "com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperServiceInterfacegetCreativeWrappersByStatementResponse")
    public CreativeWrapperPage getCreativeWrappersByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CreativeWrapper} objects that match the
     *         given {@link Statement#query}.
     *         
     *         @param creativeWrapperAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of labels
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param creativeWrapperAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201905.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
    @RequestWrapper(localName = "performCreativeWrapperAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905", className = "com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperServiceInterfaceperformCreativeWrapperAction")
    @ResponseWrapper(localName = "performCreativeWrapperActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905", className = "com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperServiceInterfaceperformCreativeWrapperActionResponse")
    public UpdateResult performCreativeWrapperAction(
        @WebParam(name = "creativeWrapperAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
        CreativeWrapperAction creativeWrapperAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@code CreativeWrapper} objects.
     *         
     *         @param creativeWrappers the creative wrappers to update
     *         @return the updated creative wrapper objects
     *         @throws ApiException
     *       
     * 
     * @param creativeWrappers
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201905.CreativeWrapper>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
    @RequestWrapper(localName = "updateCreativeWrappers", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905", className = "com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperServiceInterfaceupdateCreativeWrappers")
    @ResponseWrapper(localName = "updateCreativeWrappersResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905", className = "com.google.api.ads.admanager.jaxws.v201905.CreativeWrapperServiceInterfaceupdateCreativeWrappersResponse")
    public List<CreativeWrapper> updateCreativeWrappers(
        @WebParam(name = "creativeWrappers", targetNamespace = "https://www.google.com/apis/ads/publisher/v201905")
        List<CreativeWrapper> creativeWrappers)
        throws ApiException_Exception
    ;

}
