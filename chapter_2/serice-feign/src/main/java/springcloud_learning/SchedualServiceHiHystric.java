package springcloud_learning;

import org.springframework.stereotype.Component;

/**
 * Created by sumimasah on 2017/11/9.
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
