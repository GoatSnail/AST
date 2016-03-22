package SyntaxNodes;

import GeneralNodes.*;
import Visitors.Visitor;

/**
 * Created by Nete on 09-03-2016.
 */
public class PlusNode extends BinaryNode {
    public PlusNode(Node left, Node right)
    {
        super(left, right);
    }

    @Override
    public Object Visit(Visitor v) {
        return v.Visit(this);
    }
}
