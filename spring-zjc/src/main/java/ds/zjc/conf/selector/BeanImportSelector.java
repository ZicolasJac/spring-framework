package ds.zjc.conf.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

public class BeanImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"ds.zjc.entity.BrandImage"};
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}
}
