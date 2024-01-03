package com.vincent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vincent.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}