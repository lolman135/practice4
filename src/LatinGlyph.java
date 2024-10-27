public class LatinGlyph implements Glyph{

    char symbol;

    public LatinGlyph(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void render(int position) {
        System.out.println("Rendering glyph " + symbol + " at position " + position + ";");
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
