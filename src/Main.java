public class Main {

    public static void main(String[] args) {

        GlyphFactory factory = new GlyphFactory();
        TextLine line = new TextLine();


        line.add('H', 0, 0);
        line.add('e', 10, 0);
        line.add('l', 20, 0);
        line.add('l', 30, 0);
        line.add('o', 40, 0);

        line.add(' ', 50, 0);

        line.add('W', 60, 0);
        line.add('o', 70, 0);
        line.add('r', 80, 0);
        line.add('l', 90, 0);
        line.add('d', 100, 0);

        line.print();
    }
}
