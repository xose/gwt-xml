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

package com.github.xose.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public final class DOMUtils {
	
	private static final DOMParser parser = DOMParser.create();
	private static final XMLSerializer serializer = XMLSerializer.create();
	private static final DOMImplementation domImpl = DOMImplementation.get();
	
	public static final Document createDocument() {
		return domImpl.createDocument();
	}
	
	public static final Document parse(String contents) {
		return parser.parseFromString(contents);
	}
	
	public static final String serialize(Node node) {
		return serializer.serializeToString(node);
	}
	
	private DOMUtils() {
	}
	
}
