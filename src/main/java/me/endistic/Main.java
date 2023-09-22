package me.endistic;

import me.endistic.argparser.elements.AlternateSetElement;
import me.endistic.argparser.elements.PatternSet;
import me.endistic.argparser.elements.SingletonNode;
import me.endistic.argparser.types.NumberArgument;
import me.endistic.argparser.types.StringArgument;
import me.endistic.argparser.types.StyledTextArgument;
import me.endistic.dftypes.DecimalNumber;
import me.endistic.icons.ActionItem;

public class Main {
    public static void main(String[] args) {

    }

    void ok() {
        var x = patternSet();
    }

    protected PatternSet patternSet() {
        return new PatternSet()
                .addElement(new SingletonNode("uuid", new StringArgument()))
                .addElement(new SingletonNode("name", new StyledTextArgument())
                        .setOptional(null));
    }
    
    protected ActionItem iconItem() {
        return new ActionItem()
    }
}