package project.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "project.config.autoconfig.DispatcherServletConfig",
                "project.config.autoconfig.TomcatWebServerConfig"
        };
    }
}
