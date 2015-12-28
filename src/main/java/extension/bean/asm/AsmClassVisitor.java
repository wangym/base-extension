package extension.bean.asm;

import com.sun.org.apache.xpath.internal.compiler.OpCodes;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-27
 */
public final class AsmClassVisitor extends ClassVisitor implements Opcodes {
    public AsmClassVisitor(int api) {
        super(api);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println("visitMethod: " + name + "~" + desc + "~" + signature);

        if (name.contains("set")) {
            // 使用自定义 MethodVisitor，实际改写方法内容
            AsmMethodVisitor wrappedMv = new AsmMethodVisitor(ASM5);
            return wrappedMv;
        }

        return super.visitMethod(access, name, desc, signature, exceptions);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        System.out.println("visitField: " + name + "~" + desc + "~" + signature + "~" + value);

        return super.visitField(access, name, desc, signature, value);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println("visit: " + name + "~" + signature + "~" + superName);

        super.visit(version, access, name, signature, superName, interfaces);
    }
}
