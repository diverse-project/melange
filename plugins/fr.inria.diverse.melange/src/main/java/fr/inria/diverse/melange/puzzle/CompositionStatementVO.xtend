package fr.inria.diverse.melange.puzzle

import puzzle.Statement

class CompositionStatementVO {
	
	public boolean considered
	public Statement statement
	
	new(Statement statement){
		this.statement = statement
		this.considered = false
	}
}