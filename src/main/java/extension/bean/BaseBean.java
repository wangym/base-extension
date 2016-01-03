package extension.bean;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Map;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-17
 */
public class BaseBean implements Serializable {
    private static final long serialVersionUID = -380180465474887952L;

    @Setter
    @Getter
    public static Map<String, Object> extensions;
}
