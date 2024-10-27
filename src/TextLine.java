import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextLine {

    private List<ConcreteGlyph> line = new ArrayList<>();
    private int max = -1;

    public void add(char symbol, int position){
        if (position < 0){
            throw new IllegalArgumentException("Position can't be negative!");
        }

        Glyph glyph = GlyphFactory.getGlyph(symbol);
        ConcreteGlyph concreteGlyph = new ConcreteGlyph(glyph, position);
        line.add(concreteGlyph);

        if (position > max){
            max = position;
        }
    }

    public void print(){;
        char[] renderedSymbols = new char[max + 1];
        Arrays.fill(renderedSymbols, ' ');

        for (ConcreteGlyph concreteGlyph : line) {
            concreteGlyph.render();
            renderedSymbols[concreteGlyph.getPosition()] = concreteGlyph.getSymbol();
        }
        System.out.println(String.valueOf(renderedSymbols));
    }
}

