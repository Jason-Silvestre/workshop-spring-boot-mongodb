package com.jasonsilvestre.workshopmongo.services;

import com.jasonsilvestre.workshopmongo.domain.Post;
import com.jasonsilvestre.workshopmongo.domain.User;
import com.jasonsilvestre.workshopmongo.repository.PostRepository;
import com.jasonsilvestre.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }

}
