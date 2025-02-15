package com.songify;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Dto - data transfer object

@RestController
public class SongsController {

    Map<Integer, String> database = new HashMap<>();

    @GetMapping("/songs")
    public ResponseEntity<SongResponseDto> getAllSongs() {
        database.put(1, "Metallica song1");
        database.put(2, "Bullet for my vallentine song2");
        SongResponseDto response = new SongResponseDto(database);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/songs/{id}")
    public ResponseEntity<SingleSongResponseDto> getAllSongs(@PathVariable Integer id) {
        String song = database.get(id);
        if(song == null) {
            return ResponseEntity.notFound().build();
        }
        SingleSongResponseDto response = new SingleSongResponseDto(song);
        return ResponseEntity.ok(response);
    }
}
