package com.infsis.example.Services;

import com.infsis.example.DTOs.ArticleDTO;
import com.infsis.example.DTOs.UserDTO;

import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO> getArticleById(Integer userId);

    ArticleDTO saveArticle(ArticleDTO article);

    ArticleDTO updateArticle(Integer articleId, ArticleDTO article);
    void delete(Integer articleId);
}
