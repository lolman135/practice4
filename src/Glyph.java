/**
 * The {@code Glyph} interface represents a graphical symbol that can be rendered
 * at a specific position and has a character symbol representation.
 * @author Kyrylo Kusovskyi
 */
public interface Glyph {

    /**
     * Renders the glyph at the specified position.
     * @param position the position to render the glyph.
     */
    void render(int position);

    /**
     * Returns the character symbol of the glyph.
     * @return the character symbol.
     */
    char getSymbol();
}
