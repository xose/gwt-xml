package com.github.xose.xml.xpath.gwt;

import org.w3c.dom.xpath.XPathNSResolver;

import com.google.gwt.core.client.JavaScriptObject;

public class XPathNSResolverImpl extends JavaScriptObject implements XPathNSResolver {

	protected XPathNSResolverImpl() {
	}

	@Override
	public final native String lookupNamespaceURI(String prefix) /*-{
		return this.lookupNamespaceURI(prefix);
	}-*/;

}
