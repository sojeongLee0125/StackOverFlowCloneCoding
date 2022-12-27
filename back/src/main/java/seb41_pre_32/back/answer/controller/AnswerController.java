package seb41_pre_32.back.answer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import seb41_pre_32.back.answer.dto.AnswerPatchDto;
import seb41_pre_32.back.answer.dto.AnswerPostDto;
import seb41_pre_32.back.answer.dto.AnswerResponseDto;
import seb41_pre_32.back.answer.entity.Answer;
import seb41_pre_32.back.answer.service.AnswerService;
import seb41_pre_32.back.auth.dto.AuthInfo;
import seb41_pre_32.back.auth.utils.LoginUser;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/answers")
public class AnswerController {

    private final AnswerService answerService;

    // Answer 등록
    @PostMapping
    public ResponseEntity postAnswer(@RequestBody @Valid final AnswerPostDto answerPostDto,
                                     @LoginUser final AuthInfo authInfo) {
        return new ResponseEntity<>(
                AnswerResponseDto.of(answerService.createAnswer(answerPostDto, authInfo)),
                HttpStatus.CREATED);
    }

    // Answer 수정
    @PatchMapping("/{answerId}")
    public ResponseEntity patchAnswer(@PathVariable("answerId") final Long answerId,
                                      @LoginUser final AuthInfo authInfo,
                                      @RequestBody @Valid final AnswerPatchDto answerPatchDto) {
        return new ResponseEntity<>(
                AnswerResponseDto.of(answerService.updateAnswer(answerId, authInfo, answerPatchDto)),
                HttpStatus.OK);
    }

    //Answer 삭제
    @DeleteMapping("/{answerId}")
    public ResponseEntity deleteAnswer(@PathVariable("answerId") final Long answerId,
                                       @LoginUser AuthInfo authInfo) {
        answerService.deleteAnswer(answerId, authInfo);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}