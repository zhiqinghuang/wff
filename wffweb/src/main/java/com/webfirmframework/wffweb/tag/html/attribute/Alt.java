/*
 * Copyright 2014-2016 Web Firm Framework
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
 * @author WFF
 */
package com.webfirmframework.wffweb.tag.html.attribute;

import com.webfirmframework.wffweb.tag.html.attribute.core.AbstractAttribute;
import com.webfirmframework.wffweb.tag.html.identifier.AreaAttributable;
import com.webfirmframework.wffweb.tag.html.identifier.InputAttributable;

/**
 *
 * <code>alt</code> attribute for the element.
 *
 * A text string alternative to display on browsers that do not display images.
 * The text should be phrased so that it presents the user with the same kind of
 * choice as the image would offer when displayed without the alternative text.
 * In HTML4, this attribute is required, but may be the empty string (""). In
 * HTML5, this attribute is required only if the href attribute is used.
 *
 * @author WFF
 * @since 1.0.0
 */
public class Alt extends AbstractAttribute
        implements AreaAttributable, InputAttributable {

    private static final long serialVersionUID = 1_0_0L;

    {
        super.setAttributeName(AttributeNameConstants.ALT);
        init();
    }

    /**
     *
     * @param value
     *            the coordinates value for the attribute
     * @since 1.0.0
     * @author WFF
     */
    public Alt(final String value) {
        setAttributeValue(value);
    }

    /**
     * sets the value for this attribute.
     *
     * Specifies an alternate text for the area. Required if the href attribute
     * is present
     *
     * @param value
     *            the value for the attribute.
     * @since 1.0.0
     * @author WFF
     */
    protected void setValue(final String value) {
        super.setAttributeValue(value);
    }

    /**
     * gets the value of this attribute
     *
     * @return the value of the attribute
     * @since 1.0.0
     * @author WFF
     */
    public String getValue() {
        return super.getAttributeValue();
    }

    /**
     * invokes only once per object
     *
     * @author WFF
     * @since 1.0.0
     */
    protected void init() {
        // to override and use this method
    }

}
