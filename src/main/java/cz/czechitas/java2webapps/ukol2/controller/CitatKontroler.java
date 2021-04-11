package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class CitatKontroler {
    private final Random random = new Random();

    @GetMapping("/")        //
    public ModelAndView nastavCitat() {
        int nahodneCislo = random.nextInt(4);
        List<String> seznamTextu = Arrays.asList("Existují pouze dva dny v roce, kdy nemůžeme udělat vůbec nic. Jedním je včerejšek a druhým zítřek.",
                "Prvním krokem na cestě ke štěstí je učení se.","Studium bez touhy kazí paměť a neuchovává nic, co přijalo.",
                "Příroda je zdrojem všech skutečných znalostí. Má svou vlastní logiku, své vlastní zákony, nemá žádný účinek bez příčiny ani vynález bez nutnosti.");

        String nahodnyCitat = seznamTextu.get(nahodneCislo);
        int nahodneCislo2 = random.nextInt(8)+1;

        ModelAndView vysledek = new ModelAndView("citat");
        vysledek.addObject("text", nahodnyCitat);
        vysledek.addObject("obrazek", String.format("background-image: url(/images/image_%d.jpg)",nahodneCislo2));
        return vysledek;
    }
}
