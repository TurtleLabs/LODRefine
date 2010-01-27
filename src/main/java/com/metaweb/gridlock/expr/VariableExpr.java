package com.metaweb.gridlock.expr;

import java.util.Properties;

public class VariableExpr implements Evaluable {
	final protected String _name;
	
	public VariableExpr(String name) {
		_name = name;
	}
	
	@Override
	public Object evaluate(Properties bindings) {
		return bindings.get(_name);
	}

}