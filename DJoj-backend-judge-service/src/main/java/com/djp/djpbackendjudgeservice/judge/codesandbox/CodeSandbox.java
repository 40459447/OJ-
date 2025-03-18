package com.djp.djpbackendjudgeservice.judge.codesandbox;

import com.djp.djpbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.djp.djpbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
