package ds.zjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xml文件配置应用
 *
 * @author zjc
 * @since 2021/9/15 16:20
 */
public class ZjcXmlConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext();
	}
}
