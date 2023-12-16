package com.keaweaquarian.facebookClone.service;

import com.keaweaquarian.facebookClone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
