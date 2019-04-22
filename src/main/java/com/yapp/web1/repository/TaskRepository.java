package com.yapp.web1.repository;

import com.yapp.web1.domain.Url;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Url,Long> {
    List<Url> findByProjectIdx(Long idx);
}
