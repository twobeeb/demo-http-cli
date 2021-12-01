package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.annotation.Client;

@Client("https://api.github.com")
public interface GithubClient {
    @Get
    @Header(name = "User-Agent", value = "JC")
    String read();
}
