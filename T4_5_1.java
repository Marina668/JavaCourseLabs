package mypack_t_5_1;

public class T4_5_1 {
    public static void main (String[] args) {
        String[] txt = {"""
Gigi Hadid is an American model, television personality, founder and creator director of clothing line "Guest In Residence".\s
In November 2014, she made her debut in the Top 50 Models ranking at Models.com.\s
In 2016, she was named International Model of the Year by the British Fashion Council.\s
Over the span of four years she has made thirty-five appearances on international Vogue magazine covers."""};
        Text text = new Text(txt);
        text.setHeader(new Sentence("Who is Gigi Hadid???"));
        text.printHeader();
        System.out.println(text);
        String[] new_str = {"Bella Hadid"};
        System.out.println();
        text.completeText(txt, new_str);
        System.out.println(text);
    }
}
