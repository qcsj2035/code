package cn.itcast.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("cn.itcast")
@Import(DataSourceConfig.class)
public class springConfig {
}
