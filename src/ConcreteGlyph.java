/**
 * The {@code ConcreteGlyph} class represents a specific instance of a {@link Glyph} at a given position.
 * <p>Provides methods to render the glyph and retrieve its symbol and position.
 * @author Kyrylo Kusovskyi
 */
public class ConcreteGlyph {

    /** The {@link Glyph} instance represented by this ConcreteGlyph. */
    private Glyph glyph;

    /** The position at which this glyph is rendered. */
    private int position;

    /**
     * Constructs a {@code ConcreteGlyph} with the specified glyph and position.
     * @param glyph the {@code Glyph} instance to be rendered
     * @param position the position where the glyph will be rendered
     */
    public ConcreteGlyph(Glyph glyph, int position) {
        this.glyph = glyph;
        this.position = position;
    }

    /**
     * Renders the glyph at its position.
     */
    public void render() {
        glyph.render(position);
    }

    /**
     * Returns the symbol of the glyph.
     * @return the character symbol of the glyph
     */
    public char getSymbol() {
        return glyph.getSymbol();
    }

    /**
     * Returns the position of this glyph.
     * @return the position where the glyph is rendered
     */
    public int getPosition() {
        return position;
    }
}
