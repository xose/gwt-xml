/**
 * Copyright 2013 José Martínez
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.xose.xml.xpath.gwt;

import org.w3c.dom.xpath.XPathNSResolver;

import com.google.gwt.core.client.JavaScriptObject;

public class XPathNSResolverImpl extends JavaScriptObject implements XPathNSResolver {

	protected XPathNSResolverImpl() {
	}

	@Override
	public final native String lookupNamespaceURI(String prefix) /*-{
		return this.lookupNamespaceURI(prefix);
	}-*/;

}
