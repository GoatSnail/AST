package SyntaxNodes.TypeNodes;

import GeneralNodes.LeafNode;
import GeneralNodes.Node;
import Visitors.Visitor;

/**
 * Created by Gedesnegl on 29-03-2016.
 */
public class TypeNode extends LeafNode {
    public TypeNode() {
        super();
    }

    @Override
    public Object Visit(Visitor v) {
        return null;
    }
}
