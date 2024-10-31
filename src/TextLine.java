import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The {@code TextLine} class represents a line of text composed of {@link ConcreteGlyph} objects,
 * where each glyph has a specific position. Provides methods to add glyphs to the line and print
 * the line, rendering glyphs at their designated positions.
 * @author Kyrylo Kusovskyi
 */
public class TextLine {

    /** List of glyphs in this line, each with a specific position. */
    private final List<ConcreteGlyph> line = new ArrayList<>();

    /** The maximum position of any glyph in the line, used to determine the line length. */
    private int max = -1;

    /**
     * Adds a new glyph to the line at the specified position.
     * @param symbol the character symbol for the glyph
     * @param position the position where the glyph will be rendered
     * @throws IllegalArgumentException if the position is negative
     */
    public void add(char symbol, int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position can't be negative!");
        }

        Glyph glyph = GlyphFactory.getGlyph(symbol);
        ConcreteGlyph concreteGlyph = new ConcreteGlyph(glyph, position);
        line.add(concreteGlyph);

        if (position > max){
            max = position;
        }
    }

    /**
     * Prints the line by rendering each glyph at its specified position.
     * Unassigned positions are filled with spaces.
     */
    public void print() {
        char[] renderedSymbols = new char[max + 1];
        Arrays.fill(renderedSymbols, ' ');

        for (ConcreteGlyph concreteGlyph : line) {
            concreteGlyph.render();
            renderedSymbols[concreteGlyph.getPosition()] = concreteGlyph.getSymbol();
        }
        System.out.println(String.valueOf(renderedSymbols));
    }
}

