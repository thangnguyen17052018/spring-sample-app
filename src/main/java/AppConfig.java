import com.tma.repository.HibernateSpeakerRepositoryImpl;
import com.tma.repository.SpeakerRepository;
import com.tma.service.SpeakerService;
import com.tma.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //Example setter injection
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name ="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
