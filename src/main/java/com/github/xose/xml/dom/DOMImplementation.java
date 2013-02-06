package com.github.xose.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;

import com.google.gwt.core.client.JavaScriptObject;

final class DOMImplementation extends JavaScriptObject {

	protected DOMImplementation() {
	}

	public static final native DOMImplementation get() /*-{
		return $wnd.document.implementation;
	}-*/;

	public final native boolean hasFeature(String feature, String version) /*-{
		return this.hasFeature(feature, version);
	}-*/;

	public final native DocumentType createDocumentType(String qualifiedName, String publicId, String systemId) /*-{
		return this.createDocumentType(qualifiedName, publicId, systemId);
	}-*/;

	public final native Document createDocument() /*-{
		return this.createDocument();
	}-*/;

	public final native Document createDocument(String namespaceURI, String qualifiedName) /*-{
		return this.createDocument(namespaceURI, qualifiedName);
	}-*/;

	public final native Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype) /*-{
		return this.createDocument(namespaceURI, qualifiedName, doctype);
	}-*/;

}
