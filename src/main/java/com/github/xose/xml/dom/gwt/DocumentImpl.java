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

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DocumentImpl extends NodeImpl implements Document {

	protected DocumentImpl() {
	}

	@Override
	public final native DocumentType getDoctype() /*-{
		return this.doctype;
	}-*/;

	@Override
	public final native DOMImplementation getImplementation() /*-{
		return this.implementation;
	}-*/;

	@Override
	public final native Element getDocumentElement() /*-{
		return this.documentElement;
	}-*/;

	@Override
	public final native Element createElement(String tagName) throws DOMException /*-{
		try {
			return this.documentElement(tagName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native DocumentFragment createDocumentFragment() /*-{
		return this.createDocumentFragment();
	}-*/;

	@Override
	public final native Text createTextNode(String data) /*-{
		return this.createTextNode(data);
	}-*/;

	@Override
	public final native Comment createComment(String data) /*-{
		return this.createComment(data);
	}-*/;

	@Override
	public final native CDATASection createCDATASection(String data) throws DOMException /*-{
		try {
			return this.createCDATASection(data);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native ProcessingInstruction createProcessingInstruction(String target, String data) throws DOMException /*-{
		try {
			return this.createProcessingInstruction(target, data);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Attr createAttribute(String name) throws DOMException /*-{
		try {
			return this.createAttribute(name);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native EntityReference createEntityReference(String name) throws DOMException /*-{
		try {
			return this.createEntityReference(name);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native NodeList getElementsByTagName(String tagname) /*-{
		return this.getElementsByTagName(tagname);
	}-*/;

	@Override
	public final native Node importNode(Node importedNode, boolean deep) throws DOMException /*-{
		try {
			return this.importNode(importedNode, deep);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Element createElementNS(String namespaceURI, String qualifiedName) throws DOMException /*-{
		try {
			return this.createElementNS(namespaceURI, qualifiedName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Attr createAttributeNS(String namespaceURI, String qualifiedName) throws DOMException /*-{
		try {
			return this.createAttributeNS(namespaceURI, qualifiedName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native NodeList getElementsByTagNameNS(String namespaceURI, String localName) /*-{
		return this.getElementsByTagNameNS(namespaceURI, localName);
	}-*/;

	@Override
	public final native Element getElementById(String elementId) /*-{
		return this.getElementById(elementId);
	}-*/;

	@Override
	public final native String getInputEncoding() /*-{
		return this.inputEncoding;
	}-*/;

	@Override
	public final native String getXmlEncoding() /*-{
		return this.xmlEncoding;
	}-*/;

	@Override
	public final native boolean getXmlStandalone() /*-{
		return this.xmlStandalone;
	}-*/;

	@Override
	public final native void setXmlStandalone(boolean xmlStandalone) throws DOMException /*-{
		try {
			this.xmlStandalone = xmlStandalone;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native String getXmlVersion() /*-{
		return this.xmlVersion;
	}-*/;

	@Override
	public final native void setXmlVersion(String xmlVersion) throws DOMException /*-{
		try {
			this.xmlVersion = xmlVersion;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native String getDocumentURI() /*-{
		return this.documentURI;
	}-*/;

	@Override
	public final native void setDocumentURI(String documentURI) /*-{
		this.documentURI = documentURI;
	}-*/;

	@Override
	public final native Node adoptNode(Node source) throws DOMException /*-{
		try {
			return this.adoptNode(source);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final boolean getStrictErrorChecking() {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final void setStrictErrorChecking(boolean strictErrorChecking) {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final DOMConfiguration getDomConfig() {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final void normalizeDocument() {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final Node renameNode(Node n, String namespaceURI, String qualifiedName) throws DOMException {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

}
