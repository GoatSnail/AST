package SyntaxNodes;

import GeneralNodes.*;
import Visitors.Visitor;

import java.util.ArrayList;

/**
 * Created by Gedesnegl on 31-03-2016.
 */
public class FuncNode extends NaryNode{
    public FuncNode(ArrayList<Node> stmts){
        super(stmts);
    }
    @Override
    public Object Visit(Visitor v) {
        return null;
    }
}
