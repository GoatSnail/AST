package SyntaxNodes;

import GeneralNodes.*;
import Visitors.Visitor;

public class ValueNode extends UnaryNode{
	private String value;
	public ValueNode(String val){
		this.value = val;
	}

	@Override
	public Object Visit(Visitor v) {
		return null;
	}
}