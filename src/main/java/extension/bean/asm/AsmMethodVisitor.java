package extension.bean.asm;

import org.objectweb.asm.*;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-27
 */
public final class AsmMethodVisitor extends MethodVisitor {
    public AsmMethodVisitor(int api) {
        super(api);
    }

    @Override
    public void visitCode() {
        super.visitCode();
    }

    @Override
    public void visitVarInsn(int opcode, int var) {
        super.visitVarInsn(opcode, var);
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
        super.visitMethodInsn(opcode, owner, name, desc, itf);
    }

    @Override
    public void visitEnd() {
        super.visitEnd();
    }
}
