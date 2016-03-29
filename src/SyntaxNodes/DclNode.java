package SyntaxNodes;

import GeneralNodes.BinaryNode;
import GeneralNodes.Node;
import SyntaxNodes.TypeNodes.TypeNode;
import Visitors.Visitor;

/**
 * Created by Gedesnegl on 29-03-2016.
 */
public class DclNode extends BinaryNode{
    public DclNode(TypeNode type, Node rigtHandSide){
        super(type, rigtHandSide);
    }

    @Override
    public Object Visit(Visitor v) {
        return null;
    }
}
