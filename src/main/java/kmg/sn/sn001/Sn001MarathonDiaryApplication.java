package kmg.sn.sn001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import kmg.sn.sn001.dbflute.allcommon.DBFluteBeansJavaConfig;

@SpringBootApplication
@Import(DBFluteBeansJavaConfig.class)
public class Sn001MarathonDiaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sn001MarathonDiaryApplication.class, args);
    }
}
