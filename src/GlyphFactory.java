import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {

    private static Map<Character, Glyph> glyphMap = new HashMap<>();

    public static Glyph getGlyph(char symbol){
        Glyph glyph = glyphMap.get(symbol);

        if (glyph == null){
            glyph = new LatinGlyph(symbol);
            glyphMap.put(symbol, glyph);
        }

        return glyph;
    }
}
