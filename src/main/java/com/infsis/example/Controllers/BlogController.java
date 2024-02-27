package com.infsis.example.Controllers;

import com.infsis.example.DTOs.ArticleDTO;
import com.infsis.example.DTOs.BlogDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @GetMapping()
    public ResponseEntity<BlogDTO> getBlogs(){
        BlogDTO blog=new BlogDTO(1,"names");
        return ResponseEntity.ok().body(blog);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BlogDTO> getBlog(@PathVariable Integer id){
        BlogDTO blog=new BlogDTO(1,"names");
        return ResponseEntity.ok().body(blog);
    }
    @PostMapping()
    public ResponseEntity<BlogDTO> saveBlog(@RequestBody BlogDTO blog){
        return ResponseEntity.ok().body(blog);
    }
    @PutMapping("/{id}")
    public ResponseEntity<BlogDTO> updateArticle(@PathVariable Integer id,@RequestBody BlogDTO blog){
        return ResponseEntity.ok().body(blog);
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Integer id){

    }
}
