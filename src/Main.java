
public class Main {
    public static void main(String[] args) {

        //Istanziamento del Menù
        Menu menu = new Menu();
        //aggiunta dei secondi
        menu.addSecondi(new Secondi("Bistecca di Manzo alla Griglia",
                """
                   Una succulenta bistecca di manzo, cotta alla perfezione sulla griglia.
                   La carne è tenera, saporita e leggermente croccante all’esterno,
                   mantenendo tutta la sua morbidezza all’interno.""",
                18.0,
                new String[] {"preferibilmente taglio come fiorentina, controfiletto o entrecôte)",
                        "olio extravergine di oliva"," sale", "pepe nero", "rosmarino (opzionale)"},
                "media"));
        menu.addSecondi(new Secondi ("Bistecca di Vitello alla Piastra",
                        """
                            Una bistecca di vitello tenera e delicata, cotta sulla piastra per esaltare il sapore naturale della carne.
                            Spesso servita con un filo d'olio d'oliva e una spolverata di sale e pepe""",
                        15.50,
                        new String[] {
                                "Bistecca di vitello", "olio extravergine di oliva","sale","pepe nero",
                                "rosmarino (opzionale)","limone (opzionale)"},
                        "media"));

        menu.addSecondi(new Secondi ("Arrosticini di Pecora",
                """
                    Piccole spiedini di carne di pecora, tipici della cucina abruzzese, cotti sulla brace.
                   La carne è saporita e leggermente grigliata all’esterno, mantenendo la sua morbidezza all’interno.""",
                10.00,
                new String[] {"Carne di pecora tagliata a cubetti", "sale", "pepe", "olio d’oliva", "rosmarino (opzionale)"},
                "media"));
        menu.addSecondi(new Secondi ("Arrosticini di Fegato",
                """
                    Spiedini di fegato di vitello o agnello, cucinati sulla griglia. Un piatto tradizionale e rustico,
                    dal sapore intenso e caratteristico, perfetto per chi ama i piatti di frattaglie..""",
                12.0,
                new String []{"Fegato di agnello o vitello", "sale", "pepe", "rosmarino", "olio d’oliva"},
                "media"));
        menu.addSecondi(new Secondi ("Arrosto di Manzo con Patate",
                """
                Un arrosto di manzo cotto lentamente in forno con patate, che assorbono i succhi della carne,
                diventando croccanti e saporite. Un piatto completo e rustico, ideale per una cena sostanziosa.""",
                18.0,
                new String[] {"Carne di manzo (spalla o punta di petto)", "patate", "olio extravergine d’oliva",
                        "sale", "pepe", "rosmarino", "aglio (opzionale)"},
                "media"));
        menu.addSecondi(new Secondi ("Salcicce alla Griglia",
                """
                        Salcicce fresche di maiale, manzo o pollo, cotte sulla griglia o in padella fino a dorarsi.
                        Un piatto semplice e gustoso, molto apprezzato nelle grigliate all'aperto.""",
                8.0,
                new String[] {"Carne di maiale o pollo", "pepe nero", "sale", "aglio", "vino bianco (opzionale)",
                        "erbe aromatiche (come rosmarino o timo)"},
                "media"));

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

        //Stampa del Menù
        System.out.println(menu);
    }
}