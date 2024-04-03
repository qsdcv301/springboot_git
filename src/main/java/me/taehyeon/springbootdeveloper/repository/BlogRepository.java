package me.taehyeon.springbootdeveloper.repository;

import me.taehyeon.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

