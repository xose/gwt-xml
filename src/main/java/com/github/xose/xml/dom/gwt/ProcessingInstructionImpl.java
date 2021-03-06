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
import org.w3c.dom.ProcessingInstruction;

public class ProcessingInstructionImpl extends NodeImpl implements ProcessingInstruction {

	protected ProcessingInstructionImpl() {
	}

	@Override
	public final native String getTarget() /*-{
		return this.target;
	}-*/;

	@Override
	public final native String getData() /*-{
		return this.data;
	}-*/;

	@Override
	public final native void setData(String data) throws DOMException /*-{
		try {
			this.data = data;
		} catch (e) {
			@com.github.xose.xml.dom.gwt.DOMExceptionUtil::raise(*)(e);
		}
	}-*/;

}
