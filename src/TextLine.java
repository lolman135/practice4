import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextLine {

    private List<ConcreteGlyph> line = new ArrayList<>();

    public void add(char symbol, int position){
        Glyph glyph = GlyphFactory.getGlyph(symbol);
        ConcreteGlyph concreteGlyph = new ConcreteGlyph(glyph, position);
        line.add(concreteGlyph);
    }

    //TODO size of char array must depends of maximal value of "position"
    public void print(){
        char[] renderedSymbols = new char[line.size()];
        line.forEach(concreteGlyph -> {
            concreteGlyph.render();
            renderedSymbols[concreteGlyph.getPosition()] = concreteGlyph.getSymbol();
        });

        System.out.println(String.valueOf(renderedSymbols));
    }
}

