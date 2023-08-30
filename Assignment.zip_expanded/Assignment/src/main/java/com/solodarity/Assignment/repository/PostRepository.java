package com.solodarity.Assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solodarity.Assignment.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findAll();

}

