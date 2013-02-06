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

import org.w3c.dom.DOMException;
import org.w3c.dom.xpath.XPathException;

import com.google.gwt.core.client.JavaScriptObject;

final class XPathExceptionUtil {

	private XPathExceptionUtil() {
	}
	
	public static final native void raise(JavaScriptObject e) throws XPathException, DOMException /*-{
		if (e instanceof XPathException) {
			throw @org.w3c.dom.xpath.XPathException::new(SLjava/lang/String;)(e.code, e.message);
		}
		if (e instanceof DOMException) {
			throw @org.w3c.dom.DOMException::new(SLjava/lang/String;)(e.code, e.message);
		}
		throw e;
	}-*/;
	
}
