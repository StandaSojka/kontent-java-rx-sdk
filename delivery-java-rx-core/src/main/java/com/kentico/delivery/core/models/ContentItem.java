package com.kentico.delivery.core.models;

import com.kentico.delivery.core.interfaces.item.item.IContentItem;
import com.kentico.delivery.core.interfaces.item.item.IContentItemSystemAttributes;
import com.kentico.delivery.core.models.elements.ContentElement;

import java.util.List;

/**
 * Base class for all types representing Kentico Cloud items
 */
public abstract class ContentItem implements IContentItem {

    private IContentItemSystemAttributes system;
    private List<ContentElement<?>> elements;

    @Override
    public IContentItemSystemAttributes getSystem() {
        return this.system;
    }

    @Override
    public void setContentItemSystemAttributes( IContentItemSystemAttributes system) {
        this.system = system;
    }

    @Override
    public List<ContentElement<?>> getElements() {
        return this.elements;
    }

    @Override
    public void setElements( List<ContentElement<?>> elements) {
        this.elements = elements;
    }

}