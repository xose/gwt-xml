package com.github.xose.xml.xpath.gwt;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.xpath.XPathException;
import org.w3c.dom.xpath.XPathExpression;

import com.google.gwt.core.client.JavaScriptObject;

public class XPathExpressionImpl extends JavaScriptObject implements XPathExpression {

	protected XPathExpressionImpl() {
	}

	@Override
	public final native Object evaluate(Node contextNode, short type, Object result) throws XPathException, DOMException /*-{
		try {
			return this.evaluate(contextNode, type, result);
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

}
