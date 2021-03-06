package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j //    private final Logger log = LoggerFactory.getLogger(LogTestController.class);
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

//        log.trace("trace my log="+name); 이런식으로 사용x

        log.trace("trace log={}", name);
        log.debug("debug log={}",name);
        log.info("info log={}", name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);

        return "ok";

    }
}
