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

package com.github.xose.xml.dom.gwt;

import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;

import com.google.gwt.core.client.JavaScriptObject;

public class DOMImplementationImpl extends JavaScriptObject implements DOMImplementation {

	protected DOMImplementationImpl() {
	}

	@Override
	public final native boolean hasFeature(String feature, String version) /*-{
		return this.hasFeature(feature, version);
	}-*/;

	@Override
	public final native DocumentType createDocumentType(String qualifiedName, String publicId, String systemId) throws DOMException /*-{
		try {
			return this.createDocumentType(qualifiedName, publicId, systemId);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype) throws DOMException /*-{
		try {
			return this.createDocument(namespaceURI, qualifiedName, doctype);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final Object getFeature(String feature, String version) {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

}
