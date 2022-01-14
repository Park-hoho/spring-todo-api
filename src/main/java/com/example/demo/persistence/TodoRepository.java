package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
	// JpaRepository<T, ID> - T�� ���ε� ��ƼƼ Ŭ����, ID�� �⺻ Ű�� Ÿ��
	List<TodoEntity> findByUserId(String userId);
	
	// ?1�� �޼����� �Ű������� ���� ��ġ��.
}
