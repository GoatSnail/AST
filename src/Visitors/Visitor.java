package Visitors;

import GeneralNodes.Node;
import SyntaxNodes.PlusNode;

/**
 * Created by Nete on 09-03-2016.
 */
public abstract class Visitor {
    public abstract Object Visit(PlusNode n);
    public abstract void Visit(Node n);
}
