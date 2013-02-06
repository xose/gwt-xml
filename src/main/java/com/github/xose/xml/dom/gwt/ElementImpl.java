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
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;

public class ElementImpl extends NodeImpl implements Element {

	protected ElementImpl() {
	}

	@Override
	public final native String getTagName() /*-{
		return this.tagName;
	}-*/;

	@Override
	public final native String getAttribute(String name) /*-{
		return this.getAttribute(name);
	}-*/;

	@Override
	public final native void setAttribute(String name, String value) throws DOMException /*-{
		try {
			this.setAttribute(name, value);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void removeAttribute(String name) throws DOMException /*-{
		try {
			this.removeAttribute(name);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Attr getAttributeNode(String name) /*-{
		return this.getAttributeNode(name);
	}-*/;

	@Override
	public final native Attr setAttributeNode(Attr newAttr) throws DOMException /*-{
		try {
			return this.setAttributeNode(newAttr);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Attr removeAttributeNode(Attr oldAttr) throws DOMException /*-{
		try {
			return this.removeAttributeNode(oldAttr);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native NodeList getElementsByTagName(String name) /*-{
		return this.getElementsByTagName(name);
	}-*/;

	@Override
	public final native NodeList getElementsByTagNameNS(String namespaceURI, String localName) throws DOMException /*-{
		try {
			return this.getElementsByTagNameNS(namespaceURI, localName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native String getAttributeNS(String namespaceURI, String localName) throws DOMException /*-{
		try {
			return this.getAttributeNS(namespaceURI, localName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void setAttributeNS(String namespaceURI, String qualifiedName, String value) throws DOMException /*-{
		try {
			this.setAttributeNS(namespaceURI, qualifiedName, value);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void removeAttributeNS(String namespaceURI, String localName) throws DOMException /*-{
		try {
			this.removeAttributeNS(namespaceURI, localName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Attr getAttributeNodeNS(String namespaceURI, String localName) throws DOMException /*-{
		try {
			return this.getAttributeNodeNS(namespaceURI, localName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Attr setAttributeNodeNS(Attr newAttr) throws DOMException /*-{
		try {
			this.setAttributeNodeNS(newAttr);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native boolean hasAttribute(String name) /*-{
		return this.hasAttribute(name);
	}-*/;

	@Override
	public final native boolean hasAttributeNS(String namespaceURI, String localName) throws DOMException /*-{
		try {
			return this.hasAttributeNS(namespaceURI, localName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final TypeInfo getSchemaTypeInfo() {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final void setIdAttribute(String name, boolean isId) throws DOMException {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final void setIdAttributeNS(String namespaceURI, String localName, boolean isId) throws DOMException {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final void setIdAttributeNode(Attr idAttr, boolean isId) throws DOMException {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

}
