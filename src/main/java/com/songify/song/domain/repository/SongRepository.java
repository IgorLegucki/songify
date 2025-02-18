package com.songify.song.domain.repository;

import com.songify.song.domain.model.Song;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SongRepository {

    Map<Integer, Song> database = new HashMap<>(Map.of(
            1, new Song("Metallica song1", "Metallica"),
            2, new Song("Bullet for my vallentine song2", "Bullet for my vallentine"),
            3, new Song("Skillet song3", "Skillet"),
            4, new Song("Green Day song4", "Green Day")
    ));

    public Song saveToDatabase(Song song) {
        // 3. Zapisanie obiektu do bazy danych
        // Warstwa bazodanowa
        database.put(database.size() + 1, song);
        return song;
    }

    public Map<Integer, Song> findAll() {
        return database;
    }
}
