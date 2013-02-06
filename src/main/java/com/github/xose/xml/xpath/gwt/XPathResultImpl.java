package com.github.xose.xml.xpath.gwt;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.xpath.XPathException;
import org.w3c.dom.xpath.XPathResult;

import com.google.gwt.core.client.JavaScriptObject;

public class XPathResultImpl extends JavaScriptObject implements XPathResult {

	protected XPathResultImpl() {
	}

	@Override
	public final native short getResultType() /*-{
		return this.resultType;
	}-*/;

	@Override
	public final native double getNumberValue() throws XPathException /*-{
		try {
			return this.numberValue;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native String getStringValue() throws XPathException /*-{
		try {
			return this.stringValue;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native boolean getBooleanValue() throws XPathException /*-{
		try {
			return this.booleanValue;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node getSingleNodeValue() throws XPathException /*-{
		try {
			return this.singleNodeValue;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native boolean getInvalidIteratorState() /*-{
		return this.invalidIteratorState;
	}-*/;

	@Override
	public final native int getSnapshotLength() throws XPathException /*-{
		try {
			return this.snapshotLength;
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node iterateNext() throws XPathException, DOMException /*-{
		try {
			return this.iterateNext();
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

	@Override
	public final native Node snapshotItem(int index) throws XPathException /*-{
		try {
			return this.snapshotItem(index);
		} catch (e) {
			@com.github.xose.xml.xpath.gwt.XPathExceptionUtil::raise(*)(e);
		}
	}-*/;

}
