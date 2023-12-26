package tr.edu.medipol.yazilimaraclari.webservis;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebService {

    public record Ogrenci(String adSoyad, String Numara){};

    private static final List<Ogrenci> OGRENCI_LISTESI = new ArrayList<>();

    static {
        OGRENCI_LISTESI.add(new Ogrenci("Hasan Kumasoglu", "HR220035"));
    }
    @GetMapping("/")
    public List<Ogrenci> listele() {

        return OGRENCI_LISTESI;

    }

}
