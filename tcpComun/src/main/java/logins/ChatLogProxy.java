package logins;

import java.io.Serializable;
import javax.swing.JOptionPane;

/*
 * @author  Equipo 1
 */
public class ChatLogProxy implements IchatLogger, Serializable {

    private static IchatLogger instance;
    private IchatLogger logger;
    private Class clase;

    private ChatLogProxy(Class clase) {
        this.clase = clase;
        this.logger = chatLoggerImpl.getInstance(clase);
    }

    public static IchatLogger getInstance(Class clazz) {
        return instance != null ? instance : (instance = new ChatLogProxy(clazz));
    }

    @Override
    public void log(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "success", JOptionPane.DEFAULT_OPTION);
        logger.log(mensaje);
    }

    @Override
    public void error(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "error", JOptionPane.ERROR_MESSAGE);
        logger.error(mensaje);
    }

    @Override
    public void inf(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "info", JOptionPane.INFORMATION_MESSAGE);
        logger.inf(mensaje);
    }

    @Override
    public void advertencia(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "warning", JOptionPane.WARNING_MESSAGE);
        logger.advertencia(mensaje);
    }

}
