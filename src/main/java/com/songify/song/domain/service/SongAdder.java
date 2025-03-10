package com.songify.song.domain.service;

import com.songify.song.domain.model.Song;
import com.songify.song.domain.repository.SongRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class SongAdder {

    private final SongRepository songRepository;

    public SongAdder(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public Song addSong(Song song) {
        // 2. wyświetlanie informacji
        // Warstwa logiki biznesowej/serwisów domenowych
        log.info("Adding new song: " + song);
        songRepository.saveToDatabase(song);
        return song;
    }

}
