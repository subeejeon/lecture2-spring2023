package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {

    private Logger logger = LoggerFactory.getLogger(MappingController.class);

    //해당 URL로 요청이 오면 해당 컨트롤러 메소드가 호출됨
    @RequestMapping({"/hello-basic", "/hello-go"})
    public String helloBasic() {
        logger.info("helloBasic");
        return "Ok";
    }

    @RequestMapping(value = "/mapping-get-v1", method = RequestMethod.GET)
    public String mappingGetV1() {
        logger.info("mappingGetV1");
        return "ok";
    }

    // @PathVariable 사용 - 경로변수
    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data) {
        logger.info("mapping userId={}", data);
        return "ok";
    }


}
