package com.ivan.coj.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制 (ms)
     */
    private Long timeLimit;

    /**
     * 时间限制 (KB)
     */
    private Long memoryLimit;

    /**
     * 时间限制 (KB)
     */
    private Long stackLimit;
}
