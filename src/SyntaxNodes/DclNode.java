package SyntaxNodes;

import GeneralNodes.BinaryNode;
import GeneralNodes.Node;
import Type.Type;
import Visitors.Visitor;

/**
 * Created by Gedesnegl on 29-03-2016.
 */
public class DclNode extends BinaryNode{
    public DclNode(Type.Type type, Node rigtHandSide){
        super(type, rigtHandSide);
    }

    @Override
    public Object Visit(Visitor v) {
        return null;
    }
}
