package SyntaxNodes;


import GeneralNodes.*;

public class
AssignNode extends BinaryNode{
	public AssignNode(IDNode id, ExpressionNode expr){
		this.leftmostchild = id;
		this.rightChild = expr;
	}
}