package org.objectionary.aoi.data

import org.w3c.dom.Node

/**
 * Storage for free attributes
 */
object FreeAttributesHolder {
    /**
     * Set of free attributes to be analyzed
     */
    val storage: MutableSet<FreeAttribute> = mutableSetOf()
}

/**
 * Representation of a free attribute
 *
 * @property name attribute name
 * @property holderObject parent object body
 */
data class FreeAttribute(val name: String, val holderObject: Node) {
    /**
     * Set of the attributes of this free attribute that were applied in the program
     */
    val appliedAttributes: MutableSet<Attribute> = mutableSetOf()
}

/**
 * Attribute representation.
 *
 * @property name attribute name
 * @todo #11:30min differentiate attributes by the number of parameters passed
 *  & maybe rename these classes
 */
data class Attribute(val name: String) {
    /**
     * Free attributes which this attribute uses
     */
    val parameters: MutableSet<String> = mutableSetOf()
}