
public class Main {
    public static void main(String[] args) {

        //Istanziamento del Menù
        Menu menu = new Menu();

        //Aggiunta di dessert nel Menù
        menu.addDessert(new Dessert("Tiramisù",
                "Un classico dessert italiano, cremoso e ricco di sapori. " +
                        "Composto da strati di savoiardi imbevuti nel caffè e ricoperti con una soffice crema al mascarpone, " +
                        "il tutto spolverato con cacao amaro. È perfetto per concludere un pasto con un dolce delizioso " +
                        "ma non troppo pesante.",
                6.50,
                new String[] {
                        "Savoiardi",
                        "Mascarpone",
                        "Uova",
                        "Zucchero",
                        "Caffé espresso",
                        "Cacao amaro",
                        "Liquore Marsala"
                }));
        menu.addDessert(new Dessert("Soufflé al cioccolato",
                "Un dessert caldo e voluttuoso, il soufflé al cioccolato è una delle preparazioni " +
                        "più amate dai golosi. Il suo cuore morbido e fondente si scioglie in bocca, " +
                        "regalando un’esperienza intensa e soddisfacente. " +
                        "Viene servito appena uscito dal forno, per mantenere la sua consistenza soffice.",
                8,
                new String[] {
                        "Cioccolato fondente",
                        "Burro",
                        "Uova",
                        "Zucchero",
                        "Farina",
                        "Panna",
                        "Vaniglia"
                }));

        menu.addDessert(new Dessert("Crème Brulée",
                " Un dolce francese sofisticato e irresistibile, con una crema vellutata " +
                        "alla vaniglia e una crosta di zucchero caramellato croccante. La crema viene cotta " +
                        "delicatamente in forno e poi caramellata sulla superficie con un cannello, " +
                        "per ottenere il contrasto tra il dolce e la croccantezza del caramello.",
                7.5,
                new String[] {
                        "Panna fresca",
                        "Uova",
                        "Zucchero",
                        "Vaniglia"
                }));

        menu.addAntipasti(new Antipasti(
                "Bruschetta al pomodoro",
                "Pane tostato condito con pomodori freschi, olio d'oliva e basilico.",
                5.50,
                new String[]{"Pane", "Pomodori", "Olio d'oliva", "Basilico", "Aglio"}
        ));

        //Stampa del Menù
        System.out.println(menu);
    }
}