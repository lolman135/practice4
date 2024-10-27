public class LatinGlyph implements Glyph{

    char symbol;

    public LatinGlyph(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void render(int x, int y) {
        System.out.println("Rendering glyph " + symbol + " at position (" + x + ";" + y + ")");
    }

}
