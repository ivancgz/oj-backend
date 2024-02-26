package com.ivan.coj.model.dto.questionsubmit;

import lombok.Data;

/**
 * 判题信息
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 小号内存
     */
    private Long memory;

    /**
     * 消耗时间
     */
    private Long time;
}
