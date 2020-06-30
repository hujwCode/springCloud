package com.kuang.springcloud.swagger2;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
  // http://localhost:8080/swagger-ui.html
  // Swagger2默认将所有的Controller中的RequestMapping方法都会暴露，
  // 然而在实际开发中，我们并不一定需要把所有API都提现在文档中查看，这种情况下，使用注解
  // @ApiIgnore来解决，如果应用在Controller范围上，则当前Controller中的所有方法都会被忽略，
  // 如果应用在方法上，则对应用的方法忽略暴露API


}
