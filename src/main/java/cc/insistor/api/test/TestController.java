package cc.insistor.api.test;

import cc.insistor.annotation.WebLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cc-talent
 * @description: 测试
 * @packagename: cc.insistor.api.test
 * @author: cc
 * @date: 2020-12-09 17:06
 **/
@Api(tags = "测试")
@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @ApiOperation("测试")
    @RequestMapping("/cc")
    @WebLog(description = "请求了用户登录接口")
    public String test(){
        return "cc";
    }
}
