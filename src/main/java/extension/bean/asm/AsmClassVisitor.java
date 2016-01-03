package extension.bean.asm;

import org.objectweb.asm.*;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-27
 */
public final class AsmClassVisitor extends ClassVisitor implements Opcodes {
    private String cname;

    public AsmClassVisitor(int api) {
        super(api);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println("visit:" + name + "~" + superName);
        this.cname = name;
        super.visit(version, access, name, signature, superName, interfaces);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        System.out.println("visitField:" + name + "~" + desc + "~" + value);
        return super.visitField(access, name, desc, signature, value);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println("visitMethod:" + name + "~" + desc + "~");

        if (name.contains("set")) {
            generateNewBody(access, name, desc, signature, exceptions);
        }

        return super.visitMethod(access, name, desc, signature, exceptions);
    }

    private void generateNewBody(int access, String name, String desc, String signature, String[] exceptions) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        MethodVisitor mv = cw.visitMethod(access, name, desc, signature, exceptions);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(access, this.cname, "setExtensions", "(Ljava/util/Map;)V", true);
        mv.visitEnd();
    }
}
