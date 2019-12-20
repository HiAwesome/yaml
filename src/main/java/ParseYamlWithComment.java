import lombok.extern.slf4j.Slf4j;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * snakeyaml 的 wiki：https://bitbucket.org/asomov/snakeyaml/wiki/Documentation
 *
 * @author moqi
 * On 12/20/19 21:37
 */
@Slf4j
public class ParseYamlWithComment {

    public static final String YAML_PATH = "src/main/resources/test.yml";

    /**
     * 2019-12-20 22:01:08 INFO  YamlMain01:25 - data:{app_name=test, name=zhangsan, age=13}
     */
    public static void main(String[] args) throws FileNotFoundException {
        InputStream input = new FileInputStream(new File(YAML_PATH));
        Yaml yaml = new Yaml();

        for (Object data : yaml.loadAll(input)) {
            log.info("data:{}", data);
        }
    }

}
