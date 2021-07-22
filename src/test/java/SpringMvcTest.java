
import com.imortal.model.Book;
import com.imortal.service.imp.BookServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName SpringMvcTest
 * @Description
 * @Author 一人树杨
 * @Date 2021/7/22 20:55
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
public class SpringMvcTest {

    @Autowired
    private BookServiceImp bookServiceImp;

    @Test
    public void test() {
        List<Book> books =
                bookServiceImp.queryAllBook();
        for(Book book : books) {
            System.out.println(book);
        }
    }
}
