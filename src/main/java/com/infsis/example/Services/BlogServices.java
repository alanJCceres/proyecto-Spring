package com.infsis.example.Services;

import com.infsis.example.DTOs.ArticleDTO;
import com.infsis.example.DTOs.BlogDTO;

import java.util.Optional;

public interface BlogServices {
    Optional<BlogDTO> getBlogById(Integer BlogId);

    BlogDTO saveBlog(BlogDTO blog);

    BlogDTO updateBlog(Integer blogId, BlogDTO blog);
    void delete(Integer blogId);
}
