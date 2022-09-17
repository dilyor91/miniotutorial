package uz.yshub.miniotutorial.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "learn api", version = "v1", description = "Rest API"))
@SecurityScheme(name = "bearerAuth",
                type = SecuritySchemeType.HTTP,
                bearerFormat = "JWT",
                scheme = "bearer"
)
public class OpenAPI30Configuration {
}
