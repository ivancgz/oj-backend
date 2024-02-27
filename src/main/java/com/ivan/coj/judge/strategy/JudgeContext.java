package com.ivan.coj.judge.strategy;

import com.ivan.coj.model.dto.question.JudgeCase;
import com.ivan.coj.model.dto.questionsubmit.JudgeInfo;
import com.ivan.coj.model.entity.Question;
import com.ivan.coj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文 (用于定义在策略中传递的参数)
 */
@Data
public class JudgeContext {

    private List<JudgeCase> judgeCaseList;

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
