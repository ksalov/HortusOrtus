package hr.unipu.android.hortusortus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kristina on 28.6.2017..
 */

public class Podaci {
    private static List<Biljka> podaci = new ArrayList<>();
    private static List<Biljka> podaci2 = new ArrayList<>();

    public static List<Biljka> dajPodatke() {
        return podaci; //povrce
    }

    public static List<Biljka> dajPodatke2() {
        return podaci2; //zacinsko bilje
    }
    public static List<Biljka> dajBiljkeKojeSeSiju(int mjesec) {
        List<Biljka> biljke = new ArrayList<>();
        //za svaku biljku...
        for (Biljka biljka:podaci) {
            //...i svaki njen mogući mjesec sadnje...
            for(int mjesecSadnje:biljka.getMjeseciSadnjeArray()) {
                //...usporedi odgovara li traženom mjesecu...
                if(mjesecSadnje==mjesec) {
                    //...i ako da, dodaj tu biljku na popis i prekini gledati mjesece te biljke
                    biljke.add(biljka);
                    break;
                }
            }
        }

        return biljke;
    }
    public static List<Biljka> dajBiljkeKojeSeBeru(int mjesec) {
        List<Biljka> biljke = new ArrayList<>();
        //za svaku biljku...
        for (Biljka biljka:podaci) {
            //...i svaki njen mogući mjesec berbe...
            for(int mjesecBerbe:biljka.getMjeseciBerbeArray()) {
                //...usporedi odgovara li traženom mjesecu...
                if(mjesecBerbe==mjesec) {
                    //...i ako da, dodaj tu biljku na popis i prekini gledati mjesece te biljke
                    biljke.add(biljka);
                    break;
                }
            }
        }

        return biljke;
    }



    static {
        // naziv, opis, mjeseci sadnje, mjeseci berbe, slika
        podaci.add(new Biljka("Brokula", "Brokula (lat. brassica oleracea var. italica) je povrće iz porodice kupusnjača. Bogata vitaminom C i djeluje kao antioksidans, vitaminom A i B6.", new int[]{7}, new int[]{10,11}, "brokula"));
        podaci.add(new Biljka("Cvjetača", "Cvjetača ili karfiol (lat. Brassica oleracea var. botrytis) bogata vitaminom C, K i dobar izvor folne kiseline.", new int[]{3,4}, new int[]{8}, "cvjetaca"));
        podaci.add(new Biljka("Kelj", "Kelj (lat. Brassica oleracea var. sabauda) bogat vitaminom C, E, A i K, ima antioksidansno djelovanje, bogat kalcijem pa čuva kosti i štiti od infarkta.", new int[]{2,3,7,8}, new int[] {1,2,3,4,5,10,11,12}, "kelj"));
        podaci.add(new Biljka("Luk","Luk (lat. Allium cepa) dobar je izvor dijetalnih vlakana, vitamina B6, folata i mangana, a uz to je i vrlo dobar izvor vitamina C. Sadrži vrlo malo zasićenih masti, kolesterola i natrija. Upotrebljava u kulinarstvu i medicini.", new int[]{3}, new int[]{8},"luk"));
        podaci.add(new Biljka("Grašak","Grašak (lat. Pisum sativum) bogat je izvor ugljikohidrata i vlakana oblika galaktana, glukuronske kiseline, fruktoze, glukoze i drugih spojeva. Uz proteine i ugljikohidrate, valja spomenuti masti i lecitin, tvari važne za živčani sustav.", new int[]{4}, new int[]{7,8,9,10},"grasak"));
        podaci.add(new Biljka("Patlidžan","Patlidžan (lat. Solanum melongena) nije bogat vitaminima i mineralima, ali je zato bogat celulozom, te potiče rad probavnih organa. Također sadrži znatnu količinu pektina, koji snizuje kolesterol.", new int[]{5,6}, new int[]{6,7,8,9,10},"patlidzan"));
        podaci.add(new Biljka("Mrkva","Mrkva (Daucus carota) je veliki izvor karotenoida, koji pomažu u zaštiti od bolesti krvožilnog sustava, regulaciji šećera u krvi i poboljšanju vida. Samo jedno serviranje mrkve bogate karotenoidima za 60% smanjuje rizik od srčanog udara.",new int[]{3,4}, new int[]{6,7,8,9}, "mrkva"));
        podaci.add(new Biljka("Krastavac","Krastavac (lat. Cucumis sativus) zbog puno vode je odlični diuretik, učinkovito uklanja nakupljene toksine, potiče rad bubrega i žuči. U kombinaciji s dijetalnim vlaknima koje i sâm sadrži potiče rad debelog crijeva i štiti organizam od kancerogenih tvari.\n" +
                "Kalij kojeg ima najviše od svih minerala potiče fleksibilnost mišića i pomaže u reguliranju krvnog tlaka.\n" +
                "\n", new int[] {4,5}, new int[]{6,7,8,9}, "krastavac"));
        podaci.add(new Biljka("Paprika","Paprika sadrži četiri puta više vitamina C od naranče, a njegova količina ovisi o sorti paprike, podneblju u kojem je uzgojena i nekim drugim čimbenicima. Crvena paprika poznata je po sadržaju vitamina C i beta-karotena, odličan je izvor vitamina, dobar je izvor vitamina B6 i vitamina A. ", new int[]{2,3,4}, new int[]{7,8,9,10},"paprika"));
        podaci.add(new Biljka("Rajčica","Rajčica (Solanum lycopersicum L.) jedan od najbogatijih prirodnih izvora vitamina C. Sadrži i znatne količine vitamina B te vitamin E i K. Bogata je kalijem, natrijem, magnezijem, kalcijem i željezom te elementima u tragovima. Rajčica je najbogatija bakrom, a željeza sadrži više nego pileće meso, riba i mlijeko.",new int[]{3,4}, new int[]{7,8,9,10},"rajcica"));



        podaci2.add(new Biljka("Origano", "Origano (lat. Origanum vulgarum). Studije su pokazale kako ova biljka ima niz antibakterijskih, fungicidnih, antiviralnih i antioksidantnih svojstava, pa se, osim u kuhinji, origano koristi i u medicinske svrhe. Origano je djelotvoran kod akni, artritisa, kancerogenih oboljenja, upalnih stanja i mutacija stanica.", new int[]{4}, new int[]{1,2,3,4,5,6,7,8,9,10,11,12}, "origano"));
        podaci2.add(new Biljka("Peršin", "Peršin (lat. Petroselinum crispum) je vrlo zanimljiva ljekovita biljka, ukusna i prihvatljiva za želudac.\n" +
                "U ljekovite svrhe može se koristiti svježa biljka kao dopuna jelu, čaj od lista ili korijena peršina, juha s malo korijena peršina može djelovati vrlo okrepljujuće, sok od peršina ili ulje najčešće za vanjsku upotrebu.", new int[]{3,4}, new int[]{1,2,3,4,5,6,7,8,9,10,11,12}, "persin"));
        podaci2.add(new Biljka("Celer", "Celer ( ) sadrži komponentu kumarin, koja sprječava štetno djelovanje slobodnih radikala, a uz to potiče aktivnost bijelih krvnih stanica, obrambenih mehanizama. Izvrstan je izvor vitamina K, koji povoljno utječe na grušanje krvi, štiti od osteoporoze, sprječava štetno oksidativno djelovanje na stanicu. Cjelokupni B-kompleks iz celera potiče izmjenu ugljikohidrata u tijelu, jača živce i mozak, pomaže rad crijeva, čini i održava zdravima kožu, kosu, oči i jetru.", new int[]{3,4}, new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, "celer"));
        podaci2.add(new Biljka("Bosiljak","Bosiljak (lat. Ocimum basilicum) jelu daje karakterističan okus, odlična je zamjena za sol pa način prehrane u kojemu umjesto soli koristimo začinsko bilje posredno djeluje i na snižavanje visokog tlaka i uklanjanje celulita. Osim što poboljšava okus i obogaćuje miris mnogih jela, bosiljak svojim sastojcima povoljno utječe na zdravlje organizma.", new int[]{3,4}, new int[]{5,6,7,8,9,10},"bosiljak"));
        podaci2.add(new Biljka("Vlasac","Vlasac (lat. Allium schoenoprasum) bogat je vitaminima A, B1, B2 i C. U njemu također možemo pronaći eterično ulje i minerale poput kalcija, kalija, magnezija, bakra, željeza i fosfora.", new int[]{3,4}, new int[]{5,6,7,8,9,10},"vlasac"));

    }
}
