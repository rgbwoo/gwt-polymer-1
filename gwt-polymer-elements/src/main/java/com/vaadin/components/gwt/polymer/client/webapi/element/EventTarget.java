package com.vaadin.components.gwt.polymer.client.webapi.element;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventTarget {
    void addEventListener(String type, EventListener listener);
}
