package SyntaxNodes;

import GeneralNodes.*;
import Visitors.Visitor;

public class AssignNode extends BinaryNode{
	public AssignNode(IDNode id, Node expr){
		super(id,expr);
	}

	@Override
	public Object Visit(Visitor v) {
		return null;
	}
}