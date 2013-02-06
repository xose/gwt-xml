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

import org.w3c.dom.Document;

import com.google.gwt.core.client.JavaScriptObject;

final class DOMParser extends JavaScriptObject {

	protected DOMParser() {
	}

	public static final native DOMParser create() /*-{
		return new DOMParser();
	}-*/;

	public final Document parseFromString(String str) {
		return parseFromString(str, "text/xml");
	}

	public final native Document parseFromString(String str, String contentType) /*-{
		return this.parseFromString(str, contentType);
	}-*/;

}
