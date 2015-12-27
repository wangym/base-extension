package example;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-27
 */
public final class FamilyService {
    /**
     * @param parent
     */
    public void printlnParent(ParentBean parent) {
        System.out.println(
                String.format("[FamilyService.printlnParent]propertyA=%s&extensionMap=%s",
                        parent.getPropertyA(), parent.getExtensionMap()));
    }
}
