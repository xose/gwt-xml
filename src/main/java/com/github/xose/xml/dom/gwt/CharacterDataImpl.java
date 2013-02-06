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

import org.w3c.dom.CharacterData;
import org.w3c.dom.DOMException;

public class CharacterDataImpl extends NodeImpl implements CharacterData {

	protected CharacterDataImpl() {
	}

	@Override
	public final native String getData() throws DOMException /*-{
		try {
			return this.data;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void setData(String data) throws DOMException /*-{
		try {
			this.data = data;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native int getLength() /*-{
		return this.length;
	}-*/;

	@Override
	public final native String substringData(int offset, int count) throws DOMException /*-{
		try {
			return this.substringData(offset, count);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void appendData(String arg) throws DOMException /*-{
		try {
			return this.appendData(arg);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void insertData(int offset, String arg) throws DOMException /*-{
		try {
			return this.insertData(offset, arg);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void deleteData(int offset, int count) throws DOMException /*-{
		try {
			return this.deleteData(offset, count);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native void replaceData(int offset, int count, String arg) throws DOMException /*-{
		try {
			return this.replaceData(offset, count, arg);
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

}
