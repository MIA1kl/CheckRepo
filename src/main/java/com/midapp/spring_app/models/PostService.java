package com.midapp.spring_app.models;

import com.midapp.spring_app.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
     private PostRepository postRepository;

    public Iterable<Post> getPosts(){
        return postRepository.findAll();
    }

    public List<Post> findByKeyword(String keyword){
        return postRepository.findByKeyword(keyword);
    }
}
