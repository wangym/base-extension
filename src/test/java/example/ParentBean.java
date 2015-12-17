package example;

import extension.bean.BaseBean;
import lombok.Getter;
import lombok.Setter;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-17
 */
public class ParentBean extends BaseBean {
    @Setter
    @Getter
    private String propertyA;
}
