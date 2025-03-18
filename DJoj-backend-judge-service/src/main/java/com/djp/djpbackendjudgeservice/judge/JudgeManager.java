package com.djp.djpbackendjudgeservice.judge;

import com.djp.djpbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.djp.djpbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.djp.djpbackendjudgeservice.judge.strategy.JudgeContext;
import com.djp.djpbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.djp.djpbackendmodel.model.codesandbox.JudgeInfo;
import com.djp.djpbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
