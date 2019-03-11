package com.yapp.web1.controller;

import com.yapp.web1.domain.Project;
import com.yapp.web1.domain.User;
import com.yapp.web1.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * User Controller
 *
 * @author Dakyung Ko
 * @author Jihye Kim
 * @since 0.0.2
 * @version 1.0
 */
@AllArgsConstructor
@RequestMapping("/v1/api")
@RestController
public class UserController {

    private UserServiceImpl userServiceImpl;

    /**
     * 즐겨찾는 프로젝트 목록 반환
     *
     * @param session 로그인 유저 session
     * @return 즐겨찾는 프로젝트 list
     *
     * @see /v1/api/favorites
     */
    @GetMapping("/favorites")
    public ResponseEntity<List<Project>> getFavoriteProjects(HttpSession session){
        // 조인테이블..
        List<Project> projectList = new ArrayList<>(); // 결과 예시, 추후 DTO로 변경해야 함
        return new ResponseEntity<>(projectList, HttpStatus.OK);
    }

    /**
     * 프로젝트 즐겨찾기 설정 및 해제
     *
     * @param idx 즐겨찾기 설정할 프로젝트 idx
     * @param session 로그인 유저 session
     * @exception Exception 추후 수정
     *
     * @see /v1/api/favorite/{idx}
     */
    @PutMapping("/favorite/{idx}")
    public ResponseEntity setFavoriteProject(@PathVariable final Long idx, HttpSession session){
        // User Domain에서 추가
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 프로젝트 참여
     *
     * @param idx 참여할 프로젝트 idx
     * @param session 로그인 유저 session
     * @exception Exception 이미 join된 유저 - 추후 수정
     *
     * @see /v1/api/join/{idx}
     */
    //project join
    @PutMapping("/join/{idx}")
    public ResponseEntity joinProject(@PathVariable final Long idx, HttpSession session){
        //조인테이블...
        return new ResponseEntity(HttpStatus.OK);
    }
}
