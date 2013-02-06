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
import org.w3c.dom.xpath.XPathEvaluator;
import org.w3c.dom.xpath.XPathException;
import org.w3c.dom.xpath.XPathExpression;
import org.w3c.dom.xpath.XPathNSResolver;

import com.google.gwt.core.client.JavaScriptObject;

public class XPathEvaluatorImpl extends JavaScriptObject implements XPathEvaluator {

	protected XPathEvaluatorImpl() {
	}

	@Override
	public final native XPathExpression createExpression(String expression, XPathNSResolver resolver) throws XPathException, DOMException /*-{
		try {
			return this.createExpression(expression, resolver);
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native XPathNSResolver createNSResolver(Node nodeResolver) /*-{
		return this.createNSResolver(nodeResolver);
	}-*/;

	@Override
	public final native Object evaluate(String expression, Node contextNode, XPathNSResolver resolver, short type, Object result) throws XPathException, DOMException /*-{
		try {
			return this.evaluate(expression, contextNode, resolver, type, result);
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

}
