package GeneralNodes;

import Visitors.Visitor;

/**
 * Created by Gedesnegl on 22-03-2016.
 */

public class LeafNode extends Node {
    public LeafNode(){
        this._leftmostChild = null;
    }

    @Override
    public Object Visit(Visitor v) {
        return null;
    }
}
