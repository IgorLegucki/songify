package com.songify.song.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

//Tutaj używa się Controller a nie RestController aby użyć MVC.
//MVC - Model View Controller - służy do wyszukiwania odpowiednich plików
//Do modelu dodaje się dane, widoki to pliki html, controller - ten plik

//Po ścieżce localhost:8080/ wyświetli się plik songs.html który znajduje sie w folderze resources/static/songs.html. Jest to statyczna strona bez danych
//W templates umieszczamy strone, która posiada jakieś dane, tutaj piosenki
//Aby wyświetlić jakieś dane, np piosenki ze springa używa się thymeleaf
@Controller
public class SongViewController {

    Map<Integer, String> databaseTest = new HashMap<>(Map.of(
            1,"Metallica song1",
            2, "Bullet for my vallentine song2",
            3, "Skillet song3",
            4, "Green Day song4"
    ));

    @GetMapping("/")
    public String home(){
        return "home.html";
    }

    @GetMapping("/view/songs")
    public String songs(Model model){
        model.addAttribute("songMap", databaseTest);
        return "songs"; //.html tak na prawdę nie jest potrzebny
    }
}
