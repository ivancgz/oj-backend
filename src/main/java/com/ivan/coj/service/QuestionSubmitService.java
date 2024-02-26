package com.ivan.coj.service;

import com.ivan.coj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.ivan.coj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ivan.coj.model.entity.User;

/**
* @author ivan
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-02-26 00:33:12
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    
    /**
     * 题目提交
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

}
