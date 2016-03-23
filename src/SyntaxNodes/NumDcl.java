package SyntaxNodes;

import GeneralNodes.LeafNode;
import Visitors.Visitor;

/**
 * Created by Gedesnegl on 22-03-2016.
 */
public class NumDcl extends LeafNode{
    String _id;
    public NumDcl(String val){
        this._id = val;
    }

    @Override
    public Object Visit(Visitor v) {
        return null;
    }
}
