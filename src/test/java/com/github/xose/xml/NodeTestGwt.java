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

package com.github.xose.xml;

import static org.truth0.Truth.ASSERT;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.xpath.XPathEvaluator;

import com.github.xose.xml.dom.DOMUtils;
import com.github.xose.xml.xpath.XPathUtils;
import com.google.gwt.junit.client.GWTTestCase;

public class NodeTestGwt extends GWTTestCase {

	public void test1() {
		Document doc = DOMUtils.parse("<testxml a=\"b\"/>");
		ASSERT.that(doc).isNotNull();
		Element e = doc.getDocumentElement();
		ASSERT.that(e).isNotNull();
		ASSERT.that(e.getTagName()).isEqualTo("testxml");
		ASSERT.that(e.getAttribute("a")).isEqualTo("b");
	}
	
	public void test2() {
		Document doc = DOMUtils.parse("<testxml a=\"b\"/>");
		ASSERT.that(doc).isNotNull();
		Text t = doc.createTextNode("test");
		ASSERT.that(t).isNotNull();
		try {
			t.splitText(-1);
			fail("no exception");
		} catch (DOMException e) {
			ASSERT.that(e.code).isEqualTo(DOMException.INDEX_SIZE_ERR);
		}
	}
	
	public void test3() {
		String input = "<testxml a=\"b\"/>";
		Document doc = DOMUtils.parse(input);
		ASSERT.that(doc).isNotNull();
		Element e = doc.getDocumentElement();
		ASSERT.that(e).isNotNull();
		String output = DOMUtils.serialize(e);
		ASSERT.that(output).isEqualTo(input);
	}
	
	public void test4() {
		Document doc = DOMUtils.createDocument();
		ASSERT.that(doc).isNotNull();
	}
	
	public void test5() {
		XPathEvaluator eval = XPathUtils.createEvaluator();
		ASSERT.that(eval).isNotNull();
	}

	@Override
	public String getModuleName() {
		return "com.github.xose.xml.XMLTest";
	}

}
