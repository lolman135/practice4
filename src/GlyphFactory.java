import java.util.HashMap;
import java.util.Map;

/**
 * The {@code GlyphFactory} class provides a factory method to retrieve shared {@link Glyph} instances.
 * <p>Manages a cache of glyphs to minimize memory usage by reusing existing {@code Glyph} objects for
 * identical symbols.
 */
public class GlyphFactory {

    /** A map storing glyphs by their symbol for reuse. */
    private static Map<Character, Glyph> glyphMap = new HashMap<>();

    /**
     * Returns a {@code Glyph} for the specified symbol, creating and caching a new {@code LatinGlyph}
     * if one does not already exist.
     * @param symbol the character symbol for the glyph
     * @return a shared {@code Glyph} instance representing the symbol
     */
    public static Glyph getGlyph(char symbol){

        return glyphMap.computeIfAbsent(symbol, LatinGlyph::new);
    }
}
