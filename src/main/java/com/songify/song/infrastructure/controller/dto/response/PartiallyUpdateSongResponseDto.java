package com.songify.song.infrastructure.controller.dto.response;

import com.songify.song.domain.model.Song;

public record PartiallyUpdateSongResponseDto(Song updatedSong) {
}
