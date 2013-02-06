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
