package com.yurachi.anime_list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/anime")
    public String anime(Model model) {
        List<Map<String, Object>> animeList = List.of(
            Map.of("title", "Saki", "genres", List.of("Action", "Drama", "Fantasy")),
            Map.of("title", "Love live", "genres", List.of("Action", "Supernatural", "Historical")),
            Map.of("title", "Bang Dream", "genres", List.of("Romance", "Drama", "Supernatural")),
            Map.of("title", "Spirited Away", "genres", List.of("Adventure", "Family", "Fantasy")),
            // Add 26 more anime to make total 30, example below
            Map.of("title", "Naruto", "genres", List.of("Action", "Adventure", "Martial Arts")),
            Map.of("title", "One Piece", "genres", List.of("Adventure", "Comedy", "Fantasy")),
            Map.of("title", "Fullmetal Alchemist", "genres", List.of("Action", "Adventure", "Drama")),
            Map.of("title", "Death Note", "genres", List.of("Thriller", "Supernatural", "Mystery")),
            Map.of("title", "My Hero Academia", "genres", List.of("Action", "Superhero", "Comedy")),
            Map.of("title", "Tokyo Ghoul", "genres", List.of("Action", "Horror", "Dark Fantasy")),
            Map.of("title", "Sword Art Online", "genres", List.of("Action", "Adventure", "Fantasy")),
            Map.of("title", "Bleach", "genres", List.of("Action", "Supernatural", "Adventure")),
            Map.of("title", "Fairy Tail", "genres", List.of("Action", "Adventure", "Fantasy")),
            Map.of("title", "Cowboy Bebop", "genres", List.of("Sci-Fi", "Adventure", "Drama")),
            Map.of("title", "Hunter x Hunter", "genres", List.of("Action", "Adventure", "Fantasy")),
            Map.of("title", "Neon Genesis Evangelion", "genres", List.of("Mecha", "Psychological", "Drama")),
            Map.of("title", "Steins;Gate", "genres", List.of("Sci-Fi", "Thriller", "Drama")),
            Map.of("title", "Black Clover", "genres", List.of("Action", "Adventure", "Magic")),
            Map.of("title", "Gintama", "genres", List.of("Action", "Comedy", "Sci-Fi")),
            Map.of("title", "Mob Psycho 100", "genres", List.of("Action", "Comedy", "Supernatural")),
            Map.of("title", "Dorohedoro", "genres", List.of("Action", "Dark Fantasy", "Comedy")),
            Map.of("title", "Violet Evergarden", "genres", List.of("Drama", "Fantasy", "Slice of Life")),
            Map.of("title", "Yuri on Ice", "genres", List.of("Sports", "Drama", "Romance")),
            Map.of("title", "Parasyte", "genres", List.of("Horror", "Sci-Fi", "Thriller")),
            Map.of("title", "Made in Abyss", "genres", List.of("Adventure", "Drama", "Fantasy")),
            Map.of("title", "Erased", "genres", List.of("Mystery", "Thriller", "Drama")),
            Map.of("title", "The Promised Neverland", "genres", List.of("Mystery", "Thriller", "Sci-Fi")),
            Map.of("title", "Jujutsu Kaisen", "genres", List.of("Action", "Supernatural", "Fantasy")),
            Map.of("title", "Blue Exorcist", "genres", List.of("Action", "Supernatural", "Adventure")),
            Map.of("title", "Dororo", "genres", List.of("Adventure", "Historical", "Supernatural"))
        );
        model.addAttribute("animes", animeList);
        return "anime";
    }

    @GetMapping("/manga")
    public String manga(Model model) {
        List<Map<String, Object>> mangaList = List.of(
            Map.of("title", "One Piece", "genres", List.of("Adventure", "Comedy", "Drama")),
            Map.of("title", "Naruto", "genres", List.of("Action", "Martial Arts", "Comedy")),
            Map.of("title", "Death Note", "genres", List.of("Thriller", "Psychological", "Supernatural")),
            Map.of("title", "Tokyo Ghoul", "genres", List.of("Action", "Horror", "Dark Fantasy")),
            // Add 26 more manga to make total 30, example below
            Map.of("title", "Attack on Titan", "genres", List.of("Action", "Drama", "Fantasy")),
            Map.of("title", "My Hero Academia", "genres", List.of("Action", "Superhero", "Comedy")),
            Map.of("title", "Fullmetal Alchemist", "genres", List.of("Action", "Adventure", "Drama")),
            Map.of("title", "Berserk", "genres", List.of("Dark Fantasy", "Adventure", "Action")),
            Map.of("title", "Fairy Tail", "genres", List.of("Fantasy", "Adventure", "Action")),
            Map.of("title", "Black Clover", "genres", List.of("Action", "Adventure", "Magic")),
            Map.of("title", "Hunter x Hunter", "genres", List.of("Action", "Adventure", "Fantasy")),
            Map.of("title", "Tokyo Revengers", "genres", List.of("Action", "Drama", "Sci-Fi")),
            Map.of("title", "Chainsaw Man", "genres", List.of("Action", "Supernatural", "Horror")),
            Map.of("title", "Vagabond", "genres", List.of("Historical", "Action", "Drama")),
            Map.of("title", "One Punch Man", "genres", List.of("Action", "Comedy", "Superhero")),
            Map.of("title", "Demon Slayer", "genres", List.of("Action", "Supernatural", "Historical")),
            Map.of("title", "Blue Exorcist", "genres", List.of("Action", "Supernatural", "Adventure")),
            Map.of("title", "Naruto Shippuden", "genres", List.of("Action", "Martial Arts", "Adventure")),
            Map.of("title", "JoJo's Bizarre Adventure", "genres", List.of("Action", "Adventure", "Supernatural")),
            Map.of("title", "Re:Zero", "genres", List.of("Drama", "Fantasy", "Thriller")),
            Map.of("title", "Soul Eater", "genres", List.of("Action", "Fantasy", "Comedy")),
            Map.of("title", "Gintama", "genres", List.of("Comedy", "Action", "Sci-Fi")),
            Map.of("title", "Black Butler", "genres", List.of("Drama", "Supernatural", "Mystery")),
            Map.of("title", "The Promised Neverland", "genres", List.of("Mystery", "Thriller", "Sci-Fi")),
            Map.of("title", "Mob Psycho 100", "genres", List.of("Action", "Comedy", "Supernatural")),
            Map.of("title", "Monster", "genres", List.of("Thriller", "Mystery", "Drama")),
            Map.of("title", "Claymore", "genres", List.of("Action", "Dark Fantasy", "Adventure")),
            Map.of("title", "Yona of the Dawn", "genres", List.of("Adventure", "Drama", "Fantasy")),
            Map.of("title", "Erased", "genres", List.of("Mystery", "Thriller", "Drama")),
            Map.of("title", "Made in Abyss", "genres", List.of("Adventure", "Drama", "Fantasy")),
            Map.of("title", "Akame ga Kill!", "genres", List.of("Action", "Drama", "Fantasy")),
            Map.of("title", "Noragami", "genres", List.of("Action", "Comedy", "Supernatural")),
            Map.of("title", "Tokyo Ghoul:re", "genres", List.of("Action", "Dark Fantasy", "Horror"))
        );
        model.addAttribute("mangas", mangaList);
        return "manga";
    }
}
