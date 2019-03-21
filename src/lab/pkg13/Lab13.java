package lab.pkg13;

public class Lab13{

    private static String Text =
            "ЗТЕФТИ ЧЦФТ!\n" +
            "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
            "БЪВАШЬЪ УГЦ ЯЦ ЦЙН, УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
            "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.\n";

    public static void main(String args[]) {
        Decoder decoder = new Decoder();
        
        System.out.print("    Исходный вариант текста:\n" + Text);
        String[] text = Text.split("\n");
        
        System.out.println("\nРасшифровка первой строки:\n" + "    " + decoder.decode(-4, text[0]));
        System.out.println("\nРасшифровка второй строки:\n" + "    " + decoder.decode(8, text[1]));
        System.out.println("\nРасшифровка третьей строки:");
        
        for (int i = 1; i < 32; i++) {
            System.out.println("    " + decoder.decode(i, text[2]));
        }
        
        String[] words = text[3].split(" ");
        
        System.out.println("\nРасшифровка четвертой строки:");
        System.out.println("(Далее будут все варианты возможных расшифровок кждого слова)\n");
        
        for (int j = 0; j<words.length; j++) {
            System.out.println((j+1) + " слово:");
            
            for (int i = 1; i <= 33; i++) {
                System.out.print("    " + decoder.decode(i, words[j]) + "\n");
            }
            
            System.out.println();
        }
    }
}

