package com.vincent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vincent.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}