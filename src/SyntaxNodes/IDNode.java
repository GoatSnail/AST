package SyntaxNodes;

import GeneralNodes.*;

public class IDNode extends UnaryNode{
    private String ID;
    public IDNode(String identifier){
        this.ID = identifier;
    }
}