package fr.inria.diverse.melange.puzzle

import puzzle.Expression

class CompositionTreeLeaf extends CompositionTreeNode {
	
	public Expression language
	
	new(Expression language){
		this.language = language
	}
}