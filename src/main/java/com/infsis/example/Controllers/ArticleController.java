package com.infsis.example.Controllers;

import com.infsis.example.DTOs.ArticleDTO;
import com.infsis.example.DTOs.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @GetMapping()
    public ResponseEntity<ArticleDTO> getArticles(){
        ArticleDTO article=new ArticleDTO(1,"users","users@users");
        return ResponseEntity.ok().body(article);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ArticleDTO> getArticle(@PathVariable Integer id){
        ArticleDTO article=new ArticleDTO(1,"users","users@users");
        return ResponseEntity.ok().body(article);
    }
    @PostMapping()
    public ResponseEntity<ArticleDTO> saveArticle(@RequestBody ArticleDTO article){
        return ResponseEntity.ok().body(article);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO> updateArticle(@PathVariable Integer id,@RequestBody ArticleDTO article){
        return ResponseEntity.ok().body(article);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Integer id){

    }

}
