public class ConcreteGlyph {

    Glyph glyph;
    int x;
    int y;

    public ConcreteGlyph(Glyph glyph, int x, int y) {
        this.glyph = glyph;
        this.x = x;
        this.y = y;
    }

    public void render(){
        glyph.render(x, y);
    }


}
