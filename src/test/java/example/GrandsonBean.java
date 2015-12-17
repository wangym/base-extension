package example;

import lombok.Getter;
import lombok.Setter;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-17
 */
public class GrandsonBean extends ChildBean {
    @Setter
    @Getter
    private String propertyD;

    @Setter
    @Getter
    private String propertyE;

    @Setter
    @Getter
    private String propertyF;
}
