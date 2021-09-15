package sample.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean // 필수항목
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)  // 기존적인 응답메시지 미사용
                .select()                  
                .apis(RequestHandlerSelectors.basePackage("sample")) // Swagger를 적용할 패키지
                .paths(PathSelectors.any()) 
                .build();                   // selector build
    }

}
