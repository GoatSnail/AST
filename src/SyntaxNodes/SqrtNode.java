package SyntaxNodes;

import GeneralNodes.*;
import Visitors.Visitor;

public class SqrtNode extends BinaryNode{
	public SqrtNode(Node left, Node right){
		super(left, right);
	}

	@Override
	public Object Visit(Visitor v) {
		return null;
	}
}