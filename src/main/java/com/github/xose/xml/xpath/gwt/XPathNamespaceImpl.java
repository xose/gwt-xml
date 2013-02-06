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
