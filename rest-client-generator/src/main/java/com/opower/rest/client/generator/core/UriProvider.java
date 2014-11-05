/**
 *    Copyright 2014 Opower, Inc.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 **/
package com.opower.rest.client.generator.core;

import java.net.URI;

/**
 * Implementations of this interface are responsible for providing the base URI for all 
 * requests that the generated client proxies will make. In a sense, this is how you point
 * the ClientBuilders at their intended urls.
 */
public interface UriProvider {

    /**
     * Build a base URI for the client proxies to use when making requests.
     * @return The base URI for the REST requests that the clients will make. Should not return null.
     */
    URI getUri();
}