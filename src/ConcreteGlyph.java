public class ConcreteGlyph {

    Glyph glyph;
    int position;

    public ConcreteGlyph(Glyph glyph, int position) {
        this.glyph = glyph;
        this.position = position;
    }

    public void render(){
        glyph.render(position);
    }

    public char getSymbol(){
        return glyph.getSymbol();
    }

    public int getPosition() {
        return position;
    }
}
