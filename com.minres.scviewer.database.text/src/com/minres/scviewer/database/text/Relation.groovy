package com.minres.scviewer.database.text

import com.minres.scviewer.database.ITrRelation
import com.minres.scviewer.database.ITransaction;
import com.minres.scviewer.database.RelationType;

class Relation implements ITrRelation {
	Transaction source
	
	Transaction target
	
	RelationType relationType
	
	
	public Relation(RelationType relationType, Transaction source, Transaction target) {
		this.source = source;
		this.target = target;
		this.relationType = relationType;
	}

	@Override
	public RelationType getRelationType() {
		return relationType;
	}

	@Override
	public ITransaction getSource() {
		return source;
	}

	@Override
	public ITransaction getTarget() {
		return target;
	}

}