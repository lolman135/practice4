public class Main {

    public static void main(String[] args) {

        GlyphFactory factory = new GlyphFactory();
        TextLine line = new TextLine();

        line.add('H', 0);
        line.add('e', 1);
        line.add('l', 2);
        line.add('l', 3);
        line.add('o', 4);

        line.add(' ', 5);

        line.add('W', 6);
        line.add('o', 7);
        line.add('r', 8);
        line.add('l', 9);
        line.add('d', 10);

        line.print();
    }
}
