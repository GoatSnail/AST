package SyntaxNodes;

import GeneralNodes.*;
import Visitors.Visitor;

public class ValueNode extends LeafNode{
	private String _value;
	public ValueNode(String val){
		this._value = val;
	}

	@Override
	public Object Visit(Visitor v) {
		return null;
	}
}