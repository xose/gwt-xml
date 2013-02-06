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
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.UserDataHandler;

import com.google.gwt.core.client.JavaScriptObject;

public class NodeImpl extends JavaScriptObject implements Node {

	protected NodeImpl() {
	}

	@Override
	public final native String getNodeName() /*-{
		return this.nodeName;
	}-*/;

	@Override
	public final native String getNodeValue() throws DOMException /*-{
		try {
			return this.nodeValue;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void setNodeValue(String nodeValue) throws DOMException /*-{
		try {
			this.nodeValue = nodeValue;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native short getNodeType() /*-{
		return this.nodeType;
	}-*/;

	@Override
	public final native Node getParentNode() /*-{
		return this.parentNode;
	}-*/;

	@Override
	public final native NodeList getChildNodes() /*-{
		return this.childNodes;
	}-*/;

	@Override
	public final native Node getFirstChild() /*-{
		return this.firstChild;
	}-*/;

	@Override
	public final native Node getLastChild() /*-{
		return this.lastChild;
	}-*/;

	@Override
	public final native Node getPreviousSibling() /*-{
		return this.previousSibling;
	}-*/;

	@Override
	public final native Node getNextSibling() /*-{
		return this.nextSibling;
	}-*/;

	@Override
	public final native NamedNodeMap getAttributes() /*-{
		return this.attributes;
	}-*/;

	@Override
	public final native Document getOwnerDocument() /*-{
		return this.ownerDocument;
	}-*/;

	@Override
	public final native Node insertBefore(Node newChild, Node refChild) throws DOMException /*-{
		try {
			return this.insertBefore(newChild, refChild);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node replaceChild(Node newChild, Node oldChild) throws DOMException /*-{
		try {
			return this.replaceChild(newChild, oldChild);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node removeChild(Node oldChild) throws DOMException /*-{
		try {
			return this.removeChild(oldChild);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node appendChild(Node newChild) throws DOMException /*-{
		try {
			return this.appendChild(newChild);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native boolean hasChildNodes() /*-{
		return this.hasChildNodes();
	}-*/;

	@Override
	public final native Node cloneNode(boolean deep) /*-{
		return this.cloneNode(deep);
	}-*/;

	@Override
	public final native void normalize() /*-{
		return this.normalize();
	}-*/;

	@Override
	public final native boolean isSupported(String feature, String version) /*-{
		return this.isSupported(feature, version);
	}-*/;

	@Override
	public final native String getNamespaceURI() /*-{
		return this.namespaceURI;
	}-*/;

	@Override
	public final native String getPrefix() /*-{
		return this.prefix;
	}-*/;

	@Override
	public final native void setPrefix(String prefix) throws DOMException /*-{
		try {
			this.prefix = prefix;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native String getLocalName() /*-{
		return this.localName;
	}-*/;

	@Override
	public final native boolean hasAttributes() /*-{
		return this.hasAttributes();
	}-*/;

	@Override
	public final native String getBaseURI() /*-{
		return this.baseURI;
	}-*/;

	@Override
	public final native String getTextContent() throws DOMException /*-{
		try {
			return this.textContent;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void setTextContent(String textContent) throws DOMException /*-{
		try {
			return this.textContent;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native boolean isSameNode(Node other) /*-{
		return this.isSameNode(other);
	}-*/;
	
	@Override
	public final native boolean isEqualNode(Node arg) /*-{
		return this.isEqualNode(arg);
	}-*/;

	@Override
	public final native String lookupPrefix(String namespaceURI) /*-{
		return this.lookupPrefix(namespaceURI);
	}-*/;

	@Override
	public final native boolean isDefaultNamespace(String namespaceURI) /*-{
		return this.namespaceURI(namespaceURI);
	}-*/;

	@Override
	public final native String lookupNamespaceURI(String prefix) /*-{
		return this.lookupNamespaceURI(prefix);
	}-*/;

	@Override
	public final native short compareDocumentPosition(Node other) throws DOMException /*-{
		try {
			return this.compareDocumentPosition(other);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final Object getFeature(String feature, String version) {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final Object getUserData(String key) {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final Object setUserData(String key, Object data, UserDataHandler handler) {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

}
