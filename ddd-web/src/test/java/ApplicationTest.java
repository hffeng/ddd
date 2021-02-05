import com.swhy.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationTest.class)
public class ApplicationTest {

//    @Autowired
//    private DddController dddController;

    @Autowired
    protected ApplicationContext ctx;

    @Test
    public void toTest(){
        String[] beans = ctx.getBeanDefinitionNames();
        for (String str:beans){
            System.out.println(str);
        }
//        List<Object> list = dddRepo.findAccountList();
//        for(Object accountVO:list){
//            System.out.println(JSON.toJSONString(accountVO));
//        }
//        accountManager.getInfoList();

        System.out.println();
//        userService.hashCode();
    }
}
