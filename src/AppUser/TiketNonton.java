/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppUser;
import javax.swing.JCheckBox;
import java.util.List;

/**
 *
 * @author Elsza
 */
class TiketNonton {


public class CheckBoxHandler {
    private List<JCheckBox> checkBoxList;

    public CheckBoxHandler(List<JCheckBox> checkBoxList) {
        this.checkBoxList = checkBoxList;
    }

    public void appendSelectedText(StringBuilder stringBuilder) {
        for (JCheckBox checkBox : checkBoxList) {
            if (checkBox.isSelected()) {
                stringBuilder.append(checkBox.getText()).append("\n");
            }
        }
    }
}

}
