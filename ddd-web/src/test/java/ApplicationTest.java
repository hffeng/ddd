import com.alibaba.fastjson.JSON;
import com.swhy.Application;
import com.swhy.infrastructure.DddRepoImpl;
import com.swhy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//@MapperScan("com.swhy.*")
public class ApplicationTest {

    @Resource
    private DddRepoImpl dddRepo;

    @Resource
    private UserService userService;

    @Test
    public void toTest(){
        List<Object> list = dddRepo.findAccountList();
        for(Object accountVO:list){
            System.out.println(JSON.toJSONString(accountVO));
        }
        System.out.println();
        userService.hashCode();
    }
}
