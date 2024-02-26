package com.ivan.coj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ivan.coj.model.dto.question.QuestionQueryRequest;
import com.ivan.coj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.ivan.coj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.ivan.coj.model.entity.Question;
import com.ivan.coj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ivan.coj.model.entity.User;
import com.ivan.coj.model.vo.QuestionSubmitVO;
import com.ivan.coj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

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

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
