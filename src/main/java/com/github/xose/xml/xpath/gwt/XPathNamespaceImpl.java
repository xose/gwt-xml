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

import org.w3c.dom.Element;
import org.w3c.dom.xpath.XPathNamespace;

import com.github.xose.xml.dom.gwt.NodeImpl;

public class XPathNamespaceImpl extends NodeImpl implements XPathNamespace {

	protected XPathNamespaceImpl() {
	}

	@Override
	public final Element getOwnerElement() {
		return null;
	}

}
