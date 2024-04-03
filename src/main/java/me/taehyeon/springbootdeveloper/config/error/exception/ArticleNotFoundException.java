package me.taehyeon.springbootdeveloper.config.error.exception;


import me.taehyeon.springbootdeveloper.config.error.ErrorCode;

public class ArticleNotFoundException extends NotFoundException {
    public ArticleNotFoundException() {
        super(ErrorCode.ARTICLE_NOT_FOUND);
    }
}