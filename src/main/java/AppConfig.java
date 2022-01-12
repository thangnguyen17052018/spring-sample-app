import com.tma.repository.HibernateSpeakerRepositoryImpl;
import com.tma.repository.SpeakerRepository;
import com.tma.service.SpeakerService;
import com.tma.service.SpeakerServiceImpl;
import com.tma.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.BeanDescriptor;
import java.util.Calendar;

@Configuration
@ComponentScan({"com.tma"})
public class AppConfig {

    @Bean(name="cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//    public SpeakerService getSpeakerService(){
//        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        //Example setter injection
//        //service.setRepository(getSpeakerRepository());
//
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        return service;
//    }
//
//
//    @Bean(name ="speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }

}
