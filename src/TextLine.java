import java.util.ArrayList;
import java.util.List;

public class TextLine {

    private List<ConcreteGlyph> line = new ArrayList<>();

    public void add(char symbol, int x, int y){
        Glyph glyph = GlyphFactory.getGlyph(symbol);
        ConcreteGlyph concreteGlyph = new ConcreteGlyph(glyph, x, y);
        line.add(concreteGlyph);
    }

    public void print(){
        line.forEach(ConcreteGlyph::render);
    }
}

