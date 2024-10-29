/**
 * The {@code LatinGlyph} class represents a Latin character glyph
 * that can be rendered at a specific position and has a defined symbol.
 * <p>Implements the {@link Glyph} interface to render Latin symbols
 * in text-based applications.
 * @author Kyrylo Kusovskyi
 */
public class LatinGlyph implements Glyph{

    /** The character symbol represented by this glyph. */
    char symbol;

    /**
     * Constructs a {@code LatinGlyph} with the specified symbol.
     * @param symbol the Latin character symbol for this glyph.
     */
    public LatinGlyph(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Renders the glyph at the specified position.
     * @param position the position to render the glyph.
     */
    @Override
    public void render(int position) {
        System.out.println("Rendering glyph " + symbol + " at position " + position + ";");
    }
    /**
     * Returns the character symbol of this glyph.
     * @return the character symbol.
     */
    @Override
    public char getSymbol() {
        return symbol;
    }
}
