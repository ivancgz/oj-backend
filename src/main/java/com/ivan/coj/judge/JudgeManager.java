package com.ivan.coj.judge;

import com.ivan.coj.judge.strategy.DefaultJudgeStrategy;
import com.ivan.coj.judge.strategy.JavaLanguageJudgeStrategy;
import com.ivan.coj.judge.strategy.JudgeContext;
import com.ivan.coj.judge.strategy.JudgeStrategy;
import com.ivan.coj.model.dto.questionsubmit.JudgeInfo;
import com.ivan.coj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理(简化调用)
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("Java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
