package fr.inria.diverse.melange.annotation

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Set Unique = true on an EReference
 */
@Target(ElementType::FIELD, ElementType::METHOD)
@Retention(RetentionPolicy.SOURCE)
annotation Unique {}
