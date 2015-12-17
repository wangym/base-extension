package example;

import extension.bean.BaseBean;

import java.io.Serializable;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-17
 */
public class StandardAutoBean extends BaseBean implements Serializable {
    private static final long serialVersionUID = -1010293747897171946L;

    private String engine; // 发动机

    private String chassis; // 底盘

    private String body; // 车身

    private String electric; // 电气设备

    private String tire; // 轮胎
}
