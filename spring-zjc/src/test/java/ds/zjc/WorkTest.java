package ds.zjc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(JUnit4.class)
public class WorkTest {

	@Test
	public void testRegix(){
		Pattern pattern = Pattern.compile("品牌名称\\[.*]已存在!");
		Matcher matcher = pattern.matcher("品牌名称[CLOUDSTYLE]已存在!");
		System.out.println(matcher.find());
	}
}
