package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Song;


public interface SongRepository extends JpaRepository<Song, Integer> {

 public	Song findbyName(String name);

}






/*   links we have to paste in link bar in the addSong web page along with song name singer name song genre etc,
little umbrellas
<iframe src="https://drive.google.com/file/d/1aMGO6lGAsNihV5vVtj4OxWw9FyKiDG89/preview" width="640" height="480" allow="autoplay"></iframe>
*/
/*
Girl on top
<iframe src="https://drive.google.com/file/d/1o7JYI7Cmc1Y7nImCwq4i4lXFySmwH9e4/preview" width="640" height="480" allow="autoplay"></iframe>
*/


