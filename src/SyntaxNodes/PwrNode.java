package SyntaxNodes;

import GeneralNodes.*;
import Visitors.Visitor;

public class PwrNode extends BinaryNode{
	public PwrNode(Node left, Node right){
		super(left, right);
	}

	@Override
	public Object Visit(Visitor v) {
		return null;
	}
}