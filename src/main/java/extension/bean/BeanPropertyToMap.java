package extension.bean;

import extension.bean.asm.AsmClassVisitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import java.io.IOException;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-27
 */
public final class BeanPropertyToMap implements Opcodes {
    /**
     * @param object
     */
    public static void trans(Object object) throws IOException {
        AsmClassVisitor asmClassVisitor = new AsmClassVisitor(ASM5);
        ClassReader classReader = new ClassReader(object.getClass().getCanonicalName().toString());
        classReader.accept(asmClassVisitor, ClassReader.SKIP_DEBUG);
    }
}
