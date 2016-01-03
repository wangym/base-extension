package example;

import java.io.IOException;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-27
 */
public final class FamilyService {
    /**
     * @param parent
     */
    public void println(ParentBean parent) throws IOException {
        if (null != parent) {
            System.out.println(
                    String.format("[FamilyService.println]parent=%s&extensions=%s",
                            parent.getParent(), parent.getExtensions()));
        }
    }
}
