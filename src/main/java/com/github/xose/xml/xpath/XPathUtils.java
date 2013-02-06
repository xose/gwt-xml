package com.github.xose.xml.xpath;

import org.w3c.dom.Document;
import org.w3c.dom.xpath.XPathEvaluator;

public final class XPathUtils {

	public static final native XPathEvaluator createEvaluator() /*-{
		return new XPathEvaluator();
	}-*/;

	public static final native XPathEvaluator fromDocument(Document doc) /*-{
		return doc;
	}-*/;

	private XPathUtils() {
	}

}
