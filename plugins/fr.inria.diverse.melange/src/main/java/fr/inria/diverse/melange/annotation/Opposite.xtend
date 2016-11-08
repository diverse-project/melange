package fr.inria.diverse.melange.annotation

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention
import java.lang.annotation.Target

/**
 * Opposite annotation declaration
 */
@Target(ElementType::FIELD, ElementType::METHOD)
@Retention(RetentionPolicy.SOURCE)
public annotation Opposite
{
	String value /* Name of the opposite reference */
}