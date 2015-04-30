package fr.inria.diverse.melange.resource

class MelangeResourceException extends RuntimeException
{
	new(String msg) {
		super(msg)
	}

	new(String msg, Exception cause) {
		super(msg, cause)
	}
}
