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
import org.w3c.dom.Node;
import org.w3c.dom.xpath.XPathException;
import org.w3c.dom.xpath.XPathResult;

import com.google.gwt.core.client.JavaScriptObject;

public class XPathResultImpl extends JavaScriptObject implements XPathResult {

	protected XPathResultImpl() {
	}

	@Override
	public final native short getResultType() /*-{
		return this.resultType;
	}-*/;

	@Override
	public final native double getNumberValue() throws XPathException /*-{
		try {
			return this.numberValue;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native String getStringValue() throws XPathException /*-{
		try {
			return this.stringValue;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native boolean getBooleanValue() throws XPathException /*-{
		try {
			return this.booleanValue;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node getSingleNodeValue() throws XPathException /*-{
		try {
			return this.singleNodeValue;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native boolean getInvalidIteratorState() /*-{
		return this.invalidIteratorState;
	}-*/;

	@Override
	public final native int getSnapshotLength() throws XPathException /*-{
		try {
			return this.snapshotLength;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node iterateNext() throws XPathException, DOMException /*-{
		try {
			return this.iterateNext();
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node snapshotItem(int index) throws XPathException /*-{
		try {
			return this.snapshotItem(index);
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

}
