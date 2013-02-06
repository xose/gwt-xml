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

package com.github.xose.xml.dom;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

import com.google.gwt.core.client.JavaScriptObject;

final class XMLSerializer extends JavaScriptObject {

	protected XMLSerializer() {
	}

	public static final native XMLSerializer create() /*-{
		return new XMLSerializer();
	}-*/;

	public final native String serializeToString(Node node) throws DOMException /*-{
		try {
			return this.serializeToString(node);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

}
