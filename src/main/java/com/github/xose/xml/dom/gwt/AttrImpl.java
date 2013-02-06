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
import org.w3c.dom.TypeInfo;

public class AttrImpl extends NodeImpl implements Attr {

	protected AttrImpl() {
	}

	@Override
	public final native String getName() /*-{
		return this.name;
	}-*/;

	@Override
	public final native boolean getSpecified() /*-{
		return this.specified;
	}-*/;

	@Override
	public final native String getValue() /*-{
		return this.value;
	}-*/;

	@Override
	public final native void setValue(String value) throws DOMException /*-{
		try {
			this.value = value;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Element getOwnerElement() /*-{
		return this.ownerElement;
	}-*/;

	@Override
	public final TypeInfo getSchemaTypeInfo() {
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Method not supported");
	}

	@Override
	public final native boolean isId() /*-{
		return this.isId;
	}-*/;

}
