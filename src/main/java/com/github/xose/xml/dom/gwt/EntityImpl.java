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

import org.w3c.dom.Entity;

public class EntityImpl extends NodeImpl implements Entity {

	protected EntityImpl() {
	}

	@Override
	public final native String getPublicId() /*-{
		return this.publicId;
	}-*/;

	@Override
	public final native String getSystemId() /*-{
		return this.systemId;
	}-*/;

	@Override
	public final native String getNotationName() /*-{
		return this.notationName;
	}-*/;

	@Override
	public final String getInputEncoding() {
		return getOwnerDocument().getInputEncoding();
	}

	@Override
	public final String getXmlEncoding() {
		return getOwnerDocument().getXmlEncoding();
	}

	@Override
	public final String getXmlVersion() {
		return getOwnerDocument().getXmlVersion();
	}

}
