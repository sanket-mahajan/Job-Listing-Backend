package com.sanket.joblisting.repository;

import com.sanket.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
