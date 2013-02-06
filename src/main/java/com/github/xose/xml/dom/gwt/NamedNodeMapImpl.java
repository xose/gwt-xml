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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.google.gwt.core.client.JavaScriptObject;

public class NamedNodeMapImpl extends JavaScriptObject implements NamedNodeMap {

	protected NamedNodeMapImpl() {
	}

	@Override
	public final native Node getNamedItem(String name) /*-{
		return this.getNamedItem(name);
	}-*/;

	@Override
	public final native Node setNamedItem(Node arg) throws DOMException /*-{
		try {
			return this.setNamedItem(arg);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node removeNamedItem(String name) throws DOMException /*-{
		try {
			return this.removeNamedItem(name);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node item(int index) /*-{
		return this.item(index);
	}-*/;

	@Override
	public final native int getLength() /*-{
		return this.length;
	}-*/;

	@Override
	public final native Node getNamedItemNS(String namespaceURI, String localName) throws DOMException /*-{
		try {
			return this.getNamedItemNS(namespaceURI, localName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node setNamedItemNS(Node arg) throws DOMException /*-{
		try {
			return this.setNamedItemNS(arg);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node removeNamedItemNS(String namespaceURI, String localName) throws DOMException /*-{
		try {
			return this.removeNamedItemNS(namespaceURI, localName);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

}
