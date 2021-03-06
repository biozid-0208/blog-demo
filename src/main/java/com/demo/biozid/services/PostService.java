package com.demo.biozid.services;

import com.demo.biozid.dtos.PostDto;
import com.demo.biozid.models.Post;

import java.util.List;


public interface PostService  {

    Post save(PostDto postDto);
    PostDto findById(Long id);
    void deleteById(Long id);

    List<Post> findAll();
    List<Post> findAllPersonalPosts();
}
