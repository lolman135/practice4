/**
 * The {@code Main} class demonstrates the usage of {@link TextLine} by creating a line of text,
 * adding glyphs at specific positions, and printing the result.
 */
public class Main {

    /**
     * The entry point of the application. Creates a {@link TextLine}.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        TextLine line = new TextLine();
        try{
            line.add('H', 0);
            line.add('e', 1);
            line.add('l', 2);
            line.add('l', 3);
            line.add('o', 4);

            line.add('W', 6);
            line.add('o', 7);
            line.add('r', 8);
            line.add('l', 9);
            line.add('d', 10);

            line.print();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
