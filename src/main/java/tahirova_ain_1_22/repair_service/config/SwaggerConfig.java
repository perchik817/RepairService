package tahirova_ain_1_22.repair_service.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "Repair Service API", version = "v1", description = "API for Repair Service Management")
)
public class SwaggerConfig {
}
