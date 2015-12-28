package example;

import lombok.Getter;
import lombok.Setter;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-17
 */
public class ChildBean extends ParentBean {
    @Setter
    @Getter
    private String child;
}
